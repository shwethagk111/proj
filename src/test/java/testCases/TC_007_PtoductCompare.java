package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PtoductCompare;
import pageObjects.SearchPage;
import testBase.BaseClass;



@Test
public class TC_007_PtoductCompare extends BaseClass
{
	
public void test_productcompare () throws InterruptedException 
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
		
		SearchPage sp=new SearchPage(driver);
				sp.searchtxt("samsung");
				 Thread.sleep(3000);
				 
				sp.searchbutton();
				 Thread.sleep(3000);
				 
				PtoductCompare pc=new PtoductCompare(driver);
				pc.compare();
				 Thread.sleep(3000);
				 
				pc.compareall();
				 Thread.sleep(3000);
}
}