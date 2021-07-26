package org.testngadact;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoftAssert {
	@Test
	private void tc0() {
		String s="Welcome";
		Assert.assertEquals(s,"welcome");
		//System.out.println(s);
			

	}
	@Test
	private void tc1() {
		System.out.println("tc1");

	}
	@Test
	private void tc2() {
		String s="framework";
		SoftAssert soft=new SoftAssert();
				soft.assertEquals(s,"FrameWork");
				soft.assertAll();
		System.out.println(s);

	}

}
