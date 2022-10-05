package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.OrderHistory;
import testBase.BaseClass;

public class TC_006_OrderHistory extends BaseClass {
	
	@Test
	public void testorderhistory()
	{
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
		HomePage hp=  new HomePage(driver);
		 logger.info("Home Page Displayed ");
		 hp.clickMyAccount();
		 hp.clickLogin();
		 LoginPage lp=new LoginPage(driver);
			
			lp.setEmail(rb.getString("email"));
			logger.info("Provided Email ");
			
			lp.setPassword(rb.getString("password"));
			logger.info("Provided Password ");
			
			lp.clickLogin();
			logger.info("Clicked on Login");
			OrderHistory ohi=new OrderHistory(driver);
			ohi.orderhistory();
	boolean oi		=ohi.isorderdisplayed();
			if(oi)
			{
			Assert.assertTrue(true);
			}
			else
			{
				Assert.assertFalse(false);
			}
					ohi.clickcontinue();
	}

}
