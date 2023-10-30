package reletiveLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class belowLocatingStrategy {
	
	
	
	@Test
	public void belowLocatorDemo_1() 
	{	
		 WebDriver driver 	= new ChromeDriver (); 
	    
		 driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("//input[@name='last_name']"))).sendKeys("john@gmail.com");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 String userInput  =  driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("//input[@name='last_name']"))).getAttribute("value");
		
		 System.out.println("The user input is     "+userInput);
		 
		 driver.quit();
	}
	
	
	
	@Test
	public void belowLocatorDemo_2() throws InterruptedException 
	{	
		WebDriver driver 	= new ChromeDriver (); 
	    
		 driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("//input[@name='last_name']"))).sendKeys("john@gmail.com");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.xpath("//textarea[@placeholder='Comments']"))).click();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.quit();
	}
	
		 
		 
	

}
