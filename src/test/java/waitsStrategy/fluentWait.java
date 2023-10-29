package waitsStrategy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class fluentWait {
	
	
	
	
	@Test
	public void fluentWaitDemo() 
	
	{  
		WebDriver driver 	= new ChromeDriver (); 
		
		driver.get("https://toolsqa.com/");
		
		 Wait <WebDriver> wait = new FluentWait<> (driver)
		.withTimeout(Duration.ofSeconds(5))
		.pollingEvery(Duration.ofSeconds(10));
		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='new-training__heading']")));
		
		driver.close();
		
	}	
		

}
