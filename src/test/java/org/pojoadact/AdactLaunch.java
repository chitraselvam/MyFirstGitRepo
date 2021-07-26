package org.pojoadact;

import java.io.IOException;

import org.adactlocator.AdactHotelLoginPage;
import org.adactlocator.BookNowLocators;
import org.adactlocator.SearchHotelLocators;
import org.adactlocator.SelectHotelLocators;
import org.base.LibGlobal;
import org.openqa.selenium.WebElement;

public class AdactLaunch extends LibGlobal{
	public static void main(String[] args) throws InterruptedException, IOException {
		LibGlobal base = new LibGlobal();
		
		
		
		base.getDriver("chrome");
		base.launchUrl("https://adactinhotelapp.com/index.php");
		
			//login page
		AdactHotelLoginPage locators=new AdactHotelLoginPage();
		WebElement txtUserName = locators.getTxtUserName();
		base.typeText(txtUserName, "selvammalai");
		WebElement txtPassword = locators.getTxtPassword();
		base.typeText(txtPassword, "AdactinTest123");
		//base.getScreenshot("C:\\Users\\Dell\\eclipse-workspace\\WorkbookTask\\Screenshots", "LoginPage");
		WebElement btnLogin = locators.getBtnLogin();
		
		base.btnClick(btnLogin);
		
		//search hotel
		SearchHotelLocators search=new SearchHotelLocators();
		WebElement drpdwnLocation = search.getDrpdwnLocation();
		base.selectByDropDown("value", drpdwnLocation, "London");
		WebElement drpdwnHotels = search.getDrpdwnHotels();
		base.selectByDropDown("value", drpdwnHotels, "Hotel Sunshine");
		WebElement drpdwnRoomType = search.getDrpdwnRoomType();
		base.selectByDropDown("value", drpdwnRoomType, "Super Deluxe");
		WebElement drpdwnRoomNos = search.getDrpdwnRoomNos();
		base.selectByDropDown("value", drpdwnRoomNos, "2");
		WebElement txtCheckIn = search.getTxtCheckIn();
		txtCheckIn.clear();
		base.typeText(txtCheckIn, "01/07/2021");
		WebElement txtCheckOut = search.getTxtCheckOut();
		txtCheckOut.clear();
		base.typeText(txtCheckOut, "14/07/2021");
		WebElement drpdwnAdultPerRoom = search.getDrpdwnAdultPerRoom();
		base.selectByDropDown("value", drpdwnAdultPerRoom, "2");
		WebElement drpdwnChildrenPerRoom = search.getDrpdwnChildrenPerRoom();
		base.selectByDropDown("value", drpdwnChildrenPerRoom, "1");
		WebElement btnSearch = search.getBtnSearch();
		base.btnClick(btnSearch);
		
		//select hotel
		SelectHotelLocators select=new SelectHotelLocators();
		WebElement btnRadio = select.getBtnRadio();
		base.btnClick(btnRadio);
		WebElement btnContinue = select.getBtnContinue();
		base.btnClick(btnContinue);
		
		//book hotel
		BookNowLocators book=new BookNowLocators();
		WebElement txtFirstName = book.getTxtFirstName();
		base.typeText(txtFirstName, "selvam");
		WebElement txtLastName = book.getTxtLastName();
		base.typeText(txtLastName, "annamalai");
		WebElement txtBillingaddress = book.getTxtBillingaddress();
		base.typeText(txtBillingaddress, "Tnagar");
		WebElement txtCardNumber = book.getTxtCardNumber();
		base.typeText(txtCardNumber, "1234567890234567");
		WebElement txtCardType = book.getTxtCardType();
		base.selectByDropDown("value", txtCardType, "MAST");
		WebElement drpdwnExpiryMonth = book.getDrpdwnExpiryMonth();
		base.selectByDropDown("value", drpdwnExpiryMonth, "5");
		WebElement drpdwnExpiryYear = book.getDrpdwnExpiryYear();
		base.selectByDropDown("value", drpdwnExpiryYear, "2022");
		WebElement txtCCV = book.getTxtCCV();
		base.typeText(txtCCV, "456");
		WebElement btnBookNow = book.getBtnBookNow();
		base.btnClick(btnBookNow);
		
		 
		
		
		
		
	}
	
	

}
