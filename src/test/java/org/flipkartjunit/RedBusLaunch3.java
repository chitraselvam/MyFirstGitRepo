package org.flipkartjunit;

import java.io.IOException;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedBusLaunch3 extends LibGlobal{
	public static LibGlobal base;
	@BeforeClass
	private void beforeClass() {
		 base=new LibGlobal();
		base.getDriver("Chrome");
		base.launchUrl("https://www.redbus.in/");

	}
	@BeforeMethod
	private void beforeMethod() throws IOException {
		base.getScreenshot("loginpage");

	}
@Test
private void tc0() {
	RedBusLocators red=new RedBusLocators();
	WebElement txtFrom = red.getTxtFrom();
	base.typeText(txtFrom, "chennai");
	WebElement txtDesti = red.getTxtDesti();
	base.typeText(txtDesti, "bangalore");
	WebElement btnSearch = red.getBtnSearch();
	base.btnClick(btnSearch);

}
@AfterMethod
private void afterMethod() {
	
}

}
