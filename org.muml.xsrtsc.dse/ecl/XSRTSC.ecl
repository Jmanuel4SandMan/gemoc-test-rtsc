import 'http://org.muml.xsrtsc.xsrtsc/rtsc/'
--import 'platform:resource/org.muml.xsrtsc.xsrtsc/model/XSRTSC.ecore'  

ECLimport "platform:/resource/org.muml.xsrtsc.moc/mocc/rtsc.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

package rtsc

	context Realtimestatechart
		def: stepIt: Event = self.step()
		def: initIt: Event = self.initRTSC()

	context Transition
		def: fireIt: Event = self.fire()
	
	
	context State
		def: exitIt: Event = self.exit()		
		def: enterIt: Event = self.entry()
		
	/**
 	* @Private DSE
 	*/ 
	context Transition
		public def: canFire : Event = self.canFire()  [res] switch case (res = true) force canFireTrue; 
																   case (res = false) force canFireFalse; 
		def: canFireTrue: Event = self
		def: canFireFalse: Event = self
		def: res: Event = self

	context Transition
		inv evaluateCanfire:
			Relation EvalBoolean(self.canFire, self.canFireTrue, self.canFireFalse) 
			
		inv resIsTrueOrFalse: 
            let trueOrFalse : Event = Expression Union(self.canFireTrue, self.canFireFalse) in
            Relation Coincides(trueOrFalse, self.res)

		
		inv fireIfCanFire:
			Relation Coincides(self.canFireTrue, self.fireIt)
			
		inv exitBeforeFire:
			Relation Coincides(self.source.exitIt, self.fireIt)
		
		inv fireBeforeEnter:
			Relation Coincides(self.fireIt, self.target.enterIt)
	
	context Realtimestatechart
	
		inv evaluateSameTime:
			Relation Coincides(self.transitions.canFire)
			
--		inv onlyOneFire:
--			Relation Exclusion(self.transitions.fireIt)
			
        inv allResSynchronous:
                 Relation Coincides(self.transitions.res)


		inv evaluateEachStep:
			(self.transitions <> null) implies
			let evaluateAllTransition : Event = Expression Union(self.transitions.canFire) in
			Relation Coincides(self.stepIt, evaluateAllTransition)		
			
		inv initFirst:
                let firstInit : Event = Expression OneTickAndNoMore(self.initIt) in
                let firstStep : Event = Expression OneTickAndNoMore(self.stepIt) in
                Relation Precedes(firstInit, firstStep)
		
		
		inv onlyOneInit:
        	let firstInit2 : Event = Expression OneTickAndNoMore(self.initIt) in
            Relation Coincides(self.initIt, firstInit2)  		
 		
endpackage