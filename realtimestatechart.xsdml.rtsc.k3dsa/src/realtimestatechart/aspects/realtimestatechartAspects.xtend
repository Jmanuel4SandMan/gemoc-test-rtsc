package realtimestatechart.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import realtimestatechart.Behavior
import realtimestatechart.BehavioralElement
import realtimestatechart.Realtimestatechart
import realtimestatechart.State
import realtimestatechart.Transition
import realtimestatechart.NamedElement
import realtimestatechart.StatePoint
import realtimestatechart.Vertex

import static extension realtimestatechart.aspects.BehaviorAspect.*
import static extension realtimestatechart.aspects.BehavioralElementAspect.*
import static extension realtimestatechart.aspects.RealtimestatechartAspect.*
import static extension realtimestatechart.aspects.StateAspect.*
import static extension realtimestatechart.aspects.TransitionAspect.*
import static extension realtimestatechart.aspects.NamedElementAspect.*
import static extension realtimestatechart.aspects.StatePointAspect.*
import static extension realtimestatechart.aspects.VertexAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import java.util.List

@Aspect(className=Behavior)
abstract class BehaviorAspect {

}

@Aspect(className=BehavioralElement)
abstract class BehavioralElementAspect {

}

@Aspect(className=Realtimestatechart)
class RealtimestatechartAspect extends BehaviorAspect {
	
	@Main
	def public void main(){
		while (true)
		{
			_self.step();
		}
	}
	
	@Step
	@InitializeModel
	def public void initialize(List<String> args){
		println("Initializing " + _self.name)
		// TODO
		_self.states.findFirst[initial].active = true
	}
	
	
	@Step
	def public void step(){
		// TODO
		println("Stepping " + _self.name)
		_self.transitions.findFirst[canFire].fire()
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


}

@Aspect(className=Transition)
class TransitionAspect {
	
	def public boolean canFire(){
		_self.source.active
	}
	
	@Step
	def public Vertex fire(){
		_self.source.active = false
		_self.target.active = true
		println("Firing "+ (_self.source as NamedElement).name  + " to " + (_self.target as NamedElement).name)
		return _self.target
	}

}

@Aspect(className=NamedElement)
class NamedElementAspect {

}

@Aspect(className=StatePoint)
class StatePointAspect extends VertexAspect {

}

@Aspect(className=Vertex)
abstract class VertexAspect {
	
	public boolean active = false

}
