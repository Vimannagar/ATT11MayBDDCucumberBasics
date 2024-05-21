package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	@Given("user is at login page")
	public void user_is_at_login_page() {
	   System.out.println("Given for login");
	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String uname) {
	   System.out.println("Entered user name is "+uname);
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String string) {
	    System.out.println("entered password is "+string);
	}

	@When("user click on login {int} button")
	public void user_click_on_login_button(Integer int1) {
	   System.out.println("Clicked on login and data is "+int1);
	}

	@Then("user should get logged into application")
	public void user_should_get_logged_into_application() {
	    System.out.println("Validating login");
	}

}
