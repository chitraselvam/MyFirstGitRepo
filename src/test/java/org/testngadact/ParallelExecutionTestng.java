package org.testngadact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecutionTestng {
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void tc0(String s) {
		if(s.equalsIgnoreCase("CHROME"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumFirstDay\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		}
		else if(s.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumFirstDay\\Driver\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.manage().window().maximize();
			
		}
		else
		{
			System.out.println("Invalid browser");
		}

	}
	@Test
	private void tc1() {
		System.out.println("method 1");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc2() {
	System.out.println("method 2");	
	System.out.println(Thread.currentThread().getId());

	}
}
