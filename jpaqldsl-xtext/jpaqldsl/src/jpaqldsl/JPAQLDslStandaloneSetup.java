
package jpaqldsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JPAQLDslStandaloneSetup extends JPAQLDslStandaloneSetupGenerated{

	public static void doSetup() {
		new JPAQLDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

