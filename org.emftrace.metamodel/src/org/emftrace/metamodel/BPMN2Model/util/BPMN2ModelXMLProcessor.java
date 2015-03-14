/**
 */
package org.emftrace.metamodel.BPMN2Model.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.emftrace.metamodel.BPMN2Model.BPMN2ModelPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMN2ModelXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN2ModelXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		BPMN2ModelPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the BPMN2ModelResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new BPMN2ModelResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new BPMN2ModelResourceFactoryImpl());
		}
		return registrations;
	}

} //BPMN2ModelXMLProcessor
