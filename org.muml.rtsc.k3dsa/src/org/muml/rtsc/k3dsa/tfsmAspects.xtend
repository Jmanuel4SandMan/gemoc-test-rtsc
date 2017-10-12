package org.muml.rtsc.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step

import org.muml.rtsc.State
import org.muml.rtsc.Realtimestatechart
import org.muml.rtsc.Transition

import static extension org.muml.rtsc.k3dsa.StateAspect.*
import static extension org.muml.rtsc.k3dsa.RealtimestatechartAspect.*
import static extension org.muml.rtsc.k3dsa.TransitionAspect.*
import org.eclipse.emf.common.util.EList
import org.muml.rtsc.Behavior
import org.muml.rtsc.BehavioralElement
import org.muml.rtsc.Vertex
import org.muml.rtsc.NamedElement

@Aspect(className=Behavior)
abstract class BehaviorAspect {

}

@Aspect(className=BehavioralElement)
abstract class BehavioralElementAspect {

}

@Aspect(className=Realtimestatechart)
class RealtimestatechartAspect extends BehaviorAspect {
	public int rounds;
	@Main
	def public void main(){
		while (true)
		{
			_self.step();
		}
	}
	
	@Step
	@InitializeModel
	def public void initialize(EList<String> args){
		_self.initRTSC
	}
	
	@Step
	def public void initRTSC(){
		println("Initializing " + _self.name)
		// TODO
		_self.initialState.active = true
	}
	
	
	def public void step(){
		// TODO
		println("Stepping " + _self.name)
		_self.rounds = _self.rounds +1;
		//_self.transitions.findFirst[canFire]?.fire()
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
		_self.source.active
	}
	
	def public Vertex fire(){
		_self.source.exit
		_self.hitCount = _self.hitCount+1
		println("Firing "+ (_self.source as NamedElement).name  + " to " + (_self.target as NamedElement).name)
		_self.target.entry
		return _self.target
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