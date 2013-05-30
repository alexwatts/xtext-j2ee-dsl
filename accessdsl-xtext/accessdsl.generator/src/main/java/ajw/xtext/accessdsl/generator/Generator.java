package ajw.xtext.accessdsl.generator;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * This class generates code from a DSL model.
 * @author aphethean
 *
 */
public class Generator {
	
	@Inject
	private Provider<ResourceSet> resourceSetProvider;
	@Inject
	private IResourceValidator validator;
	@Inject
	private IGenerator generator;
	@Inject
	private JavaIoFileSystemAccess fileAccess;
	
	protected void runGenerator(String inputPath, String outputPath) {

		// load the resource
		ResourceSet set = resourceSetProvider.get();
		
		StringTokenizer sb = new StringTokenizer(inputPath, ":", false);
		
		
		Resource primaryResource = set.getResource(URI.createURI((String)sb.nextElement()), true);
		
		
		while (sb.hasMoreElements()) {
				
primaryResource.getResourceSet().getResources().add(set.getResource(URI.createURI((String)sb.nextElement()), true));
				
		}
			
		

		// validate the resource
		List<Issue> list = validator.validate(primaryResource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}

		// configure and start the generator
		fileAccess.setOutputPath(outputPath);
		generator.doGenerate(primaryResource, fileAccess);
	}
}
