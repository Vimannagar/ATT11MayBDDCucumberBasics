package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignSteps {
	

@Given("user should be at campaigns page")
public void user_should_be_at_campaigns_page() {
   System.out.println("Given statement");
}

@When("user clicks on create campaign button")
public void user_clicks_on_create_campaign_button() {
   System.out.println("Create camapaign button");
}

@When("user enters the information")
public void user_enters_the_information() {
   System.out.println("Entered the details");
}

@Then("campaign should get created")
public void campaign_should_get_created() {
   System.out.println("Campaign created!");
}

@When("user click on edit campaign")
public void user_click_on_edit_campaign() {
  System.out.println("Editing the campaign");
}

@When("user enter the schedule time")
public void user_enter_the_schedule_time() {
   System.out.println("defining schedule");
}

@Then("campaign get scheduled")
public void campaign_get_scheduled() {
   System.out.println("Schedule validated!");
}

@When("user click on the send campaign")
public void user_click_on_the_send_campaign() {
    System.out.println("Sending the campaign");
}

@Then("campaign should get triggered")
public void campaign_should_get_triggered() {
    System.out.println("Campaign sent!");
}

}
