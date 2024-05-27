package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingProductSteps {
	private String productId ;
	
	public String getProductId()
	{
		return productId;
	}

@Given("I should be at product page")
public void i_should_be_at_product_page() {
    System.out.println("Given statement");
}

@When("I click on add to cart button")
public void i_click_on_add_to_cart_button() {
    System.out.println("Product added");
}

@Then("Product should get added")
public void product_should_get_added() {
   System.out.println("Product validated");
   
    productId = "jhgfjggf348kfh8fh";
}




}
