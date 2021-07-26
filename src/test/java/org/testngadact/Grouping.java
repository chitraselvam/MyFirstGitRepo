package org.testngadact;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="@smoke,@sanity")
	private void tc0() {
		System.out.println("method 0");
		Assert.assertTrue(false);

	}
	@Test(groups="@sanity",dependsOnMethods="tc0")
	private void tc1() {
		System.out.println("method 1");

	}
	@Test(groups="@reg",dependsOnGroups="@smoke",alwaysRun=true)
	private void tc2() {
		System.out.println("method 2");

	}
	@Test(groups="@smoke")
	private void tc3() {
		System.out.println("method 3");

	}
	@Test(groups="@sanity")
	private void tc4() {
		System.out.println("method 4");

	}
	@Test(groups="@reg",dependsOnGroups="@smoke",alwaysRun=true)
	private void tc5() {
		System.out.println("method 5");

	}
	

}
