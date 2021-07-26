package org.pojoadact;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestSuit2 {
	@BeforeClass
	public static  void beforeClass() {
		System.out.println("Before class methods");

	}
	
	@Before
	public void before() {
		System.out.println("before methods");

	}
	
	@Test
	public void testMe() {
		System.out.println("test method");

}
	@Test
	public void test1() {
		System.out.println("print test1");

	}
	@Ignore
	public void test2() {
		System.out.println("print test2");

	}
	public void test3() {
		System.out.println("print test3");

	}
	public void test4() {
		System.out.println("print test4");

	}
	@After
	public  void after() {
		System.out.println("after method");
	}
	@AfterClass
	public static  void afterClass() {
		System.out.println("after class methods");
		
	}

}
