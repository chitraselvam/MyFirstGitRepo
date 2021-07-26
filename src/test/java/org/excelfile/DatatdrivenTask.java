package org.excelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatatdrivenTask {
	public static void main(String[] args) throws IOException {
		// configure browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\SeleniumFirstDay\\Driver\\chromedriver.exe");
		// launch browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtsearchbox = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearchbox.sendKeys("iphone", Keys.ENTER);

		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		File file = new File("C:\\Users\\Dell\\Documents\\Testdata_File.xlsx");
		FileInputStream inputstream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(inputstream);
		Sheet sheet = book.createSheet("product1");
		for (int i = 0; i < findElements.size(); i++) {
			WebElement webElement = findElements.get(i);
			String text = webElement.getText();
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);

		}

		FileOutputStream stream = new FileOutputStream(file);
		book.write(stream);

	}

}
