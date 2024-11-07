package uiappfeature;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import drivermanager.DriverFactory2;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.PropReader;

public class AppHooks {
	DriverFactory2 df;
	
	WebDriver driver;
	
	@Before
	public void launchBrowser() throws IOException
	{
		 df = new DriverFactory2();
		
		String browserName=  PropReader.readPropData("browser");
		
		
		String mavenBrowserName = System.getProperty("cliBrowser");
		
		String envName = System.getProperty("environment");
		
		System.out.println(envName);
		
		System.out.println("Browser name received from command prompt is : "+mavenBrowserName);
		
		if(mavenBrowserName != null)
		{
			browserName = mavenBrowserName;
		}
		
		driver = df.initBrowser(browserName);
		
		driver.manage().window().maximize();	
			
	}
	
	@After(order = 2)
	public void tearDown(Scenario scenario)
	{
		boolean scenarioStatus = scenario.isFailed();
		
		if(scenarioStatus)
		{
			String nameOfScenario = scenario.getName();
			
			//String scenarioName = nameOfScenario.replace(" ", "_");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(source, "image/png", nameOfScenario);
			
		}
	}
	
	@After(order = 1)
	public void shutDown()
	{
		driver.quit();
	}

}
