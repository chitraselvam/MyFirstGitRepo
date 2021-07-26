package org.testngadact;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedTestClass implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor arg2, Method arg3) {
		IRetryAnalyzer retryAnalyzer = annotation.getRetryAnalyzer();
		if(retryAnalyzer==null) {
			annotation.setRetryAnalyzer(FailClass.class);
		}
		
	}
	

}
