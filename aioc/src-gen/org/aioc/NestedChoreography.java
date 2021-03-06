/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.NestedChoreography#getChoreography <em>Choreography</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getNestedChoreography()
 * @model
 * @generated
 */
public interface NestedChoreography extends EObject
{
  /**
   * Returns the value of the '<em><b>Choreography</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choreography</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choreography</em>' containment reference.
   * @see #setChoreography(Choreography)
   * @see org.aioc.AiocPackage#getNestedChoreography_Choreography()
   * @model containment="true"
   * @generated
   */
  Choreography getChoreography();

  /**
   * Sets the value of the '{@link org.aioc.NestedChoreography#getChoreography <em>Choreography</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Choreography</em>' containment reference.
   * @see #getChoreography()
   * @generated
   */
  void setChoreography(Choreography value);

} // NestedChoreography
