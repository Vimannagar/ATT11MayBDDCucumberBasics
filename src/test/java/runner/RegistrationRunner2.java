package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\registration.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty", "html:target/cucumber-reports/reports.html"}
		
		
		
		)



public class RegistrationRunner2 extends AbstractTestNGCucumberTests
{

}
