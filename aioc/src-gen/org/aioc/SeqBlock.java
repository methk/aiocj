/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seq Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.SeqBlock#getEvent <em>Event</em>}</li>
 *   <li>{@link org.aioc.SeqBlock#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getSeqBlock()
 * @model
 * @generated
 */
public interface SeqBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(EObject)
   * @see org.aioc.AiocPackage#getSeqBlock_Event()
   * @model containment="true"
   * @generated
   */
  EObject getEvent();

  /**
   * Sets the value of the '{@link org.aioc.SeqBlock#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(EObject value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(Choreography)
   * @see org.aioc.AiocPackage#getSeqBlock_Next()
   * @model containment="true"
   * @generated
   */
  Choreography getNext();

  /**
   * Sets the value of the '{@link org.aioc.SeqBlock#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(Choreography value);

} // SeqBlock
