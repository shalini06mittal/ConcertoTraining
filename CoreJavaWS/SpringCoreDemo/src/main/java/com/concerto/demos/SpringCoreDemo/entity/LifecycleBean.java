package com.concerto.demos.SpringCoreDemo.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//@Component
public class LifecycleBean implements InitializingBean, DisposableBean{
	
	public LifecycleBean() {
		System.out.println("lifecycle const");
	}
	

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after properties set");
		
	}
	

}
