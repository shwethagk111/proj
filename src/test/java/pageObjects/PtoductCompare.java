package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PtoductCompare 
{
	   WebDriver driver;
	      
	      public PtoductCompare(WebDriver driver)
	      {
	    	  this.driver=driver;
	    	  PageFactory.initElements(driver,this);
	      }
	      
	  	
			@FindBy(xpath="//i[@class='fa fa-exchange']")
			WebElement productcompare;//productcompare icon
					
	        @FindBy(xpath="//a[@id='compare-total']")
	         WebElement productlink;
			
public void compare()
{
	productcompare.click();
}
public void compareall()
{
productlink.click();
}
}
