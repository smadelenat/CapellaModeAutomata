package org.gemoc.xcapella.scenario.animator.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.kitalpha.emde.model.ElementExtension;

public class ScenarioAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		
		res.add(new StringCouple("ScenarioAnimation","xCapellaAnimation"));

		return res;
	}

	@Override
	public boolean hasBeenActivated(EObject instruction) {
		// TODO Auto-generated method stub
		
//		if(instruction instanceof CapellaElement){
//			EList<ElementExtension> ownedExs = ((CapellaElement)instruction).getOwnedExtensions();
//			
//			
//			boolean res=false; 
//			for (ElementExtension elementExtension : ownedExs) {
//				
//				res  = super.hasBeenActivated(elementExtension);
//				if(res) return true;
//		
//			}
//		}
		

		return super.hasBeenActivated(instruction);
	}




}
