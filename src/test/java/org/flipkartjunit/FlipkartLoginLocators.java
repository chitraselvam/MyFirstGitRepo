package org.flipkartjunit;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginLocators extends LibGlobal {
	public FlipkartLoginLocators() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement txtUserName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnLogin;

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}
	
	

}
