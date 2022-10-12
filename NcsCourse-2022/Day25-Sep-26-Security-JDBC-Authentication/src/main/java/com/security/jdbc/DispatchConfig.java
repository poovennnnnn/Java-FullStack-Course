package com.security.jdbc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//when this class is loaded, dispatchservlet is automatically loaded
//this class is an alternative way to declare an dispatchservlet in web.xml


public class DispatchConfig  extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// this is a @configuration files need to be returned from this method
		return new Class[] {AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	
        // any @Enablewebmvc Annotation
				
	
		
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		
	  //
		    return new String[] {"/"};
	}

}
