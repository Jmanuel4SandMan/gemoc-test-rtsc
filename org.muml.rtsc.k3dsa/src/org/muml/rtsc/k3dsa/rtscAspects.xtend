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

import static extension org.muml.rtsc.k3dsa.GuardAspect.*
import static extension org.muml.rtsc.k3dsa.StateAspect.*
import static extension org.muml.rtsc.k3dsa.TransitionAspect.*
import static extension org.muml.rtsc.k3dsa.VariableAspect.*
import static extension org.muml.rtsc.k3dsa.VertexAspect.*
import static extension org.muml.rtsc.k3dsa.MessageBufferAspect.*
import static extension org.muml.rtsc.k3dsa.RealtimestatechartAspect.*
import static extension org.muml.rtsc.k3dsa.SystemAspect.*
import static extension org.muml.rtsc.k3dsa.ClockAspect.*
import static extension org.muml.rtsc.k3dsa.ClockConstraintAspect.*
import static extension org.muml.rtsc.k3dsa.EventAspect.*
import org.muml.rtsc.Port
import org.muml.rtsc.MessageBuffer
import org.muml.rtsc.Message
import java.util.List
import java.util.ArrayList
import org.muml.rtsc.MessageType
import java.util.HashMap
import java.util.Map
import org.muml.rtsc.CoordinationProtocol
import org.eclipse.emf.common.util.BasicEList
import org.muml.rtsc.Clock
import org.muml.udbm.UDBMClock
import org.muml.udbm.Federation
import org.muml.udbm.FederationFactory
import org.muml.udbm.java.JavaFederationFactory
import java.util.HashSet
import org.muml.udbm.SimpleClockConstraint
import org.muml.udbm.clockconstraint.RelationalOperator
import org.muml.rtsc.Event
import org.muml.rtsc.ClockResetEvent
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.muml.rtsc.VariableAssignmentEvent
import org.muml.rtsc.MessageEvent
import org.muml.rtsc.RtscFactory
import java.util.Random
import org.muml.rtsc.k3dsa.SystemAspect.ResolutionStrategy

@Aspect(className=Behavior)
abstract class BehaviorAspect {

}

@Aspect(className=BehavioralElement)
abstract class BehavioralElementAspect {

}

@Aspect(className= Clock)
class ClockAspect {
	public UDBMClock uClock;
	
	def public void initialize(){
		_self.uClock = new UDBMClock(_self.name, _self.name)
	}
	
	def public String printValue(){
		if (_self.uClock != null && federation != null){
			try{
				return '['+ federation.getLowerBound(_self.uClock).toString +', '+ federation.getUpperBound(_self.uClock)+']'
			} catch (Exception e){
				
			}
		}
		return _self.toString
	}
	
	def public void reset(){
		var resetSet = new HashSet
		resetSet += _self.uClock
		federation.applyResets(resetSet)
	}
}

@Aspect(className= ClockConstraint) 
class ClockConstraintAspect{

	def public boolean evaluate(Federation checkFederation){
		val uConstraint = new SimpleClockConstraint(_self.clock.uClock, RelationalOperator.GreaterOrEqualOperator, _self.bound)
		checkFederation.and(uConstraint)
		return !checkFederation.empty
	}
	
