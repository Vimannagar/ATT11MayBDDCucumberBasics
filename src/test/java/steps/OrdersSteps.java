package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {
	
	@Given("user should be logged into application")
	public void user_should_be_logged_into_application() {
	    System.out.println("Given statement");
	}

	@When("user click on orders button")
	public void user_click_on_orders_button() {
	    System.out.println("Clicked on order button");
	}

	@Then("user redirects to orders page")
	public void user_redirects_to_orders_page() {
	   System.out.println("Redirecting to order page");
	}

	@When("user click on current order")
	public void user_click_on_current_order() {
		System.out.println("Clicked on current order button");
	}

	@Then("user should see current order information")
	public void user_should_see_current_order_information() {
		System.out.println("fetching current order information");
	}

	@When("user click on previous order")
	public void user_click_on_previous_order() {
		System.out.println("Clicked on previous order button");
	}

	@Then("user should see previous order information")
	public void user_should_see_previous_order_information() {
		System.out.println("fetching previous order information");
	}

	@When("user click on cancelled order")
	public void user_click_on_cancelled_order() {
		System.out.println("Clicked on cancel order button");
	}

	@Then("user should see cancelled order information")
	public void user_should_see_cancelled_order_information() {
	  System.out.println("fetching cancelled order information");
	}

}
