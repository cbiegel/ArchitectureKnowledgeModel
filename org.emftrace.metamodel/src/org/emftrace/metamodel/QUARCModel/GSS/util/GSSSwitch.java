/**
 */
package org.emftrace.metamodel.QUARCModel.GSS.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftrace.metamodel.QUARCModel.GSS.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emftrace.metamodel.QUARCModel.GSS.GSSPackage
 * @generated
 */
public class GSSSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GSSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSSwitch() {
		if (modelPackage == null) {
			modelPackage = GSSPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GSSPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseGSSBase(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = caseGSSBase(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.DECOMPOSITION: {
				Decomposition decomposition = (Decomposition)theEObject;
				T result = caseDecomposition(decomposition);
				if (result == null) result = caseRefinement(decomposition);
				if (result == null) result = caseRelation(decomposition);
				if (result == null) result = caseGSSBase(decomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.IMPACT: {
				Impact impact = (Impact)theEObject;
				T result = caseImpact(impact);
				if (result == null) result = caseRelation(impact);
				if (result == null) result = caseGSSBase(impact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseElement(goal);
				if (result == null) result = caseGSSBase(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.CONSTRAINED_ELEMENT: {
				ConstrainedElement constrainedElement = (ConstrainedElement)theEObject;
				T result = caseConstrainedElement(constrainedElement);
				if (result == null) result = caseElement(constrainedElement);
				if (result == null) result = caseGSSBase(constrainedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.PRINCIPLE: {
				Principle principle = (Principle)theEObject;
				T result = casePrinciple(principle);
				if (result == null) result = caseConstrainedElement(principle);
				if (result == null) result = caseElement(principle);
				if (result == null) result = caseGSSBase(principle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.SOLUTION_INSTRUMENT: {
				SolutionInstrument solutionInstrument = (SolutionInstrument)theEObject;
				T result = caseSolutionInstrument(solutionInstrument);
				if (result == null) result = caseConstrainedElement(solutionInstrument);
				if (result == null) result = caseElement(solutionInstrument);
				if (result == null) result = caseGSSBase(solutionInstrument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = caseSolutionInstrument(pattern);
				if (result == null) result = caseConstrainedElement(pattern);
				if (result == null) result = caseElement(pattern);
				if (result == null) result = caseGSSBase(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.REFACTORING: {
				Refactoring refactoring = (Refactoring)theEObject;
				T result = caseRefactoring(refactoring);
				if (result == null) result = caseSolutionInstrument(refactoring);
				if (result == null) result = caseConstrainedElement(refactoring);
				if (result == null) result = caseElement(refactoring);
				if (result == null) result = caseGSSBase(refactoring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.OFFSET: {
				Offset offset = (Offset)theEObject;
				T result = caseOffset(offset);
				if (result == null) result = caseRelation(offset);
				if (result == null) result = caseGSSBase(offset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.FLAW: {
				Flaw flaw = (Flaw)theEObject;
				T result = caseFlaw(flaw);
				if (result == null) result = casePrinciple(flaw);
				if (result == null) result = caseConstrainedElement(flaw);
				if (result == null) result = caseElement(flaw);
				if (result == null) result = caseGSSBase(flaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.GSS_BASE: {
				GSSBase gssBase = (GSSBase)theEObject;
				T result = caseGSSBase(gssBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.GSS: {
				GSS gss = (GSS)theEObject;
				T result = caseGSS(gss);
				if (result == null) result = caseGSSBase(gss);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseGSSBase(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.TAGS_CATALOGUE: {
				TagsCatalogue tagsCatalogue = (TagsCatalogue)theEObject;
				T result = caseTagsCatalogue(tagsCatalogue);
				if (result == null) result = caseGSSBase(tagsCatalogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.IS_A: {
				isA isA = (isA)theEObject;
				T result = caseisA(isA);
				if (result == null) result = caseRefinement(isA);
				if (result == null) result = caseRelation(isA);
				if (result == null) result = caseGSSBase(isA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSSPackage.REFINEMENT: {
				Refinement refinement = (Refinement)theEObject;
				T result = caseRefinement(refinement);
				if (result == null) result = caseRelation(refinement);
				if (result == null) result = caseGSSBase(refinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecomposition(Decomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpact(Impact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constrained Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constrained Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrainedElement(ConstrainedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Principle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Principle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrinciple(Principle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Instrument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Instrument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionInstrument(SolutionInstrument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refactoring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refactoring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefactoring(Refactoring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffset(Offset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flaw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flaw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlaw(Flaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSBase(GSSBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSS(GSS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags Catalogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagsCatalogue(TagsCatalogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>is A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>is A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseisA(isA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefinement(Refinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GSSSwitch
