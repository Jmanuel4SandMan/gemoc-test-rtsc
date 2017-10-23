package org.muml.rcp.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.HashSet
import org.eclipse.emf.common.util.EList
import org.muml.rtsc.CoordinationProtocol
import org.muml.rtsc.Realtimestatechart
import org.muml.udbm.UDBMClock

import static extension org.muml.rtsc.k3dsa.SystemAspect.*
import static extension org.muml.rtsc.k3dsa.RealtimestatechartAspect.*

@Aspect(className=CoordinationProtocol)
class CoordinationProtocolAspect {
	
	@Main
	def public void main(){
		
		while (true){
			_self.step
		}
	}
	
	@Step
	@InitializeModel
	def public void initialize(EList<String> arguments){
		println("Initializing ")
		val uClocks = new HashSet
		
		println("Initializing " + _self.name)
		_self.initialize(uClocks)
		federation = ff.createZeroFederation(uClocks)
	}
	
	def public void initialize(HashSet<UDBMClock> uClocks){
		val stateCharts = _self.ports.map[behavior as Realtimestatechart]
		stateCharts.forEach[initialize(uClocks)]
	}
	
	@Step
	def public void step(){
		val stateCharts = _self.ports.map[behavior as Realtimestatechart]
		stateCharts.forEach[sequentialStep]
	}
}



