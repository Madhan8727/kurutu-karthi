package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclassnew {

	public static WebDriver driver;

	public static void Lauchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void urllau(String url) {

		driver.get(url);

	}

	public static void excelread(int row, int shell) throws IOException {
		
		File file = new File("C:\\Users\\91948\\eclipse-workspace\\Maveenfirst\\Excel\\data.xlsx");
		
		FileInputStream read = new FileInputStream(file);
		Workbook excl = new XSSFWorkbook(read);
		
		Sheet sh = excl.getSheet("data");
		
		Row rw = sh.getRow(row);
		Cell cel = rw.getCell(shell);
	}
	
	public static void clickbutton() {
		 
		
		
	}
	
}
