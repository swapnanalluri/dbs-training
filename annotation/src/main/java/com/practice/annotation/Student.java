package com.practice.annotation;

public class Student {

	private String name = "swapna";

	public Student() {

		System.out.println("student object created");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

}
