package windowHandeling;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newTab {
	

	@Test
	public void switchToNewTab() throws InterruptedException 
	{	
         WebDriver driver 	= new ChromeDriver (); 
	    
		 driver.get("https://www.webdriveruniversity.com/Page-Object-Model/index.html");
		 
		 driver.manage().window().maximize();
		 
		 String parentTab = driver.getWindowHandle();
		 
		 driver.switchTo().newWindow(WindowType.TAB);
		 
		 driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 
		 String clildTab = driver.getWindowHandle();
		 
		 String childTabTitle  = driver.getTitle();
				
		 
		 System.out.println("Parent window ID -  "+parentTab + "\n child Window ID  - "+clildTab + "\n Child window Title -  "+childTabTitle);
		  
		 
		 driver.quit();
		 
		 
		
	}
	

}