	def public void apply(Federation federation){
		val uConstraint = new SimpleClockConstraint(_self.clock.uClock, RelationalOperator.GreaterOrEqualOperator, _self.bound)
		federation.and(uConstraint)
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



@Aspect(className=org.muml.rtsc.System)
class SystemAspect {
	
	public enum ResolutionStrategy {
		USER, RANDOM, FIRST
	}
	
	public static FederationFactory ff = new JavaFederationFactory(); 
	public static Federation federation;
	public static ResolutionStrategy strategy = ResolutionStrategy.USER
	
}

@Aspect(className=Realtimestatechart)
class RealtimestatechartAspect extends BehaviorAspect {
	public int rounds;
	
	public EList<Transition> activeTransitions = new BasicEList
	
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
		var strategySelection = args.findFirst[it.startsWith("strategy=")]
		if (strategySelection != null){
			strategySelection = strategySelection.split("=").get(1)
			strategy = ResolutionStrategy.valueOf(strategySelection);
		}
		val uClocks = new HashSet
		_self.initialize(uClocks)	
		federation = ff.createZeroFederation(uClocks)
	}
		 
	
	def public void initialize(HashSet<UDBMClock> uClocks){
		println("Initializing " + _self.name)
		_self.initialState.active = true
		_self.clocks.forEach[
			initialize
			uClocks += uClock
		]
	}
	
	@Step
	def public void step(){
		println("Stepping " + _self.name)
		_self.rounds = _self.rounds +1;
		federation.up
	}
	
	@Step
	def public void sequentialStep(){
		_self.step
		if (_self.activeTransitions.empty){
			_self.activeTransitions += _self.transitions.filter[canFire]
			if (_self.activeTransitions.size > 1)
				switch (strategy){
					case RANDOM: {
						val r = new Random().nextInt(_self.activeTransitions.size)
						val t = _self.activeTransitions.get(r);
						_self.activeTransitions.removeIf(t0 | t0 != t)
					}
					case FIRST: {
						val t = _self.activeTransitions.get(0);
						_self.activeTransitions.removeIf(t0 | t0 != t)
					}
					default:{
						//let user select transition
					}
				}
		}
		//only fire if transition is choice is deterministic
		if (_self.activeTransitions.size == 1){
			_self.activeTransitions.get(0).fire
			_self.activeTransitions.clear
		} 
		
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
		_self.entryEvents.forEach[execute]
	}
	
	def public void exit(){
		_self.exitEvents.forEach[execute]
		_self.active = false
	}


}

@Aspect(className=Transition)
class TransitionAspect {
	
	public int hitCount = 0
	
	def public boolean canFire(){
		_self.source.active && _self.guardsHold && _self.clocksHold && _self.checkMessages
	}
	
	@Step
	def public Vertex fire(){
		_self.source.exit
		_self.hitCount = _self.hitCount+1
		println("Firing "+ (_self.source as NamedElement).name  + " to " + (_self.target as NamedElement).name)
		_self.consumeMessages
		_self.events.forEach[execute]
		_self.clockConstraints.forEach[apply(federation)]
		_self.target.entry
		return _self.target
	}
	
	def public boolean guardsHold(){
		_self.guards.empty || _self.guards.forall[evaluate]
		
	}
	
	def public boolean clocksHold(){
		val checkFederation = federation.clone as Federation
		_self.clockConstraints.empty || _self.clockConstraints.forall[evaluate(checkFederation)]
	}
	
	def public boolean checkMessages(){
		if (_self.triggerMessage.empty) return true
		
		_self.triggerMessage.forall[
			val port = _self.statechart.behaviouralElement as Port
			port.incomingBuffer.hasMessage(it)
		] 
	}
	
	def public void consumeMessages(){
		_self.triggerMessage.forEach[
			val port = _self.statechart.behaviouralElement as Port
			port.incomingBuffer.getMessage(it)
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

@Aspect(className=Event)
abstract class EventAspect {
	
	def public void execute()
		
}

@Aspect(className=ClockResetEvent) 
class ClockResetEventAspect extends EventAspect {
	
	@OverrideAspectMethod
	def public void execute(){
		_self.clock.reset
	}
}

@Aspect(className=VariableAssignmentEvent)
class VariableAssignmentEventAspect extends EventAspect {
	
	@OverrideAspectMethod
	def public void execute(){
		_self.variable.runtimeValue = _self.value
	}
}

@Aspect(className=MessageEvent)
class MessageEventAspect extends EventAspect {
	
	@OverrideAspectMethod
	def public void execute(){
		// create message
		val message = RtscFactory.eINSTANCE.createMessage();
		message.type = _self.messageType;
		
		//get own port
		val t = _self.eContainer as Transition
		val bh = t.statechart.behaviouralElement
		if (bh != null && bh instanceof Port){
			val port = bh as Port
			val other = port.connector.endpoints.findFirst[it != port]
			val targetBuffer = other.incomingBuffer;
			targetBuffer.addMessage(message);
			println(message.type.name + "!")
		}
	}
}



@Aspect(className=MessageBuffer)
abstract class MessageBufferAspect {
	
	private Map<MessageType, List<Message>> messages = new HashMap
	
	//attribute to display messages in animation
	public EList<Message> allMessages = new BasicEList
	
	def public Message getMessage(MessageType type){
		if (_self.messages.containsKey(type)){
			val list = _self.messages.get(type)
			if (!list.empty){
				val message = list.remove(0)
				_self.allMessages.remove(message)
				return message
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
		_self.allMessages += message
	}
}
