package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='nav-cart']")
	WebElement cartIcon;
	
	@FindBy(xpath = "//*[@class='a-carousel-card']//img[@alt='Daily needs']")
	WebElement dealSection;
	
	
	
	public HomePage()
	{
		
	}
	
	
	public String fetchtitle()
	{
		String title = driver.getTitle();
		
		return title;
	}
	
	
	public boolean verifyCartIcon()
	{
		boolean isDisplaying = cartIcon.isDisplayed();
		
		return isDisplaying;
	}
	
	
	public void enteringDealSection()
	{
		
	}
	
	
	
	
	 

}
