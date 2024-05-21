package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("user is at signup")
	public void user_is_at_signup() {
	  System.out.println("Given statement"); 
	}

	@When("user enters name as {string} in form")
	public void user_enters_name_as_in_form(String name) {
	    System.out.println("Entered name as "+name);
	}

	@When("user enters age as {int}")
	public void user_enters_age_as(Integer int1) {
		System.out.println("Entered age is "+int1);
		if(int1==40)
		{
			throw new NullPointerException();
		}
	}

	@When("user confirms {string} radio button")
	public void user_confirms_radio_button(String string) {
		System.out.println("Selected gender is "+string);
	}

	@Then("user gets created")
	public void user_gets_created() {
	   System.out.println("User created!!");
	}


}
