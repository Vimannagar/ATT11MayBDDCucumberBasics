package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = {"src//test//resources//uiappfeature"},
				
		glue = {"uiappfeature"},
		
		
		plugin = {"pretty", "html:target/amazontestreport/reports.html",
					"json:target/reports.json"
					},
		
		tags = "@sanity",
		
		publish = true, 
		
		dryRun = false
	)





public class AmazonTestRunner extends AbstractTestNGCucumberTests {

}
