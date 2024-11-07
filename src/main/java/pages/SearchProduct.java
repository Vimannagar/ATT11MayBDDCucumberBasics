package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProduct {
	
	private WebDriver driver;
	
	private WebDriverWait wait;
	
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	private WebElement searchfield;
	
	@FindBy(xpath = "//*[@id='nav-search-submit-button123']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//*[contains(text(),'Redmi Note 13 Pro+')]/parent::a")
	private WebElement productName;
	
	
	public SearchProduct(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		PageFactory.initElements(driver, this);
	}
	
	public void enterProduct(String productName)
	{
		searchfield.sendKeys(productName);
		searchButton.click();
	}
	
	public boolean verifyProduct()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		boolean isDisplay = productName.isDisplayed();
		
		return isDisplay;
		
	}
	
	

}
