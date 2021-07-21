package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	
	LoginPage lp;
	HomePage homepage;
	
	
	 public LoginPageTest() {
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp()
	{
		initialisation();
		 lp=new LoginPage();
	}
	@Test(priority=1)
	public void  LoginPageTitleTest()
	{
		String title=lp.validateLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	@Test(priority=2)
	public void CrmLogoImgTest()
	{
	boolean flag=	lp.validatecrmimg();
	Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void LoginTest()
	{
		homepage=lp.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
