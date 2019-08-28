package com.practice.annotation;

//import org.springframework.stereotype.Component;

//@Component("myaddr")
public class Address {
	public Address() {
		System.out.println("Address object created");
	}

	private String state = "AP";
	private String city = "sml";
	private int pin = 123;

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pin=" + pin + "]";
	}

}
