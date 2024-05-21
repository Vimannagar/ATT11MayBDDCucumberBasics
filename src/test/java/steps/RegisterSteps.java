package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	
	@Given("user is at home page")
	public void user_is_at_home_page() {
	 
		System.out.println("Given statement");
	}

	@When("user click on register")
	public void user_click_on_register() {
	   System.out.println("When statement 1");
	}

	@When("user enters the detail")
	public void user_enters_the_detail() {
		   System.out.println("When statement 2");
	}

	@Then("user should be able to register")
	public void user_should_be_able_to_register() {
		   System.out.println("Then statement");
	}

}
