/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.sorting;

import org.xtext.example.sorting.SortingStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SortingStandaloneSetup extends SortingStandaloneSetupGenerated {
  public static void doSetup() {
    new SortingStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
