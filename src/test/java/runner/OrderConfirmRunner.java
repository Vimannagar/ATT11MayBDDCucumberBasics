package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\Placeorder.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty", "html:target/cucumber-reports/reports.html"}
		
		
		
		)

public class OrderConfirmRunner extends AbstractTestNGCucumberTests
{

}
