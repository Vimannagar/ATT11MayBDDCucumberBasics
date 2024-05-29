package uiappfeature;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.PropReader;

public class AppHooks {
	DriverFactory df;
	
	WebDriver driver;
	
	@Before
	public void launchBrowser() throws IOException
	{
		 df = new DriverFactory();
		
		String browserName=  PropReader.readPropData("browser");
		 
		driver = df.initBrowser(browserName);
		
		driver.manage().window().maximize();	
			
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
