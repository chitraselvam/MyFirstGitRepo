package org.adactlocator;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelLocators extends LibGlobal {
	public SelectHotelLocators() {
		PageFactory.initElements(driver, this);
		
	}
	@FindAll({@FindBy(id="radiobutton_0"), @FindBy(name="radiobutton")})
	private WebElement btnRadio;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	@FindAll({@FindBy(id="cancel"),@FindBy(name="cancell")})
	private WebElement btnCancel;

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
	

}
