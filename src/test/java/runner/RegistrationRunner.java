package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\RegisterUser.feature"},
		
		glue = {"steps"}
		
		
		
		
		)


public class RegistrationRunner extends  AbstractTestNGCucumberTests
{

}
