import 'platform:/resource/org.muml.xsrtsc.xsrtsc/model/XSRTSC.ecore'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

package rtsc

	context Realtimestatechart
		def: initIt: Event = self.initRTSC()
		def: stepIt: Event = self.step()

	/*	context Transition
	def: fireIt: Event = self.fire() */
	
	context Realtimestatechart
		
		inv initFirst:
                let firstInit : Event = Expression OneTickAndNoMore(self.initIt) in
                let allSteps : Event = Expression Union(self.stepIt) in
                let firstOfAllSteps : Event = Expression OneTickAndNoMore(allSteps) in
                Relation Precedes(firstInit, firstOfAllSteps)
		
		
		inv onlyOneInit:
        	let firstInit2 : Event = Expression OneTickAndNoMore(self.initIt) in
            Relation Coincides(self.initIt, firstInit2)  		
 		
 		
 	
	

endpackage