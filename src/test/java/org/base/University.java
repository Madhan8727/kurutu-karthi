package org.base;

import java.io.IOException;

import org.apache.xmlbeans.impl.common.LoadSaveUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class University extends pojoLogin {

	public static void main(String[] args) throws IOException {
		
		Lauchbrowser();
		urllau("https://www.bduedu.in/myaccount/login");
		
		pojoLogin l = new pojoLogin();
		
		l.getUsename();
		excelread(4, 0);
		l.getPass();
		excelread(4, 1);
		l.getLogin(); 
		
		
		
		
	}
}
