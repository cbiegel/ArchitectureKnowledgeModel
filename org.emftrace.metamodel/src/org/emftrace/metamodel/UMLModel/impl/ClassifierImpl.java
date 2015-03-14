/**
 */
package org.emftrace.metamodel.UMLModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftrace.metamodel.UMLModel.Classifier;
import org.emftrace.metamodel.UMLModel.CollaborationUse;
import org.emftrace.metamodel.UMLModel.Generalization;
import org.emftrace.metamodel.UMLModel.PackageableElement;
import org.emftrace.metamodel.UMLModel.ParameterableElement;
import org.emftrace.metamodel.UMLModel.RedefinableElement;
import org.emftrace.metamodel.UMLModel.Substitution;
import org.emftrace.metamodel.UMLModel.TemplateBinding;
import org.emftrace.metamodel.UMLModel.TemplateSignature;
import org.emftrace.metamodel.UMLModel.TemplateableElement;
import org.emftrace.metamodel.UMLModel.Type;
import org.emftrace.metamodel.UMLModel.UMLModelPackage;
import org.emftrace.metamodel.UMLModel.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getCollaborationUse <em>Collaboration Use</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.emftrace.metamodel.UMLModel.impl.ClassifierImpl#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl extends NamespaceImpl implements Classifier {
	/**
	 * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedElement() <em>Redefined Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElement()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedElement() <em>Redefined Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElement()
	 * @generated
	 * @ordered
	 */
	protected String redefinedElement = REDEFINED_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinitionContext() <em>Redefinition Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContext()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINITION_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinitionContext() <em>Redefinition Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContext()
	 * @generated
	 * @ordered
	 */
	protected String redefinitionContext = REDEFINITION_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwningTemplateParameter() <em>Owning Template Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNING_TEMPLATE_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwningTemplateParameter() <em>Owning Template Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected String owningTemplateParameter = OWNING_TEMPLATE_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected String templateParameter = TEMPLATE_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplateBinding() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBinding;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature ownedTemplateSignature;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalization;

	/**
	 * The default value of the '{@link #getPowertypeExtent() <em>Powertype Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeExtent()
	 * @generated
	 * @ordered
	 */
	protected static final String POWERTYPE_EXTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowertypeExtent() <em>Powertype Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeExtent()
	 * @generated
	 * @ordered
	 */
	protected String powertypeExtent = POWERTYPE_EXTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected String feature = FEATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritedMember() <em>Inherited Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedMember()
	 * @generated
	 * @ordered
	 */
	protected static final String INHERITED_MEMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInheritedMember() <em>Inherited Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedMember()
	 * @generated
	 * @ordered
	 */
	protected String inheritedMember = INHERITED_MEMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedClassifier() <em>Redefined Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_CLASSIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedClassifier() <em>Redefined Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifier()
	 * @generated
	 * @ordered
	 */
	protected String redefinedClassifier = REDEFINED_CLASSIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneral() <em>General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected String general = GENERAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected EList<Substitution> substitution;

	/**
	 * The default value of the '{@link #getRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected String representation = REPRESENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCollaborationUse() <em>Collaboration Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationUse()
	 * @generated
	 * @ordered
	 */
	protected EList<CollaborationUse> collaborationUse;

	/**
	 * The cached value of the '{@link #getOwnedUseCase() <em>Owned Use Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> ownedUseCase;

	/**
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected String attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseCase() <em>Use Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCase()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_CASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseCase() <em>Use Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCase()
	 * @generated
	 * @ordered
	 */
	protected String useCase = USE_CASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLModelPackage.eINSTANCE.getClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedElement() {
		return redefinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedElement(String newRedefinedElement) {
		String oldRedefinedElement = redefinedElement;
		redefinedElement = newRedefinedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__REDEFINED_ELEMENT, oldRedefinedElement, redefinedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinitionContext() {
		return redefinitionContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinitionContext(String newRedefinitionContext) {
		String oldRedefinitionContext = redefinitionContext;
		redefinitionContext = newRedefinitionContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__REDEFINITION_CONTEXT, oldRedefinitionContext, redefinitionContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwningTemplateParameter() {
		return owningTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(String newOwningTemplateParameter) {
		String oldOwningTemplateParameter = owningTemplateParameter;
		owningTemplateParameter = newOwningTemplateParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER, oldOwningTemplateParameter, owningTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(String newTemplateParameter) {
		String oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		String oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBinding() {
		if (templateBinding == null) {
			templateBinding = new EObjectContainmentEList<TemplateBinding>(TemplateBinding.class, this, UMLModelPackage.CLASSIFIER__TEMPLATE_BINDING);
		}
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
		TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, null, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLModelPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, null, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectContainmentEList<Generalization>(Generalization.class, this, UMLModelPackage.CLASSIFIER__GENERALIZATION);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPowertypeExtent() {
		return powertypeExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowertypeExtent(String newPowertypeExtent) {
		String oldPowertypeExtent = powertypeExtent;
		powertypeExtent = newPowertypeExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__POWERTYPE_EXTENT, oldPowertypeExtent, powertypeExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(String newFeature) {
		String oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInheritedMember() {
		return inheritedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritedMember(String newInheritedMember) {
		String oldInheritedMember = inheritedMember;
		inheritedMember = newInheritedMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__INHERITED_MEMBER, oldInheritedMember, inheritedMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedClassifier() {
		return redefinedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedClassifier(String newRedefinedClassifier) {
		String oldRedefinedClassifier = redefinedClassifier;
		redefinedClassifier = newRedefinedClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__REDEFINED_CLASSIFIER, oldRedefinedClassifier, redefinedClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(String newGeneral) {
		String oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__GENERAL, oldGeneral, general));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Substitution> getSubstitution() {
		if (substitution == null) {
			substitution = new EObjectContainmentEList<Substitution>(Substitution.class, this, UMLModelPackage.CLASSIFIER__SUBSTITUTION);
		}
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(String newRepresentation) {
		String oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollaborationUse> getCollaborationUse() {
		if (collaborationUse == null) {
			collaborationUse = new EObjectContainmentEList<CollaborationUse>(CollaborationUse.class, this, UMLModelPackage.CLASSIFIER__COLLABORATION_USE);
		}
		return collaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getOwnedUseCase() {
		if (ownedUseCase == null) {
			ownedUseCase = new EObjectContainmentEList<UseCase>(UseCase.class, this, UMLModelPackage.CLASSIFIER__OWNED_USE_CASE);
		}
		return ownedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(String newAttribute) {
		String oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseCase() {
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCase(String newUseCase) {
		String oldUseCase = useCase;
		useCase = newUseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLModelPackage.CLASSIFIER__USE_CASE, oldUseCase, useCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLModelPackage.CLASSIFIER__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLModelPackage.CLASSIFIER__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.CLASSIFIER__SUBSTITUTION:
				return ((InternalEList<?>)getSubstitution()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.CLASSIFIER__COLLABORATION_USE:
				return ((InternalEList<?>)getCollaborationUse()).basicRemove(otherEnd, msgs);
			case UMLModelPackage.CLASSIFIER__OWNED_USE_CASE:
				return ((InternalEList<?>)getOwnedUseCase()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLModelPackage.CLASSIFIER__IS_LEAF:
				return isIsLeaf();
			case UMLModelPackage.CLASSIFIER__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case UMLModelPackage.CLASSIFIER__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case UMLModelPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter();
			case UMLModelPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case UMLModelPackage.CLASSIFIER__PACKAGE:
				return getPackage();
			case UMLModelPackage.CLASSIFIER__TEMPLATE_BINDING:
				return getTemplateBinding();
			case UMLModelPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UMLModelPackage.CLASSIFIER__IS_ABSTRACT:
				return isIsAbstract();
			case UMLModelPackage.CLASSIFIER__GENERALIZATION:
				return getGeneralization();
			case UMLModelPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return getPowertypeExtent();
			case UMLModelPackage.CLASSIFIER__FEATURE:
				return getFeature();
			case UMLModelPackage.CLASSIFIER__INHERITED_MEMBER:
				return getInheritedMember();
			case UMLModelPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				return getRedefinedClassifier();
			case UMLModelPackage.CLASSIFIER__GENERAL:
				return getGeneral();
			case UMLModelPackage.CLASSIFIER__SUBSTITUTION:
				return getSubstitution();
			case UMLModelPackage.CLASSIFIER__REPRESENTATION:
				return getRepresentation();
			case UMLModelPackage.CLASSIFIER__COLLABORATION_USE:
				return getCollaborationUse();
			case UMLModelPackage.CLASSIFIER__OWNED_USE_CASE:
				return getOwnedUseCase();
			case UMLModelPackage.CLASSIFIER__ATTRIBUTE:
				return getAttribute();
			case UMLModelPackage.CLASSIFIER__USE_CASE:
				return getUseCase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLModelPackage.CLASSIFIER__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__REDEFINED_ELEMENT:
				setRedefinedElement((String)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__REDEFINITION_CONTEXT:
				setRedefinitionContext((String)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((String)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((String)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__PACKAGE:
				setPackage((String)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__POWERTYPE_EXTENT:
				setPowertypeExtent((String)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__FEATURE:
				setFeature((String)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__INHERITED_MEMBER:
				setInheritedMember((String)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				setRedefinedClassifier((String)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__GENERAL:
				setGeneral((String)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__SUBSTITUTION:
				getSubstitution().clear();
				getSubstitution().addAll((Collection<? extends Substitution>)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__REPRESENTATION:
				setRepresentation((String)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__COLLABORATION_USE:
				getCollaborationUse().clear();
				getCollaborationUse().addAll((Collection<? extends CollaborationUse>)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				getOwnedUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__ATTRIBUTE:
				setAttribute((String)newValue);
				return;
			case UMLModelPackage.CLASSIFIER__USE_CASE:
				setUseCase((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLModelPackage.CLASSIFIER__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__REDEFINED_ELEMENT:
				setRedefinedElement(REDEFINED_ELEMENT_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__REDEFINITION_CONTEXT:
				setRedefinitionContext(REDEFINITION_CONTEXT_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter(OWNING_TEMPLATE_PARAMETER_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter(TEMPLATE_PARAMETER_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				return;
			case UMLModelPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UMLModelPackage.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				return;
			case UMLModelPackage.CLASSIFIER__POWERTYPE_EXTENT:
				setPowertypeExtent(POWERTYPE_EXTENT_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__FEATURE:
				setFeature(FEATURE_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__INHERITED_MEMBER:
				setInheritedMember(INHERITED_MEMBER_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				setRedefinedClassifier(REDEFINED_CLASSIFIER_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__GENERAL:
				setGeneral(GENERAL_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__SUBSTITUTION:
				getSubstitution().clear();
				return;
			case UMLModelPackage.CLASSIFIER__REPRESENTATION:
				setRepresentation(REPRESENTATION_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__COLLABORATION_USE:
				getCollaborationUse().clear();
				return;
			case UMLModelPackage.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				return;
			case UMLModelPackage.CLASSIFIER__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
			case UMLModelPackage.CLASSIFIER__USE_CASE:
				setUseCase(USE_CASE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLModelPackage.CLASSIFIER__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case UMLModelPackage.CLASSIFIER__REDEFINED_ELEMENT:
				return REDEFINED_ELEMENT_EDEFAULT == null ? redefinedElement != null : !REDEFINED_ELEMENT_EDEFAULT.equals(redefinedElement);
			case UMLModelPackage.CLASSIFIER__REDEFINITION_CONTEXT:
				return REDEFINITION_CONTEXT_EDEFAULT == null ? redefinitionContext != null : !REDEFINITION_CONTEXT_EDEFAULT.equals(redefinitionContext);
			case UMLModelPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				return OWNING_TEMPLATE_PARAMETER_EDEFAULT == null ? owningTemplateParameter != null : !OWNING_TEMPLATE_PARAMETER_EDEFAULT.equals(owningTemplateParameter);
			case UMLModelPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				return TEMPLATE_PARAMETER_EDEFAULT == null ? templateParameter != null : !TEMPLATE_PARAMETER_EDEFAULT.equals(templateParameter);
			case UMLModelPackage.CLASSIFIER__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case UMLModelPackage.CLASSIFIER__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLModelPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UMLModelPackage.CLASSIFIER__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case UMLModelPackage.CLASSIFIER__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UMLModelPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return POWERTYPE_EXTENT_EDEFAULT == null ? powertypeExtent != null : !POWERTYPE_EXTENT_EDEFAULT.equals(powertypeExtent);
			case UMLModelPackage.CLASSIFIER__FEATURE:
				return FEATURE_EDEFAULT == null ? feature != null : !FEATURE_EDEFAULT.equals(feature);
			case UMLModelPackage.CLASSIFIER__INHERITED_MEMBER:
				return INHERITED_MEMBER_EDEFAULT == null ? inheritedMember != null : !INHERITED_MEMBER_EDEFAULT.equals(inheritedMember);
			case UMLModelPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				return REDEFINED_CLASSIFIER_EDEFAULT == null ? redefinedClassifier != null : !REDEFINED_CLASSIFIER_EDEFAULT.equals(redefinedClassifier);
			case UMLModelPackage.CLASSIFIER__GENERAL:
				return GENERAL_EDEFAULT == null ? general != null : !GENERAL_EDEFAULT.equals(general);
			case UMLModelPackage.CLASSIFIER__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UMLModelPackage.CLASSIFIER__REPRESENTATION:
				return REPRESENTATION_EDEFAULT == null ? representation != null : !REPRESENTATION_EDEFAULT.equals(representation);
			case UMLModelPackage.CLASSIFIER__COLLABORATION_USE:
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLModelPackage.CLASSIFIER__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLModelPackage.CLASSIFIER__ATTRIBUTE:
				return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
			case UMLModelPackage.CLASSIFIER__USE_CASE:
				return USE_CASE_EDEFAULT == null ? useCase != null : !USE_CASE_EDEFAULT.equals(useCase);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.CLASSIFIER__IS_LEAF: return UMLModelPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case UMLModelPackage.CLASSIFIER__REDEFINED_ELEMENT: return UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case UMLModelPackage.CLASSIFIER__REDEFINITION_CONTEXT: return UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER: return UMLModelPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case UMLModelPackage.CLASSIFIER__TEMPLATE_PARAMETER: return UMLModelPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.CLASSIFIER__PACKAGE: return UMLModelPackage.TYPE__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case UMLModelPackage.CLASSIFIER__TEMPLATE_BINDING: return UMLModelPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case UMLModelPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE: return UMLModelPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.REDEFINABLE_ELEMENT__IS_LEAF: return UMLModelPackage.CLASSIFIER__IS_LEAF;
				case UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return UMLModelPackage.CLASSIFIER__REDEFINED_ELEMENT;
				case UMLModelPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UMLModelPackage.CLASSIFIER__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return UMLModelPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER;
				case UMLModelPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return UMLModelPackage.CLASSIFIER__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.TYPE__PACKAGE: return UMLModelPackage.CLASSIFIER__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case UMLModelPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return UMLModelPackage.CLASSIFIER__TEMPLATE_BINDING;
				case UMLModelPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return UMLModelPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isLeaf: ");
		result.append(isLeaf);
		result.append(", redefinedElement: ");
		result.append(redefinedElement);
		result.append(", redefinitionContext: ");
		result.append(redefinitionContext);
		result.append(", owningTemplateParameter: ");
		result.append(owningTemplateParameter);
		result.append(", templateParameter: ");
		result.append(templateParameter);
		result.append(", package: ");
		result.append(package_);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", powertypeExtent: ");
		result.append(powertypeExtent);
		result.append(", feature: ");
		result.append(feature);
		result.append(", inheritedMember: ");
		result.append(inheritedMember);
		result.append(", redefinedClassifier: ");
		result.append(redefinedClassifier);
		result.append(", general: ");
		result.append(general);
		result.append(", representation: ");
		result.append(representation);
		result.append(", attribute: ");
		result.append(attribute);
		result.append(", useCase: ");
		result.append(useCase);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl
