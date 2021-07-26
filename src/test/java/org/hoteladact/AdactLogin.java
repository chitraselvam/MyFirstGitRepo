package org.hoteladact;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;

public class AdactLogin extends LibGlobal{
	public static void main(String[] args) throws InterruptedException {
		LibGlobal base= new LibGlobal();
		base.getDriver("chrome");
		base.launchUrl("https://adactinhotelapp.com/index.php");
		WebElement findById2 = base.findById("id", "username");
		base.typeText(findById2, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",3 , 1));
		WebElement findById3 = base.findById("id","password");
		base.typeText(findById3, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",4 , 1));
		WebElement findById4 = base.findById("id", "login");
		base.btnClick(findById4);
		Thread.sleep(3000);
		
		
		//search hotel
		WebElement findById5 = base.findById("id", "location");
		base.selectByDropDown("visibleText", findById5, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",12, 1));
		
		WebElement findById6 = base.findById("id", "hotels");
		base.selectByDropDown("value", findById6, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",13, 1));
		
		WebElement findById7 = base.findById("id", "room_type");
		base.selectByDropDown("index", findById7, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",14, 1));
		
		WebElement findById8 = base.findById("id", "room_nos");
		base.selectByDropDown("value", findById8, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",15, 1));
		
		Thread.sleep(7000);
		
		WebElement findById9 = base.findById("xpath", "//input[@id='datepick_in']");
		findById9.clear();
		base.typeText(findById9, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",16, 1));
		
		WebElement findById10 = base.findById("xpath", "//input[@id='datepick_out']");
		findById10.clear();
		base.typeText(findById10, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",17, 1));
		
		WebElement findById11 = base.findById("id", "adult_room");
		base.selectByDropDown("value", findById11, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",18, 1));
		
		WebElement findById12 = base.findById("id", "child_room");
		base.selectByDropDown("visibleText", findById12, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",19, 1));
		
		WebElement findById13 = base.findById("id", "Submit");
		base.btnClick(findById13);
		
		//select hotel
		WebElement findById14 = base.findById("id", "radiobutton_0");
		base.btnClick(findById14);
		WebElement findById15= base.findById("id", "continue");
		base.btnClick(findById15);
		
		//checkout page
		WebElement findById16 = base.findById("id", "first_name");
		base.typeText(findById16, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",22, 1));
		
		WebElement findById17 = base.findById("id", "last_name");
		base.typeText(findById17, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",23, 1));
		
		WebElement findById18= base.findById("id", "address");
		base.typeText(findById18, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",24, 1));
		
		WebElement findById19 = base.findById("id", "cc_num");
		base.typeText(findById19, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",25, 1));
		
		WebElement findById20 = base.findById("id", "cc_type");
		base.selectByDropDown("visibleText", findById20, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",26, 1));
		
		WebElement findById21 = base.findById("id", "cc_exp_month");
		base.selectByDropDown("value", findById21, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",27, 1));
		
		WebElement findById22 = base.findById("id", "cc_exp_year");
		base.selectByDropDown("value", findById22, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",27, 2));
		
		WebElement findById23 = base.findById("id", "cc_cvv");
		base.typeText(findById23, base.getDataFromExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "Sheet1",28, 1));
		
		WebElement findById24 = base.findById("id", "book_now");
		base.btnClick(findById24);
		
		//write orderid in excel
		Thread.sleep(6000);
		WebElement findById25 = base.findById("xpath", "//input[@id='order_no']");
		base.writeDataToExcel("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\TestData\\AdactinHotel.xlsx", "OrderId1", 0, 1,base.getValueByAttribute(findById25));
		
		//logout
		WebElement findById26 = base.findById("id", "logout");
		base.btnClick(findById26);
	}

}
