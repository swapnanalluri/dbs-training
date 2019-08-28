package com.practice.practicecode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

//	static ArrayList<Clerk> carr = new ArrayList<Clerk>();
//	static ArrayList<Programmer> parr = new ArrayList<Programmer>();
//	static ArrayList<Manager> marr = new ArrayList<Manager>();

	static ArrayList<Emp> emp = new ArrayList<Emp>();

	public static void main(String args[]) {

		mainMenu();

	}

	public static void mainMenu() {

		Scanner sc = new Scanner(System.in);
		int ch = 1;

		while (ch >= 1 && ch <= 3) {
			System.out.println("1.Create");
			System.out.println("2.Display");
			System.out.println("3.Base Salary");
			System.out.println("4.Exit");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			if (ch > 4) {
				System.out.println("Choice should be between 1 to 4");
			}
			switch (ch) {
			case 1:
				create();
				break;
			case 2:
				display();
				break;
			case 3:
				baseSalary();
				break;
			case 4:
				getCount();
				break;
			}
		}

	}

	public static void create() {
		Scanner sc = new Scanner(System.in);
		int ch = 1;

		while (ch >= 1 && ch <= 3) {
			System.out.println("1.Clerk");
			System.out.println("2.Programmer");
			System.out.println("3.Manager");
			System.out.println("4.Exit");
			ch = sc.nextInt();
			/*
			 * if(ch>4) { System.out.println("Choice should be between 1 to 4"); }
			 */

			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			switch (ch) {
			case 1:
				/*
				 * Clerk c = (Clerk) context.getBean("clerk"); carr.add(c);
				 */
				// emp.add((Clerk) context.getBean("clerk"));
				context.getBean("clerk");
				break;
			case 2:
				/*
				 * Programmer p = (Programmer) context.getBean("programmer"); parr.add(p);
				 */
				// emp.add((Programmer) context.getBean("programmer"));
				context.getBean("programmer");
				break;
			case 3:
				/*
				 * Manager m = (Manager) context.getBean("manager"); marr.add(m);
				 */
				// emp.add((Manager) context.getBean("manager"));
				context.getBean("manager");
				break;
			}
		}
	}

	public static void display() {

		/*
		 * for (Clerk c : carr) { System.out.println(c); } for (Programmer p : parr) {
		 * System.out.println(p); } for (Manager m : marr) { System.out.println(m); }
		 * 
		 * for(Emp e:emp) { System.out.println(e); }
		 */
		
		Iterator<Emp> i1=Helper.list.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

	public static void baseSalary() {

		/*
		 * for (Clerk c : carr) { c.raiseSalary(); } for (Programmer p : parr) {
		 * p.raiseSalary(); } for (Manager m : marr) { m.raiseSalary(); }
		 */
		/*
		 * for (Emp e : emp) { e.raiseSalary(); }
		 */
		Iterator<Emp> i1=Helper.list.iterator();
		while(i1.hasNext()) {
			i1.next().raiseSalary();
		}

	}

	public static void getCount() {
		// int count = carr.size() + parr.size() + marr.size();
		System.out.println("The number of objects created==" + Helper.empCount);
	}
}
