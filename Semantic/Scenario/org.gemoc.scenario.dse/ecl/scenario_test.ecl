import 'http://www.polarsys.org/capella/core/modeller/1.3.0'
import 'http://www.polarsys.org/kitalpha/emde/1.0.0'
import 'http://www.polarsys.org/capella/core/interaction/1.3.0' 

import 'http://www.polarsys.org/capella/core/ctx/1.3.0'
import 'http://www.polarsys.org/capella/core/common/1.3.0'
import 'http://www.eclipse.org/emf/2002/Ecore'
import 'http://www.polarsys.org/capella/core/la/1.3.0' 
import 'http://www.polarsys.org/capella/core/cs/1.3.0' 

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport  "platform:/resource/org.gemoc.scenario.mocc/mocc/lib4RT.ccslLib"
ECLimport  "platform:/resource/org.gemoc.scenario.mocc/mocc/temporalConstraints.moccml" 

package capellamodeller

endpackage

package emde

endpackage

----ONLY FOR THALES DEMO --> SHOULD USE bcoOl
package ctx

  context SystemFunction
  
	def if (self.ownedFunctions->isEmpty()) : ACTIVATED : Event = self.getLabel()
	def if (self.ownedFunctions->isEmpty()) : STARTED : Event = self.hasUnnamedLabel()
	def if (self.ownedFunctions->isEmpty()) : TERMINATED : Event = self.hasUnnamedLabel()
	def if (self.ownedFunctions->isEmpty()) : SUSPENDED : Event = self.getFullLabel()
	def if (self.ownedFunctions->isEmpty()) : unsuspend : Event = self.destroy()
	def if (self.ownedFunctions->isEmpty()) : isRunning : Event = self.getLabel()
	def if (self.ownedFunctions->isEmpty()) : hasBeenElected : Event = self
	
  context System
  	def : isWorking : Event = self
  --	def : isIdle : Event = self

  context SystemAnalysis
 	def : ms : Event = self
endpackage


----- END ONLY FOR THALES DEMO
 

package interaction 

	context MessageEnd
	 def : messEnd_occurs : Event = self.getLabel()
	 
	context ExecutionEnd
	 def : execEnd_occurs : Event = self.getLabel()
	 
	context AbstractEnd
	 def : abstractEnd_occurs : Event = self--.isOccurring()

	context InstanceRole
		inv endsInOrder:
			Relation Causes(self.abstractEnds.abstractEnd_occurs)
			
		inv nonRentrantSCenario:
			(self.abstractEnds->size() > 1) implies
			(Relation WeakAlternates(self.abstractEnds->first().abstractEnd_occurs, self.abstractEnds->last().abstractEnd_occurs))
			
	context SequenceMessage	
		inv instantaneousReply:
			(self.kind = MessageKind::REPLY) implies
			(Relation Causes(self.sendingEnd.messEnd_occurs,self.receivingEnd.messEnd_occurs))
			
		inv causalityCall:
			(self.kind <> MessageKind::REPLY) implies
			(Relation Causes(self.sendingEnd.messEnd_occurs,self.receivingEnd.messEnd_occurs))
		
		inv sendMeansActivates:
		(self.kind <> MessageKind::REPLY) implies
			(Relation Coincides(self.sendingEnd.messEnd_occurs, self.receivingFunction.oclAsType(ctx::SystemFunction).ACTIVATED)) 
			
--		inv sendifRunning:
--		(self.kind <> MessageKind::REPLY) implies
--			(Relation SubClock(self.sendingEnd.messEnd_occurs, self.sendingEnd.covered.representedInstance.oclAsType(ctx::SystemFunction).isRunning)) 

	context MessageEnd 
		inv messIsAbst:
			Relation Coincides(self.abstractEnd_occurs, self.messEnd_occurs)
	
	context ExecutionEnd
		inv execIsAbst:
			Relation Coincides(self.abstractEnd_occurs, self.execEnd_occurs)
	
	context Execution
	
			inv eitherElectedXORmessageOccured:
			Relation Exclusion(self.covered.representedInstance.oclAsType(ctx::SystemFunction).hasBeenElected, self.start.oclAsType(AbstractEnd).abstractEnd_occurs)
	
			inv startedOrrElectedMeansStarts:
			let startedOrElected : Event = Expression Union(self.covered.representedInstance.oclAsType(ctx::SystemFunction).hasBeenElected, self.start.oclAsType(AbstractEnd).abstractEnd_occurs) in
			(Relation Coincides(startedOrElected, self.covered.representedInstance.oclAsType(ctx::SystemFunction).STARTED))
