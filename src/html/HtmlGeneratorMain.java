package html;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.acceleo.query.delegates.AQLValidationDelegate;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;

import assignment.AssignmentPackage;
import assignment.Course;
import assignment.Department;
import assignment.util.AssignmentResourceFactoryImpl;

public class HtmlGeneratorMain {
	
	
	public static void getDepartment(String uriString) {
		
	}
	public static void getSampleDepartment() {
		
	}	
	
	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}
	
	

	public static void main(String[] args) {
		ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/acceleo/query/1.0", new AQLValidationDelegate());
		ResourceSet resSet = new ResourceSetImpl();
		
		resSet.getPackageRegistry().put(AssignmentPackage.eNS_URI, AssignmentPackage.eINSTANCE);
		
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		
		Resource resource = resSet.getResource(URI.createURI(HtmlGeneratorMain.class.getResource("Department.xmi").toString()), true);
		
		
		
		Department dep = (Department) resource.getContents().get(0);
		/*for (Course course : dep.getCourse()) {
			System.out.println(course);
		}*/
		
		/*Resource convertedResource = new JsonResourceFactory().createResource(resource.getURI().trimFileExtension().appendFileExtension("json"));
		convertedResource.getContents().addAll(resource.getContents());
		try {
			convertedResource.save(System.out,null);	
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));

		if(diagnostic.getSeverity()!= Diagnostic.OK) {
			printDiagnostic(diagnostic,"");
		}
		
		
		String html = new HtmlGenerator().generateHtml(dep);
		try {
			FileOutputStream fout=new FileOutputStream("Department.html");
		//	URI target = URI.createURI(HtmlGeneratorMain.class.getResource("Department.xmi").toString());
			//URI target = URI.createURI("URI");	
		//	PrintStream ps = new PrintStream(dep.eResource().getResourceSet().getURIConverter().createOutputStream(target));
			PrintStream ps = new PrintStream(fout);
				ps.print(html);
				
				System.out.println(html);
				ps.close(); 
		}catch (Exception e) {
			System.out.println("error: "+e);
		}
		
		

	}



}
