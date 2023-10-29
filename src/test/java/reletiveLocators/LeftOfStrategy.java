package reletiveLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class LeftOfStrategy {
	
	
	
	@Test
	public void leftOfLocatorDemo_1() throws InterruptedException 
	{	
		WebDriver driver 	= new ChromeDriver (); 
	    
		 driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 
		 driver.manage().window().maximize();
		 
         driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("//input[@name='last_name']"))).sendKeys("john@gmail.com");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@type='submit']"))).click();
		 
		 Thread.sleep(5000);
		 
		 driver.quit();
	}

}