--		inv startWhenEndOccurs:
--			Relation Coincides(self.covered.representedInstance.oclAsType(ctx::SystemFunction).ACTIVATED, self.start.oclAsType(AbstractEnd).abstractEnd_occurs)
		inv stopWhenEndOccurs:
			Relation Coincides(self.finish.oclAsType(AbstractEnd).abstractEnd_occurs, self.covered.representedInstance.oclAsType(ctx::SystemFunction).TERMINATED)
		inv startBeforeFinish_nonRentrant:
			Relation WeakAlternates(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, self.finish.oclAsType(AbstractEnd).abstractEnd_occurs)

	context ConstraintDuration
		inv DurationAsAPeriodic:
		((self.duration.startsWith('p')) and
		self.duration.replaceAll('^..','').replaceAll(';.*','').toString().toInteger().round() <> 0) implies 
			let  period1 : Integer = self.duration.replaceAll('^..','').replaceAll(';.*','').toString().toInteger().round() in
			let  jitter1 : Integer = self.duration.replaceAll('..[0-9]+;','').replaceAll(']','').toString().toInteger().round() in
			Relation PeriodicWithJitterUnknowOffset(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, 
							  self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ecore::EObject).oclAsType(ctx::SystemAnalysis).ms,
							  period1, jitter1
			)
	
	
		inv DurationOfAllocatedExec:
		((not (self.duration.startsWith('p'))) and
		self.duration.replaceAll('^.','').replaceAll(';.*','').toString().toInteger().round() <> 0 and
		self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ecore::EObject).eContents()->select(eo | (eo).oclIsKindOf(ctx::System)).oclAsType(ctx::System).ownedFunctionalAllocation.function->exists(sf | ((sf) = self.start.oclAsType(AbstractEnd).covered.representedInstance))
		) implies 
			let bestExecCase1 : Integer = self.duration.replaceAll('^.','').replaceAll(';.*','').toString().toInteger().round() in
			let worstlExecCase1 : Integer = self.duration.replaceAll('.[0-9]+;','').replaceAll(']','').toString().toInteger().round() in
			Relation Duration(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, 
							  self.finish.oclAsType(AbstractEnd).abstractEnd_occurs,
							  self.start.oclAsType(AbstractEnd).covered.representedInstance.oclAsType(ctx::SystemFunction).isRunning,
							  bestExecCase1, worstlExecCase1
			)
--			self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ecore::EObject).oclAsType(ctx::SystemAnalysis).ms,

		inv DurationOfNonAllocatedExec:
		((not (self.duration.startsWith('p'))) and
		 self.duration.replaceAll('^.','').replaceAll(';.*','').toString().toInteger().round() <> 0 and not
		(self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ecore::EObject).eContents()->select(eo | (eo).oclIsKindOf(ctx::System)).oclAsType(ctx::System).ownedFunctionalAllocation.function->exists(sf | ((sf) = self.start.oclAsType(AbstractEnd).covered.representedInstance)))
		) implies 
			let bestExecCase : Integer = self.duration.replaceAll('^.','').replaceAll(';.*','').toString().toInteger().round() in
			let worstlExecCase : Integer = self.duration.replaceAll('.[0-9]+;','').replaceAll(']','').toString().toInteger().round() in
			Relation Duration(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, 
							  self.finish.oclAsType(AbstractEnd).abstractEnd_occurs,
							  self.start.oclAsType(AbstractEnd).covered.representedInstance.oclAsType(ctx::SystemFunction).isRunning,
							  bestExecCase, worstlExecCase
			)
--			 self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ecore::EObject).oclAsType(ctx::SystemAnalysis).ms,
		inv DurationOfZero:
		((not (self.duration.startsWith('p'))) and
		self.duration.replaceAll('^.','').replaceAll(';.*','').toString().toInteger().round() = 0
			and
		 self.duration.replaceAll('.[0-9]+;','').replaceAll(']','').toString().toInteger().round() = 0
		) implies
		(Relation Coincides(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, 
						    self.finish.oclAsType(AbstractEnd).abstractEnd_occurs
					 )
		 ) 
--							self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ecore::EObject).oclAsType(ctx::SystemAnalysis).ms

endpackage	

----ONLY FOR THALES DEMO --> SHOULD USE bcoOl


package ctx

  context System

	
	inv nonPreemptiveSched_part2:
	(self.ownedFunctionalAllocation->size() > 0) implies
		(Relation Exclusion(self.ownedFunctionalAllocation.function.oclAsType(SystemFunction).STARTED))
	
	
	
	inv isWorkingIfATaskIsRunning:
		let aTaskIsRunning : Event = Expression Union(self.ownedFunctionalAllocation.function.oclAsType(SystemFunction).isRunning) in
		Relation Coincides(aTaskIsRunning, self.isWorking)
		
  context SystemFunction
  
  	inv unsuspendBeforeElection:
  	(self.ownedFunctions->isEmpty()) implies
  		(Relation Causes(self.unsuspend, self.hasBeenElected))
   
	inv taskTaskInv:
	(self.ownedFunctions->isEmpty()) implies
		(Relation TaskState(self.ACTIVATED,self.STARTED,self.TERMINATED,self.SUSPENDED,self.unsuspend, self.isRunning))
	
	
	
	
	
	
	--suspend is the union of all synchronousCall+allOtherStarts from the same CPU






	inv isRunningTakesTime:
	(self.ownedFunctions->isEmpty()) implies
		(Relation SubClock(self.isRunning, self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ms))
		
--	inv startsSynchronous:
--	(self.ownedFunctions->isEmpty()) implies
--		(Relation SubClock(self.STARTED, self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ms))	
----	inv terminatesSynchronous:
----	(self.ownedFunctions->isEmpty()) implies
----		(Relation SubClock(self.TERMINATED, self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ms))
--	inv SuspendsSynchronous:
--	(self.ownedFunctions->isEmpty()) implies
--		(Relation SubClock(self.SUSPENDED, self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ms))
--	inv activatedSynchronous:
--	(self.ownedFunctions->isEmpty()) implies
--		(Relation SubClock(self.ACTIVATED, self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ms))
--	inv unsuspendsSynchronous:
--	(self.ownedFunctions->isEmpty()) implies
--		(Relation SubClock(self.unsuspend, self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ms))
	
endpackage

----- END ONLY FOR THALMES DEMO	
			
			