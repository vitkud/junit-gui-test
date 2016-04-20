package ru.vitkud.test;

import junit.framework.TestCase;

public class First3 extends TestCase {

	public void testFoo() {
		System.out.println("First3.testFoo()");
	}

	public void testBar() {
		System.out.println("First3.testBar()");
	}

	public void testFail() throws Exception {
		fail("First3.testFail()");
	}

}
