package windowHandeling;

import java.time.Duration;
import java.util.ArrayList;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class newTabDemo {
	
	@Test
	public void auto_newTabDemo() 
	{	
		 WebDriver driver 	= new ChromeDriver (); 
		    
		 driver.get("https://www.webdriveruniversity.com/");
		 
		 driver.manage().window().maximize();
		 
		 WebElement loginLink =   driver.findElement(By.xpath("//h1[normalize-space()='LOGIN PORTAL']"));
		
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable((loginLink))).click();
		
		
		ArrayList <String> list   = new ArrayList <> (driver.getWindowHandles());
	
		driver.switchTo().window(list.get(1));
		
		System.out.println("The title is  : "+driver.getTitle());
	
		 
		driver.quit();
		
		

	}

}
