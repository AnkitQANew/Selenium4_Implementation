package browersOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class firefoxOptions_Implementation {
	
	
	
	@Test
    public void test_FirefoxOptions ()
	
	{	
	
    FirefoxOptions obj_firefox  = new FirefoxOptions ();
	
    obj_firefox.addArguments("start-maximized");
	
    obj_firefox.addArguments("—incognito");
	
    obj_firefox.addArguments("—headless");
	
	WebDriver driver 	= new FirefoxDriver (obj_firefox); 
	
	driver.get("https://www.flipkart.com/");
	
	driver.quit();
    }
	

}
