
package accessdsl;

import jpadsl.JPADslStandaloneSetup;
import jpaqldsl.JPAQLDslStandaloneSetup;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AccessDslStandaloneSetup extends AccessDslStandaloneSetupGenerated{

	public static void doSetup() {
		new AccessDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		org.eclipse.xtext.xbase.XbaseStandaloneSetup.doSetup();
		
		JPADslStandaloneSetup.doSetup();
		
		JPAQLDslStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
}

