/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.sorting.sorting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sorting.sorting.Component#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.sorting.sorting.Component#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link org.xtext.example.sorting.sorting.Component#getOutPorts <em>Out Ports</em>}</li>
 *   <li>{@link org.xtext.example.sorting.sorting.Component#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sorting.sorting.SortingPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.sorting.sorting.SortingPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.sorting.sorting.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>In Ports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.sorting.sorting.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Ports</em>' containment reference list.
   * @see org.xtext.example.sorting.sorting.SortingPackage#getComponent_InPorts()
   * @model containment="true"
   * @generated
   */
  EList<Port> getInPorts();

  /**
   * Returns the value of the '<em><b>Out Ports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.sorting.sorting.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Ports</em>' containment reference list.
   * @see org.xtext.example.sorting.sorting.SortingPackage#getComponent_OutPorts()
   * @model containment="true"
   * @generated
   */
  EList<Port> getOutPorts();

  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see #setMethod(String)
   * @see org.xtext.example.sorting.sorting.SortingPackage#getComponent_Method()
   * @model
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link org.xtext.example.sorting.sorting.Component#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

} // Component
