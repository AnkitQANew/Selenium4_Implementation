package reletiveLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class nearStrategy {
	
	
	
	@Test
	public void nearDemo() throws InterruptedException 
	{	
		WebDriver driver 	= new ChromeDriver (); 
	    
		 driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 
		 driver.manage().window().maximize();
		 
         driver.findElement(RelativeLocator.with(By.xpath("//input")).near(By.xpath("//input[@type='submit']"))).click();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 Thread.sleep(5000);
		 
		 driver.quit();
	}
	

}
