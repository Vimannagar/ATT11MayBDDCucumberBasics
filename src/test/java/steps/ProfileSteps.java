package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	
	@Given("user is on home page")
	public void preConditions()
	{
		System.out.println("Given statement");
	}
	
	
	@When("user clicks on the add  profile button")
	public void user_clicks_on_the_add_profile_button() {
	   
		System.out.println("clicking on add profile");
	}

	@When("user enters the details")
	public void user_enters_the_details() {
		
		System.out.println("entered details");
	}

	@Then("profile should get created")
	public void profile_should_get_created() {
	   System.out.println("Profile creation validated");
	}

	@When("user clicks on the edit profile button")
	public void user_clicks_on_the_edit_profile_button() {
		System.out.println("clicking on edit profile");
	}

	@When("user updates the details")
	public void user_updates_the_details() {
		System.out.println("details updated");
	}

	@Then("profile should get updated")
	public void profile_should_get_updated() {
	   System.out.println("Validate updation");
	}

	@When("user clicks on the delete button")
	public void user_clicks_on_the_delete_button() {
	    System.out.println("Clicked on delete button");
	}

	@Then("profile should get deleted")
	public void profile_should_get_deleted() {
	   System.out.println("Profile deleted");
	}

	
	
}
