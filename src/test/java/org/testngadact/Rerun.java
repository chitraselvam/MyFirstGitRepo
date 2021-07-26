package org.testngadact;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun {
	@Test
	private void tc0() {
	System.out.println("method 0");	

}
	@Test
	private void tc01() {
	System.out.println("method 1");	
}
	@Test
	private void tc02() {
		Assert.assertTrue(false);
	System.out.println("method 2");	
}
}
