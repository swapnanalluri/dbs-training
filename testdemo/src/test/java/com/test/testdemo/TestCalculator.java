package com.test.testdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {

	Calculator c1 = new Calculator();

	@Test
	public void abc() {
		assertEquals(30, c1.add(10, 20));
	}

	/*
	 * @Test public void xyz() { assertEquals(30,c1.subtract(0, 20)); }
	 */
	@Test
	public void act() {
		assertTrue("wrong", c1.add(10, 20) == 30);
	}

	@Before
	public void s() {
		System.out.println("before");
	}

	@After
	public void a() {
		System.out.println("after");
	}

	@BeforeClass
	public static void f() {
		System.out.println("Executed first before all tcs");
	}
	
	@AfterClass
	public static void af() {
		System.out.println("Executed after before all tcs");
	}

}
