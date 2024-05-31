package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
//		features = {"src\\test\\resources\\uiappfeature"},
		
		features = {"@target/failedrun.txt"},
		
		glue = {"uiappfeature"},
		
		plugin = {
				  "pretty", 
				  "html:target/amazontestreport/reports.html",
				  "rerun:target/failedrun.txt"
				 },
		
		tags = "@sanity",
		
		publish = true, 
		
		dryRun = false
	)




public class AmazonFailedTestRunner extends AbstractTestNGCucumberTests {
	
	

}
