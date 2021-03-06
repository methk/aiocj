/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.Constant#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.aioc.Constant#getFloatValue <em>Float Value</em>}</li>
 *   <li>{@link org.aioc.Constant#getStrValue <em>Str Value</em>}</li>
 *   <li>{@link org.aioc.Constant#getTrue <em>True</em>}</li>
 *   <li>{@link org.aioc.Constant#getFalse <em>False</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends EObject
{
  /**
   * Returns the value of the '<em><b>Int Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Value</em>' containment reference.
   * @see #setIntValue(org.aioc.Integer)
   * @see org.aioc.AiocPackage#getConstant_IntValue()
   * @model containment="true"
   * @generated
   */
  org.aioc.Integer getIntValue();

  /**
   * Sets the value of the '{@link org.aioc.Constant#getIntValue <em>Int Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Value</em>' containment reference.
   * @see #getIntValue()
   * @generated
   */
  void setIntValue(org.aioc.Integer value);

  /**
   * Returns the value of the '<em><b>Float Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Float Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Float Value</em>' containment reference.
   * @see #setFloatValue(org.aioc.Float)
   * @see org.aioc.AiocPackage#getConstant_FloatValue()
   * @model containment="true"
   * @generated
   */
  org.aioc.Float getFloatValue();

  /**
   * Sets the value of the '{@link org.aioc.Constant#getFloatValue <em>Float Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float Value</em>' containment reference.
   * @see #getFloatValue()
   * @generated
   */
  void setFloatValue(org.aioc.Float value);

  /**
   * Returns the value of the '<em><b>Str Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str Value</em>' attribute.
   * @see #setStrValue(String)
   * @see org.aioc.AiocPackage#getConstant_StrValue()
   * @model
   * @generated
   */
  String getStrValue();

  /**
   * Sets the value of the '{@link org.aioc.Constant#getStrValue <em>Str Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str Value</em>' attribute.
   * @see #getStrValue()
   * @generated
   */
  void setStrValue(String value);

  /**
   * Returns the value of the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True</em>' attribute.
   * @see #setTrue(String)
   * @see org.aioc.AiocPackage#getConstant_True()
   * @model
   * @generated
   */
  String getTrue();

  /**
   * Sets the value of the '{@link org.aioc.Constant#getTrue <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True</em>' attribute.
   * @see #getTrue()
   * @generated
   */
  void setTrue(String value);

  /**
   * Returns the value of the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False</em>' attribute.
   * @see #setFalse(String)
   * @see org.aioc.AiocPackage#getConstant_False()
   * @model
   * @generated
   */
  String getFalse();

  /**
   * Sets the value of the '{@link org.aioc.Constant#getFalse <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False</em>' attribute.
   * @see #getFalse()
   * @generated
   */
  void setFalse(String value);

} // Constant
