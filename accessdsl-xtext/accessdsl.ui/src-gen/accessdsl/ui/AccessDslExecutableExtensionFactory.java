/*
 * generated by Xtext
 */
package accessdsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import accessdsl.ui.internal.AccessDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AccessDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AccessDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AccessDslActivator.getInstance().getInjector(AccessDslActivator.ACCESSDSL_ACCESSDSL);
	}
	
}
