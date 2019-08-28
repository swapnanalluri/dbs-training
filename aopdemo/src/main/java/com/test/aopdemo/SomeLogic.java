package com.test.aopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class SomeLogic {

	@Before("execution(public void abc())")
	public void someMethod() {
		System.out.println("My advice");
	}

	@Before("execution(public void insert())")
	public void someMethod1() {
		System.out.println("My advice1");
	}

	@After("execution(public void delete())")
	public void someMethod2() {
		System.out.println("My advice2");
	}

	@Before("execution(public void *())")
	public void connect() {
		System.out.println("Database Connceting");
	}

	@After("execution(public void a*())") // This method will execute after the method name starts with a
	public void disconnect() {
		System.out.println("Database diconnceting");
	}

	@AfterReturning("execution(public void abc())")
	public void notifyToMobile() {
		System.out.println("Message Sent");
	}
	
	@AfterThrowing("execution(public void abc())")
	public void notifyToMail() {
		System.out.println("Message Sent to mail");
	}

}
