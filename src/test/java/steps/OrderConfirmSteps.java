package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConfirmSteps {
	
	AddingProductSteps addingProduct;
	
	public OrderConfirmSteps(AddingProductSteps aps)
	{
		addingProduct = aps;
	}
	
	@When("I click on place order")
	public void i_click_on_place_order() {
	   System.out.println("Placing the order");
	}

	@Then("Order should get placed")
	public void order_should_get_placed() {
		
		String prdId = addingProduct.getProductId();
		
		System.out.println("Order placed for product id : "+prdId); 
	}

}
