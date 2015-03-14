/**
 */
package org.emftrace.metamodel.URNModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.URNModel.URNModelFactory
 * @model kind="package"
 * @generated
 */
public interface URNModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "URNModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "URNModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "URNModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	URNModelPackage eINSTANCE = org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.URNBaseImpl <em>URN Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.URNBaseImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getURNBase()
	 * @generated
	 */
	int URN_BASE = 79;

	/**
	 * The number of structural features of the '<em>URN Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URN_BASE_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.URNmodelElementImpl <em>UR Nmodel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.URNmodelElementImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getURNmodelElement()
	 * @generated
	 */
	int UR_NMODEL_ELEMENT = 74;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NMODEL_ELEMENT__ID = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NMODEL_ELEMENT__NAME = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NMODEL_ELEMENT__METADATA = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NMODEL_ELEMENT__TO_LINKS = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NMODEL_ELEMENT__FROM_LINKS = URN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NMODEL_ELEMENT__DESC = URN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NMODEL_ELEMENT__CONCERN = URN_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>UR Nmodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NMODEL_ELEMENT_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.UCMmodelElementImpl <em>UC Mmodel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.UCMmodelElementImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getUCMmodelElement()
	 * @generated
	 */
	int UC_MMODEL_ELEMENT = 71;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMODEL_ELEMENT__ID = UR_NMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMODEL_ELEMENT__NAME = UR_NMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMODEL_ELEMENT__METADATA = UR_NMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMODEL_ELEMENT__TO_LINKS = UR_NMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMODEL_ELEMENT__FROM_LINKS = UR_NMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMODEL_ELEMENT__DESC = UR_NMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMODEL_ELEMENT__CONCERN = UR_NMODEL_ELEMENT__CONCERN;

	/**
	 * The number of structural features of the '<em>UC Mmodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMODEL_ELEMENT_FEATURE_COUNT = UR_NMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.GeneralResourceImpl <em>General Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.GeneralResourceImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getGeneralResource()
	 * @generated
	 */
	int GENERAL_RESOURCE = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE__ID = UC_MMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE__NAME = UC_MMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE__METADATA = UC_MMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE__TO_LINKS = UC_MMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE__FROM_LINKS = UC_MMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE__DESC = UC_MMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE__CONCERN = UC_MMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE__MULTIPLICITY = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE__SCHED_POLICY = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>General Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ActiveResourceImpl <em>Active Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ActiveResourceImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getActiveResource()
	 * @generated
	 */
	int ACTIVE_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__ID = GENERAL_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__NAME = GENERAL_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__METADATA = GENERAL_RESOURCE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__TO_LINKS = GENERAL_RESOURCE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__FROM_LINKS = GENERAL_RESOURCE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__DESC = GENERAL_RESOURCE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__CONCERN = GENERAL_RESOURCE__CONCERN;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__MULTIPLICITY = GENERAL_RESOURCE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__SCHED_POLICY = GENERAL_RESOURCE__SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Op Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__OP_TIME = GENERAL_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE__UNIT = GENERAL_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Active Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE_FEATURE_COUNT = GENERAL_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.GRLmodelElementImpl <em>GR Lmodel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.GRLmodelElementImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getGRLmodelElement()
	 * @generated
	 */
	int GR_LMODEL_ELEMENT = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LMODEL_ELEMENT__ID = UR_NMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LMODEL_ELEMENT__NAME = UR_NMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LMODEL_ELEMENT__METADATA = UR_NMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LMODEL_ELEMENT__TO_LINKS = UR_NMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LMODEL_ELEMENT__FROM_LINKS = UR_NMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LMODEL_ELEMENT__DESC = UR_NMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LMODEL_ELEMENT__CONCERN = UR_NMODEL_ELEMENT__CONCERN;

	/**
	 * The number of structural features of the '<em>GR Lmodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LMODEL_ELEMENT_FEATURE_COUNT = UR_NMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.GRLLinkableElementImpl <em>GRL Linkable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.GRLLinkableElementImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getGRLLinkableElement()
	 * @generated
	 */
	int GRL_LINKABLE_ELEMENT = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_LINKABLE_ELEMENT__ID = GR_LMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_LINKABLE_ELEMENT__NAME = GR_LMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_LINKABLE_ELEMENT__METADATA = GR_LMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_LINKABLE_ELEMENT__TO_LINKS = GR_LMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_LINKABLE_ELEMENT__FROM_LINKS = GR_LMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_LINKABLE_ELEMENT__DESC = GR_LMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_LINKABLE_ELEMENT__CONCERN = GR_LMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Links Dest</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_LINKABLE_ELEMENT__LINKS_DEST = GR_LMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links Src</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_LINKABLE_ELEMENT__LINKS_SRC = GR_LMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GRL Linkable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_LINKABLE_ELEMENT_FEATURE_COUNT = GR_LMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ActorImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ID = GRL_LINKABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = GRL_LINKABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__METADATA = GRL_LINKABLE_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TO_LINKS = GRL_LINKABLE_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__FROM_LINKS = GRL_LINKABLE_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESC = GRL_LINKABLE_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONCERN = GRL_LINKABLE_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Links Dest</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__LINKS_DEST = GRL_LINKABLE_ELEMENT__LINKS_DEST;

	/**
	 * The feature id for the '<em><b>Links Src</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__LINKS_SRC = GRL_LINKABLE_ELEMENT__LINKS_SRC;

	/**
	 * The feature id for the '<em><b>Collapsed Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__COLLAPSED_REFS = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTOR_REFS = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__STYLE = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elems</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ELEMS = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ActorRefImpl <em>Actor Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ActorRefImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getActorRef()
	 * @generated
	 */
	int ACTOR_REF = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REF__ID = GR_LMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REF__NAME = GR_LMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REF__METADATA = GR_LMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REF__TO_LINKS = GR_LMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REF__FROM_LINKS = GR_LMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REF__DESC = GR_LMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REF__CONCERN = GR_LMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REF__LABEL = GR_LMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REF__ACTOR_DEF = GR_LMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REF__NODES = GR_LMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REF__POS = GR_LMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REF__SIZE = GR_LMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Actor Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REF_FEATURE_COUNT = GR_LMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.PathNodeImpl <em>Path Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.PathNodeImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getPathNode()
	 * @generated
	 */
	int PATH_NODE = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__ID = UC_MMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__NAME = UC_MMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__METADATA = UC_MMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__TO_LINKS = UC_MMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__FROM_LINKS = UC_MMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__DESC = UC_MMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__CONCERN = UC_MMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__LABEL = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__PRED = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__SUCC = UC_MMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__CONT_REF = UC_MMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE__POS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Path Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NODE_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.AndForkImpl <em>And Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.AndForkImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getAndFork()
	 * @generated
	 */
	int AND_FORK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__ID = PATH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__NAME = PATH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__METADATA = PATH_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__TO_LINKS = PATH_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__FROM_LINKS = PATH_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__DESC = PATH_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__CONCERN = PATH_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__LABEL = PATH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__PRED = PATH_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__SUCC = PATH_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__CONT_REF = PATH_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK__POS = PATH_NODE__POS;

	/**
	 * The number of structural features of the '<em>And Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FORK_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.AndJoinImpl <em>And Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.AndJoinImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getAndJoin()
	 * @generated
	 */
	int AND_JOIN = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__ID = PATH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__NAME = PATH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__METADATA = PATH_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__TO_LINKS = PATH_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__FROM_LINKS = PATH_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__DESC = PATH_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__CONCERN = PATH_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__LABEL = PATH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__PRED = PATH_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__SUCC = PATH_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__CONT_REF = PATH_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN__POS = PATH_NODE__POS;

	/**
	 * The number of structural features of the '<em>And Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.WorkloadImpl <em>Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.WorkloadImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getWorkload()
	 * @generated
	 */
	int WORKLOAD = 78;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__ID = UC_MMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__NAME = UC_MMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__METADATA = UC_MMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__TO_LINKS = UC_MMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__FROM_LINKS = UC_MMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__DESC = UC_MMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__CONCERN = UC_MMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__UNIT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ClosedWorkloadImpl <em>Closed Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ClosedWorkloadImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getClosedWorkload()
	 * @generated
	 */
	int CLOSED_WORKLOAD = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD__ID = WORKLOAD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD__NAME = WORKLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD__METADATA = WORKLOAD__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD__TO_LINKS = WORKLOAD__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD__FROM_LINKS = WORKLOAD__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD__DESC = WORKLOAD__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD__CONCERN = WORKLOAD__CONCERN;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD__UNIT = WORKLOAD__UNIT;

	/**
	 * The feature id for the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD__POPULATION = WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD__EXTERNAL_DELAY = WORKLOAD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Closed Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_FEATURE_COUNT = WORKLOAD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.GRLNodeImpl <em>GRL Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.GRLNodeImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getGRLNode()
	 * @generated
	 */
	int GRL_NODE = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_NODE__ID = GR_LMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_NODE__NAME = GR_LMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_NODE__METADATA = GR_LMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_NODE__TO_LINKS = GR_LMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_NODE__FROM_LINKS = GR_LMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_NODE__DESC = GR_LMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_NODE__CONCERN = GR_LMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_NODE__PRED = GR_LMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_NODE__SUCC = GR_LMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_NODE__CONT_REF = GR_LMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_NODE__POS = GR_LMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_NODE__SIZE = GR_LMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>GRL Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_NODE_FEATURE_COUNT = GR_LMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.CollapsedActorRefImpl <em>Collapsed Actor Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.CollapsedActorRefImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getCollapsedActorRef()
	 * @generated
	 */
	int COLLAPSED_ACTOR_REF = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF__ID = GRL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF__NAME = GRL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF__METADATA = GRL_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF__TO_LINKS = GRL_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF__FROM_LINKS = GRL_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF__DESC = GRL_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF__CONCERN = GRL_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF__PRED = GRL_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF__SUCC = GRL_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF__CONT_REF = GRL_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF__POS = GRL_NODE__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF__SIZE = GRL_NODE__SIZE;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF__ACTOR = GRL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collapsed Actor Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSED_ACTOR_REF_FEATURE_COUNT = GRL_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.CommentImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__DESCRIPTION = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__X = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__Y = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__WIDTH = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__HEIGHT = URN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__FILL_COLOR = URN_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ComponentImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = UC_MMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = UC_MMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__METADATA = UC_MMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TO_LINKS = UC_MMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FROM_LINKS = UC_MMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESC = UC_MMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONCERN = UC_MMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__KIND = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROTECTED = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTEXT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = UC_MMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Included Components</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INCLUDED_COMPONENTS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Including Components</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INCLUDING_COMPONENTS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HOST = UC_MMODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RESOURCE = UC_MMODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Comp Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMP_REFS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STYLE = UC_MMODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ComponentBindingImpl <em>Component Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ComponentBindingImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComponentBinding()
	 * @generated
	 */
	int COMPONENT_BINDING = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BINDING__ID = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BINDING__PARENT_COMPONENT = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Plugin Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BINDING__PLUGIN_COMPONENT = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_BINDING_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ComponentRefImpl <em>Component Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ComponentRefImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComponentRef()
	 * @generated
	 */
	int COMPONENT_REF = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__ID = UC_MMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__NAME = UC_MMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__METADATA = UC_MMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__TO_LINKS = UC_MMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__FROM_LINKS = UC_MMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__DESC = UC_MMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__CONCERN = UC_MMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Parent Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__PARENT_BINDINGS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plugin Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__PLUGIN_BINDINGS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comp Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__COMP_DEF = UC_MMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__LABEL = UC_MMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__CHILDREN = UC_MMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__PARENT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__NODES = UC_MMODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__POS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF__SIZE = UC_MMODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Component Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REF_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ComponentTypeImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__ID = UC_MMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = UC_MMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__METADATA = UC_MMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__TO_LINKS = UC_MMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__FROM_LINKS = UC_MMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__DESC = UC_MMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__CONCERN = UC_MMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__INSTANCES = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ConcernImpl <em>Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ConcernImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getConcern()
	 * @generated
	 */
	int CONCERN = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ID = UR_NMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__NAME = UR_NMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__METADATA = UR_NMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__TO_LINKS = UR_NMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__FROM_LINKS = UR_NMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__DESC = UR_NMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__CONCERN = UR_NMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__CONDITION = UR_NMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN__ELEMENTS = UR_NMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_FEATURE_COUNT = UR_NMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ConcreteConditionImpl <em>Concrete Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ConcreteConditionImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getConcreteCondition()
	 * @generated
	 */
	int CONCRETE_CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONDITION__LABEL = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONDITION__DESCRIPTION = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concrete Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CONDITION_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ConcreteGRLspecImpl <em>Concrete GR Lspec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ConcreteGRLspecImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getConcreteGRLspec()
	 * @generated
	 */
	int CONCRETE_GR_LSPEC = 14;

	/**
	 * The feature id for the '<em><b>Show As Means End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_GR_LSPEC__SHOW_AS_MEANS_END = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete GR Lspec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_GR_LSPEC_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ConcreteStyleImpl <em>Concrete Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ConcreteStyleImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getConcreteStyle()
	 * @generated
	 */
	int CONCRETE_STYLE = 15;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STYLE__LINE_COLOR = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STYLE__FILL_COLOR = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STYLE__FILLED = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concrete Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_STYLE_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ConcreteURNspecImpl <em>Concrete UR Nspec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ConcreteURNspecImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getConcreteURNspec()
	 * @generated
	 */
	int CONCRETE_UR_NSPEC = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_UR_NSPEC__DESCRIPTION = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_UR_NSPEC__AUTHOR = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_UR_NSPEC__CREATED = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_UR_NSPEC__MODIFIED = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Spec Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_UR_NSPEC__SPEC_VERSION = URN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Urn Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_UR_NSPEC__URN_VERSION = URN_BASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Concrete UR Nspec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_UR_NSPEC_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ConditionImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 17;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DESC = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__LABEL = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ConnectImpl <em>Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ConnectImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getConnect()
	 * @generated
	 */
	int CONNECT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__ID = PATH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__NAME = PATH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__METADATA = PATH_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__TO_LINKS = PATH_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__FROM_LINKS = PATH_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__DESC = PATH_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__CONCERN = PATH_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__LABEL = PATH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__PRED = PATH_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__SUCC = PATH_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__CONT_REF = PATH_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__POS = PATH_NODE__POS;

	/**
	 * The number of structural features of the '<em>Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ElementLinkImpl <em>Element Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ElementLinkImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getElementLink()
	 * @generated
	 */
	int ELEMENT_LINK = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LINK__ID = GR_LMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LINK__NAME = GR_LMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LINK__METADATA = GR_LMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LINK__TO_LINKS = GR_LMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LINK__FROM_LINKS = GR_LMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LINK__DESC = GR_LMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LINK__CONCERN = GR_LMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LINK__REFS = GR_LMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LINK__DEST = GR_LMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LINK__SRC = GR_LMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_LINK_FEATURE_COUNT = GR_LMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ContributionImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__ID = ELEMENT_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__NAME = ELEMENT_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__METADATA = ELEMENT_LINK__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__TO_LINKS = ELEMENT_LINK__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__FROM_LINKS = ELEMENT_LINK__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__DESC = ELEMENT_LINK__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__CONCERN = ELEMENT_LINK__CONCERN;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__REFS = ELEMENT_LINK__REFS;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__DEST = ELEMENT_LINK__DEST;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__SRC = ELEMENT_LINK__SRC;

	/**
	 * The feature id for the '<em><b>Contribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__CONTRIBUTION = ELEMENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantitative Contribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__QUANTITATIVE_CONTRIBUTION = ELEMENT_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__CORRELATION = ELEMENT_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = ELEMENT_LINK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.DecompositionImpl <em>Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.DecompositionImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDecomposition()
	 * @generated
	 */
	int DECOMPOSITION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__ID = ELEMENT_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__NAME = ELEMENT_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__METADATA = ELEMENT_LINK__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__TO_LINKS = ELEMENT_LINK__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__FROM_LINKS = ELEMENT_LINK__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__DESC = ELEMENT_LINK__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__CONCERN = ELEMENT_LINK__CONCERN;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__REFS = ELEMENT_LINK__REFS;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__DEST = ELEMENT_LINK__DEST;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__SRC = ELEMENT_LINK__SRC;

	/**
	 * The number of structural features of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_FEATURE_COUNT = ELEMENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.DemandImpl <em>Demand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.DemandImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDemand()
	 * @generated
	 */
	int DEMAND = 21;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND__QUANTITY = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND__RESOURCE = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMAND_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.DependencyImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ID = ELEMENT_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = ELEMENT_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__METADATA = ELEMENT_LINK__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TO_LINKS = ELEMENT_LINK__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__FROM_LINKS = ELEMENT_LINK__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DESC = ELEMENT_LINK__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__CONCERN = ELEMENT_LINK__CONCERN;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__REFS = ELEMENT_LINK__REFS;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEST = ELEMENT_LINK__DEST;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SRC = ELEMENT_LINK__SRC;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = ELEMENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.DescriptionImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__DESCRIPTION = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.DirectionArrowImpl <em>Direction Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.DirectionArrowImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDirectionArrow()
	 * @generated
	 */
	int DIRECTION_ARROW = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_ARROW__ID = PATH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_ARROW__NAME = PATH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_ARROW__METADATA = PATH_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_ARROW__TO_LINKS = PATH_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_ARROW__FROM_LINKS = PATH_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_ARROW__DESC = PATH_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_ARROW__CONCERN = PATH_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_ARROW__LABEL = PATH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_ARROW__PRED = PATH_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_ARROW__SUCC = PATH_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_ARROW__CONT_REF = PATH_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_ARROW__POS = PATH_NODE__POS;

	/**
	 * The number of structural features of the '<em>Direction Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_ARROW_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.DocumentRootImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 25;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>UR Nspec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UR_NSPEC = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.EmptyPointImpl <em>Empty Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.EmptyPointImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getEmptyPoint()
	 * @generated
	 */
	int EMPTY_POINT = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_POINT__ID = PATH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_POINT__NAME = PATH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_POINT__METADATA = PATH_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_POINT__TO_LINKS = PATH_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_POINT__FROM_LINKS = PATH_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_POINT__DESC = PATH_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_POINT__CONCERN = PATH_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_POINT__LABEL = PATH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_POINT__PRED = PATH_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_POINT__SUCC = PATH_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_POINT__CONT_REF = PATH_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_POINT__POS = PATH_NODE__POS;

	/**
	 * The number of structural features of the '<em>Empty Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_POINT_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.EndPointImpl <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.EndPointImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getEndPoint()
	 * @generated
	 */
	int END_POINT = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__ID = PATH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__NAME = PATH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__METADATA = PATH_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__TO_LINKS = PATH_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__FROM_LINKS = PATH_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__DESC = PATH_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__CONCERN = PATH_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__LABEL = PATH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__PRED = PATH_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__SUCC = PATH_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__CONT_REF = PATH_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__POS = PATH_NODE__POS;

	/**
	 * The feature id for the '<em><b>Out Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__OUT_BINDINGS = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__POSTCONDITION = PATH_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.EnumerationTypeImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__ID = UC_MMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__NAME = UC_MMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__METADATA = UC_MMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__TO_LINKS = UC_MMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__FROM_LINKS = UC_MMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__DESC = UC_MMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__CONCERN = UC_MMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__VALUES = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__INSTANCES = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.EvaluationImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 30;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__EVALUATION = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualitative Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__QUALITATIVE_EVALUATION = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Int Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__INT_ELEMENT = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.EvaluationStrategyImpl <em>Evaluation Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.EvaluationStrategyImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getEvaluationStrategy()
	 * @generated
	 */
	int EVALUATION_STRATEGY = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_STRATEGY__ID = GR_LMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_STRATEGY__NAME = GR_LMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_STRATEGY__METADATA = GR_LMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_STRATEGY__TO_LINKS = GR_LMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_STRATEGY__FROM_LINKS = GR_LMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_STRATEGY__DESC = GR_LMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_STRATEGY__CONCERN = GR_LMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Evaluations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_STRATEGY__EVALUATIONS = GR_LMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_STRATEGY__GROUP = GR_LMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evaluation Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_STRATEGY_FEATURE_COUNT = GR_LMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ExternalOperationImpl <em>External Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ExternalOperationImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getExternalOperation()
	 * @generated
	 */
	int EXTERNAL_OPERATION = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION__ID = ACTIVE_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION__NAME = ACTIVE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION__METADATA = ACTIVE_RESOURCE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION__TO_LINKS = ACTIVE_RESOURCE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION__FROM_LINKS = ACTIVE_RESOURCE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION__DESC = ACTIVE_RESOURCE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION__CONCERN = ACTIVE_RESOURCE__CONCERN;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION__MULTIPLICITY = ACTIVE_RESOURCE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION__SCHED_POLICY = ACTIVE_RESOURCE__SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Op Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION__OP_TIME = ACTIVE_RESOURCE__OP_TIME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION__UNIT = ACTIVE_RESOURCE__UNIT;

	/**
	 * The feature id for the '<em><b>Demands</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION__DEMANDS = ACTIVE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OPERATION_FEATURE_COUNT = ACTIVE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.GRLGraphImpl <em>GRL Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.GRLGraphImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getGRLGraph()
	 * @generated
	 */
	int GRL_GRAPH = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_GRAPH__ID = GR_LMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_GRAPH__NAME = GR_LMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_GRAPH__METADATA = GR_LMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_GRAPH__TO_LINKS = GR_LMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_GRAPH__FROM_LINKS = GR_LMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_GRAPH__DESC = GR_LMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_GRAPH__CONCERN = GR_LMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_GRAPH__CONNECTIONS = GR_LMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_GRAPH__NODES = GR_LMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cont Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_GRAPH__CONT_REFS = GR_LMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_GRAPH__COMMENTS = GR_LMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>GRL Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRL_GRAPH_FEATURE_COUNT = GR_LMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.GRLspecImpl <em>GR Lspec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.GRLspecImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getGRLspec()
	 * @generated
	 */
	int GR_LSPEC = 38;

	/**
	 * The feature id for the '<em><b>Int Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LSPEC__INT_ELEMENTS = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LSPEC__ACTORS = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LSPEC__LINKS = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LSPEC__GROUPS = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LSPEC__STRATEGIES = URN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Grl Graphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LSPEC__GRL_GRAPHS = URN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LSPEC__INFO = URN_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>GR Lspec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GR_LSPEC_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.InBindingImpl <em>In Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.InBindingImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getInBinding()
	 * @generated
	 */
	int IN_BINDING = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BINDING__ID = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BINDING__START_POINT = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stub Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BINDING__STUB_ENTRY = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>In Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BINDING_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.InitializationImpl <em>Initialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.InitializationImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getInitialization()
	 * @generated
	 */
	int INITIALIZATION = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION__VALUE = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION__VARIABLE = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.IntentionalElementImpl <em>Intentional Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.IntentionalElementImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getIntentionalElement()
	 * @generated
	 */
	int INTENTIONAL_ELEMENT = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__ID = GRL_LINKABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__NAME = GRL_LINKABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__METADATA = GRL_LINKABLE_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__TO_LINKS = GRL_LINKABLE_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__FROM_LINKS = GRL_LINKABLE_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__DESC = GRL_LINKABLE_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__CONCERN = GRL_LINKABLE_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Links Dest</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__LINKS_DEST = GRL_LINKABLE_ELEMENT__LINKS_DEST;

	/**
	 * The feature id for the '<em><b>Links Src</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__LINKS_SRC = GRL_LINKABLE_ELEMENT__LINKS_SRC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__TYPE = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__IMPORTANCE = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__REFS = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__STYLE = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT__ACTOR = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Intentional Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_FEATURE_COUNT = GRL_LINKABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.IntentionalElementRefImpl <em>Intentional Element Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.IntentionalElementRefImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getIntentionalElementRef()
	 * @generated
	 */
	int INTENTIONAL_ELEMENT_REF = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF__ID = GRL_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF__NAME = GRL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF__METADATA = GRL_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF__TO_LINKS = GRL_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF__FROM_LINKS = GRL_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF__DESC = GRL_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF__CONCERN = GRL_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF__PRED = GRL_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF__SUCC = GRL_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF__CONT_REF = GRL_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF__POS = GRL_NODE__POS;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF__SIZE = GRL_NODE__SIZE;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF__DEF = GRL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intentional Element Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTIONAL_ELEMENT_REF_FEATURE_COUNT = GRL_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.LabelImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 43;

	/**
	 * The feature id for the '<em><b>Delta X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DELTA_X = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delta Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DELTA_Y = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.LinkRefImpl <em>Link Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.LinkRefImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getLinkRef()
	 * @generated
	 */
	int LINK_REF = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__ID = GR_LMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__NAME = GR_LMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__METADATA = GR_LMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__TO_LINKS = GR_LMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__FROM_LINKS = GR_LMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__DESC = GR_LMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__CONCERN = GR_LMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Curve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__CURVE = GR_LMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__LINK = GR_LMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__BENDPOINTS = GR_LMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__LABEL = GR_LMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__TARGET = GR_LMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF__SOURCE = GR_LMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Link Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF_FEATURE_COUNT = GR_LMODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.LinkRefBendpointImpl <em>Link Ref Bendpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.LinkRefBendpointImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getLinkRefBendpoint()
	 * @generated
	 */
	int LINK_REF_BENDPOINT = 45;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF_BENDPOINT__X = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF_BENDPOINT__Y = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link Ref Bendpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_REF_BENDPOINT_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.MetadataImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__NAME = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__VALUE = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl <em>Node Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getNodeConnection()
	 * @generated
	 */
	int NODE_CONNECTION = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONNECTION__ID = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONNECTION__PROBABILITY = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONNECTION__THRESHOLD = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONNECTION__IN_BINDINGS = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Out Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONNECTION__OUT_BINDINGS = URN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONNECTION__CONDITION = URN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONNECTION__TIMER = URN_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONNECTION__LABEL = URN_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONNECTION__TARGET = URN_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONNECTION__SOURCE = URN_BASE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Node Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONNECTION_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.OpenWorkloadImpl <em>Open Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.OpenWorkloadImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOpenWorkload()
	 * @generated
	 */
	int OPEN_WORKLOAD = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD__ID = WORKLOAD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD__NAME = WORKLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD__METADATA = WORKLOAD__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD__TO_LINKS = WORKLOAD__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD__FROM_LINKS = WORKLOAD__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD__DESC = WORKLOAD__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD__CONCERN = WORKLOAD__CONCERN;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD__UNIT = WORKLOAD__UNIT;

	/**
	 * The number of structural features of the '<em>Open Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_FEATURE_COUNT = WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.OrForkImpl <em>Or Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.OrForkImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOrFork()
	 * @generated
	 */
	int OR_FORK = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__ID = PATH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__NAME = PATH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__METADATA = PATH_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__TO_LINKS = PATH_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__FROM_LINKS = PATH_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__DESC = PATH_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__CONCERN = PATH_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__LABEL = PATH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__PRED = PATH_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__SUCC = PATH_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__CONT_REF = PATH_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK__POS = PATH_NODE__POS;

	/**
	 * The number of structural features of the '<em>Or Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FORK_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.OrJoinImpl <em>Or Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.OrJoinImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOrJoin()
	 * @generated
	 */
	int OR_JOIN = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__ID = PATH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__NAME = PATH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__METADATA = PATH_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__TO_LINKS = PATH_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__FROM_LINKS = PATH_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__DESC = PATH_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__CONCERN = PATH_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__LABEL = PATH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__PRED = PATH_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__SUCC = PATH_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__CONT_REF = PATH_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN__POS = PATH_NODE__POS;

	/**
	 * The number of structural features of the '<em>Or Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JOIN_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.OutBindingImpl <em>Out Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.OutBindingImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOutBinding()
	 * @generated
	 */
	int OUT_BINDING = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_BINDING__ID = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_BINDING__END_POINT = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stub Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_BINDING__STUB_EXIT = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Out Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_BINDING_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.OWPeriodicImpl <em>OW Periodic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.OWPeriodicImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOWPeriodic()
	 * @generated
	 */
	int OW_PERIODIC = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PERIODIC__ID = OPEN_WORKLOAD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PERIODIC__NAME = OPEN_WORKLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PERIODIC__METADATA = OPEN_WORKLOAD__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PERIODIC__TO_LINKS = OPEN_WORKLOAD__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PERIODIC__FROM_LINKS = OPEN_WORKLOAD__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PERIODIC__DESC = OPEN_WORKLOAD__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PERIODIC__CONCERN = OPEN_WORKLOAD__CONCERN;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PERIODIC__UNIT = OPEN_WORKLOAD__UNIT;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PERIODIC__PERIOD = OPEN_WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PERIODIC__DEVIATION = OPEN_WORKLOAD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OW Periodic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PERIODIC_FEATURE_COUNT = OPEN_WORKLOAD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.OWPhaseTypeImpl <em>OW Phase Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.OWPhaseTypeImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOWPhaseType()
	 * @generated
	 */
	int OW_PHASE_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PHASE_TYPE__ID = OPEN_WORKLOAD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PHASE_TYPE__NAME = OPEN_WORKLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PHASE_TYPE__METADATA = OPEN_WORKLOAD__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PHASE_TYPE__TO_LINKS = OPEN_WORKLOAD__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PHASE_TYPE__FROM_LINKS = OPEN_WORKLOAD__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PHASE_TYPE__DESC = OPEN_WORKLOAD__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PHASE_TYPE__CONCERN = OPEN_WORKLOAD__CONCERN;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PHASE_TYPE__UNIT = OPEN_WORKLOAD__UNIT;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PHASE_TYPE__ALPHA = OPEN_WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PHASE_TYPE__S = OPEN_WORKLOAD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OW Phase Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_PHASE_TYPE_FEATURE_COUNT = OPEN_WORKLOAD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.OWPoissonImpl <em>OW Poisson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.OWPoissonImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOWPoisson()
	 * @generated
	 */
	int OW_POISSON = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_POISSON__ID = OPEN_WORKLOAD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_POISSON__NAME = OPEN_WORKLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_POISSON__METADATA = OPEN_WORKLOAD__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_POISSON__TO_LINKS = OPEN_WORKLOAD__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_POISSON__FROM_LINKS = OPEN_WORKLOAD__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_POISSON__DESC = OPEN_WORKLOAD__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_POISSON__CONCERN = OPEN_WORKLOAD__CONCERN;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_POISSON__UNIT = OPEN_WORKLOAD__UNIT;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_POISSON__MEAN = OPEN_WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OW Poisson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_POISSON_FEATURE_COUNT = OPEN_WORKLOAD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.OWUniformImpl <em>OW Uniform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.OWUniformImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOWUniform()
	 * @generated
	 */
	int OW_UNIFORM = 55;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_UNIFORM__ID = OPEN_WORKLOAD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_UNIFORM__NAME = OPEN_WORKLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_UNIFORM__METADATA = OPEN_WORKLOAD__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_UNIFORM__TO_LINKS = OPEN_WORKLOAD__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_UNIFORM__FROM_LINKS = OPEN_WORKLOAD__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_UNIFORM__DESC = OPEN_WORKLOAD__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_UNIFORM__CONCERN = OPEN_WORKLOAD__CONCERN;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_UNIFORM__UNIT = OPEN_WORKLOAD__UNIT;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_UNIFORM__START = OPEN_WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_UNIFORM__END = OPEN_WORKLOAD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OW Uniform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OW_UNIFORM_FEATURE_COUNT = OPEN_WORKLOAD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.PassiveResourceImpl <em>Passive Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.PassiveResourceImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getPassiveResource()
	 * @generated
	 */
	int PASSIVE_RESOURCE = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__ID = GENERAL_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__NAME = GENERAL_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__METADATA = GENERAL_RESOURCE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__TO_LINKS = GENERAL_RESOURCE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__FROM_LINKS = GENERAL_RESOURCE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__DESC = GENERAL_RESOURCE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__CONCERN = GENERAL_RESOURCE__CONCERN;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__MULTIPLICITY = GENERAL_RESOURCE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__SCHED_POLICY = GENERAL_RESOURCE__SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE__COMPONENT = GENERAL_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Passive Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_RESOURCE_FEATURE_COUNT = GENERAL_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.PluginBindingImpl <em>Plugin Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.PluginBindingImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getPluginBinding()
	 * @generated
	 */
	int PLUGIN_BINDING = 58;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_BINDING__ID = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_BINDING__PROBABILITY = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Replication Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_BINDING__REPLICATION_FACTOR = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_BINDING__IN = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_BINDING__OUT = URN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_BINDING__PLUGIN = URN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_BINDING__PRECONDITION = URN_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_BINDING__COMPONENTS = URN_BASE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Plugin Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_BINDING_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.PositionImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 59;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ProcessingResourceImpl <em>Processing Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ProcessingResourceImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getProcessingResource()
	 * @generated
	 */
	int PROCESSING_RESOURCE = 60;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__ID = ACTIVE_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__NAME = ACTIVE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__METADATA = ACTIVE_RESOURCE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__TO_LINKS = ACTIVE_RESOURCE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__FROM_LINKS = ACTIVE_RESOURCE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__DESC = ACTIVE_RESOURCE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__CONCERN = ACTIVE_RESOURCE__CONCERN;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__MULTIPLICITY = ACTIVE_RESOURCE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__SCHED_POLICY = ACTIVE_RESOURCE__SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Op Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__OP_TIME = ACTIVE_RESOURCE__OP_TIME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__UNIT = ACTIVE_RESOURCE__UNIT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__KIND = ACTIVE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE__COMPONENTS = ACTIVE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Processing Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_FEATURE_COUNT = ACTIVE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ResponsibilityImpl <em>Responsibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ResponsibilityImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getResponsibility()
	 * @generated
	 */
	int RESPONSIBILITY = 61;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__ID = UC_MMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__NAME = UC_MMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__METADATA = UC_MMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__TO_LINKS = UC_MMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__FROM_LINKS = UC_MMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__DESC = UC_MMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__CONCERN = UC_MMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__EXPRESSION = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Demands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__DEMANDS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resp Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__RESP_REFS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.RespRefImpl <em>Resp Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.RespRefImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getRespRef()
	 * @generated
	 */
	int RESP_REF = 62;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__ID = PATH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__NAME = PATH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__METADATA = PATH_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__TO_LINKS = PATH_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__FROM_LINKS = PATH_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__DESC = PATH_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__CONCERN = PATH_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__LABEL = PATH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__PRED = PATH_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__SUCC = PATH_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__CONT_REF = PATH_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__POS = PATH_NODE__POS;

	/**
	 * The feature id for the '<em><b>Repetition Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__REPETITION_COUNT = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__HOST_DEMAND = PATH_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resp Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF__RESP_DEF = PATH_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resp Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESP_REF_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ScenarioDefImpl <em>Scenario Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ScenarioDefImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getScenarioDef()
	 * @generated
	 */
	int SCENARIO_DEF = 63;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__ID = UC_MMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__NAME = UC_MMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__METADATA = UC_MMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__TO_LINKS = UC_MMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__FROM_LINKS = UC_MMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__DESC = UC_MMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__CONCERN = UC_MMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Initializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__INITIALIZATIONS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__POSTCONDITIONS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__PRECONDITIONS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Scenarios</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__PARENT_SCENARIOS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Included Scenarios</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__INCLUDED_SCENARIOS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__GROUPS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Start Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__START_POINTS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF__END_POINTS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Scenario Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_DEF_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.ScenarioGroupImpl <em>Scenario Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.ScenarioGroupImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getScenarioGroup()
	 * @generated
	 */
	int SCENARIO_GROUP = 64;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_GROUP__ID = UC_MMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_GROUP__NAME = UC_MMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_GROUP__METADATA = UC_MMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_GROUP__TO_LINKS = UC_MMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_GROUP__FROM_LINKS = UC_MMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_GROUP__DESC = UC_MMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_GROUP__CONCERN = UC_MMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_GROUP__SCENARIOS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scenario Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_GROUP_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.SizeImpl <em>Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.SizeImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 65;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__WIDTH = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__HEIGHT = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.StartPointImpl <em>Start Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.StartPointImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getStartPoint()
	 * @generated
	 */
	int START_POINT = 66;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__ID = PATH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__NAME = PATH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__METADATA = PATH_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__TO_LINKS = PATH_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__FROM_LINKS = PATH_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__DESC = PATH_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__CONCERN = PATH_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__LABEL = PATH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__PRED = PATH_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__SUCC = PATH_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__CONT_REF = PATH_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__POS = PATH_NODE__POS;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__WORKLOAD = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Bindings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__IN_BINDINGS = PATH_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__PRECONDITION = PATH_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Start Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.StrategiesGroupImpl <em>Strategies Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.StrategiesGroupImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getStrategiesGroup()
	 * @generated
	 */
	int STRATEGIES_GROUP = 67;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIES_GROUP__ID = GR_LMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIES_GROUP__NAME = GR_LMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIES_GROUP__METADATA = GR_LMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIES_GROUP__TO_LINKS = GR_LMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIES_GROUP__FROM_LINKS = GR_LMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIES_GROUP__DESC = GR_LMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIES_GROUP__CONCERN = GR_LMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIES_GROUP__STRATEGIES = GR_LMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strategies Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIES_GROUP_FEATURE_COUNT = GR_LMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.StubImpl <em>Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.StubImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getStub()
	 * @generated
	 */
	int STUB = 68;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__ID = PATH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__NAME = PATH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__METADATA = PATH_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__TO_LINKS = PATH_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__FROM_LINKS = PATH_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__DESC = PATH_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__CONCERN = PATH_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__LABEL = PATH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__PRED = PATH_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__SUCC = PATH_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__CONT_REF = PATH_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__POS = PATH_NODE__POS;

	/**
	 * The feature id for the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__DYNAMIC = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synchronizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__SYNCHRONIZING = PATH_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__BLOCKING = PATH_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__BINDINGS = PATH_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.WaitingPlaceImpl <em>Waiting Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.WaitingPlaceImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getWaitingPlace()
	 * @generated
	 */
	int WAITING_PLACE = 77;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE__ID = PATH_NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE__NAME = PATH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE__METADATA = PATH_NODE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE__TO_LINKS = PATH_NODE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE__FROM_LINKS = PATH_NODE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE__DESC = PATH_NODE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE__CONCERN = PATH_NODE__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE__LABEL = PATH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE__PRED = PATH_NODE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE__SUCC = PATH_NODE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE__CONT_REF = PATH_NODE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE__POS = PATH_NODE__POS;

	/**
	 * The feature id for the '<em><b>Wait Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE__WAIT_TYPE = PATH_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Waiting Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_PLACE_FEATURE_COUNT = PATH_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.TimerImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 69;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__ID = WAITING_PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__NAME = WAITING_PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__METADATA = WAITING_PLACE__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__TO_LINKS = WAITING_PLACE__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__FROM_LINKS = WAITING_PLACE__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__DESC = WAITING_PLACE__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__CONCERN = WAITING_PLACE__CONCERN;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__LABEL = WAITING_PLACE__LABEL;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__PRED = WAITING_PLACE__PRED;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__SUCC = WAITING_PLACE__SUCC;

	/**
	 * The feature id for the '<em><b>Cont Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__CONT_REF = WAITING_PLACE__CONT_REF;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__POS = WAITING_PLACE__POS;

	/**
	 * The feature id for the '<em><b>Wait Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__WAIT_TYPE = WAITING_PLACE__WAIT_TYPE;

	/**
	 * The feature id for the '<em><b>Timeout Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__TIMEOUT_PATH = WAITING_PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FEATURE_COUNT = WAITING_PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.UCMmapImpl <em>UC Mmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.UCMmapImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getUCMmap()
	 * @generated
	 */
	int UC_MMAP = 70;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP__ID = UC_MMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP__NAME = UC_MMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP__METADATA = UC_MMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP__TO_LINKS = UC_MMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP__FROM_LINKS = UC_MMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP__DESC = UC_MMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP__CONCERN = UC_MMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP__SINGLETON = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Stub</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP__PARENT_STUB = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cont Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP__CONT_REFS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP__CONNECTIONS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP__NODES = UC_MMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP__COMMENTS = UC_MMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>UC Mmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MMAP_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.UCMspecImpl <em>UC Mspec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.UCMspecImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getUCMspec()
	 * @generated
	 */
	int UC_MSPEC = 72;

	/**
	 * The feature id for the '<em><b>Enumeration Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MSPEC__ENUMERATION_TYPES = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MSPEC__VARIABLES = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scenario Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MSPEC__SCENARIO_GROUPS = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MSPEC__RESOURCES = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ucm Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MSPEC__UCM_MAPS = URN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MSPEC__COMPONENTS = URN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Component Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MSPEC__COMPONENT_TYPES = URN_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Responsibilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MSPEC__RESPONSIBILITIES = URN_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Scenario Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MSPEC__SCENARIO_DEFS = URN_BASE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>UC Mspec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_MSPEC_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.URNlinkImpl <em>UR Nlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.URNlinkImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getURNlink()
	 * @generated
	 */
	int UR_NLINK = 73;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NLINK__ID = UR_NMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NLINK__NAME = UR_NMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NLINK__METADATA = UR_NMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NLINK__TO_LINKS = UR_NMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NLINK__FROM_LINKS = UR_NMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NLINK__DESC = UR_NMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NLINK__CONCERN = UR_NMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NLINK__TYPE = UR_NMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Elem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NLINK__TO_ELEM = UR_NMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Elem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NLINK__FROM_ELEM = UR_NMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>UR Nlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NLINK_FEATURE_COUNT = UR_NMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.URNspecImpl <em>UR Nspec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.URNspecImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getURNspec()
	 * @generated
	 */
	int UR_NSPEC = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NSPEC__NAME = URN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ucmspec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NSPEC__UCMSPEC = URN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NSPEC__METADATA = URN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Urn Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NSPEC__URN_LINKS = URN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Grlspec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NSPEC__GRLSPEC = URN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NSPEC__INFO = URN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NSPEC__CONCERNS = URN_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>UR Nspec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UR_NSPEC_FEATURE_COUNT = URN_BASE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.impl.VariableImpl
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 76;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ID = UC_MMODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = UC_MMODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__METADATA = UC_MMODEL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TO_LINKS = UC_MMODEL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FROM_LINKS = UC_MMODEL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DESC = UC_MMODEL_ELEMENT__DESC;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONCERN = UC_MMODEL_ELEMENT__CONCERN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = UC_MMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumeration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ENUMERATION_TYPE = UC_MMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = UC_MMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.ComponentKind <em>Component Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.ComponentKind
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComponentKind()
	 * @generated
	 */
	int COMPONENT_KIND = 80;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.ContributionType <em>Contribution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.ContributionType
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getContributionType()
	 * @generated
	 */
	int CONTRIBUTION_TYPE = 81;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.DatatypeKind <em>Datatype Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.DatatypeKind
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDatatypeKind()
	 * @generated
	 */
	int DATATYPE_KIND = 82;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.DecompositionType <em>Decomposition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.DecompositionType
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDecompositionType()
	 * @generated
	 */
	int DECOMPOSITION_TYPE = 83;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.DeviceKind <em>Device Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.DeviceKind
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDeviceKind()
	 * @generated
	 */
	int DEVICE_KIND = 84;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.ImportanceType <em>Importance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.ImportanceType
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getImportanceType()
	 * @generated
	 */
	int IMPORTANCE_TYPE = 85;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.IntentionalElementType <em>Intentional Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.IntentionalElementType
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getIntentionalElementType()
	 * @generated
	 */
	int INTENTIONAL_ELEMENT_TYPE = 86;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.QualitativeLabel <em>Qualitative Label</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.QualitativeLabel
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getQualitativeLabel()
	 * @generated
	 */
	int QUALITATIVE_LABEL = 87;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.TimeUnit
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 88;

	/**
	 * The meta object id for the '{@link org.emftrace.metamodel.URNModel.WaitKind <em>Wait Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftrace.metamodel.URNModel.WaitKind
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getWaitKind()
	 * @generated
	 */
	int WAIT_KIND = 89;

	/**
	 * The meta object id for the '<em>Component Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComponentKindObject()
	 * @generated
	 */
	int COMPONENT_KIND_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Contribution Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getContributionTypeObject()
	 * @generated
	 */
	int CONTRIBUTION_TYPE_OBJECT = 91;

	/**
	 * The meta object id for the '<em>Datatype Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDatatypeKindObject()
	 * @generated
	 */
	int DATATYPE_KIND_OBJECT = 92;

	/**
	 * The meta object id for the '<em>Decomposition Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDecompositionTypeObject()
	 * @generated
	 */
	int DECOMPOSITION_TYPE_OBJECT = 93;

	/**
	 * The meta object id for the '<em>Device Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDeviceKindObject()
	 * @generated
	 */
	int DEVICE_KIND_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Importance Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getImportanceTypeObject()
	 * @generated
	 */
	int IMPORTANCE_TYPE_OBJECT = 95;

	/**
	 * The meta object id for the '<em>Intentional Element Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getIntentionalElementTypeObject()
	 * @generated
	 */
	int INTENTIONAL_ELEMENT_TYPE_OBJECT = 96;

	/**
	 * The meta object id for the '<em>Qualitative Label Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getQualitativeLabelObject()
	 * @generated
	 */
	int QUALITATIVE_LABEL_OBJECT = 97;

	/**
	 * The meta object id for the '<em>Time Unit Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getTimeUnitObject()
	 * @generated
	 */
	int TIME_UNIT_OBJECT = 98;

	/**
	 * The meta object id for the '<em>Wait Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getWaitKindObject()
	 * @generated
	 */
	int WAIT_KIND_OBJECT = 99;


	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ActiveResource <em>Active Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Resource</em>'.
	 * @see org.emftrace.metamodel.URNModel.ActiveResource
	 * @generated
	 */
	EClass getActiveResource();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ActiveResource#getOpTime <em>Op Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Time</em>'.
	 * @see org.emftrace.metamodel.URNModel.ActiveResource#getOpTime()
	 * @see #getActiveResource()
	 * @generated
	 */
	EAttribute getActiveResource_OpTime();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ActiveResource#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.emftrace.metamodel.URNModel.ActiveResource#getUnit()
	 * @see #getActiveResource()
	 * @generated
	 */
	EAttribute getActiveResource_Unit();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.emftrace.metamodel.URNModel.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.Actor#getCollapsedRefs <em>Collapsed Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Collapsed Refs</em>'.
	 * @see org.emftrace.metamodel.URNModel.Actor#getCollapsedRefs()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_CollapsedRefs();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.Actor#getActorRefs <em>Actor Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actor Refs</em>'.
	 * @see org.emftrace.metamodel.URNModel.Actor#getActorRefs()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ActorRefs();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.Actor#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.emftrace.metamodel.URNModel.Actor#getStyle()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Style();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.Actor#getElems <em>Elems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Elems</em>'.
	 * @see org.emftrace.metamodel.URNModel.Actor#getElems()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Elems();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ActorRef <em>Actor Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Ref</em>'.
	 * @see org.emftrace.metamodel.URNModel.ActorRef
	 * @generated
	 */
	EClass getActorRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.ActorRef#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.emftrace.metamodel.URNModel.ActorRef#getLabel()
	 * @see #getActorRef()
	 * @generated
	 */
	EReference getActorRef_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ActorRef#getActorDef <em>Actor Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor Def</em>'.
	 * @see org.emftrace.metamodel.URNModel.ActorRef#getActorDef()
	 * @see #getActorRef()
	 * @generated
	 */
	EAttribute getActorRef_ActorDef();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.ActorRef#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nodes</em>'.
	 * @see org.emftrace.metamodel.URNModel.ActorRef#getNodes()
	 * @see #getActorRef()
	 * @generated
	 */
	EAttribute getActorRef_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.ActorRef#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos</em>'.
	 * @see org.emftrace.metamodel.URNModel.ActorRef#getPos()
	 * @see #getActorRef()
	 * @generated
	 */
	EReference getActorRef_Pos();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.ActorRef#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.emftrace.metamodel.URNModel.ActorRef#getSize()
	 * @see #getActorRef()
	 * @generated
	 */
	EReference getActorRef_Size();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.AndFork <em>And Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Fork</em>'.
	 * @see org.emftrace.metamodel.URNModel.AndFork
	 * @generated
	 */
	EClass getAndFork();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.AndJoin <em>And Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Join</em>'.
	 * @see org.emftrace.metamodel.URNModel.AndJoin
	 * @generated
	 */
	EClass getAndJoin();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ClosedWorkload <em>Closed Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closed Workload</em>'.
	 * @see org.emftrace.metamodel.URNModel.ClosedWorkload
	 * @generated
	 */
	EClass getClosedWorkload();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ClosedWorkload#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population</em>'.
	 * @see org.emftrace.metamodel.URNModel.ClosedWorkload#getPopulation()
	 * @see #getClosedWorkload()
	 * @generated
	 */
	EAttribute getClosedWorkload_Population();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ClosedWorkload#getExternalDelay <em>External Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Delay</em>'.
	 * @see org.emftrace.metamodel.URNModel.ClosedWorkload#getExternalDelay()
	 * @see #getClosedWorkload()
	 * @generated
	 */
	EAttribute getClosedWorkload_ExternalDelay();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.CollapsedActorRef <em>Collapsed Actor Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collapsed Actor Ref</em>'.
	 * @see org.emftrace.metamodel.URNModel.CollapsedActorRef
	 * @generated
	 */
	EClass getCollapsedActorRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.CollapsedActorRef#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor</em>'.
	 * @see org.emftrace.metamodel.URNModel.CollapsedActorRef#getActor()
	 * @see #getCollapsedActorRef()
	 * @generated
	 */
	EAttribute getCollapsedActorRef_Actor();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.emftrace.metamodel.URNModel.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Comment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.URNModel.Comment#getDescription()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Comment#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.emftrace.metamodel.URNModel.Comment#getX()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_X();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Comment#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.emftrace.metamodel.URNModel.Comment#getY()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Comment#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.emftrace.metamodel.URNModel.Comment#getWidth()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Comment#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.emftrace.metamodel.URNModel.Comment#getHeight()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Comment#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Color</em>'.
	 * @see org.emftrace.metamodel.URNModel.Comment#getFillColor()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_FillColor();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.emftrace.metamodel.URNModel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Component#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.emftrace.metamodel.URNModel.Component#getKind()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Component#isProtected <em>Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protected</em>'.
	 * @see org.emftrace.metamodel.URNModel.Component#isProtected()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Protected();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Component#isContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.emftrace.metamodel.URNModel.Component#isContext()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.Component#getIncludedComponents <em>Included Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Included Components</em>'.
	 * @see org.emftrace.metamodel.URNModel.Component#getIncludedComponents()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_IncludedComponents();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.Component#getIncludingComponents <em>Including Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Including Components</em>'.
	 * @see org.emftrace.metamodel.URNModel.Component#getIncludingComponents()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_IncludingComponents();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Component#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.emftrace.metamodel.URNModel.Component#getHost()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Component#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.emftrace.metamodel.URNModel.Component#getResource()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Resource();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.Component#getCompRefs <em>Comp Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comp Refs</em>'.
	 * @see org.emftrace.metamodel.URNModel.Component#getCompRefs()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_CompRefs();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.Component#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.emftrace.metamodel.URNModel.Component#getStyle()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Style();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ComponentBinding <em>Component Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Binding</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentBinding
	 * @generated
	 */
	EClass getComponentBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ComponentBinding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentBinding#getId()
	 * @see #getComponentBinding()
	 * @generated
	 */
	EAttribute getComponentBinding_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ComponentBinding#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Component</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentBinding#getParentComponent()
	 * @see #getComponentBinding()
	 * @generated
	 */
	EAttribute getComponentBinding_ParentComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ComponentBinding#getPluginComponent <em>Plugin Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Component</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentBinding#getPluginComponent()
	 * @see #getComponentBinding()
	 * @generated
	 */
	EAttribute getComponentBinding_PluginComponent();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ComponentRef <em>Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Ref</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentRef
	 * @generated
	 */
	EClass getComponentRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.ComponentRef#getParentBindings <em>Parent Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parent Bindings</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentRef#getParentBindings()
	 * @see #getComponentRef()
	 * @generated
	 */
	EAttribute getComponentRef_ParentBindings();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.ComponentRef#getPluginBindings <em>Plugin Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Plugin Bindings</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentRef#getPluginBindings()
	 * @see #getComponentRef()
	 * @generated
	 */
	EAttribute getComponentRef_PluginBindings();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ComponentRef#getCompDef <em>Comp Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp Def</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentRef#getCompDef()
	 * @see #getComponentRef()
	 * @generated
	 */
	EAttribute getComponentRef_CompDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.ComponentRef#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentRef#getLabel()
	 * @see #getComponentRef()
	 * @generated
	 */
	EReference getComponentRef_Label();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.ComponentRef#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Children</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentRef#getChildren()
	 * @see #getComponentRef()
	 * @generated
	 */
	EAttribute getComponentRef_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ComponentRef#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentRef#getParent()
	 * @see #getComponentRef()
	 * @generated
	 */
	EAttribute getComponentRef_Parent();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.ComponentRef#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nodes</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentRef#getNodes()
	 * @see #getComponentRef()
	 * @generated
	 */
	EAttribute getComponentRef_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.ComponentRef#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentRef#getPos()
	 * @see #getComponentRef()
	 * @generated
	 */
	EReference getComponentRef_Pos();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.ComponentRef#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentRef#getSize()
	 * @see #getComponentRef()
	 * @generated
	 */
	EReference getComponentRef_Size();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.ComponentType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Instances</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentType#getInstances()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Instances();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Concern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern</em>'.
	 * @see org.emftrace.metamodel.URNModel.Concern
	 * @generated
	 */
	EClass getConcern();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.Concern#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.emftrace.metamodel.URNModel.Concern#getCondition()
	 * @see #getConcern()
	 * @generated
	 */
	EReference getConcern_Condition();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.Concern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Elements</em>'.
	 * @see org.emftrace.metamodel.URNModel.Concern#getElements()
	 * @see #getConcern()
	 * @generated
	 */
	EAttribute getConcern_Elements();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ConcreteCondition <em>Concrete Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Condition</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteCondition
	 * @generated
	 */
	EClass getConcreteCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ConcreteCondition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteCondition#getLabel()
	 * @see #getConcreteCondition()
	 * @generated
	 */
	EAttribute getConcreteCondition_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ConcreteCondition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteCondition#getDescription()
	 * @see #getConcreteCondition()
	 * @generated
	 */
	EAttribute getConcreteCondition_Description();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ConcreteGRLspec <em>Concrete GR Lspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete GR Lspec</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteGRLspec
	 * @generated
	 */
	EClass getConcreteGRLspec();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ConcreteGRLspec#isShowAsMeansEnd <em>Show As Means End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show As Means End</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteGRLspec#isShowAsMeansEnd()
	 * @see #getConcreteGRLspec()
	 * @generated
	 */
	EAttribute getConcreteGRLspec_ShowAsMeansEnd();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ConcreteStyle <em>Concrete Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Style</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteStyle
	 * @generated
	 */
	EClass getConcreteStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ConcreteStyle#getLineColor <em>Line Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Color</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteStyle#getLineColor()
	 * @see #getConcreteStyle()
	 * @generated
	 */
	EAttribute getConcreteStyle_LineColor();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ConcreteStyle#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Color</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteStyle#getFillColor()
	 * @see #getConcreteStyle()
	 * @generated
	 */
	EAttribute getConcreteStyle_FillColor();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ConcreteStyle#isFilled <em>Filled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filled</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteStyle#isFilled()
	 * @see #getConcreteStyle()
	 * @generated
	 */
	EAttribute getConcreteStyle_Filled();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ConcreteURNspec <em>Concrete UR Nspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete UR Nspec</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteURNspec
	 * @generated
	 */
	EClass getConcreteURNspec();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ConcreteURNspec#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteURNspec#getDescription()
	 * @see #getConcreteURNspec()
	 * @generated
	 */
	EAttribute getConcreteURNspec_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ConcreteURNspec#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteURNspec#getAuthor()
	 * @see #getConcreteURNspec()
	 * @generated
	 */
	EAttribute getConcreteURNspec_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ConcreteURNspec#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteURNspec#getCreated()
	 * @see #getConcreteURNspec()
	 * @generated
	 */
	EAttribute getConcreteURNspec_Created();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ConcreteURNspec#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteURNspec#getModified()
	 * @see #getConcreteURNspec()
	 * @generated
	 */
	EAttribute getConcreteURNspec_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ConcreteURNspec#getSpecVersion <em>Spec Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec Version</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteURNspec#getSpecVersion()
	 * @see #getConcreteURNspec()
	 * @generated
	 */
	EAttribute getConcreteURNspec_SpecVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ConcreteURNspec#getUrnVersion <em>Urn Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urn Version</em>'.
	 * @see org.emftrace.metamodel.URNModel.ConcreteURNspec#getUrnVersion()
	 * @see #getConcreteURNspec()
	 * @generated
	 */
	EAttribute getConcreteURNspec_UrnVersion();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.emftrace.metamodel.URNModel.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.emftrace.metamodel.URNModel.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.Condition#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Desc</em>'.
	 * @see org.emftrace.metamodel.URNModel.Condition#getDesc()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.Condition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.emftrace.metamodel.URNModel.Condition#getLabel()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Label();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Connect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect</em>'.
	 * @see org.emftrace.metamodel.URNModel.Connect
	 * @generated
	 */
	EClass getConnect();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see org.emftrace.metamodel.URNModel.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Contribution#getContribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contribution</em>'.
	 * @see org.emftrace.metamodel.URNModel.Contribution#getContribution()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Contribution();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Contribution#getQuantitativeContribution <em>Quantitative Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantitative Contribution</em>'.
	 * @see org.emftrace.metamodel.URNModel.Contribution#getQuantitativeContribution()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_QuantitativeContribution();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Contribution#isCorrelation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correlation</em>'.
	 * @see org.emftrace.metamodel.URNModel.Contribution#isCorrelation()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Correlation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition</em>'.
	 * @see org.emftrace.metamodel.URNModel.Decomposition
	 * @generated
	 */
	EClass getDecomposition();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Demand <em>Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Demand</em>'.
	 * @see org.emftrace.metamodel.URNModel.Demand
	 * @generated
	 */
	EClass getDemand();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Demand#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.emftrace.metamodel.URNModel.Demand#getQuantity()
	 * @see #getDemand()
	 * @generated
	 */
	EAttribute getDemand_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Demand#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see org.emftrace.metamodel.URNModel.Demand#getResource()
	 * @see #getDemand()
	 * @generated
	 */
	EAttribute getDemand_Resource();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see org.emftrace.metamodel.URNModel.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.emftrace.metamodel.URNModel.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Description#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.emftrace.metamodel.URNModel.Description#getDescription()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Description();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.DirectionArrow <em>Direction Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direction Arrow</em>'.
	 * @see org.emftrace.metamodel.URNModel.DirectionArrow
	 * @generated
	 */
	EClass getDirectionArrow();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.emftrace.metamodel.URNModel.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.emftrace.metamodel.URNModel.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.emftrace.metamodel.URNModel.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.emftrace.metamodel.URNModel.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.emftrace.metamodel.URNModel.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.emftrace.metamodel.URNModel.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.DocumentRoot#getURNspec <em>UR Nspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UR Nspec</em>'.
	 * @see org.emftrace.metamodel.URNModel.DocumentRoot#getURNspec()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_URNspec();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ElementLink <em>Element Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Link</em>'.
	 * @see org.emftrace.metamodel.URNModel.ElementLink
	 * @generated
	 */
	EClass getElementLink();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.ElementLink#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Refs</em>'.
	 * @see org.emftrace.metamodel.URNModel.ElementLink#getRefs()
	 * @see #getElementLink()
	 * @generated
	 */
	EAttribute getElementLink_Refs();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ElementLink#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see org.emftrace.metamodel.URNModel.ElementLink#getDest()
	 * @see #getElementLink()
	 * @generated
	 */
	EAttribute getElementLink_Dest();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ElementLink#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.emftrace.metamodel.URNModel.ElementLink#getSrc()
	 * @see #getElementLink()
	 * @generated
	 */
	EAttribute getElementLink_Src();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.EmptyPoint <em>Empty Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Point</em>'.
	 * @see org.emftrace.metamodel.URNModel.EmptyPoint
	 * @generated
	 */
	EClass getEmptyPoint();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see org.emftrace.metamodel.URNModel.EndPoint
	 * @generated
	 */
	EClass getEndPoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.EndPoint#getOutBindings <em>Out Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Out Bindings</em>'.
	 * @see org.emftrace.metamodel.URNModel.EndPoint#getOutBindings()
	 * @see #getEndPoint()
	 * @generated
	 */
	EAttribute getEndPoint_OutBindings();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.EndPoint#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postcondition</em>'.
	 * @see org.emftrace.metamodel.URNModel.EndPoint#getPostcondition()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_Postcondition();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.EnumerationType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see org.emftrace.metamodel.URNModel.EnumerationType#getValues()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_Values();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.EnumerationType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Instances</em>'.
	 * @see org.emftrace.metamodel.URNModel.EnumerationType#getInstances()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_Instances();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see org.emftrace.metamodel.URNModel.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Evaluation#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation</em>'.
	 * @see org.emftrace.metamodel.URNModel.Evaluation#getEvaluation()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_Evaluation();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Evaluation#getQualitativeEvaluation <em>Qualitative Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualitative Evaluation</em>'.
	 * @see org.emftrace.metamodel.URNModel.Evaluation#getQualitativeEvaluation()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_QualitativeEvaluation();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Evaluation#getIntElement <em>Int Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Element</em>'.
	 * @see org.emftrace.metamodel.URNModel.Evaluation#getIntElement()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_IntElement();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.EvaluationStrategy <em>Evaluation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Strategy</em>'.
	 * @see org.emftrace.metamodel.URNModel.EvaluationStrategy
	 * @generated
	 */
	EClass getEvaluationStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.EvaluationStrategy#getEvaluations <em>Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluations</em>'.
	 * @see org.emftrace.metamodel.URNModel.EvaluationStrategy#getEvaluations()
	 * @see #getEvaluationStrategy()
	 * @generated
	 */
	EReference getEvaluationStrategy_Evaluations();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.EvaluationStrategy#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.emftrace.metamodel.URNModel.EvaluationStrategy#getGroup()
	 * @see #getEvaluationStrategy()
	 * @generated
	 */
	EAttribute getEvaluationStrategy_Group();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ExternalOperation <em>External Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Operation</em>'.
	 * @see org.emftrace.metamodel.URNModel.ExternalOperation
	 * @generated
	 */
	EClass getExternalOperation();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.ExternalOperation#getDemands <em>Demands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Demands</em>'.
	 * @see org.emftrace.metamodel.URNModel.ExternalOperation#getDemands()
	 * @see #getExternalOperation()
	 * @generated
	 */
	EAttribute getExternalOperation_Demands();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.GeneralResource <em>General Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Resource</em>'.
	 * @see org.emftrace.metamodel.URNModel.GeneralResource
	 * @generated
	 */
	EClass getGeneralResource();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.GeneralResource#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.emftrace.metamodel.URNModel.GeneralResource#getMultiplicity()
	 * @see #getGeneralResource()
	 * @generated
	 */
	EAttribute getGeneralResource_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.GeneralResource#getSchedPolicy <em>Sched Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sched Policy</em>'.
	 * @see org.emftrace.metamodel.URNModel.GeneralResource#getSchedPolicy()
	 * @see #getGeneralResource()
	 * @generated
	 */
	EAttribute getGeneralResource_SchedPolicy();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.GRLGraph <em>GRL Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GRL Graph</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLGraph
	 * @generated
	 */
	EClass getGRLGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.GRLGraph#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLGraph#getConnections()
	 * @see #getGRLGraph()
	 * @generated
	 */
	EReference getGRLGraph_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.GRLGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLGraph#getNodes()
	 * @see #getGRLGraph()
	 * @generated
	 */
	EReference getGRLGraph_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.GRLGraph#getContRefs <em>Cont Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cont Refs</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLGraph#getContRefs()
	 * @see #getGRLGraph()
	 * @generated
	 */
	EReference getGRLGraph_ContRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.GRLGraph#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLGraph#getComments()
	 * @see #getGRLGraph()
	 * @generated
	 */
	EReference getGRLGraph_Comments();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.GRLLinkableElement <em>GRL Linkable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GRL Linkable Element</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLLinkableElement
	 * @generated
	 */
	EClass getGRLLinkableElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.GRLLinkableElement#getLinksDest <em>Links Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Links Dest</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLLinkableElement#getLinksDest()
	 * @see #getGRLLinkableElement()
	 * @generated
	 */
	EAttribute getGRLLinkableElement_LinksDest();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.GRLLinkableElement#getLinksSrc <em>Links Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Links Src</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLLinkableElement#getLinksSrc()
	 * @see #getGRLLinkableElement()
	 * @generated
	 */
	EAttribute getGRLLinkableElement_LinksSrc();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.GRLmodelElement <em>GR Lmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GR Lmodel Element</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLmodelElement
	 * @generated
	 */
	EClass getGRLmodelElement();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.GRLNode <em>GRL Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GRL Node</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLNode
	 * @generated
	 */
	EClass getGRLNode();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.GRLNode#getPred <em>Pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pred</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLNode#getPred()
	 * @see #getGRLNode()
	 * @generated
	 */
	EAttribute getGRLNode_Pred();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.GRLNode#getSucc <em>Succ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Succ</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLNode#getSucc()
	 * @see #getGRLNode()
	 * @generated
	 */
	EAttribute getGRLNode_Succ();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.GRLNode#getContRef <em>Cont Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cont Ref</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLNode#getContRef()
	 * @see #getGRLNode()
	 * @generated
	 */
	EAttribute getGRLNode_ContRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.GRLNode#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLNode#getPos()
	 * @see #getGRLNode()
	 * @generated
	 */
	EReference getGRLNode_Pos();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.GRLNode#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLNode#getSize()
	 * @see #getGRLNode()
	 * @generated
	 */
	EReference getGRLNode_Size();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.GRLspec <em>GR Lspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GR Lspec</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLspec
	 * @generated
	 */
	EClass getGRLspec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.GRLspec#getIntElements <em>Int Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Int Elements</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLspec#getIntElements()
	 * @see #getGRLspec()
	 * @generated
	 */
	EReference getGRLspec_IntElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.GRLspec#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLspec#getActors()
	 * @see #getGRLspec()
	 * @generated
	 */
	EReference getGRLspec_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.GRLspec#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLspec#getLinks()
	 * @see #getGRLspec()
	 * @generated
	 */
	EReference getGRLspec_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.GRLspec#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLspec#getGroups()
	 * @see #getGRLspec()
	 * @generated
	 */
	EReference getGRLspec_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.GRLspec#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategies</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLspec#getStrategies()
	 * @see #getGRLspec()
	 * @generated
	 */
	EReference getGRLspec_Strategies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.GRLspec#getGrlGraphs <em>Grl Graphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grl Graphs</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLspec#getGrlGraphs()
	 * @see #getGRLspec()
	 * @generated
	 */
	EReference getGRLspec_GrlGraphs();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.GRLspec#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see org.emftrace.metamodel.URNModel.GRLspec#getInfo()
	 * @see #getGRLspec()
	 * @generated
	 */
	EReference getGRLspec_Info();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.InBinding <em>In Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Binding</em>'.
	 * @see org.emftrace.metamodel.URNModel.InBinding
	 * @generated
	 */
	EClass getInBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.InBinding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.emftrace.metamodel.URNModel.InBinding#getId()
	 * @see #getInBinding()
	 * @generated
	 */
	EAttribute getInBinding_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.InBinding#getStartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Point</em>'.
	 * @see org.emftrace.metamodel.URNModel.InBinding#getStartPoint()
	 * @see #getInBinding()
	 * @generated
	 */
	EAttribute getInBinding_StartPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.InBinding#getStubEntry <em>Stub Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stub Entry</em>'.
	 * @see org.emftrace.metamodel.URNModel.InBinding#getStubEntry()
	 * @see #getInBinding()
	 * @generated
	 */
	EAttribute getInBinding_StubEntry();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Initialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialization</em>'.
	 * @see org.emftrace.metamodel.URNModel.Initialization
	 * @generated
	 */
	EClass getInitialization();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Initialization#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftrace.metamodel.URNModel.Initialization#getValue()
	 * @see #getInitialization()
	 * @generated
	 */
	EAttribute getInitialization_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Initialization#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.emftrace.metamodel.URNModel.Initialization#getVariable()
	 * @see #getInitialization()
	 * @generated
	 */
	EAttribute getInitialization_Variable();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.IntentionalElement <em>Intentional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intentional Element</em>'.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElement
	 * @generated
	 */
	EClass getIntentionalElement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElement#getType()
	 * @see #getIntentionalElement()
	 * @generated
	 */
	EAttribute getIntentionalElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getDecompositionType <em>Decomposition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decomposition Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElement#getDecompositionType()
	 * @see #getIntentionalElement()
	 * @generated
	 */
	EAttribute getIntentionalElement_DecompositionType();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getImportance <em>Importance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importance</em>'.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElement#getImportance()
	 * @see #getIntentionalElement()
	 * @generated
	 */
	EAttribute getIntentionalElement_Importance();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getImportanceQuantitative <em>Importance Quantitative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importance Quantitative</em>'.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElement#getImportanceQuantitative()
	 * @see #getIntentionalElement()
	 * @generated
	 */
	EAttribute getIntentionalElement_ImportanceQuantitative();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Refs</em>'.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElement#getRefs()
	 * @see #getIntentionalElement()
	 * @generated
	 */
	EAttribute getIntentionalElement_Refs();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElement#getStyle()
	 * @see #getIntentionalElement()
	 * @generated
	 */
	EReference getIntentionalElement_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.IntentionalElement#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor</em>'.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElement#getActor()
	 * @see #getIntentionalElement()
	 * @generated
	 */
	EAttribute getIntentionalElement_Actor();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.IntentionalElementRef <em>Intentional Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intentional Element Ref</em>'.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElementRef
	 * @generated
	 */
	EClass getIntentionalElementRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.IntentionalElementRef#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Def</em>'.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElementRef#getDef()
	 * @see #getIntentionalElementRef()
	 * @generated
	 */
	EAttribute getIntentionalElementRef_Def();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.emftrace.metamodel.URNModel.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Label#getDeltaX <em>Delta X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta X</em>'.
	 * @see org.emftrace.metamodel.URNModel.Label#getDeltaX()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_DeltaX();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Label#getDeltaY <em>Delta Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta Y</em>'.
	 * @see org.emftrace.metamodel.URNModel.Label#getDeltaY()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_DeltaY();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.LinkRef <em>Link Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Ref</em>'.
	 * @see org.emftrace.metamodel.URNModel.LinkRef
	 * @generated
	 */
	EClass getLinkRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.LinkRef#isCurve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve</em>'.
	 * @see org.emftrace.metamodel.URNModel.LinkRef#isCurve()
	 * @see #getLinkRef()
	 * @generated
	 */
	EAttribute getLinkRef_Curve();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.LinkRef#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see org.emftrace.metamodel.URNModel.LinkRef#getLink()
	 * @see #getLinkRef()
	 * @generated
	 */
	EAttribute getLinkRef_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.LinkRef#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bendpoints</em>'.
	 * @see org.emftrace.metamodel.URNModel.LinkRef#getBendpoints()
	 * @see #getLinkRef()
	 * @generated
	 */
	EReference getLinkRef_Bendpoints();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.LinkRef#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.emftrace.metamodel.URNModel.LinkRef#getLabel()
	 * @see #getLinkRef()
	 * @generated
	 */
	EReference getLinkRef_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.LinkRef#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.emftrace.metamodel.URNModel.LinkRef#getTarget()
	 * @see #getLinkRef()
	 * @generated
	 */
	EAttribute getLinkRef_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.LinkRef#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.emftrace.metamodel.URNModel.LinkRef#getSource()
	 * @see #getLinkRef()
	 * @generated
	 */
	EAttribute getLinkRef_Source();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.LinkRefBendpoint <em>Link Ref Bendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Ref Bendpoint</em>'.
	 * @see org.emftrace.metamodel.URNModel.LinkRefBendpoint
	 * @generated
	 */
	EClass getLinkRefBendpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.LinkRefBendpoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.emftrace.metamodel.URNModel.LinkRefBendpoint#getX()
	 * @see #getLinkRefBendpoint()
	 * @generated
	 */
	EAttribute getLinkRefBendpoint_X();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.LinkRefBendpoint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.emftrace.metamodel.URNModel.LinkRefBendpoint#getY()
	 * @see #getLinkRefBendpoint()
	 * @generated
	 */
	EAttribute getLinkRefBendpoint_Y();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see org.emftrace.metamodel.URNModel.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Metadata#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.URNModel.Metadata#getName()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Metadata#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftrace.metamodel.URNModel.Metadata#getValue()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Value();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.NodeConnection <em>Node Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Connection</em>'.
	 * @see org.emftrace.metamodel.URNModel.NodeConnection
	 * @generated
	 */
	EClass getNodeConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.NodeConnection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.emftrace.metamodel.URNModel.NodeConnection#getId()
	 * @see #getNodeConnection()
	 * @generated
	 */
	EAttribute getNodeConnection_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.NodeConnection#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.emftrace.metamodel.URNModel.NodeConnection#getProbability()
	 * @see #getNodeConnection()
	 * @generated
	 */
	EAttribute getNodeConnection_Probability();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.NodeConnection#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see org.emftrace.metamodel.URNModel.NodeConnection#getThreshold()
	 * @see #getNodeConnection()
	 * @generated
	 */
	EAttribute getNodeConnection_Threshold();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.NodeConnection#getInBindings <em>In Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>In Bindings</em>'.
	 * @see org.emftrace.metamodel.URNModel.NodeConnection#getInBindings()
	 * @see #getNodeConnection()
	 * @generated
	 */
	EAttribute getNodeConnection_InBindings();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.NodeConnection#getOutBindings <em>Out Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Out Bindings</em>'.
	 * @see org.emftrace.metamodel.URNModel.NodeConnection#getOutBindings()
	 * @see #getNodeConnection()
	 * @generated
	 */
	EAttribute getNodeConnection_OutBindings();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.NodeConnection#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.emftrace.metamodel.URNModel.NodeConnection#getCondition()
	 * @see #getNodeConnection()
	 * @generated
	 */
	EReference getNodeConnection_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.NodeConnection#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer</em>'.
	 * @see org.emftrace.metamodel.URNModel.NodeConnection#getTimer()
	 * @see #getNodeConnection()
	 * @generated
	 */
	EAttribute getNodeConnection_Timer();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.NodeConnection#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.emftrace.metamodel.URNModel.NodeConnection#getLabel()
	 * @see #getNodeConnection()
	 * @generated
	 */
	EReference getNodeConnection_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.NodeConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.emftrace.metamodel.URNModel.NodeConnection#getTarget()
	 * @see #getNodeConnection()
	 * @generated
	 */
	EAttribute getNodeConnection_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.NodeConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.emftrace.metamodel.URNModel.NodeConnection#getSource()
	 * @see #getNodeConnection()
	 * @generated
	 */
	EAttribute getNodeConnection_Source();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.OpenWorkload <em>Open Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Workload</em>'.
	 * @see org.emftrace.metamodel.URNModel.OpenWorkload
	 * @generated
	 */
	EClass getOpenWorkload();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.OrFork <em>Or Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Fork</em>'.
	 * @see org.emftrace.metamodel.URNModel.OrFork
	 * @generated
	 */
	EClass getOrFork();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.OrJoin <em>Or Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Join</em>'.
	 * @see org.emftrace.metamodel.URNModel.OrJoin
	 * @generated
	 */
	EClass getOrJoin();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.OutBinding <em>Out Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Binding</em>'.
	 * @see org.emftrace.metamodel.URNModel.OutBinding
	 * @generated
	 */
	EClass getOutBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.OutBinding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.emftrace.metamodel.URNModel.OutBinding#getId()
	 * @see #getOutBinding()
	 * @generated
	 */
	EAttribute getOutBinding_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.OutBinding#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point</em>'.
	 * @see org.emftrace.metamodel.URNModel.OutBinding#getEndPoint()
	 * @see #getOutBinding()
	 * @generated
	 */
	EAttribute getOutBinding_EndPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.OutBinding#getStubExit <em>Stub Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stub Exit</em>'.
	 * @see org.emftrace.metamodel.URNModel.OutBinding#getStubExit()
	 * @see #getOutBinding()
	 * @generated
	 */
	EAttribute getOutBinding_StubExit();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.OWPeriodic <em>OW Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OW Periodic</em>'.
	 * @see org.emftrace.metamodel.URNModel.OWPeriodic
	 * @generated
	 */
	EClass getOWPeriodic();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.OWPeriodic#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.emftrace.metamodel.URNModel.OWPeriodic#getPeriod()
	 * @see #getOWPeriodic()
	 * @generated
	 */
	EAttribute getOWPeriodic_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.OWPeriodic#getDeviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deviation</em>'.
	 * @see org.emftrace.metamodel.URNModel.OWPeriodic#getDeviation()
	 * @see #getOWPeriodic()
	 * @generated
	 */
	EAttribute getOWPeriodic_Deviation();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.OWPhaseType <em>OW Phase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OW Phase Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.OWPhaseType
	 * @generated
	 */
	EClass getOWPhaseType();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.OWPhaseType#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see org.emftrace.metamodel.URNModel.OWPhaseType#getAlpha()
	 * @see #getOWPhaseType()
	 * @generated
	 */
	EAttribute getOWPhaseType_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.OWPhaseType#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see org.emftrace.metamodel.URNModel.OWPhaseType#getS()
	 * @see #getOWPhaseType()
	 * @generated
	 */
	EAttribute getOWPhaseType_S();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.OWPoisson <em>OW Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OW Poisson</em>'.
	 * @see org.emftrace.metamodel.URNModel.OWPoisson
	 * @generated
	 */
	EClass getOWPoisson();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.OWPoisson#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see org.emftrace.metamodel.URNModel.OWPoisson#getMean()
	 * @see #getOWPoisson()
	 * @generated
	 */
	EAttribute getOWPoisson_Mean();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.OWUniform <em>OW Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OW Uniform</em>'.
	 * @see org.emftrace.metamodel.URNModel.OWUniform
	 * @generated
	 */
	EClass getOWUniform();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.OWUniform#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.emftrace.metamodel.URNModel.OWUniform#getStart()
	 * @see #getOWUniform()
	 * @generated
	 */
	EAttribute getOWUniform_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.OWUniform#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.emftrace.metamodel.URNModel.OWUniform#getEnd()
	 * @see #getOWUniform()
	 * @generated
	 */
	EAttribute getOWUniform_End();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.PassiveResource <em>Passive Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Resource</em>'.
	 * @see org.emftrace.metamodel.URNModel.PassiveResource
	 * @generated
	 */
	EClass getPassiveResource();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.PassiveResource#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component</em>'.
	 * @see org.emftrace.metamodel.URNModel.PassiveResource#getComponent()
	 * @see #getPassiveResource()
	 * @generated
	 */
	EAttribute getPassiveResource_Component();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.PathNode <em>Path Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Node</em>'.
	 * @see org.emftrace.metamodel.URNModel.PathNode
	 * @generated
	 */
	EClass getPathNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.PathNode#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.emftrace.metamodel.URNModel.PathNode#getLabel()
	 * @see #getPathNode()
	 * @generated
	 */
	EReference getPathNode_Label();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.PathNode#getPred <em>Pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pred</em>'.
	 * @see org.emftrace.metamodel.URNModel.PathNode#getPred()
	 * @see #getPathNode()
	 * @generated
	 */
	EAttribute getPathNode_Pred();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.PathNode#getSucc <em>Succ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Succ</em>'.
	 * @see org.emftrace.metamodel.URNModel.PathNode#getSucc()
	 * @see #getPathNode()
	 * @generated
	 */
	EAttribute getPathNode_Succ();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.PathNode#getContRef <em>Cont Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cont Ref</em>'.
	 * @see org.emftrace.metamodel.URNModel.PathNode#getContRef()
	 * @see #getPathNode()
	 * @generated
	 */
	EAttribute getPathNode_ContRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.PathNode#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos</em>'.
	 * @see org.emftrace.metamodel.URNModel.PathNode#getPos()
	 * @see #getPathNode()
	 * @generated
	 */
	EReference getPathNode_Pos();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.PluginBinding <em>Plugin Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Binding</em>'.
	 * @see org.emftrace.metamodel.URNModel.PluginBinding
	 * @generated
	 */
	EClass getPluginBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.PluginBinding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.emftrace.metamodel.URNModel.PluginBinding#getId()
	 * @see #getPluginBinding()
	 * @generated
	 */
	EAttribute getPluginBinding_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.PluginBinding#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.emftrace.metamodel.URNModel.PluginBinding#getProbability()
	 * @see #getPluginBinding()
	 * @generated
	 */
	EAttribute getPluginBinding_Probability();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.PluginBinding#getReplicationFactor <em>Replication Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication Factor</em>'.
	 * @see org.emftrace.metamodel.URNModel.PluginBinding#getReplicationFactor()
	 * @see #getPluginBinding()
	 * @generated
	 */
	EAttribute getPluginBinding_ReplicationFactor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.PluginBinding#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In</em>'.
	 * @see org.emftrace.metamodel.URNModel.PluginBinding#getIn()
	 * @see #getPluginBinding()
	 * @generated
	 */
	EReference getPluginBinding_In();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.PluginBinding#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out</em>'.
	 * @see org.emftrace.metamodel.URNModel.PluginBinding#getOut()
	 * @see #getPluginBinding()
	 * @generated
	 */
	EReference getPluginBinding_Out();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.PluginBinding#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin</em>'.
	 * @see org.emftrace.metamodel.URNModel.PluginBinding#getPlugin()
	 * @see #getPluginBinding()
	 * @generated
	 */
	EAttribute getPluginBinding_Plugin();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.PluginBinding#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see org.emftrace.metamodel.URNModel.PluginBinding#getPrecondition()
	 * @see #getPluginBinding()
	 * @generated
	 */
	EReference getPluginBinding_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.PluginBinding#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.emftrace.metamodel.URNModel.PluginBinding#getComponents()
	 * @see #getPluginBinding()
	 * @generated
	 */
	EReference getPluginBinding_Components();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see org.emftrace.metamodel.URNModel.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.emftrace.metamodel.URNModel.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.emftrace.metamodel.URNModel.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ProcessingResource <em>Processing Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource</em>'.
	 * @see org.emftrace.metamodel.URNModel.ProcessingResource
	 * @generated
	 */
	EClass getProcessingResource();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ProcessingResource#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.emftrace.metamodel.URNModel.ProcessingResource#getKind()
	 * @see #getProcessingResource()
	 * @generated
	 */
	EAttribute getProcessingResource_Kind();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.ProcessingResource#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Components</em>'.
	 * @see org.emftrace.metamodel.URNModel.ProcessingResource#getComponents()
	 * @see #getProcessingResource()
	 * @generated
	 */
	EAttribute getProcessingResource_Components();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Responsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsibility</em>'.
	 * @see org.emftrace.metamodel.URNModel.Responsibility
	 * @generated
	 */
	EClass getResponsibility();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Responsibility#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.emftrace.metamodel.URNModel.Responsibility#getExpression()
	 * @see #getResponsibility()
	 * @generated
	 */
	EAttribute getResponsibility_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.Responsibility#getDemands <em>Demands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Demands</em>'.
	 * @see org.emftrace.metamodel.URNModel.Responsibility#getDemands()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_Demands();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.Responsibility#getRespRefs <em>Resp Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resp Refs</em>'.
	 * @see org.emftrace.metamodel.URNModel.Responsibility#getRespRefs()
	 * @see #getResponsibility()
	 * @generated
	 */
	EAttribute getResponsibility_RespRefs();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.RespRef <em>Resp Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resp Ref</em>'.
	 * @see org.emftrace.metamodel.URNModel.RespRef
	 * @generated
	 */
	EClass getRespRef();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.RespRef#getRepetitionCount <em>Repetition Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetition Count</em>'.
	 * @see org.emftrace.metamodel.URNModel.RespRef#getRepetitionCount()
	 * @see #getRespRef()
	 * @generated
	 */
	EAttribute getRespRef_RepetitionCount();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.RespRef#getHostDemand <em>Host Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Demand</em>'.
	 * @see org.emftrace.metamodel.URNModel.RespRef#getHostDemand()
	 * @see #getRespRef()
	 * @generated
	 */
	EAttribute getRespRef_HostDemand();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.RespRef#getRespDef <em>Resp Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resp Def</em>'.
	 * @see org.emftrace.metamodel.URNModel.RespRef#getRespDef()
	 * @see #getRespRef()
	 * @generated
	 */
	EAttribute getRespRef_RespDef();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ScenarioDef <em>Scenario Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Def</em>'.
	 * @see org.emftrace.metamodel.URNModel.ScenarioDef
	 * @generated
	 */
	EClass getScenarioDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.ScenarioDef#getInitializations <em>Initializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initializations</em>'.
	 * @see org.emftrace.metamodel.URNModel.ScenarioDef#getInitializations()
	 * @see #getScenarioDef()
	 * @generated
	 */
	EReference getScenarioDef_Initializations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.ScenarioDef#getPostconditions <em>Postconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postconditions</em>'.
	 * @see org.emftrace.metamodel.URNModel.ScenarioDef#getPostconditions()
	 * @see #getScenarioDef()
	 * @generated
	 */
	EReference getScenarioDef_Postconditions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.ScenarioDef#getPreconditions <em>Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preconditions</em>'.
	 * @see org.emftrace.metamodel.URNModel.ScenarioDef#getPreconditions()
	 * @see #getScenarioDef()
	 * @generated
	 */
	EReference getScenarioDef_Preconditions();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.ScenarioDef#getParentScenarios <em>Parent Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parent Scenarios</em>'.
	 * @see org.emftrace.metamodel.URNModel.ScenarioDef#getParentScenarios()
	 * @see #getScenarioDef()
	 * @generated
	 */
	EAttribute getScenarioDef_ParentScenarios();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ScenarioDef#getIncludedScenarios <em>Included Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Included Scenarios</em>'.
	 * @see org.emftrace.metamodel.URNModel.ScenarioDef#getIncludedScenarios()
	 * @see #getScenarioDef()
	 * @generated
	 */
	EAttribute getScenarioDef_IncludedScenarios();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.ScenarioDef#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Groups</em>'.
	 * @see org.emftrace.metamodel.URNModel.ScenarioDef#getGroups()
	 * @see #getScenarioDef()
	 * @generated
	 */
	EAttribute getScenarioDef_Groups();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.ScenarioDef#getStartPoints <em>Start Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Points</em>'.
	 * @see org.emftrace.metamodel.URNModel.ScenarioDef#getStartPoints()
	 * @see #getScenarioDef()
	 * @generated
	 */
	EAttribute getScenarioDef_StartPoints();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.ScenarioDef#getEndPoints <em>End Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>End Points</em>'.
	 * @see org.emftrace.metamodel.URNModel.ScenarioDef#getEndPoints()
	 * @see #getScenarioDef()
	 * @generated
	 */
	EAttribute getScenarioDef_EndPoints();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.ScenarioGroup <em>Scenario Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Group</em>'.
	 * @see org.emftrace.metamodel.URNModel.ScenarioGroup
	 * @generated
	 */
	EClass getScenarioGroup();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.ScenarioGroup#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scenarios</em>'.
	 * @see org.emftrace.metamodel.URNModel.ScenarioGroup#getScenarios()
	 * @see #getScenarioGroup()
	 * @generated
	 */
	EAttribute getScenarioGroup_Scenarios();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size</em>'.
	 * @see org.emftrace.metamodel.URNModel.Size
	 * @generated
	 */
	EClass getSize();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Size#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.emftrace.metamodel.URNModel.Size#getWidth()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Size#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.emftrace.metamodel.URNModel.Size#getHeight()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Height();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.StartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Point</em>'.
	 * @see org.emftrace.metamodel.URNModel.StartPoint
	 * @generated
	 */
	EClass getStartPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.StartPoint#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workload</em>'.
	 * @see org.emftrace.metamodel.URNModel.StartPoint#getWorkload()
	 * @see #getStartPoint()
	 * @generated
	 */
	EReference getStartPoint_Workload();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.StartPoint#getInBindings <em>In Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>In Bindings</em>'.
	 * @see org.emftrace.metamodel.URNModel.StartPoint#getInBindings()
	 * @see #getStartPoint()
	 * @generated
	 */
	EAttribute getStartPoint_InBindings();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.StartPoint#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see org.emftrace.metamodel.URNModel.StartPoint#getPrecondition()
	 * @see #getStartPoint()
	 * @generated
	 */
	EReference getStartPoint_Precondition();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.StrategiesGroup <em>Strategies Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategies Group</em>'.
	 * @see org.emftrace.metamodel.URNModel.StrategiesGroup
	 * @generated
	 */
	EClass getStrategiesGroup();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.StrategiesGroup#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Strategies</em>'.
	 * @see org.emftrace.metamodel.URNModel.StrategiesGroup#getStrategies()
	 * @see #getStrategiesGroup()
	 * @generated
	 */
	EAttribute getStrategiesGroup_Strategies();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Stub <em>Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stub</em>'.
	 * @see org.emftrace.metamodel.URNModel.Stub
	 * @generated
	 */
	EClass getStub();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Stub#isDynamic <em>Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic</em>'.
	 * @see org.emftrace.metamodel.URNModel.Stub#isDynamic()
	 * @see #getStub()
	 * @generated
	 */
	EAttribute getStub_Dynamic();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Stub#isSynchronizing <em>Synchronizing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronizing</em>'.
	 * @see org.emftrace.metamodel.URNModel.Stub#isSynchronizing()
	 * @see #getStub()
	 * @generated
	 */
	EAttribute getStub_Synchronizing();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Stub#isBlocking <em>Blocking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocking</em>'.
	 * @see org.emftrace.metamodel.URNModel.Stub#isBlocking()
	 * @see #getStub()
	 * @generated
	 */
	EAttribute getStub_Blocking();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.Stub#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.emftrace.metamodel.URNModel.Stub#getBindings()
	 * @see #getStub()
	 * @generated
	 */
	EReference getStub_Bindings();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see org.emftrace.metamodel.URNModel.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Timer#getTimeoutPath <em>Timeout Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout Path</em>'.
	 * @see org.emftrace.metamodel.URNModel.Timer#getTimeoutPath()
	 * @see #getTimer()
	 * @generated
	 */
	EAttribute getTimer_TimeoutPath();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.UCMmap <em>UC Mmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Mmap</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMmap
	 * @generated
	 */
	EClass getUCMmap();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.UCMmap#isSingleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Singleton</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMmap#isSingleton()
	 * @see #getUCMmap()
	 * @generated
	 */
	EAttribute getUCMmap_Singleton();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.UCMmap#getParentStub <em>Parent Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parent Stub</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMmap#getParentStub()
	 * @see #getUCMmap()
	 * @generated
	 */
	EAttribute getUCMmap_ParentStub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.UCMmap#getContRefs <em>Cont Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cont Refs</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMmap#getContRefs()
	 * @see #getUCMmap()
	 * @generated
	 */
	EReference getUCMmap_ContRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.UCMmap#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMmap#getConnections()
	 * @see #getUCMmap()
	 * @generated
	 */
	EReference getUCMmap_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.UCMmap#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMmap#getNodes()
	 * @see #getUCMmap()
	 * @generated
	 */
	EReference getUCMmap_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.UCMmap#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMmap#getComments()
	 * @see #getUCMmap()
	 * @generated
	 */
	EReference getUCMmap_Comments();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.UCMmodelElement <em>UC Mmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Mmodel Element</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMmodelElement
	 * @generated
	 */
	EClass getUCMmodelElement();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.UCMspec <em>UC Mspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Mspec</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMspec
	 * @generated
	 */
	EClass getUCMspec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.UCMspec#getEnumerationTypes <em>Enumeration Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration Types</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMspec#getEnumerationTypes()
	 * @see #getUCMspec()
	 * @generated
	 */
	EReference getUCMspec_EnumerationTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.UCMspec#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMspec#getVariables()
	 * @see #getUCMspec()
	 * @generated
	 */
	EReference getUCMspec_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.UCMspec#getScenarioGroups <em>Scenario Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario Groups</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMspec#getScenarioGroups()
	 * @see #getUCMspec()
	 * @generated
	 */
	EReference getUCMspec_ScenarioGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.UCMspec#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMspec#getResources()
	 * @see #getUCMspec()
	 * @generated
	 */
	EReference getUCMspec_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.UCMspec#getUcmMaps <em>Ucm Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ucm Maps</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMspec#getUcmMaps()
	 * @see #getUCMspec()
	 * @generated
	 */
	EReference getUCMspec_UcmMaps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.UCMspec#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMspec#getComponents()
	 * @see #getUCMspec()
	 * @generated
	 */
	EReference getUCMspec_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.UCMspec#getComponentTypes <em>Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Types</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMspec#getComponentTypes()
	 * @see #getUCMspec()
	 * @generated
	 */
	EReference getUCMspec_ComponentTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.UCMspec#getResponsibilities <em>Responsibilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsibilities</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMspec#getResponsibilities()
	 * @see #getUCMspec()
	 * @generated
	 */
	EReference getUCMspec_Responsibilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.UCMspec#getScenarioDefs <em>Scenario Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario Defs</em>'.
	 * @see org.emftrace.metamodel.URNModel.UCMspec#getScenarioDefs()
	 * @see #getUCMspec()
	 * @generated
	 */
	EReference getUCMspec_ScenarioDefs();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.URNlink <em>UR Nlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UR Nlink</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNlink
	 * @generated
	 */
	EClass getURNlink();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.URNlink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNlink#getType()
	 * @see #getURNlink()
	 * @generated
	 */
	EAttribute getURNlink_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.URNlink#getToElem <em>To Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Elem</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNlink#getToElem()
	 * @see #getURNlink()
	 * @generated
	 */
	EAttribute getURNlink_ToElem();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.URNlink#getFromElem <em>From Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Elem</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNlink#getFromElem()
	 * @see #getURNlink()
	 * @generated
	 */
	EAttribute getURNlink_FromElem();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.URNmodelElement <em>UR Nmodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UR Nmodel Element</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNmodelElement
	 * @generated
	 */
	EClass getURNmodelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.URNmodelElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNmodelElement#getId()
	 * @see #getURNmodelElement()
	 * @generated
	 */
	EAttribute getURNmodelElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.URNmodelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNmodelElement#getName()
	 * @see #getURNmodelElement()
	 * @generated
	 */
	EAttribute getURNmodelElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.URNmodelElement#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNmodelElement#getMetadata()
	 * @see #getURNmodelElement()
	 * @generated
	 */
	EReference getURNmodelElement_Metadata();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.URNmodelElement#getToLinks <em>To Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>To Links</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNmodelElement#getToLinks()
	 * @see #getURNmodelElement()
	 * @generated
	 */
	EAttribute getURNmodelElement_ToLinks();

	/**
	 * Returns the meta object for the attribute list '{@link org.emftrace.metamodel.URNModel.URNmodelElement#getFromLinks <em>From Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>From Links</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNmodelElement#getFromLinks()
	 * @see #getURNmodelElement()
	 * @generated
	 */
	EAttribute getURNmodelElement_FromLinks();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.URNmodelElement#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Desc</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNmodelElement#getDesc()
	 * @see #getURNmodelElement()
	 * @generated
	 */
	EReference getURNmodelElement_Desc();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.URNmodelElement#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concern</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNmodelElement#getConcern()
	 * @see #getURNmodelElement()
	 * @generated
	 */
	EAttribute getURNmodelElement_Concern();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.URNspec <em>UR Nspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UR Nspec</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNspec
	 * @generated
	 */
	EClass getURNspec();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.URNspec#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNspec#getName()
	 * @see #getURNspec()
	 * @generated
	 */
	EAttribute getURNspec_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.URNspec#getUcmspec <em>Ucmspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ucmspec</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNspec#getUcmspec()
	 * @see #getURNspec()
	 * @generated
	 */
	EReference getURNspec_Ucmspec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.URNspec#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNspec#getMetadata()
	 * @see #getURNspec()
	 * @generated
	 */
	EReference getURNspec_Metadata();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.URNspec#getUrnLinks <em>Urn Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Urn Links</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNspec#getUrnLinks()
	 * @see #getURNspec()
	 * @generated
	 */
	EReference getURNspec_UrnLinks();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.URNspec#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grlspec</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNspec#getGrlspec()
	 * @see #getURNspec()
	 * @generated
	 */
	EReference getURNspec_Grlspec();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftrace.metamodel.URNModel.URNspec#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNspec#getInfo()
	 * @see #getURNspec()
	 * @generated
	 */
	EReference getURNspec_Info();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftrace.metamodel.URNModel.URNspec#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNspec#getConcerns()
	 * @see #getURNspec()
	 * @generated
	 */
	EReference getURNspec_Concerns();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.emftrace.metamodel.URNModel.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Variable#getEnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enumeration Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.Variable#getEnumerationType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_EnumerationType();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.WaitingPlace <em>Waiting Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Waiting Place</em>'.
	 * @see org.emftrace.metamodel.URNModel.WaitingPlace
	 * @generated
	 */
	EClass getWaitingPlace();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.WaitingPlace#getWaitType <em>Wait Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.WaitingPlace#getWaitType()
	 * @see #getWaitingPlace()
	 * @generated
	 */
	EAttribute getWaitingPlace_WaitType();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload</em>'.
	 * @see org.emftrace.metamodel.URNModel.Workload
	 * @generated
	 */
	EClass getWorkload();

	/**
	 * Returns the meta object for the attribute '{@link org.emftrace.metamodel.URNModel.Workload#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.emftrace.metamodel.URNModel.Workload#getUnit()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_Unit();

	/**
	 * Returns the meta object for class '{@link org.emftrace.metamodel.URNModel.URNBase <em>URN Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URN Base</em>'.
	 * @see org.emftrace.metamodel.URNModel.URNBase
	 * @generated
	 */
	EClass getURNBase();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.URNModel.ComponentKind <em>Component Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Kind</em>'.
	 * @see org.emftrace.metamodel.URNModel.ComponentKind
	 * @generated
	 */
	EEnum getComponentKind();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.URNModel.ContributionType <em>Contribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contribution Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.ContributionType
	 * @generated
	 */
	EEnum getContributionType();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.URNModel.DatatypeKind <em>Datatype Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datatype Kind</em>'.
	 * @see org.emftrace.metamodel.URNModel.DatatypeKind
	 * @generated
	 */
	EEnum getDatatypeKind();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.URNModel.DecompositionType <em>Decomposition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decomposition Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.DecompositionType
	 * @generated
	 */
	EEnum getDecompositionType();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.URNModel.DeviceKind <em>Device Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Kind</em>'.
	 * @see org.emftrace.metamodel.URNModel.DeviceKind
	 * @generated
	 */
	EEnum getDeviceKind();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.URNModel.ImportanceType <em>Importance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Importance Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.ImportanceType
	 * @generated
	 */
	EEnum getImportanceType();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.URNModel.IntentionalElementType <em>Intentional Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Intentional Element Type</em>'.
	 * @see org.emftrace.metamodel.URNModel.IntentionalElementType
	 * @generated
	 */
	EEnum getIntentionalElementType();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.URNModel.QualitativeLabel <em>Qualitative Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qualitative Label</em>'.
	 * @see org.emftrace.metamodel.URNModel.QualitativeLabel
	 * @generated
	 */
	EEnum getQualitativeLabel();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.URNModel.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see org.emftrace.metamodel.URNModel.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link org.emftrace.metamodel.URNModel.WaitKind <em>Wait Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wait Kind</em>'.
	 * @see org.emftrace.metamodel.URNModel.WaitKind
	 * @generated
	 */
	EEnum getWaitKind();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Component Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Component Kind Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 * @generated
	 */
	EDataType getComponentKindObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Contribution Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contribution Type Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 * @generated
	 */
	EDataType getContributionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Datatype Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Datatype Kind Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 * @generated
	 */
	EDataType getDatatypeKindObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Decomposition Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Decomposition Type Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 * @generated
	 */
	EDataType getDecompositionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Device Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Device Kind Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 * @generated
	 */
	EDataType getDeviceKindObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Importance Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Importance Type Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 * @generated
	 */
	EDataType getImportanceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Intentional Element Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Intentional Element Type Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 * @generated
	 */
	EDataType getIntentionalElementTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Qualitative Label Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Qualitative Label Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 * @generated
	 */
	EDataType getQualitativeLabelObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Time Unit Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Unit Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 * @generated
	 */
	EDataType getTimeUnitObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Wait Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Wait Kind Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 * @generated
	 */
	EDataType getWaitKindObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	URNModelFactory getURNModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ActiveResourceImpl <em>Active Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ActiveResourceImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getActiveResource()
		 * @generated
		 */
		EClass ACTIVE_RESOURCE = eINSTANCE.getActiveResource();

		/**
		 * The meta object literal for the '<em><b>Op Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_RESOURCE__OP_TIME = eINSTANCE.getActiveResource_OpTime();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_RESOURCE__UNIT = eINSTANCE.getActiveResource_Unit();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ActorImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Collapsed Refs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__COLLAPSED_REFS = eINSTANCE.getActor_CollapsedRefs();

		/**
		 * The meta object literal for the '<em><b>Actor Refs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ACTOR_REFS = eINSTANCE.getActor_ActorRefs();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__STYLE = eINSTANCE.getActor_Style();

		/**
		 * The meta object literal for the '<em><b>Elems</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ELEMS = eINSTANCE.getActor_Elems();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ActorRefImpl <em>Actor Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ActorRefImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getActorRef()
		 * @generated
		 */
		EClass ACTOR_REF = eINSTANCE.getActorRef();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_REF__LABEL = eINSTANCE.getActorRef_Label();

		/**
		 * The meta object literal for the '<em><b>Actor Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_REF__ACTOR_DEF = eINSTANCE.getActorRef_ActorDef();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_REF__NODES = eINSTANCE.getActorRef_Nodes();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_REF__POS = eINSTANCE.getActorRef_Pos();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_REF__SIZE = eINSTANCE.getActorRef_Size();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.AndForkImpl <em>And Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.AndForkImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getAndFork()
		 * @generated
		 */
		EClass AND_FORK = eINSTANCE.getAndFork();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.AndJoinImpl <em>And Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.AndJoinImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getAndJoin()
		 * @generated
		 */
		EClass AND_JOIN = eINSTANCE.getAndJoin();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ClosedWorkloadImpl <em>Closed Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ClosedWorkloadImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getClosedWorkload()
		 * @generated
		 */
		EClass CLOSED_WORKLOAD = eINSTANCE.getClosedWorkload();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSED_WORKLOAD__POPULATION = eINSTANCE.getClosedWorkload_Population();

		/**
		 * The meta object literal for the '<em><b>External Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSED_WORKLOAD__EXTERNAL_DELAY = eINSTANCE.getClosedWorkload_ExternalDelay();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.CollapsedActorRefImpl <em>Collapsed Actor Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.CollapsedActorRefImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getCollapsedActorRef()
		 * @generated
		 */
		EClass COLLAPSED_ACTOR_REF = eINSTANCE.getCollapsedActorRef();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLAPSED_ACTOR_REF__ACTOR = eINSTANCE.getCollapsedActorRef_Actor();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.CommentImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__DESCRIPTION = eINSTANCE.getComment_Description();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__X = eINSTANCE.getComment_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__Y = eINSTANCE.getComment_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__WIDTH = eINSTANCE.getComment_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__HEIGHT = eINSTANCE.getComment_Height();

		/**
		 * The meta object literal for the '<em><b>Fill Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__FILL_COLOR = eINSTANCE.getComment_FillColor();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ComponentImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__KIND = eINSTANCE.getComponent_Kind();

		/**
		 * The meta object literal for the '<em><b>Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__PROTECTED = eINSTANCE.getComponent_Protected();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__CONTEXT = eINSTANCE.getComponent_Context();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__TYPE = eINSTANCE.getComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Included Components</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__INCLUDED_COMPONENTS = eINSTANCE.getComponent_IncludedComponents();

		/**
		 * The meta object literal for the '<em><b>Including Components</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__INCLUDING_COMPONENTS = eINSTANCE.getComponent_IncludingComponents();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__HOST = eINSTANCE.getComponent_Host();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__RESOURCE = eINSTANCE.getComponent_Resource();

		/**
		 * The meta object literal for the '<em><b>Comp Refs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMP_REFS = eINSTANCE.getComponent_CompRefs();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__STYLE = eINSTANCE.getComponent_Style();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ComponentBindingImpl <em>Component Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ComponentBindingImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComponentBinding()
		 * @generated
		 */
		EClass COMPONENT_BINDING = eINSTANCE.getComponentBinding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_BINDING__ID = eINSTANCE.getComponentBinding_Id();

		/**
		 * The meta object literal for the '<em><b>Parent Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_BINDING__PARENT_COMPONENT = eINSTANCE.getComponentBinding_ParentComponent();

		/**
		 * The meta object literal for the '<em><b>Plugin Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_BINDING__PLUGIN_COMPONENT = eINSTANCE.getComponentBinding_PluginComponent();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ComponentRefImpl <em>Component Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ComponentRefImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComponentRef()
		 * @generated
		 */
		EClass COMPONENT_REF = eINSTANCE.getComponentRef();

		/**
		 * The meta object literal for the '<em><b>Parent Bindings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REF__PARENT_BINDINGS = eINSTANCE.getComponentRef_ParentBindings();

		/**
		 * The meta object literal for the '<em><b>Plugin Bindings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REF__PLUGIN_BINDINGS = eINSTANCE.getComponentRef_PluginBindings();

		/**
		 * The meta object literal for the '<em><b>Comp Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REF__COMP_DEF = eINSTANCE.getComponentRef_CompDef();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REF__LABEL = eINSTANCE.getComponentRef_Label();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REF__CHILDREN = eINSTANCE.getComponentRef_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REF__PARENT = eINSTANCE.getComponentRef_Parent();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REF__NODES = eINSTANCE.getComponentRef_Nodes();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REF__POS = eINSTANCE.getComponentRef_Pos();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_REF__SIZE = eINSTANCE.getComponentRef_Size();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ComponentTypeImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__INSTANCES = eINSTANCE.getComponentType_Instances();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ConcernImpl <em>Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ConcernImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getConcern()
		 * @generated
		 */
		EClass CONCERN = eINSTANCE.getConcern();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCERN__CONDITION = eINSTANCE.getConcern_Condition();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCERN__ELEMENTS = eINSTANCE.getConcern_Elements();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ConcreteConditionImpl <em>Concrete Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ConcreteConditionImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getConcreteCondition()
		 * @generated
		 */
		EClass CONCRETE_CONDITION = eINSTANCE.getConcreteCondition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_CONDITION__LABEL = eINSTANCE.getConcreteCondition_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_CONDITION__DESCRIPTION = eINSTANCE.getConcreteCondition_Description();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ConcreteGRLspecImpl <em>Concrete GR Lspec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ConcreteGRLspecImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getConcreteGRLspec()
		 * @generated
		 */
		EClass CONCRETE_GR_LSPEC = eINSTANCE.getConcreteGRLspec();

		/**
		 * The meta object literal for the '<em><b>Show As Means End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_GR_LSPEC__SHOW_AS_MEANS_END = eINSTANCE.getConcreteGRLspec_ShowAsMeansEnd();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ConcreteStyleImpl <em>Concrete Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ConcreteStyleImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getConcreteStyle()
		 * @generated
		 */
		EClass CONCRETE_STYLE = eINSTANCE.getConcreteStyle();

		/**
		 * The meta object literal for the '<em><b>Line Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_STYLE__LINE_COLOR = eINSTANCE.getConcreteStyle_LineColor();

		/**
		 * The meta object literal for the '<em><b>Fill Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_STYLE__FILL_COLOR = eINSTANCE.getConcreteStyle_FillColor();

		/**
		 * The meta object literal for the '<em><b>Filled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_STYLE__FILLED = eINSTANCE.getConcreteStyle_Filled();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ConcreteURNspecImpl <em>Concrete UR Nspec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ConcreteURNspecImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getConcreteURNspec()
		 * @generated
		 */
		EClass CONCRETE_UR_NSPEC = eINSTANCE.getConcreteURNspec();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_UR_NSPEC__DESCRIPTION = eINSTANCE.getConcreteURNspec_Description();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_UR_NSPEC__AUTHOR = eINSTANCE.getConcreteURNspec_Author();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_UR_NSPEC__CREATED = eINSTANCE.getConcreteURNspec_Created();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_UR_NSPEC__MODIFIED = eINSTANCE.getConcreteURNspec_Modified();

		/**
		 * The meta object literal for the '<em><b>Spec Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_UR_NSPEC__SPEC_VERSION = eINSTANCE.getConcreteURNspec_SpecVersion();

		/**
		 * The meta object literal for the '<em><b>Urn Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_UR_NSPEC__URN_VERSION = eINSTANCE.getConcreteURNspec_UrnVersion();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ConditionImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__DESC = eINSTANCE.getCondition_Desc();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__LABEL = eINSTANCE.getCondition_Label();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ConnectImpl <em>Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ConnectImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getConnect()
		 * @generated
		 */
		EClass CONNECT = eINSTANCE.getConnect();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ContributionImpl <em>Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ContributionImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getContribution()
		 * @generated
		 */
		EClass CONTRIBUTION = eINSTANCE.getContribution();

		/**
		 * The meta object literal for the '<em><b>Contribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__CONTRIBUTION = eINSTANCE.getContribution_Contribution();

		/**
		 * The meta object literal for the '<em><b>Quantitative Contribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__QUANTITATIVE_CONTRIBUTION = eINSTANCE.getContribution_QuantitativeContribution();

		/**
		 * The meta object literal for the '<em><b>Correlation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__CORRELATION = eINSTANCE.getContribution_Correlation();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.DecompositionImpl <em>Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.DecompositionImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDecomposition()
		 * @generated
		 */
		EClass DECOMPOSITION = eINSTANCE.getDecomposition();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.DemandImpl <em>Demand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.DemandImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDemand()
		 * @generated
		 */
		EClass DEMAND = eINSTANCE.getDemand();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEMAND__QUANTITY = eINSTANCE.getDemand_Quantity();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEMAND__RESOURCE = eINSTANCE.getDemand_Resource();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.DependencyImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.DescriptionImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__DESCRIPTION = eINSTANCE.getDescription_Description();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.DirectionArrowImpl <em>Direction Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.DirectionArrowImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDirectionArrow()
		 * @generated
		 */
		EClass DIRECTION_ARROW = eINSTANCE.getDirectionArrow();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.DocumentRootImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>UR Nspec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UR_NSPEC = eINSTANCE.getDocumentRoot_URNspec();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ElementLinkImpl <em>Element Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ElementLinkImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getElementLink()
		 * @generated
		 */
		EClass ELEMENT_LINK = eINSTANCE.getElementLink();

		/**
		 * The meta object literal for the '<em><b>Refs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_LINK__REFS = eINSTANCE.getElementLink_Refs();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_LINK__DEST = eINSTANCE.getElementLink_Dest();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_LINK__SRC = eINSTANCE.getElementLink_Src();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.EmptyPointImpl <em>Empty Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.EmptyPointImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getEmptyPoint()
		 * @generated
		 */
		EClass EMPTY_POINT = eINSTANCE.getEmptyPoint();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.EndPointImpl <em>End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.EndPointImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getEndPoint()
		 * @generated
		 */
		EClass END_POINT = eINSTANCE.getEndPoint();

		/**
		 * The meta object literal for the '<em><b>Out Bindings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_POINT__OUT_BINDINGS = eINSTANCE.getEndPoint_OutBindings();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT__POSTCONDITION = eINSTANCE.getEndPoint_Postcondition();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.EnumerationTypeImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getEnumerationType()
		 * @generated
		 */
		EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE__VALUES = eINSTANCE.getEnumerationType_Values();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE__INSTANCES = eINSTANCE.getEnumerationType_Instances();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.EvaluationImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__EVALUATION = eINSTANCE.getEvaluation_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Qualitative Evaluation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__QUALITATIVE_EVALUATION = eINSTANCE.getEvaluation_QualitativeEvaluation();

		/**
		 * The meta object literal for the '<em><b>Int Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__INT_ELEMENT = eINSTANCE.getEvaluation_IntElement();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.EvaluationStrategyImpl <em>Evaluation Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.EvaluationStrategyImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getEvaluationStrategy()
		 * @generated
		 */
		EClass EVALUATION_STRATEGY = eINSTANCE.getEvaluationStrategy();

		/**
		 * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_STRATEGY__EVALUATIONS = eINSTANCE.getEvaluationStrategy_Evaluations();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_STRATEGY__GROUP = eINSTANCE.getEvaluationStrategy_Group();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ExternalOperationImpl <em>External Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ExternalOperationImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getExternalOperation()
		 * @generated
		 */
		EClass EXTERNAL_OPERATION = eINSTANCE.getExternalOperation();

		/**
		 * The meta object literal for the '<em><b>Demands</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_OPERATION__DEMANDS = eINSTANCE.getExternalOperation_Demands();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.GeneralResourceImpl <em>General Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.GeneralResourceImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getGeneralResource()
		 * @generated
		 */
		EClass GENERAL_RESOURCE = eINSTANCE.getGeneralResource();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_RESOURCE__MULTIPLICITY = eINSTANCE.getGeneralResource_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Sched Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_RESOURCE__SCHED_POLICY = eINSTANCE.getGeneralResource_SchedPolicy();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.GRLGraphImpl <em>GRL Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.GRLGraphImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getGRLGraph()
		 * @generated
		 */
		EClass GRL_GRAPH = eINSTANCE.getGRLGraph();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRL_GRAPH__CONNECTIONS = eINSTANCE.getGRLGraph_Connections();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRL_GRAPH__NODES = eINSTANCE.getGRLGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Cont Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRL_GRAPH__CONT_REFS = eINSTANCE.getGRLGraph_ContRefs();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRL_GRAPH__COMMENTS = eINSTANCE.getGRLGraph_Comments();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.GRLLinkableElementImpl <em>GRL Linkable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.GRLLinkableElementImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getGRLLinkableElement()
		 * @generated
		 */
		EClass GRL_LINKABLE_ELEMENT = eINSTANCE.getGRLLinkableElement();

		/**
		 * The meta object literal for the '<em><b>Links Dest</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRL_LINKABLE_ELEMENT__LINKS_DEST = eINSTANCE.getGRLLinkableElement_LinksDest();

		/**
		 * The meta object literal for the '<em><b>Links Src</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRL_LINKABLE_ELEMENT__LINKS_SRC = eINSTANCE.getGRLLinkableElement_LinksSrc();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.GRLmodelElementImpl <em>GR Lmodel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.GRLmodelElementImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getGRLmodelElement()
		 * @generated
		 */
		EClass GR_LMODEL_ELEMENT = eINSTANCE.getGRLmodelElement();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.GRLNodeImpl <em>GRL Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.GRLNodeImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getGRLNode()
		 * @generated
		 */
		EClass GRL_NODE = eINSTANCE.getGRLNode();

		/**
		 * The meta object literal for the '<em><b>Pred</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRL_NODE__PRED = eINSTANCE.getGRLNode_Pred();

		/**
		 * The meta object literal for the '<em><b>Succ</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRL_NODE__SUCC = eINSTANCE.getGRLNode_Succ();

		/**
		 * The meta object literal for the '<em><b>Cont Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRL_NODE__CONT_REF = eINSTANCE.getGRLNode_ContRef();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRL_NODE__POS = eINSTANCE.getGRLNode_Pos();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRL_NODE__SIZE = eINSTANCE.getGRLNode_Size();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.GRLspecImpl <em>GR Lspec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.GRLspecImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getGRLspec()
		 * @generated
		 */
		EClass GR_LSPEC = eINSTANCE.getGRLspec();

		/**
		 * The meta object literal for the '<em><b>Int Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GR_LSPEC__INT_ELEMENTS = eINSTANCE.getGRLspec_IntElements();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GR_LSPEC__ACTORS = eINSTANCE.getGRLspec_Actors();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GR_LSPEC__LINKS = eINSTANCE.getGRLspec_Links();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GR_LSPEC__GROUPS = eINSTANCE.getGRLspec_Groups();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GR_LSPEC__STRATEGIES = eINSTANCE.getGRLspec_Strategies();

		/**
		 * The meta object literal for the '<em><b>Grl Graphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GR_LSPEC__GRL_GRAPHS = eINSTANCE.getGRLspec_GrlGraphs();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GR_LSPEC__INFO = eINSTANCE.getGRLspec_Info();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.InBindingImpl <em>In Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.InBindingImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getInBinding()
		 * @generated
		 */
		EClass IN_BINDING = eINSTANCE.getInBinding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_BINDING__ID = eINSTANCE.getInBinding_Id();

		/**
		 * The meta object literal for the '<em><b>Start Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_BINDING__START_POINT = eINSTANCE.getInBinding_StartPoint();

		/**
		 * The meta object literal for the '<em><b>Stub Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_BINDING__STUB_ENTRY = eINSTANCE.getInBinding_StubEntry();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.InitializationImpl <em>Initialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.InitializationImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getInitialization()
		 * @generated
		 */
		EClass INITIALIZATION = eINSTANCE.getInitialization();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIALIZATION__VALUE = eINSTANCE.getInitialization_Value();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIALIZATION__VARIABLE = eINSTANCE.getInitialization_Variable();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.IntentionalElementImpl <em>Intentional Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.IntentionalElementImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getIntentionalElement()
		 * @generated
		 */
		EClass INTENTIONAL_ELEMENT = eINSTANCE.getIntentionalElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTIONAL_ELEMENT__TYPE = eINSTANCE.getIntentionalElement_Type();

		/**
		 * The meta object literal for the '<em><b>Decomposition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE = eINSTANCE.getIntentionalElement_DecompositionType();

		/**
		 * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTIONAL_ELEMENT__IMPORTANCE = eINSTANCE.getIntentionalElement_Importance();

		/**
		 * The meta object literal for the '<em><b>Importance Quantitative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE = eINSTANCE.getIntentionalElement_ImportanceQuantitative();

		/**
		 * The meta object literal for the '<em><b>Refs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTIONAL_ELEMENT__REFS = eINSTANCE.getIntentionalElement_Refs();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTIONAL_ELEMENT__STYLE = eINSTANCE.getIntentionalElement_Style();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTIONAL_ELEMENT__ACTOR = eINSTANCE.getIntentionalElement_Actor();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.IntentionalElementRefImpl <em>Intentional Element Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.IntentionalElementRefImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getIntentionalElementRef()
		 * @generated
		 */
		EClass INTENTIONAL_ELEMENT_REF = eINSTANCE.getIntentionalElementRef();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENTIONAL_ELEMENT_REF__DEF = eINSTANCE.getIntentionalElementRef_Def();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.LabelImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Delta X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__DELTA_X = eINSTANCE.getLabel_DeltaX();

		/**
		 * The meta object literal for the '<em><b>Delta Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__DELTA_Y = eINSTANCE.getLabel_DeltaY();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.LinkRefImpl <em>Link Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.LinkRefImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getLinkRef()
		 * @generated
		 */
		EClass LINK_REF = eINSTANCE.getLinkRef();

		/**
		 * The meta object literal for the '<em><b>Curve</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_REF__CURVE = eINSTANCE.getLinkRef_Curve();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_REF__LINK = eINSTANCE.getLinkRef_Link();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_REF__BENDPOINTS = eINSTANCE.getLinkRef_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_REF__LABEL = eINSTANCE.getLinkRef_Label();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_REF__TARGET = eINSTANCE.getLinkRef_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_REF__SOURCE = eINSTANCE.getLinkRef_Source();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.LinkRefBendpointImpl <em>Link Ref Bendpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.LinkRefBendpointImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getLinkRefBendpoint()
		 * @generated
		 */
		EClass LINK_REF_BENDPOINT = eINSTANCE.getLinkRefBendpoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_REF_BENDPOINT__X = eINSTANCE.getLinkRefBendpoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_REF_BENDPOINT__Y = eINSTANCE.getLinkRefBendpoint_Y();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.MetadataImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__NAME = eINSTANCE.getMetadata_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__VALUE = eINSTANCE.getMetadata_Value();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl <em>Node Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.NodeConnectionImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getNodeConnection()
		 * @generated
		 */
		EClass NODE_CONNECTION = eINSTANCE.getNodeConnection();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CONNECTION__ID = eINSTANCE.getNodeConnection_Id();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CONNECTION__PROBABILITY = eINSTANCE.getNodeConnection_Probability();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CONNECTION__THRESHOLD = eINSTANCE.getNodeConnection_Threshold();

		/**
		 * The meta object literal for the '<em><b>In Bindings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CONNECTION__IN_BINDINGS = eINSTANCE.getNodeConnection_InBindings();

		/**
		 * The meta object literal for the '<em><b>Out Bindings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CONNECTION__OUT_BINDINGS = eINSTANCE.getNodeConnection_OutBindings();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_CONNECTION__CONDITION = eINSTANCE.getNodeConnection_Condition();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CONNECTION__TIMER = eINSTANCE.getNodeConnection_Timer();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_CONNECTION__LABEL = eINSTANCE.getNodeConnection_Label();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CONNECTION__TARGET = eINSTANCE.getNodeConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_CONNECTION__SOURCE = eINSTANCE.getNodeConnection_Source();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.OpenWorkloadImpl <em>Open Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.OpenWorkloadImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOpenWorkload()
		 * @generated
		 */
		EClass OPEN_WORKLOAD = eINSTANCE.getOpenWorkload();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.OrForkImpl <em>Or Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.OrForkImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOrFork()
		 * @generated
		 */
		EClass OR_FORK = eINSTANCE.getOrFork();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.OrJoinImpl <em>Or Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.OrJoinImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOrJoin()
		 * @generated
		 */
		EClass OR_JOIN = eINSTANCE.getOrJoin();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.OutBindingImpl <em>Out Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.OutBindingImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOutBinding()
		 * @generated
		 */
		EClass OUT_BINDING = eINSTANCE.getOutBinding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_BINDING__ID = eINSTANCE.getOutBinding_Id();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_BINDING__END_POINT = eINSTANCE.getOutBinding_EndPoint();

		/**
		 * The meta object literal for the '<em><b>Stub Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_BINDING__STUB_EXIT = eINSTANCE.getOutBinding_StubExit();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.OWPeriodicImpl <em>OW Periodic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.OWPeriodicImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOWPeriodic()
		 * @generated
		 */
		EClass OW_PERIODIC = eINSTANCE.getOWPeriodic();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OW_PERIODIC__PERIOD = eINSTANCE.getOWPeriodic_Period();

		/**
		 * The meta object literal for the '<em><b>Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OW_PERIODIC__DEVIATION = eINSTANCE.getOWPeriodic_Deviation();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.OWPhaseTypeImpl <em>OW Phase Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.OWPhaseTypeImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOWPhaseType()
		 * @generated
		 */
		EClass OW_PHASE_TYPE = eINSTANCE.getOWPhaseType();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OW_PHASE_TYPE__ALPHA = eINSTANCE.getOWPhaseType_Alpha();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OW_PHASE_TYPE__S = eINSTANCE.getOWPhaseType_S();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.OWPoissonImpl <em>OW Poisson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.OWPoissonImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOWPoisson()
		 * @generated
		 */
		EClass OW_POISSON = eINSTANCE.getOWPoisson();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OW_POISSON__MEAN = eINSTANCE.getOWPoisson_Mean();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.OWUniformImpl <em>OW Uniform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.OWUniformImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getOWUniform()
		 * @generated
		 */
		EClass OW_UNIFORM = eINSTANCE.getOWUniform();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OW_UNIFORM__START = eINSTANCE.getOWUniform_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OW_UNIFORM__END = eINSTANCE.getOWUniform_End();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.PassiveResourceImpl <em>Passive Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.PassiveResourceImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getPassiveResource()
		 * @generated
		 */
		EClass PASSIVE_RESOURCE = eINSTANCE.getPassiveResource();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSIVE_RESOURCE__COMPONENT = eINSTANCE.getPassiveResource_Component();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.PathNodeImpl <em>Path Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.PathNodeImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getPathNode()
		 * @generated
		 */
		EClass PATH_NODE = eINSTANCE.getPathNode();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_NODE__LABEL = eINSTANCE.getPathNode_Label();

		/**
		 * The meta object literal for the '<em><b>Pred</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_NODE__PRED = eINSTANCE.getPathNode_Pred();

		/**
		 * The meta object literal for the '<em><b>Succ</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_NODE__SUCC = eINSTANCE.getPathNode_Succ();

		/**
		 * The meta object literal for the '<em><b>Cont Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_NODE__CONT_REF = eINSTANCE.getPathNode_ContRef();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_NODE__POS = eINSTANCE.getPathNode_Pos();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.PluginBindingImpl <em>Plugin Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.PluginBindingImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getPluginBinding()
		 * @generated
		 */
		EClass PLUGIN_BINDING = eINSTANCE.getPluginBinding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_BINDING__ID = eINSTANCE.getPluginBinding_Id();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_BINDING__PROBABILITY = eINSTANCE.getPluginBinding_Probability();

		/**
		 * The meta object literal for the '<em><b>Replication Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_BINDING__REPLICATION_FACTOR = eINSTANCE.getPluginBinding_ReplicationFactor();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_BINDING__IN = eINSTANCE.getPluginBinding_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_BINDING__OUT = eINSTANCE.getPluginBinding_Out();

		/**
		 * The meta object literal for the '<em><b>Plugin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_BINDING__PLUGIN = eINSTANCE.getPluginBinding_Plugin();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_BINDING__PRECONDITION = eINSTANCE.getPluginBinding_Precondition();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_BINDING__COMPONENTS = eINSTANCE.getPluginBinding_Components();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.PositionImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ProcessingResourceImpl <em>Processing Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ProcessingResourceImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getProcessingResource()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE = eINSTANCE.getProcessingResource();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE__KIND = eINSTANCE.getProcessingResource_Kind();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE__COMPONENTS = eINSTANCE.getProcessingResource_Components();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ResponsibilityImpl <em>Responsibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ResponsibilityImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getResponsibility()
		 * @generated
		 */
		EClass RESPONSIBILITY = eINSTANCE.getResponsibility();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBILITY__EXPRESSION = eINSTANCE.getResponsibility_Expression();

		/**
		 * The meta object literal for the '<em><b>Demands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__DEMANDS = eINSTANCE.getResponsibility_Demands();

		/**
		 * The meta object literal for the '<em><b>Resp Refs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBILITY__RESP_REFS = eINSTANCE.getResponsibility_RespRefs();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.RespRefImpl <em>Resp Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.RespRefImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getRespRef()
		 * @generated
		 */
		EClass RESP_REF = eINSTANCE.getRespRef();

		/**
		 * The meta object literal for the '<em><b>Repetition Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESP_REF__REPETITION_COUNT = eINSTANCE.getRespRef_RepetitionCount();

		/**
		 * The meta object literal for the '<em><b>Host Demand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESP_REF__HOST_DEMAND = eINSTANCE.getRespRef_HostDemand();

		/**
		 * The meta object literal for the '<em><b>Resp Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESP_REF__RESP_DEF = eINSTANCE.getRespRef_RespDef();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ScenarioDefImpl <em>Scenario Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ScenarioDefImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getScenarioDef()
		 * @generated
		 */
		EClass SCENARIO_DEF = eINSTANCE.getScenarioDef();

		/**
		 * The meta object literal for the '<em><b>Initializations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_DEF__INITIALIZATIONS = eINSTANCE.getScenarioDef_Initializations();

		/**
		 * The meta object literal for the '<em><b>Postconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_DEF__POSTCONDITIONS = eINSTANCE.getScenarioDef_Postconditions();

		/**
		 * The meta object literal for the '<em><b>Preconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_DEF__PRECONDITIONS = eINSTANCE.getScenarioDef_Preconditions();

		/**
		 * The meta object literal for the '<em><b>Parent Scenarios</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_DEF__PARENT_SCENARIOS = eINSTANCE.getScenarioDef_ParentScenarios();

		/**
		 * The meta object literal for the '<em><b>Included Scenarios</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_DEF__INCLUDED_SCENARIOS = eINSTANCE.getScenarioDef_IncludedScenarios();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_DEF__GROUPS = eINSTANCE.getScenarioDef_Groups();

		/**
		 * The meta object literal for the '<em><b>Start Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_DEF__START_POINTS = eINSTANCE.getScenarioDef_StartPoints();

		/**
		 * The meta object literal for the '<em><b>End Points</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_DEF__END_POINTS = eINSTANCE.getScenarioDef_EndPoints();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.ScenarioGroupImpl <em>Scenario Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.ScenarioGroupImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getScenarioGroup()
		 * @generated
		 */
		EClass SCENARIO_GROUP = eINSTANCE.getScenarioGroup();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_GROUP__SCENARIOS = eINSTANCE.getScenarioGroup_Scenarios();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.SizeImpl <em>Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.SizeImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getSize()
		 * @generated
		 */
		EClass SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__WIDTH = eINSTANCE.getSize_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__HEIGHT = eINSTANCE.getSize_Height();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.StartPointImpl <em>Start Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.StartPointImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getStartPoint()
		 * @generated
		 */
		EClass START_POINT = eINSTANCE.getStartPoint();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_POINT__WORKLOAD = eINSTANCE.getStartPoint_Workload();

		/**
		 * The meta object literal for the '<em><b>In Bindings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_POINT__IN_BINDINGS = eINSTANCE.getStartPoint_InBindings();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_POINT__PRECONDITION = eINSTANCE.getStartPoint_Precondition();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.StrategiesGroupImpl <em>Strategies Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.StrategiesGroupImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getStrategiesGroup()
		 * @generated
		 */
		EClass STRATEGIES_GROUP = eINSTANCE.getStrategiesGroup();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGIES_GROUP__STRATEGIES = eINSTANCE.getStrategiesGroup_Strategies();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.StubImpl <em>Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.StubImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getStub()
		 * @generated
		 */
		EClass STUB = eINSTANCE.getStub();

		/**
		 * The meta object literal for the '<em><b>Dynamic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUB__DYNAMIC = eINSTANCE.getStub_Dynamic();

		/**
		 * The meta object literal for the '<em><b>Synchronizing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUB__SYNCHRONIZING = eINSTANCE.getStub_Synchronizing();

		/**
		 * The meta object literal for the '<em><b>Blocking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUB__BLOCKING = eINSTANCE.getStub_Blocking();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUB__BINDINGS = eINSTANCE.getStub_Bindings();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.TimerImpl <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.TimerImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '<em><b>Timeout Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER__TIMEOUT_PATH = eINSTANCE.getTimer_TimeoutPath();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.UCMmapImpl <em>UC Mmap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.UCMmapImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getUCMmap()
		 * @generated
		 */
		EClass UC_MMAP = eINSTANCE.getUCMmap();

		/**
		 * The meta object literal for the '<em><b>Singleton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UC_MMAP__SINGLETON = eINSTANCE.getUCMmap_Singleton();

		/**
		 * The meta object literal for the '<em><b>Parent Stub</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UC_MMAP__PARENT_STUB = eINSTANCE.getUCMmap_ParentStub();

		/**
		 * The meta object literal for the '<em><b>Cont Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MMAP__CONT_REFS = eINSTANCE.getUCMmap_ContRefs();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MMAP__CONNECTIONS = eINSTANCE.getUCMmap_Connections();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MMAP__NODES = eINSTANCE.getUCMmap_Nodes();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MMAP__COMMENTS = eINSTANCE.getUCMmap_Comments();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.UCMmodelElementImpl <em>UC Mmodel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.UCMmodelElementImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getUCMmodelElement()
		 * @generated
		 */
		EClass UC_MMODEL_ELEMENT = eINSTANCE.getUCMmodelElement();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.UCMspecImpl <em>UC Mspec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.UCMspecImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getUCMspec()
		 * @generated
		 */
		EClass UC_MSPEC = eINSTANCE.getUCMspec();

		/**
		 * The meta object literal for the '<em><b>Enumeration Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MSPEC__ENUMERATION_TYPES = eINSTANCE.getUCMspec_EnumerationTypes();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MSPEC__VARIABLES = eINSTANCE.getUCMspec_Variables();

		/**
		 * The meta object literal for the '<em><b>Scenario Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MSPEC__SCENARIO_GROUPS = eINSTANCE.getUCMspec_ScenarioGroups();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MSPEC__RESOURCES = eINSTANCE.getUCMspec_Resources();

		/**
		 * The meta object literal for the '<em><b>Ucm Maps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MSPEC__UCM_MAPS = eINSTANCE.getUCMspec_UcmMaps();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MSPEC__COMPONENTS = eINSTANCE.getUCMspec_Components();

		/**
		 * The meta object literal for the '<em><b>Component Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MSPEC__COMPONENT_TYPES = eINSTANCE.getUCMspec_ComponentTypes();

		/**
		 * The meta object literal for the '<em><b>Responsibilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MSPEC__RESPONSIBILITIES = eINSTANCE.getUCMspec_Responsibilities();

		/**
		 * The meta object literal for the '<em><b>Scenario Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_MSPEC__SCENARIO_DEFS = eINSTANCE.getUCMspec_ScenarioDefs();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.URNlinkImpl <em>UR Nlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.URNlinkImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getURNlink()
		 * @generated
		 */
		EClass UR_NLINK = eINSTANCE.getURNlink();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UR_NLINK__TYPE = eINSTANCE.getURNlink_Type();

		/**
		 * The meta object literal for the '<em><b>To Elem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UR_NLINK__TO_ELEM = eINSTANCE.getURNlink_ToElem();

		/**
		 * The meta object literal for the '<em><b>From Elem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UR_NLINK__FROM_ELEM = eINSTANCE.getURNlink_FromElem();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.URNmodelElementImpl <em>UR Nmodel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.URNmodelElementImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getURNmodelElement()
		 * @generated
		 */
		EClass UR_NMODEL_ELEMENT = eINSTANCE.getURNmodelElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UR_NMODEL_ELEMENT__ID = eINSTANCE.getURNmodelElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UR_NMODEL_ELEMENT__NAME = eINSTANCE.getURNmodelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UR_NMODEL_ELEMENT__METADATA = eINSTANCE.getURNmodelElement_Metadata();

		/**
		 * The meta object literal for the '<em><b>To Links</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UR_NMODEL_ELEMENT__TO_LINKS = eINSTANCE.getURNmodelElement_ToLinks();

		/**
		 * The meta object literal for the '<em><b>From Links</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UR_NMODEL_ELEMENT__FROM_LINKS = eINSTANCE.getURNmodelElement_FromLinks();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UR_NMODEL_ELEMENT__DESC = eINSTANCE.getURNmodelElement_Desc();

		/**
		 * The meta object literal for the '<em><b>Concern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UR_NMODEL_ELEMENT__CONCERN = eINSTANCE.getURNmodelElement_Concern();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.URNspecImpl <em>UR Nspec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.URNspecImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getURNspec()
		 * @generated
		 */
		EClass UR_NSPEC = eINSTANCE.getURNspec();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UR_NSPEC__NAME = eINSTANCE.getURNspec_Name();

		/**
		 * The meta object literal for the '<em><b>Ucmspec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UR_NSPEC__UCMSPEC = eINSTANCE.getURNspec_Ucmspec();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UR_NSPEC__METADATA = eINSTANCE.getURNspec_Metadata();

		/**
		 * The meta object literal for the '<em><b>Urn Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UR_NSPEC__URN_LINKS = eINSTANCE.getURNspec_UrnLinks();

		/**
		 * The meta object literal for the '<em><b>Grlspec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UR_NSPEC__GRLSPEC = eINSTANCE.getURNspec_Grlspec();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UR_NSPEC__INFO = eINSTANCE.getURNspec_Info();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UR_NSPEC__CONCERNS = eINSTANCE.getURNspec_Concerns();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.VariableImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Enumeration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ENUMERATION_TYPE = eINSTANCE.getVariable_EnumerationType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.WaitingPlaceImpl <em>Waiting Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.WaitingPlaceImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getWaitingPlace()
		 * @generated
		 */
		EClass WAITING_PLACE = eINSTANCE.getWaitingPlace();

		/**
		 * The meta object literal for the '<em><b>Wait Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAITING_PLACE__WAIT_TYPE = eINSTANCE.getWaitingPlace_WaitType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.WorkloadImpl <em>Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.WorkloadImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getWorkload()
		 * @generated
		 */
		EClass WORKLOAD = eINSTANCE.getWorkload();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__UNIT = eINSTANCE.getWorkload_Unit();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.impl.URNBaseImpl <em>URN Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.impl.URNBaseImpl
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getURNBase()
		 * @generated
		 */
		EClass URN_BASE = eINSTANCE.getURNBase();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.ComponentKind <em>Component Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.ComponentKind
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComponentKind()
		 * @generated
		 */
		EEnum COMPONENT_KIND = eINSTANCE.getComponentKind();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.ContributionType <em>Contribution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.ContributionType
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getContributionType()
		 * @generated
		 */
		EEnum CONTRIBUTION_TYPE = eINSTANCE.getContributionType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.DatatypeKind <em>Datatype Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.DatatypeKind
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDatatypeKind()
		 * @generated
		 */
		EEnum DATATYPE_KIND = eINSTANCE.getDatatypeKind();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.DecompositionType <em>Decomposition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.DecompositionType
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDecompositionType()
		 * @generated
		 */
		EEnum DECOMPOSITION_TYPE = eINSTANCE.getDecompositionType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.DeviceKind <em>Device Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.DeviceKind
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDeviceKind()
		 * @generated
		 */
		EEnum DEVICE_KIND = eINSTANCE.getDeviceKind();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.ImportanceType <em>Importance Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.ImportanceType
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getImportanceType()
		 * @generated
		 */
		EEnum IMPORTANCE_TYPE = eINSTANCE.getImportanceType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.IntentionalElementType <em>Intentional Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.IntentionalElementType
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getIntentionalElementType()
		 * @generated
		 */
		EEnum INTENTIONAL_ELEMENT_TYPE = eINSTANCE.getIntentionalElementType();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.QualitativeLabel <em>Qualitative Label</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.QualitativeLabel
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getQualitativeLabel()
		 * @generated
		 */
		EEnum QUALITATIVE_LABEL = eINSTANCE.getQualitativeLabel();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.TimeUnit
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link org.emftrace.metamodel.URNModel.WaitKind <em>Wait Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftrace.metamodel.URNModel.WaitKind
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getWaitKind()
		 * @generated
		 */
		EEnum WAIT_KIND = eINSTANCE.getWaitKind();

		/**
		 * The meta object literal for the '<em>Component Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getComponentKindObject()
		 * @generated
		 */
		EDataType COMPONENT_KIND_OBJECT = eINSTANCE.getComponentKindObject();

		/**
		 * The meta object literal for the '<em>Contribution Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getContributionTypeObject()
		 * @generated
		 */
		EDataType CONTRIBUTION_TYPE_OBJECT = eINSTANCE.getContributionTypeObject();

		/**
		 * The meta object literal for the '<em>Datatype Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDatatypeKindObject()
		 * @generated
		 */
		EDataType DATATYPE_KIND_OBJECT = eINSTANCE.getDatatypeKindObject();

		/**
		 * The meta object literal for the '<em>Decomposition Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDecompositionTypeObject()
		 * @generated
		 */
		EDataType DECOMPOSITION_TYPE_OBJECT = eINSTANCE.getDecompositionTypeObject();

		/**
		 * The meta object literal for the '<em>Device Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getDeviceKindObject()
		 * @generated
		 */
		EDataType DEVICE_KIND_OBJECT = eINSTANCE.getDeviceKindObject();

		/**
		 * The meta object literal for the '<em>Importance Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getImportanceTypeObject()
		 * @generated
		 */
		EDataType IMPORTANCE_TYPE_OBJECT = eINSTANCE.getImportanceTypeObject();

		/**
		 * The meta object literal for the '<em>Intentional Element Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getIntentionalElementTypeObject()
		 * @generated
		 */
		EDataType INTENTIONAL_ELEMENT_TYPE_OBJECT = eINSTANCE.getIntentionalElementTypeObject();

		/**
		 * The meta object literal for the '<em>Qualitative Label Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getQualitativeLabelObject()
		 * @generated
		 */
		EDataType QUALITATIVE_LABEL_OBJECT = eINSTANCE.getQualitativeLabelObject();

		/**
		 * The meta object literal for the '<em>Time Unit Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getTimeUnitObject()
		 * @generated
		 */
		EDataType TIME_UNIT_OBJECT = eINSTANCE.getTimeUnitObject();

		/**
		 * The meta object literal for the '<em>Wait Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see org.emftrace.metamodel.URNModel.impl.URNModelPackageImpl#getWaitKindObject()
		 * @generated
		 */
		EDataType WAIT_KIND_OBJECT = eINSTANCE.getWaitKindObject();

	}

} //URNModelPackage
