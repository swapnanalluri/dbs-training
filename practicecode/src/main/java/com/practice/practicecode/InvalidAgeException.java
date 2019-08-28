package com.practice.practicecode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidAgeException extends RuntimeException {

	public InvalidAgeException() {
		super();
	}

	public InvalidAgeException(String m) {
		super(m);
	}

	public static int readEmpAge() {
		int age = 0;
		while (true) {
			try {
				System.out.println("Enter age: ");
				Scanner sc = new Scanner(System.in);
				age = sc.nextInt();
				if (age < 21 || age > 60) {
					throw new InvalidAgeException("Please enter correct value");
				} else
					return age;
			} catch (InputMismatchException e) {
					System.out.println("enter number");
			}
			catch(InvalidAgeException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}

}
