package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	public static long page_load_Timeout=20;
	public static long implicit_wait=10;
	
	public void swithToFrame()
	{
		driver.switchTo().frame("mainpanel");
	}
}
