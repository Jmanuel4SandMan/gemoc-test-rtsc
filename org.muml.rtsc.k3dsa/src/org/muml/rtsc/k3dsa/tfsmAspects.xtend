package org.muml.rtsc.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import org.muml.rtsc.Behavior
import org.muml.rtsc.BehavioralElement
import org.muml.rtsc.ClockConstraint
import org.muml.rtsc.Guard
import org.muml.rtsc.NamedElement
import org.muml.rtsc.Realtimestatechart
import org.muml.rtsc.State
import org.muml.rtsc.Transition
import org.muml.rtsc.Variable
import org.muml.rtsc.Vertex
import org.muml.rtsc.k3dsa.timekeeper.TimeKeeper

import static extension org.muml.rtsc.k3dsa.GuardAspect.*
import static extension org.muml.rtsc.k3dsa.StateAspect.*
import static extension org.muml.rtsc.k3dsa.TransitionAspect.*
import static extension org.muml.rtsc.k3dsa.VariableAspect.*
import static extension org.muml.rtsc.k3dsa.VertexAspect.*
import static extension org.muml.rtsc.k3dsa.MessageBufferAspect.*
import static extension org.muml.rtsc.k3dsa.RealtimestatechartAspect.*
import org.muml.rtsc.Port
import org.muml.rtsc.MessageBuffer
import org.muml.rtsc.Message
import java.util.List
import java.util.ArrayList
import org.muml.rtsc.MessageType
import java.util.HashMap
import java.util.Map
import org.muml.rtsc.CoordinationProtocol

@Aspect(className=Behavior)
abstract class BehaviorAspect {

}

@Aspect(className=BehavioralElement)
abstract class BehavioralElementAspect {

}

@Aspect(className= ClockConstraint)
class ClockConstraintAspect{

	def public boolean evaluate(/*Federation checkFederation*/){
		val stateChart = _self.clock.statechart
//		val uClock = stateChart.clockMapping.get(_self.clock)
//		val uConstraint = new SimpleClockConstraint(uClock, RelationalOperator.GreaterOrEqualOperator, _self.bound)
//		checkFederation.and(uConstraint)
//		return !checkFederation.empty
	return true
	}
	
	def public void apply(/*Federation federation*/){
		val stateChart = _self.clock.statechart
//		val uClock = stateChart.clockMapping.get(_self.clock)
//		val uConstraint = new SimpleClockConstraint(uClock, RelationalOperator.GreaterOrEqualOperator, _self.bound)
//		federation.and(uConstraint)
	}
}

@Aspect(className=Guard)
class GuardAspect {
	
	def public boolean evaluate(){
		_self.variable.runtimeValue == _self.value 
	}
}

@Aspect(className=Variable)
class VariableAspect {
	public String runtimeValue;
	
}

@Aspect(className=Realtimestatechart)
class RealtimestatechartAspect extends BehaviorAspect {
	public int rounds;

	@Main
	def public void main(){
		while (true)
		{
			_self.sequentialStep();
		}
	}
	
	@Step
	@InitializeModel
	def public void initialize(EList<String> args){
		println("Initializing " + _self.name)
		_self.initialState.active = true
		//_self.clocks.forEach[TimeKeeper.addClock(_self.name, it.name)]
	}
	
	
	def public void step(){
		println("Stepping " + _self.name)
		_self.rounds = _self.rounds +1;
//		federation.up
	}
	
	@Step
	def public void sequentialStep(){
		_self.step
		_self.transitions.findFirst[canFire]?.fire()
	}
	
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=State)
class StateAspect extends VertexAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/
	
	def public void entry(){
		_self.active = true
	}
	
	def public void exit(){
		_self.active = false
	}


}

@Aspect(className=Transition)
class TransitionAspect {
	
	public int hitCount = 0
	
	def public boolean canFire(){
		_self.source.active && _self.guardsHold && _self.clocksHold && _self.checkMessages
	}
	
	def public Vertex fire(){
		_self.source.exit
		_self.hitCount = _self.hitCount+1
		println("Firing "+ (_self.source as NamedElement).name  + " to " + (_self.target as NamedElement).name)
		_self.target.entry
		return _self.target
	}
	
	def public boolean guardsHold(){
		_self.guards.empty || _self.guards.forall[evaluate]
		
	}
	
	def public boolean clocksHold(){
//		val checkFederation = federation.clone as Federation
//		_self.clockConstraints.empty || _self.clockConstraints.forall[evaluate(checkFederation)]
		return true
	}
	
	def public boolean checkMessages(){
		if (_self.triggerMessage.empty) return true
		
		_self.triggerMessage.forall[
			val port = _self.statechart.behaviouralElement as Port
			port.incomingBuffer.hasMessage(it)
		] 
	}

}

@Aspect(className=NamedElement)
abstract class NamedElementAspect {

}

//@Aspect(className=StatePoint)
//class StatePointAspect extends VertexAspect {
//
//}

@Aspect(className=Vertex)
abstract class VertexAspect {
	
	public boolean active = false

}

@Aspect(className=MessageBuffer)
abstract class MessageBufferAspect {
	
	private Map<MessageType, List<Message>> messages = new HashMap
	
	def public Message getMessage(MessageType type){
		if (_self.messages.containsKey(type)){
			val list = _self.messages.get(type)
			if (!list.empty){
				list.remove(0)
			}
		}
		return null
	}
	
	def public boolean hasMessage(MessageType type){
		_self.messages.containsKey(type) && !_self.messages.get(type).empty
	}
	
	def public void addMessage(Message message){
		if (!_self.messages.containsKey(message.type)){
			_self.messages.put(message.type, new ArrayList)
		}
		_self.messages.get(message.type) += message
	}
}

@Aspect(className=CoordinationProtocol)
class CoordinationProtocolAspect {
	
	
	@Main
	def public void main(){
		val stateCharts = _self.ports.map[behavior as Realtimestatechart]
		while (true){
			stateCharts.forEach[step]
		}
	}
	
	
	@Step
	@InitializeModel
	def public void initialize(EList<String> arguments){
		println("Initializing ")
		_self.ports.map[behavior as Realtimestatechart].forEach[initialize(arguments)]
	}
}