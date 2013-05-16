
package accessdsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AccessDslStandaloneSetup extends AccessDslStandaloneSetupGenerated{

	public static void doSetup() {
		new AccessDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

