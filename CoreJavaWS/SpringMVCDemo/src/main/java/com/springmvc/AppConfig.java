package com.springmvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
	// TODO Auto-generated method stub
	return null;
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
	// TODO Auto-generated method stub
	return new Class<?>[] {WebConfig.class};
	}
	@Override
	protected String[] getServletMappings() {
	// TODO Auto-generated method stub
	return new String[] {"/"};
	}

}
