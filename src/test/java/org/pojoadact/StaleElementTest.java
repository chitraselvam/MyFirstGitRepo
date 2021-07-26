package org.pojoadact;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;

public class StaleElementTest extends LibGlobal {
	public static void main(String[] args) throws InterruptedException {
		LibGlobal global=new LibGlobal();
		global.getDriver("chrome");
		global.launchUrl("https://en-gb.facebook.com/");
		WebElement txtUsername = global.findById("id", "email");
		global.typeText(txtUsername,global.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1", 3, 1));
		//global.getValueByAttribute(txtUsername);
		Thread.sleep(5000);
		driver.navigate().refresh();
		global.typeText(txtUsername, global.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1", 3, 1));
		Thread.sleep(5000);
		WebElement txtpassword = global.findById("id", "pass");
		global.typeText(txtpassword, global.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1", 4, 1));
	}

}
