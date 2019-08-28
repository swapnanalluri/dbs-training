package com.demo.springdemo;

public class Car implements Vehicle{

	public void accelete() {
		System.out.println("Car started");
	}

	public void brake() {
		System.out.println("Car stopped");
	}

	public void start() {
		accelete();
		
	}

	public void stop() {
		brake();
		
	}

}
