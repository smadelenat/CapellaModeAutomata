package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.util.ModeSimulationResourceImpl
 * @generated
 */
public class ModeSimulationResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeSimulationResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {

		Resource result = new ModeSimulationResourceImpl(uri);
		return result;

	}

} //ModeSimulationResourceFactoryImpl
