package steps;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class RegistrationSteps {
	
	@Given("user should be at accounts page")
	public void user_should_be_at_accounts_page() {
		System.out.println("Given statement");
	}

	@When("user enters the following data")
	public void user_enters_the_following_data(io.cucumber.datatable.DataTable dataTable) {
	List<List<String>> data = dataTable.asLists();
	
	List<String> data1 = data.get(0);
	
	String emailAddress = data1.get(2);
	
	System.out.println(emailAddress);
	
	List<String> firstList = data.get(1);
	
	System.out.println(firstList);
	
	for(String s:data1)
	{
		System.out.println(s);
	}
	
	
	
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	   System.out.println("Clicked on submit button");
	}

	@Then("user should get app id")
	public void user_should_get_app_id() {
	  System.out.println("Validated app id");  
	}



}
