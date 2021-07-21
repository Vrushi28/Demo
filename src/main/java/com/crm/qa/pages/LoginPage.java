package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	
	@FindBy(xpath="//input[@name=\"username\"]")
	WebElement  username;


	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;

	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement Signupbtn;
	
	@FindBy(xpath="//a[@class='navbar-brand']//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
		
	}
	public boolean validatecrmimg()
	{
		return crmLogo.isDisplayed();
	}
	public HomePage login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
	}
}

