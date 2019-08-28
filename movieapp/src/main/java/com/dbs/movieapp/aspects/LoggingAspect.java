package com.dbs.movieapp.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class LoggingAspect {
	
	@Before("within(com.dbs.movieapp.*.*)")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Before executing the method :: ");
        Arrays.asList(joinPoint.getArgs()).forEach(System.out::println);
    }

    @After("within(com.dbs.movieapp.*.*)")
    public void logAfter(){
        System.out.println("After executing the method :: ");

    }

}
