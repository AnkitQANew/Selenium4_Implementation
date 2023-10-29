package newActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragAndDrop {
	
	
	@Test
	public void dragAndDrop_Demo() 
	{
		WebDriver driver 	= new ChromeDriver (); 
	    
		 driver.get("https://www.webdriveruniversity.com/Actions/index.html");
		 
		 driver.manage().window().maximize();
		 
		 WebElement  drag_element  = driver.findElement(By.xpath("//div[@id='draggable']"));
		 
		 WebElement  drop_element  = driver.findElement(By.xpath(".//div[@id='droppable']"));
		 
		 Actions   objAction = new Actions (driver);
		 
		 objAction.moveToElement(drag_element).clickAndHold().moveToElement(drop_element).release().build().perform();
		 
		 driver.quit();
		

	}

}
