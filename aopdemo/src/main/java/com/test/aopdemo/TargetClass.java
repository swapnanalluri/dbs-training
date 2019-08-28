package com.test.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class TargetClass {

	public void insert() {
		System.out.println("Inserting recoed");
	}
	public void delete() {
		System.out.println("Deleting record");
	}
	public void abc() {
		System.out.println("Just for demo");
		/*
		 * if(true) { throw new NullPointerException(); }
		 */
	}
}
