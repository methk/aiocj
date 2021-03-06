/**
 */
package org.aioc.impl;

import java.util.Collection;

import org.aioc.Aioc;
import org.aioc.AiocJ;
import org.aioc.AiocPackage;
import org.aioc.Rule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>J</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.AiocJImpl#getAioc <em>Aioc</em>}</li>
 *   <li>{@link org.aioc.impl.AiocJImpl#getRuleSet <em>Rule Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AiocJImpl extends MinimalEObjectImpl.Container implements AiocJ
{
  /**
   * The cached value of the '{@link #getAioc() <em>Aioc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAioc()
   * @generated
   * @ordered
   */
  protected Aioc aioc;

  /**
   * The cached value of the '{@link #getRuleSet() <em>Rule Set</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleSet()
   * @generated
   * @ordered
   */
  protected EList<Rule> ruleSet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AiocJImpl()
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
    return AiocPackage.Literals.AIOC_J;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aioc getAioc()
  {
    return aioc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAioc(Aioc newAioc, NotificationChain msgs)
  {
    Aioc oldAioc = aioc;
    aioc = newAioc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.AIOC_J__AIOC, oldAioc, newAioc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAioc(Aioc newAioc)
  {
    if (newAioc != aioc)
    {
      NotificationChain msgs = null;
      if (aioc != null)
        msgs = ((InternalEObject)aioc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.AIOC_J__AIOC, null, msgs);
      if (newAioc != null)
        msgs = ((InternalEObject)newAioc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.AIOC_J__AIOC, null, msgs);
      msgs = basicSetAioc(newAioc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.AIOC_J__AIOC, newAioc, newAioc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRuleSet()
  {
    if (ruleSet == null)
    {
      ruleSet = new EObjectContainmentEList<Rule>(Rule.class, this, AiocPackage.AIOC_J__RULE_SET);
    }
    return ruleSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AiocPackage.AIOC_J__AIOC:
        return basicSetAioc(null, msgs);
      case AiocPackage.AIOC_J__RULE_SET:
        return ((InternalEList<?>)getRuleSet()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AiocPackage.AIOC_J__AIOC:
        return getAioc();
      case AiocPackage.AIOC_J__RULE_SET:
        return getRuleSet();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AiocPackage.AIOC_J__AIOC:
        setAioc((Aioc)newValue);
        return;
      case AiocPackage.AIOC_J__RULE_SET:
        getRuleSet().clear();
        getRuleSet().addAll((Collection<? extends Rule>)newValue);
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
      case AiocPackage.AIOC_J__AIOC:
        setAioc((Aioc)null);
        return;
      case AiocPackage.AIOC_J__RULE_SET:
        getRuleSet().clear();
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
      case AiocPackage.AIOC_J__AIOC:
        return aioc != null;
      case AiocPackage.AIOC_J__RULE_SET:
        return ruleSet != null && !ruleSet.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AiocJImpl
