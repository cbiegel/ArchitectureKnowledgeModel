/**
 */
package org.emftrace.metamodel.QUARCModel.Query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftrace.metamodel.QUARCModel.Query.AssignedConstraintsSet;
import org.emftrace.metamodel.QUARCModel.Query.GSSQuery;
import org.emftrace.metamodel.QUARCModel.Query.QueryPackage;
import org.emftrace.metamodel.QUARCModel.Query.QueryResultSet;
import org.emftrace.metamodel.QUARCModel.Query.SelectedGoalsPriorities;
import org.emftrace.metamodel.QUARCModel.Query.SelectedGoalsSet;
import org.emftrace.metamodel.QUARCModel.Query.SelectedPrinciplesSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#isIncludeAll <em>Include All</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#isIncludePattern <em>Include Pattern</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#isIncludeRefactorings <em>Include Refactorings</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#isIncludePrinciples <em>Include Principles</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#isIncludeFlaws <em>Include Flaws</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#getQueryResultSet <em>Query Result Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#getSelectedGoalsSet <em>Selected Goals Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#getAssignedConstraintsSet <em>Assigned Constraints Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#getSelectedPrinciplesSet <em>Selected Principles Set</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#getSelectedGoalsPriorities <em>Selected Goals Priorities</em>}</li>
 *   <li>{@link org.emftrace.metamodel.QUARCModel.Query.impl.GSSQueryImpl#isChanged <em>Changed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GSSQueryImpl extends GSSQueryModelBaseImpl implements GSSQuery {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected String timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeAll() <em>Include All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeAll() <em>Include All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeAll()
	 * @generated
	 * @ordered
	 */
	protected boolean includeAll = INCLUDE_ALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludePattern() <em>Include Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludePattern()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_PATTERN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludePattern() <em>Include Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludePattern()
	 * @generated
	 * @ordered
	 */
	protected boolean includePattern = INCLUDE_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeRefactorings() <em>Include Refactorings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeRefactorings()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_REFACTORINGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeRefactorings() <em>Include Refactorings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeRefactorings()
	 * @generated
	 * @ordered
	 */
	protected boolean includeRefactorings = INCLUDE_REFACTORINGS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludePrinciples() <em>Include Principles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludePrinciples()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_PRINCIPLES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludePrinciples() <em>Include Principles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludePrinciples()
	 * @generated
	 * @ordered
	 */
	protected boolean includePrinciples = INCLUDE_PRINCIPLES_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeFlaws() <em>Include Flaws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeFlaws()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_FLAWS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeFlaws() <em>Include Flaws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeFlaws()
	 * @generated
	 * @ordered
	 */
	protected boolean includeFlaws = INCLUDE_FLAWS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQueryResultSet() <em>Query Result Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryResultSet()
	 * @generated
	 * @ordered
	 */
	protected QueryResultSet queryResultSet;

	/**
	 * The cached value of the '{@link #getSelectedGoalsSet() <em>Selected Goals Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedGoalsSet()
	 * @generated
	 * @ordered
	 */
	protected SelectedGoalsSet selectedGoalsSet;

	/**
	 * The cached value of the '{@link #getAssignedConstraintsSet() <em>Assigned Constraints Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedConstraintsSet()
	 * @generated
	 * @ordered
	 */
	protected AssignedConstraintsSet assignedConstraintsSet;

	/**
	 * The cached value of the '{@link #getSelectedPrinciplesSet() <em>Selected Principles Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedPrinciplesSet()
	 * @generated
	 * @ordered
	 */
	protected SelectedPrinciplesSet selectedPrinciplesSet;

	/**
	 * The cached value of the '{@link #getSelectedGoalsPriorities() <em>Selected Goals Priorities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedGoalsPriorities()
	 * @generated
	 * @ordered
	 */
	protected SelectedGoalsPriorities selectedGoalsPriorities;

	/**
	 * The default value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChanged()
	 * @generated
	 * @ordered
	 */
	protected boolean changed = CHANGED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.GSS_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(String newTimestamp) {
		String oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeAll() {
		return includeAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeAll(boolean newIncludeAll) {
		boolean oldIncludeAll = includeAll;
		includeAll = newIncludeAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__INCLUDE_ALL, oldIncludeAll, includeAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludePattern() {
		return includePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludePattern(boolean newIncludePattern) {
		boolean oldIncludePattern = includePattern;
		includePattern = newIncludePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__INCLUDE_PATTERN, oldIncludePattern, includePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeRefactorings() {
		return includeRefactorings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeRefactorings(boolean newIncludeRefactorings) {
		boolean oldIncludeRefactorings = includeRefactorings;
		includeRefactorings = newIncludeRefactorings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__INCLUDE_REFACTORINGS, oldIncludeRefactorings, includeRefactorings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludePrinciples() {
		return includePrinciples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludePrinciples(boolean newIncludePrinciples) {
		boolean oldIncludePrinciples = includePrinciples;
		includePrinciples = newIncludePrinciples;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__INCLUDE_PRINCIPLES, oldIncludePrinciples, includePrinciples));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeFlaws() {
		return includeFlaws;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeFlaws(boolean newIncludeFlaws) {
		boolean oldIncludeFlaws = includeFlaws;
		includeFlaws = newIncludeFlaws;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__INCLUDE_FLAWS, oldIncludeFlaws, includeFlaws));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryResultSet getQueryResultSet() {
		return queryResultSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryResultSet(QueryResultSet newQueryResultSet, NotificationChain msgs) {
		QueryResultSet oldQueryResultSet = queryResultSet;
		queryResultSet = newQueryResultSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__QUERY_RESULT_SET, oldQueryResultSet, newQueryResultSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryResultSet(QueryResultSet newQueryResultSet) {
		if (newQueryResultSet != queryResultSet) {
			NotificationChain msgs = null;
			if (queryResultSet != null)
				msgs = ((InternalEObject)queryResultSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.GSS_QUERY__QUERY_RESULT_SET, null, msgs);
			if (newQueryResultSet != null)
				msgs = ((InternalEObject)newQueryResultSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.GSS_QUERY__QUERY_RESULT_SET, null, msgs);
			msgs = basicSetQueryResultSet(newQueryResultSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__QUERY_RESULT_SET, newQueryResultSet, newQueryResultSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedGoalsSet getSelectedGoalsSet() {
		return selectedGoalsSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedGoalsSet(SelectedGoalsSet newSelectedGoalsSet, NotificationChain msgs) {
		SelectedGoalsSet oldSelectedGoalsSet = selectedGoalsSet;
		selectedGoalsSet = newSelectedGoalsSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__SELECTED_GOALS_SET, oldSelectedGoalsSet, newSelectedGoalsSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedGoalsSet(SelectedGoalsSet newSelectedGoalsSet) {
		if (newSelectedGoalsSet != selectedGoalsSet) {
			NotificationChain msgs = null;
			if (selectedGoalsSet != null)
				msgs = ((InternalEObject)selectedGoalsSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.GSS_QUERY__SELECTED_GOALS_SET, null, msgs);
			if (newSelectedGoalsSet != null)
				msgs = ((InternalEObject)newSelectedGoalsSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.GSS_QUERY__SELECTED_GOALS_SET, null, msgs);
			msgs = basicSetSelectedGoalsSet(newSelectedGoalsSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__SELECTED_GOALS_SET, newSelectedGoalsSet, newSelectedGoalsSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedConstraintsSet getAssignedConstraintsSet() {
		return assignedConstraintsSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedConstraintsSet(AssignedConstraintsSet newAssignedConstraintsSet, NotificationChain msgs) {
		AssignedConstraintsSet oldAssignedConstraintsSet = assignedConstraintsSet;
		assignedConstraintsSet = newAssignedConstraintsSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__ASSIGNED_CONSTRAINTS_SET, oldAssignedConstraintsSet, newAssignedConstraintsSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedConstraintsSet(AssignedConstraintsSet newAssignedConstraintsSet) {
		if (newAssignedConstraintsSet != assignedConstraintsSet) {
			NotificationChain msgs = null;
			if (assignedConstraintsSet != null)
				msgs = ((InternalEObject)assignedConstraintsSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.GSS_QUERY__ASSIGNED_CONSTRAINTS_SET, null, msgs);
			if (newAssignedConstraintsSet != null)
				msgs = ((InternalEObject)newAssignedConstraintsSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.GSS_QUERY__ASSIGNED_CONSTRAINTS_SET, null, msgs);
			msgs = basicSetAssignedConstraintsSet(newAssignedConstraintsSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__ASSIGNED_CONSTRAINTS_SET, newAssignedConstraintsSet, newAssignedConstraintsSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedPrinciplesSet getSelectedPrinciplesSet() {
		return selectedPrinciplesSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedPrinciplesSet(SelectedPrinciplesSet newSelectedPrinciplesSet, NotificationChain msgs) {
		SelectedPrinciplesSet oldSelectedPrinciplesSet = selectedPrinciplesSet;
		selectedPrinciplesSet = newSelectedPrinciplesSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__SELECTED_PRINCIPLES_SET, oldSelectedPrinciplesSet, newSelectedPrinciplesSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedPrinciplesSet(SelectedPrinciplesSet newSelectedPrinciplesSet) {
		if (newSelectedPrinciplesSet != selectedPrinciplesSet) {
			NotificationChain msgs = null;
			if (selectedPrinciplesSet != null)
				msgs = ((InternalEObject)selectedPrinciplesSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.GSS_QUERY__SELECTED_PRINCIPLES_SET, null, msgs);
			if (newSelectedPrinciplesSet != null)
				msgs = ((InternalEObject)newSelectedPrinciplesSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.GSS_QUERY__SELECTED_PRINCIPLES_SET, null, msgs);
			msgs = basicSetSelectedPrinciplesSet(newSelectedPrinciplesSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__SELECTED_PRINCIPLES_SET, newSelectedPrinciplesSet, newSelectedPrinciplesSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedGoalsPriorities getSelectedGoalsPriorities() {
		return selectedGoalsPriorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedGoalsPriorities(SelectedGoalsPriorities newSelectedGoalsPriorities, NotificationChain msgs) {
		SelectedGoalsPriorities oldSelectedGoalsPriorities = selectedGoalsPriorities;
		selectedGoalsPriorities = newSelectedGoalsPriorities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__SELECTED_GOALS_PRIORITIES, oldSelectedGoalsPriorities, newSelectedGoalsPriorities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedGoalsPriorities(SelectedGoalsPriorities newSelectedGoalsPriorities) {
		if (newSelectedGoalsPriorities != selectedGoalsPriorities) {
			NotificationChain msgs = null;
			if (selectedGoalsPriorities != null)
				msgs = ((InternalEObject)selectedGoalsPriorities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.GSS_QUERY__SELECTED_GOALS_PRIORITIES, null, msgs);
			if (newSelectedGoalsPriorities != null)
				msgs = ((InternalEObject)newSelectedGoalsPriorities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.GSS_QUERY__SELECTED_GOALS_PRIORITIES, null, msgs);
			msgs = basicSetSelectedGoalsPriorities(newSelectedGoalsPriorities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__SELECTED_GOALS_PRIORITIES, newSelectedGoalsPriorities, newSelectedGoalsPriorities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChanged() {
		return changed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChanged(boolean newChanged) {
		boolean oldChanged = changed;
		changed = newChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.GSS_QUERY__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.GSS_QUERY__QUERY_RESULT_SET:
				return basicSetQueryResultSet(null, msgs);
			case QueryPackage.GSS_QUERY__SELECTED_GOALS_SET:
				return basicSetSelectedGoalsSet(null, msgs);
			case QueryPackage.GSS_QUERY__ASSIGNED_CONSTRAINTS_SET:
				return basicSetAssignedConstraintsSet(null, msgs);
			case QueryPackage.GSS_QUERY__SELECTED_PRINCIPLES_SET:
				return basicSetSelectedPrinciplesSet(null, msgs);
			case QueryPackage.GSS_QUERY__SELECTED_GOALS_PRIORITIES:
				return basicSetSelectedGoalsPriorities(null, msgs);
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
			case QueryPackage.GSS_QUERY__NAME:
				return getName();
			case QueryPackage.GSS_QUERY__DESCRIPTION:
				return getDescription();
			case QueryPackage.GSS_QUERY__UUID:
				return getUuid();
			case QueryPackage.GSS_QUERY__USERNAME:
				return getUsername();
			case QueryPackage.GSS_QUERY__TIMESTAMP:
				return getTimestamp();
			case QueryPackage.GSS_QUERY__INCLUDE_ALL:
				return isIncludeAll();
			case QueryPackage.GSS_QUERY__INCLUDE_PATTERN:
				return isIncludePattern();
			case QueryPackage.GSS_QUERY__INCLUDE_REFACTORINGS:
				return isIncludeRefactorings();
			case QueryPackage.GSS_QUERY__INCLUDE_PRINCIPLES:
				return isIncludePrinciples();
			case QueryPackage.GSS_QUERY__INCLUDE_FLAWS:
				return isIncludeFlaws();
			case QueryPackage.GSS_QUERY__QUERY_RESULT_SET:
				return getQueryResultSet();
			case QueryPackage.GSS_QUERY__SELECTED_GOALS_SET:
				return getSelectedGoalsSet();
			case QueryPackage.GSS_QUERY__ASSIGNED_CONSTRAINTS_SET:
				return getAssignedConstraintsSet();
			case QueryPackage.GSS_QUERY__SELECTED_PRINCIPLES_SET:
				return getSelectedPrinciplesSet();
			case QueryPackage.GSS_QUERY__SELECTED_GOALS_PRIORITIES:
				return getSelectedGoalsPriorities();
			case QueryPackage.GSS_QUERY__CHANGED:
				return isChanged();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QueryPackage.GSS_QUERY__NAME:
				setName((String)newValue);
				return;
			case QueryPackage.GSS_QUERY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case QueryPackage.GSS_QUERY__UUID:
				setUuid((String)newValue);
				return;
			case QueryPackage.GSS_QUERY__USERNAME:
				setUsername((String)newValue);
				return;
			case QueryPackage.GSS_QUERY__TIMESTAMP:
				setTimestamp((String)newValue);
				return;
			case QueryPackage.GSS_QUERY__INCLUDE_ALL:
				setIncludeAll((Boolean)newValue);
				return;
			case QueryPackage.GSS_QUERY__INCLUDE_PATTERN:
				setIncludePattern((Boolean)newValue);
				return;
			case QueryPackage.GSS_QUERY__INCLUDE_REFACTORINGS:
				setIncludeRefactorings((Boolean)newValue);
				return;
			case QueryPackage.GSS_QUERY__INCLUDE_PRINCIPLES:
				setIncludePrinciples((Boolean)newValue);
				return;
			case QueryPackage.GSS_QUERY__INCLUDE_FLAWS:
				setIncludeFlaws((Boolean)newValue);
				return;
			case QueryPackage.GSS_QUERY__QUERY_RESULT_SET:
				setQueryResultSet((QueryResultSet)newValue);
				return;
			case QueryPackage.GSS_QUERY__SELECTED_GOALS_SET:
				setSelectedGoalsSet((SelectedGoalsSet)newValue);
				return;
			case QueryPackage.GSS_QUERY__ASSIGNED_CONSTRAINTS_SET:
				setAssignedConstraintsSet((AssignedConstraintsSet)newValue);
				return;
			case QueryPackage.GSS_QUERY__SELECTED_PRINCIPLES_SET:
				setSelectedPrinciplesSet((SelectedPrinciplesSet)newValue);
				return;
			case QueryPackage.GSS_QUERY__SELECTED_GOALS_PRIORITIES:
				setSelectedGoalsPriorities((SelectedGoalsPriorities)newValue);
				return;
			case QueryPackage.GSS_QUERY__CHANGED:
				setChanged((Boolean)newValue);
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
			case QueryPackage.GSS_QUERY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QueryPackage.GSS_QUERY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case QueryPackage.GSS_QUERY__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case QueryPackage.GSS_QUERY__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case QueryPackage.GSS_QUERY__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case QueryPackage.GSS_QUERY__INCLUDE_ALL:
				setIncludeAll(INCLUDE_ALL_EDEFAULT);
				return;
			case QueryPackage.GSS_QUERY__INCLUDE_PATTERN:
				setIncludePattern(INCLUDE_PATTERN_EDEFAULT);
				return;
			case QueryPackage.GSS_QUERY__INCLUDE_REFACTORINGS:
				setIncludeRefactorings(INCLUDE_REFACTORINGS_EDEFAULT);
				return;
			case QueryPackage.GSS_QUERY__INCLUDE_PRINCIPLES:
				setIncludePrinciples(INCLUDE_PRINCIPLES_EDEFAULT);
				return;
			case QueryPackage.GSS_QUERY__INCLUDE_FLAWS:
				setIncludeFlaws(INCLUDE_FLAWS_EDEFAULT);
				return;
			case QueryPackage.GSS_QUERY__QUERY_RESULT_SET:
				setQueryResultSet((QueryResultSet)null);
				return;
			case QueryPackage.GSS_QUERY__SELECTED_GOALS_SET:
				setSelectedGoalsSet((SelectedGoalsSet)null);
				return;
			case QueryPackage.GSS_QUERY__ASSIGNED_CONSTRAINTS_SET:
				setAssignedConstraintsSet((AssignedConstraintsSet)null);
				return;
			case QueryPackage.GSS_QUERY__SELECTED_PRINCIPLES_SET:
				setSelectedPrinciplesSet((SelectedPrinciplesSet)null);
				return;
			case QueryPackage.GSS_QUERY__SELECTED_GOALS_PRIORITIES:
				setSelectedGoalsPriorities((SelectedGoalsPriorities)null);
				return;
			case QueryPackage.GSS_QUERY__CHANGED:
				setChanged(CHANGED_EDEFAULT);
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
			case QueryPackage.GSS_QUERY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QueryPackage.GSS_QUERY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case QueryPackage.GSS_QUERY__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case QueryPackage.GSS_QUERY__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case QueryPackage.GSS_QUERY__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case QueryPackage.GSS_QUERY__INCLUDE_ALL:
				return includeAll != INCLUDE_ALL_EDEFAULT;
			case QueryPackage.GSS_QUERY__INCLUDE_PATTERN:
				return includePattern != INCLUDE_PATTERN_EDEFAULT;
			case QueryPackage.GSS_QUERY__INCLUDE_REFACTORINGS:
				return includeRefactorings != INCLUDE_REFACTORINGS_EDEFAULT;
			case QueryPackage.GSS_QUERY__INCLUDE_PRINCIPLES:
				return includePrinciples != INCLUDE_PRINCIPLES_EDEFAULT;
			case QueryPackage.GSS_QUERY__INCLUDE_FLAWS:
				return includeFlaws != INCLUDE_FLAWS_EDEFAULT;
			case QueryPackage.GSS_QUERY__QUERY_RESULT_SET:
				return queryResultSet != null;
			case QueryPackage.GSS_QUERY__SELECTED_GOALS_SET:
				return selectedGoalsSet != null;
			case QueryPackage.GSS_QUERY__ASSIGNED_CONSTRAINTS_SET:
				return assignedConstraintsSet != null;
			case QueryPackage.GSS_QUERY__SELECTED_PRINCIPLES_SET:
				return selectedPrinciplesSet != null;
			case QueryPackage.GSS_QUERY__SELECTED_GOALS_PRIORITIES:
				return selectedGoalsPriorities != null;
			case QueryPackage.GSS_QUERY__CHANGED:
				return changed != CHANGED_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(", username: ");
		result.append(username);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", includeAll: ");
		result.append(includeAll);
		result.append(", includePattern: ");
		result.append(includePattern);
		result.append(", includeRefactorings: ");
		result.append(includeRefactorings);
		result.append(", includePrinciples: ");
		result.append(includePrinciples);
		result.append(", includeFlaws: ");
		result.append(includeFlaws);
		result.append(", changed: ");
		result.append(changed);
		result.append(')');
		return result.toString();
	}

} //GSSQueryImpl
