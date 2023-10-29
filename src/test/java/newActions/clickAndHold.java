package newActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class clickAndHold {
	
	
	@Test
	public void clickAndHold_Demo() throws InterruptedException 
	{
		 WebDriver driver 	= new ChromeDriver (); 
	    
		 driver.get("https://www.webdriveruniversity.com/Actions/index.html");
		 
		 driver.manage().window().maximize();
		 
	     WebElement element	= driver.findElement(By.xpath("//div[@id='click-box']"));
		 
		 Actions   objAction = new Actions (driver);
		 
		 objAction.clickAndHold(element).build().perform();
		 
		 Thread.sleep(5000);
		 
		 objAction.release(element).build().perform();
		 
		 Thread.sleep(5000);
		 
		 driver.quit();

	}
	

}
