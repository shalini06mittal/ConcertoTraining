package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	public LogAspect() {
		//System.out.println("Log Aspect constructor");
	}
//	@Before("execution(* com.aop.EmpService.setName(..))"
//			+ "&& args(name)")
	public void beforeAdvice(JoinPoint jp, String name)
	{
		System.out.println("**********************************************");
		System.out.println("before advice "+name);
		System.out.println(jp.getTarget());
		System.out.println(jp.getSignature());
		System.out.println("**********************************************");
		System.out.println();
	}
	//@After("execution(* com.aop.EmpService.setName(..))")
	public void afterAdvice()
	{
		System.out.println("after advice");
	}
	
//	@AfterReturning(pointcut = "execution(public * com.aop.CustomerServiceImpl.*(..))", 
//			returning = "data")
	public void afterReturning(double data)
	{
		System.out.println("**********************************************");
		System.out.println("after returning "+data);
		System.out.println("**********************************************");
		System.out.println();
	}
	//@AfterThrowing(pointcut = "pointcut()", throwing = "ex" )
	public void afterThrowing(Exception ex)
	{
		System.out.println("**********************************************");
		System.out.println("after throwing "+ex.getMessage());
		System.out.println("**********************************************");
		System.out.println();
	}
	
	@Pointcut("execution(public * com.aop.EmpService.*(..))")
	public void pointcut() {}
	
	@Around("pointcut()")
	public String around(ProceedingJoinPoint pjp)
	{
		String data = null;
		System.out.println("around advice before ");
		try {
			data = (String)pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("around advice after "+data);
		if(data!=null)
		data = data.toUpperCase();
		return data;
	}
}














