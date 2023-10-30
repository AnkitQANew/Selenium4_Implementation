package chromeDevTool;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class geoLocation {
	
	
	@Test
	public void geoLocationDemo() 
	{
		
		  WebDriver driver 	= new ChromeDriver (); 
        /* Create a hashmap for latitude, longitude, and accuracy as needed by Google Maps */
        Map<String, Object> coordinates = new HashMap<>();
        /* 27.944903941, -82.47211430 : random coordinates within Tampa (USA) */
        coordinates.put("latitude", 27.94490);
        coordinates.put("longitude", -82.47211);
        coordinates.put("accuracy", 100);
        
       ((ChromeDriver) driver).executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
       
       driver.get("https://locations.kfc.com/search?r=20");
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       
        
      WebElement locationIcon   = driver.findElement(By.xpath("//button[@class='Locator-button js-locator-geolocateTrigger']"));
      
      locationIcon.click();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
      
      driver.quit();
      
      
        

	}

}
