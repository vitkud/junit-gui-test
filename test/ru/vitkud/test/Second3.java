package ru.vitkud.test;

import junit.framework.TestCase;

public class Second3 extends TestCase {

	public void testZTest() {
		System.out.println("Second3.testZTest()");
	}

	public void testTest() {
		System.out.println("Second3.testTest()");
	}

	public void testATest() {
		System.out.println("Second.testATest()");
	}

	public void testError() throws Exception {
		throw new Exception("Second3.testError()");
	}
}
