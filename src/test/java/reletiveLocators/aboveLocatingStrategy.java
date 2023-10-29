package reletiveLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocatorServerSide;
import org.testng.annotations.Test;

public class aboveLocatingStrategy {
	
	
	@Test
	public void aboveLocatorDemo_1() 
	{	
		WebDriver driver 	= new ChromeDriver (); 
	    
		 driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.xpath("//input[@name = 'last_name']"))).sendKeys("John");
		 
		 String userInput   = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.xpath("//input[@name = 'last_name']"))).getAttribute("value");
		
		 System.out.println("The user input is   "+userInput);
		 
		 driver.quit();
		 
		 
		 
	}

}

////input[@placeholder='Last Name']