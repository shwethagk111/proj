package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistory {
	WebDriver driver;
	public OrderHistory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	
	
	
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Order History']")
	WebElement oh;
@FindBy(xpath="//p[normalize-space()='You have not made any previous orders!']")	
WebElement po;
@FindBy(xpath="//a[normalize-space()='Continue']")	
WebElement cliclck;
public boolean  isorderdisplayed()
{
	return(po.isDisplayed());
}
public void orderhistory()
{
	oh.click();
}

public void clickcontinue()
{
	cliclck.click();
}

}
