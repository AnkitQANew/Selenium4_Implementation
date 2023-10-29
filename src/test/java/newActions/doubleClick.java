package newActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class doubleClick {
	
	
	@Test
	public void doubleClick_Demo() 
	{
		WebDriver driver 	= new ChromeDriver (); 
	    
		 driver.get("https://www.webdriveruniversity.com/Actions/index.html");
		 
		 driver.manage().window().maximize();
		 
		 WebElement  double_element  = driver.findElement(By.xpath("//div[@id='double-click']"));
		 
		 Actions   objAction = new Actions (driver);
		 		 
		 objAction.doubleClick(double_element).release().build().perform();
		 
		 driver.quit();

	}

}
