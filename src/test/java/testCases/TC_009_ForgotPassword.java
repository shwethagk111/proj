package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

@Test
public class TC_009_ForgotPassword extends BaseClass

{
	public void  Forgotpassword() throws InterruptedException
{
	driver.get(rb.getString("appURL"));
	driver.manage().window().maximize();
	HomePage hp=  new HomePage(driver);
	 logger.info("Home Page Displayed ");
	 hp.clickMyAccount();
	 hp.clickLogin();
	 LoginPage lp=new LoginPage(driver);
		

		lp.setEmail("email");
		logger.info("Provided Email ");
		
		lp.setPassword("pwd");
		logger.info("Provided Password ");
		
		lp.clickLogin();
		logger.info("Clicked on Login");
		ForgotPassword fd=new ForgotPassword(driver);
		fd.forgot();
		fd.emai("shwethagk34@gmail.com");
		Thread.sleep(1000);
		fd.cont();
	boolean tarp=fd.isreturnconstomerExists();
		if(tarp)
		{
	Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
		
		
		
	
	
}
}

