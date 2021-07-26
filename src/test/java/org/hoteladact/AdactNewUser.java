package org.hoteladact;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;

public class AdactNewUser extends LibGlobal{
	public static void main(String[] args) {
		LibGlobal base= new LibGlobal();
		base.getDriver("chrome");
		base.launchUrl("https://adactinhotelapp.com/");
		WebElement findById = base.findById("xpath", "//a[text()='New User Register Here']");
		base.btnClick(findById);
		WebElement findById2 = base.findById("id", "username");
		base.typeText(findById2, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",3 , 1));
		WebElement findById3 = base.findById("id","password");
		base.typeText(findById3, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",4 , 1));
		WebElement findById4 = base.findById("id","re_password");
		base.typeText(findById4, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",5 , 1));
		WebElement findById5 = base.findById("id","full_name");
		base.typeText(findById5, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",6 , 1));
		WebElement findById6 = base.findById("id", "email_add");
		base.typeText(findById6, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",7 , 1));
	}

}
