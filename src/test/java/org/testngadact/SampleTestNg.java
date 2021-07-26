package org.testngadact;

import org.adactlocator.AdactHotelLoginPage;
import org.adactlocator.SearchHotelLocators;
import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTestNg extends LibGlobal {
	static LibGlobal base;
	AdactHotelLoginPage locators;
	SearchHotelLocators search;

	@BeforeClass
	private void beforeClass() {
		base=new LibGlobal();
		base.getDriver("chrome");
		base.launchUrl("https://adactinhotelapp.com/index.php");

	}

	@Parameters({ "username" })
	@Test
	private void tc0(String s1) {
		locators = new AdactHotelLoginPage();
		WebElement txtUserName = locators.getTxtUserName();
		txtUserName.sendKeys(s1);

	}

	@Parameters({ "password" })
	@Test
	private void tc01(String s2) {
		WebElement txtPassword2 = locators.getTxtPassword();

		txtPassword2.sendKeys(s2);

	}

	@Test
	private void tc02() {
		WebElement btnLogin = locators.getBtnLogin();
		btnLogin.click();

	}

	@Parameters({ "location" })
	@Test
	private void tc03(@Optional("London") String s1) {
		search=new SearchHotelLocators();
		WebElement drpdwnLocation = search.getDrpdwnLocation();
		Select select = new Select(drpdwnLocation);
		select.selectByValue(s1);
	}

	@Parameters({ "hotel" })
	@Test
	private void tc04(@Optional("Hotel Cornice") String s2) {
		WebElement drpdwnHotel = search.getDrpdwnHotels();
		Select select = new Select(drpdwnHotel);
		select.selectByValue(s2);

	}

	@Parameters({ "room type" })
	@Test
	private void tc05(@Optional("Super Deluxe") String s3) {

		WebElement drpdwnRoomtype = search.getDrpdwnRoomType();
		Select select = new Select(drpdwnRoomtype);
		select.selectByValue(s3);

	}

	@Parameters({ "NoOfRooms" })
	@Test
	private void tc06(@Optional("3 - Three") String s4) {
		WebElement drpdwnNoOfRoom = search.getDrpdwnRoomNos();
		Select select = new Select(drpdwnNoOfRoom);
		select.selectByValue(s4);

	}

	@Parameters({ "checkin" })
	@Test
	private void tc07(String s5) {
		WebElement txtcheckin = search.getTxtCheckIn();
		txtcheckin.clear();
		txtcheckin.sendKeys(s5);

	}

	@Parameters({ "checkout" })
	@Test
	private void tc08(String s6) {
		WebElement txtcheckout = search.getTxtCheckOut();
		txtcheckout.clear();
		txtcheckout.sendKeys(s6);

	}

	@Parameters({ "adults" })
	@Test
	private void tc09(@Optional("3 - Three") String s7) {
		WebElement drpdwnAdult = search.getDrpdwnAdultPerRoom();
		Select select = new Select(drpdwnAdult);
		select.selectByValue(s7);

	}

	@Parameters({ "children" })
	@Test
	private void tc10(@Optional("3 - Three") String s8) {
		WebElement drpdwnChildren = search.getDrpdwnChildrenPerRoom();
		Select select = new Select(drpdwnChildren);
		select.selectByValue(s8);

	}

	@Test
	private void tc11() {
		WebElement btnSearch = search.getBtnSearch();
		btnSearch.click();

	}

	@Test(enabled = false)
	private void tc12() {
		WebElement btnReset = search.getBtnReset();
		btnReset.click();

	}

}
