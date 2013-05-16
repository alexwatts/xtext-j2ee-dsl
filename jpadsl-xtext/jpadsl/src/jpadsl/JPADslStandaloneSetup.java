
package jpadsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JPADslStandaloneSetup extends JPADslStandaloneSetupGenerated{

	public static void doSetup() {
		new JPADslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

