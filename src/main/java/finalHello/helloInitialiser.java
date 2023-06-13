package finalHello;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class helloInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configFiles= {helloConfig.class};
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {
		  String[] mappings= {"/finalHello/hello","/hello"};
		return mappings;
	}

}
