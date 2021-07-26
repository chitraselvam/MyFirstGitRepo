package org.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleJunit {
	@BeforeClass
	public static  void beforeClass() {
		System.out.println("Before class methods");

	}
	@AfterClass
	public static  void afterClass() {
		System.out.println("after class methods");
		
	}
	@Before
	public void before() {
		System.out.println("before methods");

	}
	@After
	public  void after() {
		System.out.println("after method");
	}
	@Test
	public void testMe() {
		System.out.println("test method");

	}

}
