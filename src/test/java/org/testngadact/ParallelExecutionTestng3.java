package org.testngadact;

import org.testng.annotations.Test;

public class ParallelExecutionTestng3 {
	@Test
	private void tc6() {
		System.out.println("method 6");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc7() {
		System.out.println("method 7");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc8() {
		System.out.println("method 8");
		System.out.println(Thread.currentThread().getId());

	}
}
