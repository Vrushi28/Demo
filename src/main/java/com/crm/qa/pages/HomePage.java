package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'User: group automation')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[@title=\"Contacts\"]")
	WebElement contacts;
	
	@FindBy(xpath="//a[@title=\"Deals\"]")
	WebElement deals;
	
	@FindBy(xpath="//a[@title=\"Tasks\"]")
	WebElement tasks;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyHomepageTitle()
	{
		return driver.getTitle();
	}
	public boolean verifyUsername()
	{
		return userNameLabel.isDisplayed();
		
	}
	public ContactsPage clickOnContactsLink()
	{
		contacts.click();
		return new ContactsPage();
	}
	public DealsPage clickOnDealsLink() {
		deals.click();
		return new DealsPage();
	}
	public TasksPage clickOnTasksPage()
	{
		tasks.click();
		return new TasksPage();
		
	}
	

}
