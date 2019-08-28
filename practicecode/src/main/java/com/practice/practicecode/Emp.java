package com.practice.practicecode;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Emp {

	private String name;
	private int age;
	private String designation;
	private int salary;
	private int count;

	public Emp(int salary, String designation) {
		this.getDetails();
		this.salary = salary;
		this.designation = designation;
		Helper.empCount++;
		Helper.list.add(this);
	}

	public void getDetails() {
		
		
		boolean flag=true;
		/*
		 * try { Scanner sc = new Scanner(System.in); System.out.print("Enter name: ");
		 * this.name = sc.next(); System.out.println("Enter age: ");
		 * this.age=sc.nextInt();
		 * 
		 * } catch(InputMismatchException e) { System.out.println("wrong output");
		 * getDetails(); }
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		this.name = sc.next();
		this.age = InvalidAgeException.readEmpAge();
		/*
		 * do { try { flag = false; System.out.println("Enter age: "); this.age =
		 * sc.nextInt(); break; } catch (InputMismatchException e) {
		 * 
		 * System.out.println("Please enter only numbers"); flag = true; }
		 * sc.nextLine(); } while (age < 20 || age > 60);
		 */
		 
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", designation=" + designation + ", salary=" + salary + "]";
	}

	public void raiseSalary() {
		System.out.print("Enter amount to raise the salary " + this.name + ":");
		int amt = new Scanner(System.in).nextInt();
		this.salary = this.salary + amt;
	}

}
