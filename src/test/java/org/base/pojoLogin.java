package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoLogin extends Baseclassnew {

	public pojoLogin() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id="uname")
	WebElement usename;
	
	@FindBy(id="psw")
	WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;

	public WebElement getUsename() {
		return usename;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






