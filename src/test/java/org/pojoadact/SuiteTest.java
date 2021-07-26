package org.pojoadact;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@org.junit.runners.Suite.SuiteClasses({TestSuite1.class,TestSuit2.class,TestSuite3.class})

public class SuiteTest {
	
	
	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(SuiteTest.class);
		int runCount = runClasses.getRunCount();
		System.out.println(runCount);
		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println(ignoreCount);
		List<Failure> failures = runClasses.getFailures();
		for (int i = 0; i < failures.size(); i++) {
			Failure failure = failures.get(i);
			System.out.println(failure);
			
		}
		
	}
		
		
	
}
