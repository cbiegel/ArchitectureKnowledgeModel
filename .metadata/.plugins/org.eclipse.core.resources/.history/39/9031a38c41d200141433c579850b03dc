/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftrace.metamodel.QUARCModel.Packages.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsFactory;
import org.emftrace.metamodel.QUARCModel.Constraints.PredefinedConstraintSetCatalogue;
import org.emftrace.metamodel.QUARCModel.Constraints.TechnicalPropertiesCatalogue;
import org.emftrace.metamodel.QUARCModel.Constraints.impl.ConstraintsFactoryImpl;
import org.emftrace.metamodel.QUARCModel.GSS.GSS;
import org.emftrace.metamodel.QUARCModel.GSS.GSSFactory;
import org.emftrace.metamodel.QUARCModel.GSS.TagsCatalogue;
import org.emftrace.metamodel.QUARCModel.GSS.impl.GSSFactoryImpl;
import org.emftrace.metamodel.QUARCModel.Packages.*;
import org.emftrace.metamodel.QUARCModel.Query.GSSQueryContainment;
import org.emftrace.metamodel.QUARCModel.Query.QueryFactory;
import org.emftrace.metamodel.QUARCModel.Query.impl.QueryFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackagesFactoryImpl extends EFactoryImpl implements PackagesFactory {


	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackagesFactory init() {
		try {
			PackagesFactory thePackagesFactory = (PackagesFactory)EPackage.Registry.INSTANCE.getEFactory(PackagesPackage.eNS_URI);
			if (thePackagesFactory != null) {
				return thePackagesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PackagesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PackagesPackage.TOOLBOX: return createToolbox();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Toolbox createToolbox() {
		ToolboxImpl toolbox = new ToolboxImpl();
		GSSFactory gssfactory = new GSSFactoryImpl();
		GSS gss = gssfactory.createGSS();
		TagsCatalogue tags = gssfactory.createTagsCatalogue();
		
		ConstraintsFactory constraintsFactory = new ConstraintsFactoryImpl();
		
		TechnicalPropertiesCatalogue technicalPropertiesCatalogue = constraintsFactory.createTechnicalPropertiesCatalogue();
		PredefinedConstraintSetCatalogue predefinedConstraintSetCatalogue = constraintsFactory.createPredefinedConstraintSetCatalogue();
		
		QueryFactory queryFactory = new QueryFactoryImpl();
		
		GSSQueryContainment gssQueryContainment = queryFactory.createGSSQueryContainment();

		toolbox.setGssCatalogue(gss);
		toolbox.setTagsCatalogue(tags);
		toolbox.setPredefinedContraintsSetCatalogue(predefinedConstraintSetCatalogue);
		toolbox.setPropertiesCatalogue(technicalPropertiesCatalogue);
		toolbox.setQueryContainment(gssQueryContainment);

		return toolbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagesPackage getPackagesPackage() {
		return (PackagesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PackagesPackage getPackage() {
		return PackagesPackage.eINSTANCE;
	}

} //PackagesFactoryImpl
