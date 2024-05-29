package uiappfeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivermanager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
	HomePage homepage = new HomePage(DriverFactory.getDriver());
	
	@Given("I am at landing page")
	public void i_am_at_landing_page() {
	 WebDriver driver = DriverFactory.getDriver();
	 
	 driver.get("https://www.amazon.in/");
	}

	@Then("page title should have {string}")
	public void page_title_should_have(String word) {
	    
	   String actualTitle =  homepage.fetchtitle();
	   
	   boolean isPresent = actualTitle.contains(word);
	   
	   Assert.assertEquals(isPresent, true);
	}

	@Then("cart icon should get display")
	public void cart_icon_should_get_display() {
	 boolean isIconPresent = homepage.verifyCartIcon();
	 
	 Assert.assertEquals(isIconPresent, true);
	}

	@When("I click on daily needs section")
	public void i_click_on_daily_needs_section() {
	    homepage.enteringDealSection();
	}

	@Then("daily need section should open")
	public void daily_need_section_should_open() {
	    homepage.identifyGrocery();
	}

}
