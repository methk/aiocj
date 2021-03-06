/**
 */
package org.aioc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.FunctionList#getFunctionName <em>Function Name</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getFunctionList()
 * @model
 * @generated
 */
public interface FunctionList extends EObject
{
  /**
   * Returns the value of the '<em><b>Function Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Name</em>' attribute list.
   * @see org.aioc.AiocPackage#getFunctionList_FunctionName()
   * @model unique="false"
   * @generated
   */
  EList<String> getFunctionName();

} // FunctionList
