/*
 * package com.practice.practicecode;
 * 
 * import java.util.Scanner;
 * 
 * import org.springframework.context.support.ClassPathXmlApplicationContext;
 * 
 * import com.practice.practicecode.Clerk;
 * 
 * public class Employee {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner s = new Scanner(System.in); String cname = s.next(); int cage =
 * s.nextInt();
 * 
 * ClassPathXmlApplicationContext context = new
 * ClassPathXmlApplicationContext("beans.xml");
 * 
 * Clerk c1 = (Clerk) context.getBean("cl");
 * 
 * System.out.println("Name=" + cname); System.out.println("age=" + cage);
 * System.out.println(c1);
 * 
 * float caddsalary = c1.reAddSalary(2000); System.out.println("Name=" + cname);
 * System.out.println("age=" + cage); System.out.println("Salary=" +
 * caddsalary);
 * 
 * String pname = s.next(); int page = s.nextInt();
 * 
 * Programmer p1 = (Programmer) context.getBean("pr");
 * System.out.println("Name=" + cname); System.out.println("age=" + cage);
 * System.out.println(c1);
 * 
 * float paddsalary = p1.reAddSalary(2000); System.out.println("Name=" + pname);
 * System.out.println("age=" + page); System.out.println("Salary=" +
 * paddsalary);
 * 
 * String tname = s.next(); int tage = s.nextInt();
 * 
 * Test t1 = (Test) context.getBean("te"); System.out.println("Name=" + tname);
 * System.out.println("age=" + tage); System.out.println(c1);
 * 
 * float taddsalary = t1.reAddSalary(2000); System.out.println("Name=" + tname);
 * System.out.println("age=" + tage); System.out.println("Salary=" +
 * taddsalary);
 * 
 * context.close(); }
 * 
 * }
 */