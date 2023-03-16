package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword 
{
	 WebDriver driver;
	   
	   public ForgotPassword(WebDriver driver)
	   {
		   this.driver=driver;
		   PageFactory.initElements(driver,this);
	   } 
	   
	   
		   @FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
			 WebElement fp;
		   @FindBy(xpath="//input[@id='input-email']")
		   WebElement em;
		   @FindBy(xpath="//input[@value='Continue']")
		   WebElement con;
		   @FindBy(xpath="//strong[normalize-space()='I am a returning customer']")
		   WebElement rc;
		   
		  
		   public void forgot()
		   {
			   fp.click();
		   }
			
	public void emai(String email)
	{
	em.sendKeys(email);
	}
	public void cont()
	{
		con.click();
	}
	public boolean isreturnconstomerExists()
	{
		return (rc.isDisplayed());
		
	}
	
}
