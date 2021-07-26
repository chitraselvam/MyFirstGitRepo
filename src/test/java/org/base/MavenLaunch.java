package org.base;

import org.locator.LoginPage;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.WebElement;

public class MavenLaunch extends LibGlobal {
	public static void main(String[] args) throws InterruptedException {
		LibGlobal global=new LibGlobal();
		global.getDriver("chrome");
		global.launchUrl("https://en-gb.facebook.com/");
		global.printTitle();
		global.printCurrentUrl();
		
		
		LoginPage page=new LoginPage();
		WebElement txtUserName = page.getTxtUserName();
		global.typeText(txtUserName, "nchitra2015");
		WebElement txtPassword = page.getTxtPassword();
		global.typeText(txtPassword, "framework");
		WebElement btnLogin = page.getBtnLogin();
		global.btnClick(btnLogin);
		
		/*WebElement findById = global.findById("id", "email");
		global.typeText(findById, "hi chitra");
		WebElement findById2 = global.findById("xpath", "//input[@id='pass']");
		global.typeText(findById2, "jaaavaa");
		WebElement findById3 = global.findById("name", "login");
		global.btnClick(findById3);*/
		
		//create a new account in fb
		/*global.btnClick(global.findById("xpath", "//a[text()='Create New Account']"));
		Thread.sleep(3000);
		//WebElement findById5= ;
		global.selectByDropDown("value", global.findById("xpath", "//select[@title='Day']"), "11");
		//WebElement findById6 = ;
		global.selectByDropDown("visibleText", global.findById("xpath", "//select[@title='Month']"), "Oct");
		//WebElement findById4 = ;
		global.selectByDropDown("index", global.findById("xpath", "//select[@title='Year']"), "3");*/
		
		
	}

}
