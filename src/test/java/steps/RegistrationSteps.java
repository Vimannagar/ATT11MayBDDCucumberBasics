package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
public class RegistrationSteps {
	
	@Given("user should be at accounts page")
	public void user_should_be_at_accounts_page() {
		System.out.println("Given statement");
	}

	@When("user enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {
	List<List<String>> data = dataTable.asLists();
	
	List<String> data1 = data.get(0);
	
	String emailAddress = data1.get(2);
	
	System.out.println(emailAddress);
	
	String emailAddress2 = data.get(1).get(2);
	
	System.out.println("Email address 2 value is "+ emailAddress2);
	
	List<String> firstList = data.get(1);
	
	System.out.println(firstList);
	
	for(String s:data1)
	{
		System.out.println(s);
	}
	
	System.out.println("*******************************");
	
	// reading values using Map
	
	List<Map<String, String>> mapData = dataTable.asMaps();
	
	Map<String, String> mapData1 = mapData.get(1);
	
	 String emailValue = mapData1.get("email");
	 
	 System.out.println(emailValue);
	
	
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
