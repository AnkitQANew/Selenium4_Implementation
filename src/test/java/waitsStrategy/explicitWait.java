package waitsStrategy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class explicitWait 
{
	
	
	@Test
	public void explicitWaitDemo() 
	
	{  
		WebDriver driver 	= new ChromeDriver (); 
	    
		driver.get("https://toolsqa.com/");

		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='new-training__heading']")));
		
		System.out.println(element.getText());
		
		driver.close();
		
	}	
		
		
     
	

}
