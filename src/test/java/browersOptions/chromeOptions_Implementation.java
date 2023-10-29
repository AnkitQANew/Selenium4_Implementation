package browersOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

public class chromeOptions_Implementation 
{
	
	
	@Test
	public void test_ChromeOptions ()
	
	{	
	ChromeOptions  obj_ChromeOptions = new ChromeOptions ();
	
	obj_ChromeOptions.addArguments("start-maximized");
	
	obj_ChromeOptions.addArguments("—incognito");
	
	obj_ChromeOptions.addArguments("—headless");
	
	WebDriver driver 	= new ChromeDriver (obj_ChromeOptions); 
	
	driver.get("https://www.flipkart.com/");
	
	driver.quit();
    }
	
	@Test
	public void test_ChromeCapability ()
	
	{
		ChromeOptions  obj_ChromeOptions = new ChromeOptions ();
		
		obj_ChromeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		obj_ChromeOptions.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
		obj_ChromeOptions.setCapability(CapabilityType.PLATFORM_NAME, "MAC");
		
		WebDriver driver 	= new ChromeDriver (obj_ChromeOptions); 
		
		driver.get("https://www.flipkart.com/");
		
		driver.quit();
		
		
	}
	
	
	
}