package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("I am at login page")
	public void precondition()
	{
		System.out.println("Given statement specific method");
	}
	
//	CTRL+SHIFT+O
	@When("I enter username")
	public void enterUsername()
	{
		System.out.println("Entering username");
	}
	
	@When("I enter password")
	public void enteringPassword()
	{
		System.out.println("Entered pwd");
	}
	
	@When("I click on login button")
	public void clickOnLogin()
	{
		System.out.println("Logged in to app");
	}
	
	@Then("I should get logged into application")
	public void validatingLogin()
	{
		System.out.println("Login validated!");
	}
	
	
	@Then("title of page should get fetched")
	public void fetchTitle()
	{
		System.out.println("Title validated");
	}

}
