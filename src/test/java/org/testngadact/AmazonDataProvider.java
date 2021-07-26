package org.testngadact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonDataProvider{
	@Test(dataProvider="AmazonProductSearch",dataProviderClass=Dataprovider.class)
	private void tc0(String s) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\SeleniumFirstDay\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys(s);
		WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));
		btnSearch.click();

	}

}
