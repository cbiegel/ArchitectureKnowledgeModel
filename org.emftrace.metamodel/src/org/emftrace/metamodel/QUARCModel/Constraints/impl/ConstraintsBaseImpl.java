/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftrace.metamodel.QUARCModel.Constraints.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsBase;
import org.emftrace.metamodel.QUARCModel.Constraints.ConstraintsPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.emfstore.internal.common.model.Project;
import org.eclipse.emf.ecp.edit.spi.util.ECPModelElementChangeListener;
import org.eclipse.emf.emfstore.internal.common.model.util.ModelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintsBaseImpl extends EObjectImpl implements ConstraintsBase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ConstraintsBaseImpl() {
		super();
        changeListeners = new ArrayList<ECPModelElementChangeListener>();
        internalChangeListener = null;
        listenersToBeRemoved = new TreeSet<ECPModelElementChangeListener>();
        isNotifying = false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.CONSTRAINTS_BASE;
	}
	
	
	 /**
    * @generated NOT
    */
   private List<ECPModelElementChangeListener> changeListeners;
   private AdapterImpl internalChangeListener;
   private boolean isNotifying;
   private Set<ECPModelElementChangeListener> listenersToBeRemoved;
   

   /**
    * @generated NOT
    */
   public void delete()
   {
       //if( modelElementChangeListener != null ) modelElementChangeListener.remove();
       
       Project project = ModelUtil.getProject(this);
       project.deleteModelElement(this);
   }
   
   /**
    * @generated NOT
    */
   public String getIdentifier()
   {
       Project project = ModelUtil.getProject(this);
       return project.getModelElementId(this).getId();
   }
   
   /**
    * @generated NOT
    */
   public void addModelElementChangeListener(ECPModelElementChangeListener listener) {
       if (this.changeListeners.size() == 0) {
           internalChangeListener = new AdapterImpl() {
               /**
                * {@inheritDoc}
                */
               @Override
               public void notifyChanged(Notification notification) {
                   notifyListenersAboutChange(notification);
               }
           };
           this.eAdapters().add(internalChangeListener);
       }
       this.changeListeners.add(listener);
   }
   
   /**
    * @generated NOT
    */
   public void removeModelElementChangeListener(ECPModelElementChangeListener listener) {
       // if we are notifying listeners at the moment than just add listener for later removal
       if (isNotifying) {
           listenersToBeRemoved.add(listener);
           return;
       }

       this.changeListeners.remove(listener);
       if (this.changeListeners.size() < 1 && internalChangeListener != null) {
           this.eAdapters().remove(internalChangeListener);
           internalChangeListener = null;
       }
   }  
   
   /**
    * @generated NOT
    * @param notification
    */
   private void notifyListenersAboutChange(Notification notification) {
       isNotifying = true;
       for (ECPModelElementChangeListener listener : changeListeners) {
           try {
        	   listener.onChange(notification);
           }
           // BEGIN SUPRESS CATCH EXCEPTION
           catch (RuntimeException exception) {
               ModelUtil.logWarning("ModelElementChangeListener threw RuntimeException on Change Notification " + ""
                   + "(exception was caught and forwarded to listener for handling)", exception);
               try {
                   //listener.onRuntimeExceptionInListener(exception);
                   // TODO CLEANUP listener onRuntimeExceptionInListener
                   System.out.println("hi");
               } catch (RuntimeException runtimeException) {
                   ModelUtil.logException(
                       "Notifying listener about change in a model element failed, UI may not update properly now.",
                       runtimeException);
                   listenersToBeRemoved.add(listener);
               }
           }
           // END SUPRESS CATCH EXCEPTION
       }
       isNotifying = false;
       for (ECPModelElementChangeListener listener : listenersToBeRemoved) {
           removeModelElementChangeListener(listener);
       }
       listenersToBeRemoved.clear();
   }

} //ConstraintsBaseImpl
