package com.inetbaning.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void LoginTest() throws IOException 
	{
		
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		
		lp.Setusername(username);
		logger.info("Entered Username");
		lp.Setpassword(password);
		logger.info("Entered Password");
		lp.clicksubmit();
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			System.out.println("Test case is pass");
			logger.info("Test case is pass");
		} else {
			captureScreen(driver, "LoginTest");
			Assert.assertTrue(false);
			System.out.println("Test case is fail");
			logger.info("Test case is fail");
			
		}
	}
	
}
