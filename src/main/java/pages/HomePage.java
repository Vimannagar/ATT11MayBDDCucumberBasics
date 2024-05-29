package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	
	WebDriverWait wait;
	
	@FindBy(xpath = "//*[@id='nav-cart']")
	WebElement cartIcon;
	
	@FindBy(xpath = "//*[@class='a-carousel-card']//a[@aria-label='Grocery']")
	WebElement dealSection;
	
	@FindBy(xpath = "//*[@aria-label='Grocery & Gourmet Foods']")
	WebElement grocerySection;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		PageFactory.initElements(driver, this);
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
		wait.until(ExpectedConditions.visibilityOf(dealSection));
		dealSection.click();
	}
	
	public boolean identifyGrocery()
	{
		wait.until(ExpectedConditions.visibilityOf(grocerySection));
		boolean isDisplay = grocerySection.isDisplayed();
		
		System.out.println(isDisplay);
		return isDisplay;
	}
	
	
	
	
	 

}
