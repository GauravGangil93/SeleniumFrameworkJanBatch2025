package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.chaintest.plugins.ChainTestListener;

import dataprovider.ConfigUtility;
import factory.BrowserFactory;

public class BaseClass 
{
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		ChainTestListener.log("LOG:INFO - Setting up browser");
		
		driver=BrowserFactory.startBrowser(ConfigUtility.readProperty("Browser"), ConfigUtility.readProperty("qaenv"));
		
	}
	
	@AfterClass
	public void tearDown()
	{
		ChainTestListener.log("LOG:INFO - Closing the browser");
		 		
		driver.quit();
	}

}
