package uiappfeature;

import org.testng.Assert;

import drivermanager.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchProduct;

public class SearchProductSteps {

	SearchProduct search = new SearchProduct(DriverFactory.getDriver());
	
	@When("I search the name as {string} in searchfield")
	public void i_search_the_name_as_in_searchfield(String product) {
		search.enterProduct(product);
	}

	@Then("I should see results")
	public void i_should_see_results() {
	 boolean isDisplaying = search.verifyProduct();
	 
	 Assert.assertTrue(isDisplaying);
		
	}
}
