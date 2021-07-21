package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{

	LoginPage lp;
	HomePage homepage;
	TestUtil testutil;
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialisation();
		testutil=new TestUtil();
		lp=new LoginPage();
		homepage=lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		String HomePageTitle=homepage.verifyHomepageTitle();
		Assert.assertEquals(HomePageTitle, "CRMPRO","homepage title is not matched");
	}
	
	@Test(priority=2)
	public void verifyuserNameTest()
	{
		testutil.swithToFrame();
		Assert.assertTrue(homepage.verifyUsername());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
