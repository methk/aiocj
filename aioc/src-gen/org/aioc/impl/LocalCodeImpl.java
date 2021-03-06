/**
 */
package org.aioc.impl;

import org.aioc.AiocPackage;
import org.aioc.LocalCode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.LocalCodeImpl#getThread <em>Thread</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalCodeImpl extends MinimalEObjectImpl.Container implements LocalCode
{
  /**
   * The default value of the '{@link #getThread() <em>Thread</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThread()
   * @generated
   * @ordered
   */
  protected static final String THREAD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getThread() <em>Thread</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThread()
   * @generated
   * @ordered
   */
  protected String thread = THREAD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalCodeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AiocPackage.Literals.LOCAL_CODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getThread()
  {
    return thread;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThread(String newThread)
  {
    String oldThread = thread;
    thread = newThread;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.LOCAL_CODE__THREAD, oldThread, thread));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AiocPackage.LOCAL_CODE__THREAD:
        return getThread();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AiocPackage.LOCAL_CODE__THREAD:
        setThread((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AiocPackage.LOCAL_CODE__THREAD:
        setThread(THREAD_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AiocPackage.LOCAL_CODE__THREAD:
        return THREAD_EDEFAULT == null ? thread != null : !THREAD_EDEFAULT.equals(thread);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (thread: ");
    result.append(thread);
    result.append(')');
    return result.toString();
  }

} //LocalCodeImpl
