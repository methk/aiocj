/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.Skip#isSkip <em>Skip</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getSkip()
 * @model
 * @generated
 */
public interface Skip extends EObject
{
  /**
   * Returns the value of the '<em><b>Skip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Skip</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skip</em>' attribute.
   * @see #setSkip(boolean)
   * @see org.aioc.AiocPackage#getSkip_Skip()
   * @model
   * @generated
   */
  boolean isSkip();

  /**
   * Sets the value of the '{@link org.aioc.Skip#isSkip <em>Skip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skip</em>' attribute.
   * @see #isSkip()
   * @generated
   */
  void setSkip(boolean value);

} // Skip
