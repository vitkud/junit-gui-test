package ru.vitkud.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests3 extends TestCase {

	public void testTest1() {
		System.out.println("AllTests3.testTest1()");
	}

	public void testTest2() {
		System.out.println("AllTests3.testTest2()");
	}

	public static Test suite() {
		final TestSuite s = new TestSuite();
		s.addTestSuite(First3.class);
		s.addTestSuite(Second3.class);
		return s;
	}

//	public static junit.framework.Test suite() {
//	    return new junit.framework.JUnit4TestAdapter(AllTests.class);
//	}

}
