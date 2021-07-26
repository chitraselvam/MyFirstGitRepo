package org.flipkartjunit;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusLocators extends LibGlobal {
	public RedBusLocators() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="signin-block")
	private WebElement btnSignin;
	
	
	@FindBy(id="src")
	private WebElement txtFrom;
	
	@FindBy(id="dest")
	private WebElement txtDesti;
	
	@FindBy(id="search_btn")
	private WebElement btnSearch;

	public WebElement getBtnSignin() {
		return btnSignin;
	}

	public WebElement getTxtFrom() {
		return txtFrom;
	}

	public WebElement getTxtDesti() {
		return txtDesti;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	

}
