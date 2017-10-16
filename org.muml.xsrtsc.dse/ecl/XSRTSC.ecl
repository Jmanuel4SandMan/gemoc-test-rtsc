import 'platform:/resource/org.muml.xsrtsc.xsrtsc/model/XSRTSC.ecore'

ECLimport "platform:/resource/org.muml.xsrtsc.moc/mocc/rtsc.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

package rtsc

	context Realtimestatechart
		def: stepIt: Event = self.step()

	context Transition
		def: fireIt: Event = self.fire()
	
	
--	context State
--		def: exitIt: Event = self.exit()		
--		def: enterIt: Event = self.entry()
		
	/**
 	* @Private DSE
 	*/
	context Transition
		public def: canFire : Event = self.canFire() -- [res] switch case res = true force canFireTrue; 
													 --				 case res = false force evaluatedFalse;
		def: canFireTrue: Event = self
		def: canFireFalse: Event = self

	context Transition
		
		inv evaluateCanfire:
			Relation EvalBoolean(self.canFire, self.canFireTrue, self.canFireFalse)
		
--		inv eitherTrueOrFalse:
--			Relation Exclusion(self.canFireTrue, self.canFireFalse)
		
		inv fireIfCanFire:
			Relation Coincides(self.canFireTrue, self.fireIt)
			
--		inv exitBeforeFire:
--			Relation Precedes(self.source.exitIt, self.fireIt)
--		
--		inv fireBeforeEnter:
--			Relation Precedes(self.fireIt, self.target.enterIt)
	
	context Realtimestatechart
	
		inv evaluateSameTime:
			Relation Coincides(self.transitions.canFire)
			
		inv onlyOneFire:
			Relation Exclusion(self.transitions.fireIt)

		inv evaluateEachStep:
			(self.transitions <> null) implies
			let evaluateAllTransition : Event = Expression Union(self.transitions.canFire) in
			Relation Coincides(self.stepIt, evaluateAllTransition)		
--		inv initFirst:
--                let firstInit : Event = Expression OneTickAndNoMore(self.initIt) in
--                let allSteps : Event = Expression Union(self.stepIt) in
--                let firstOfAllSteps : Event = Expression OneTickAndNoMore(allSteps) in
--                Relation Precedes(firstInit, firstOfAllSteps)
--		
--		
--		inv onlyOneInit:
--        	let firstInit2 : Event = Expression OneTickAndNoMore(self.initIt) in
--            Relation Coincides(self.initIt, firstInit2)  		
 		
endpackage