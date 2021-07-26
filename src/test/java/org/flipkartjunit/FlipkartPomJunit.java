package org.flipkartjunit;

import java.io.IOException;
import java.util.Date;

import org.base.LibGlobal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.junit.Before;

public class FlipkartPomJunit extends LibGlobal {
	static LibGlobal base;
	@BeforeClass
	public static void beforeClass() {
		 base=new LibGlobal();
		base.getDriver("chrome");
		base.launchUrl("https://www.flipkart.com/account/login");
		

	}
	@Before
	public void beforeMethod() throws IOException {
		Date date=new Date();
		base.getScreenshot("LoginPage");
		System.out.println(date);
		

	}
	
	
	@Test
	public void tc0() {
		FlipkartLoginLocators flip=new FlipkartLoginLocators();
		WebElement txtUserName = flip.getTxtUserName();
		base.typeText(txtUserName,base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "FlipkartLogin", 0, 1));
		Assert.assertEquals(txtUserName.getAttribute("value"), "chitranatraj88@gmail.com");
		
		WebElement txtPassword = flip.getTxtPassword();
		base.typeText(txtPassword, base.getDataFromExcel("C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\WorkbookTask\\\\TestData\\\\AdactinHotel.xlsx", "FlipkartLogin", 1, 1));
		Assert.assertEquals(txtPassword.getAttribute("value"), "flip2021");
		
		WebElement btnLogin = flip.getBtnLogin();
		base.btnClick(btnLogin);
		
		}
	
	
	
	@After
	public  void afterMethod() throws IOException {
		Date date=new Date();
		base.getScreenshot("LoginPage1");
		System.out.println(date);
		
	}
	@AfterClass
	public static  void afterClass() {
		

	}
	

}
