package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\campaign.feature"},
		
		glue = {"steps", "hooks"},
		
		plugin = {"pretty", "html:target/cucumber-reports/reports.html"}
		
		
		
		)


public class CampaignRunner extends AbstractTestNGCucumberTests
{

}
