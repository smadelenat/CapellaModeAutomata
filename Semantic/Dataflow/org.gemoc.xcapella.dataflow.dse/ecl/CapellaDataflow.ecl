import 'http://www.polarsys.org/capella/core/modeller/0.8.0'
import 'http://www.polarsys.org/kitalpha/emde/1.0.0'
import 'platform:/resource/com.thalesgroup.trt.mde.vp.modesimulation/models/ModeSimulation.ecore'
import 'http://www.polarsys.org/capella/core/fa/0.8.0' 

import 'http://www.polarsys.org/capella/core/core/0.8.0'
import 'http://www.polarsys.org/capella/core/common/0.8.0'
import 'http://www.eclipse.org/emf/2002/Ecore'


ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib" 
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib" 
ECLimport "platform:/resource/fr.inria.aoste.dataflowmode.constraint.moccml/mocc/ModeFunctionalChain.moccml"

package capellamodeller

endpackage

package emde

endpackage
 
package ModeSimulation 
      
endpackage  

package fa



context AbstractFunction
--	def if ( (self.ownedFunctions->notEmpty() and not self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(FunctionPkg)) 
--			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))) : makeactive : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().activate()
	def if (self.ownedFunctions->isEmpty()) : makeactive : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().activate()
	def if (self.ownedFunctions->isEmpty()) : start : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().start()
	def if (self.ownedFunctions->isEmpty()) : run : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().run()
	def if (self.ownedFunctions->isEmpty()) : stop : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().stop()
	def if (self.ownedFunctions->isEmpty()) : makeinactive : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().deactivate()

context FunctionalChain
	def : activate : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionalChainRuntimeData)).oclAsType(ModeSimulation::FunctionalChainRuntimeData)->first().activate()
	def : deactivate : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionalChainRuntimeData)).oclAsType(ModeSimulation::FunctionalChainRuntimeData)->first().deactivate()


context AbstractFunction
  
	inv functionLifeCycle:
--		( (self.ownedFunctions->notEmpty() and not self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(FunctionPkg))
--			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction)))
--		implies
	(self.ownedFunctions->isEmpty()) implies
	  	(Relation FunctionLifeCycle(self.makeactive, self.makeinactive,self.start,self.stop, self.run))
	 
	  
--	inv ActivateSonWithFather :
--		(self.ownedFunctions->notEmpty()
--			and not self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(FunctionPkg)
--		) implies
--		(Relation Coincides(self.makeactive,self.ownedFunctions->first().makeactive))
	  
--	inv ActivateAllSonTogether :
--		(self.ownedFunctions->notEmpty()
--			and not self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(FunctionPkg)
--		) implies
--		(Relation Coincides(self.ownedFunctions.makeactive))
	  
--	inv StartFatherBeforeSon:
--		(self.ownedFunctions->notEmpty()
--			and not self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(FunctionPkg)
--		) implies
--		(let firstSonStart : Event = Expression Inf(self.ownedFunctions.start) in
--			Relation Precedes(self.start,firstSonStart))
		
--	inv StopSonBeforeFather:
--		(self.ownedFunctions->notEmpty()
--			and not self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(FunctionPkg)
--		) implies
--		(let lastSonFinish: Event = Expression Sup(self.ownedFunctions.stop) in
--			Relation Precedes(lastSonFinish,self.stop))


--Can a function be always active ? in this case is it linked to alla FC or to none of them ?

	inv activatedIfOneAssociatedFCactivated:
	(self.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction).ownedFunctionalChains->select(fc | (fc).enactedFunctions->exists(ef | (ef) = self))->size() >0) implies
		let anyAssociatedFCactivation : Event = Expression Union(self.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction).ownedFunctionalChains->select(fc | (fc).enactedFunctions->exists(ef | (ef) = self)).activate) in 
		Relation Coincides(self.makeactive, anyAssociatedFCactivation)		

	inv deactivatedIfOneAssociatedFCdeactivated: 
	(self.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction).ownedFunctionalChains->select(fc | (fc).enactedFunctions->exists(ef | (ef) = self))->size() >0) implies
		let anyAssociatedFCdeactivation : Event = Expression Union(	(self.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction).ownedFunctionalChains->select(fc | (fc).enactedFunctions->exists(ef | (ef) = self))).deactivate) in 
		Relation Coincides(self.makeinactive, anyAssociatedFCdeactivation)		

context FunctionalChain

-- too restrictive since a function can be used and activated in various FC
--	inv allenactedFunctionActivatedSynchronously:
--		Relation Coincides(self.enactedFunctions.makeactive)
	
--	inv activateFunctionsWhenActivated:
--		let allEnactedFunctionActivation : Event = Expression Union(self.enactedFunctions.makeactive) in
--		Relation Coincides (self.activate, allEnactedFunctionActivation)
		
-- too restrictive since a function can be used and deactivated in various FC
--	inv allenactedFunctionDeActivatedSynchronously:
--		Relation Coincides(self.enactedFunctions.makeinactive)
	
--	inv deactivateFunctionsWhenDeActivated:
--		let allEnactedFunctionDeactivation : Event = Expression Union(self.enactedFunctions.makeinactive) in
--		Relation Coincides (self.deactivate, allEnactedFunctionDeactivation)
		
	inv activateAltDeactivate:
		Relation Alternates(self.activate, self.deactivate)

context FunctionalExchange

--	def : sourceFunction : AbstractFunction =
--		self.sourceFunctionOutputPort.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction)
		
--	def : targetFunction : AbstractFunction =
--		self.targetFunctionInputPort.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction)
--
	inv SourcePrecedesTarget:
	(let sourceFunction : AbstractFunction =
		self.sourceFunctionOutputPort.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction) in
	let targetFunction : AbstractFunction =
		self.targetFunctionInputPort.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction) in
          	(Relation Alternates((sourceFunction).run,(targetFunction).run)))
          	

endpackage