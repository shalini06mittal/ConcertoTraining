package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context
    	= new AnnotationConfigApplicationContext(App.class);
    	System.out.println(" ######################### \n");
    	EmpService es = context.getBean(EmpService.class);
    	//System.out.println(es.getClass().getName());
    	
    	es.setName("Shalini Mittal");
    	System.out.println(es.getName());
    	
//    	CustomerServiceImpl cs = context.getBean(CustomerServiceImpl.class);
//    	System.out.println(cs.getClass().getName());
//    	System.out.println(cs.balance(12345));
    	
    	System.out.println(es.applyNow());
//    	try {
//			es.applyThen();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//		}
    }
}
