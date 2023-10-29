package windowHandeling;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newWindow {
	
	
	@Test
	public void  getNewWindow() 
	{	
     
		 WebDriver driver 	= new ChromeDriver (); 
		    
		 driver.get("https://www.webdriveruniversity.com/");
		 
		 driver.manage().window().maximize();
		 
		 
		 String parentTab = driver.getWindowHandle();
		 
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 
		 driver.get("http://www.automationteststore.com");
		 
		 ArrayList <String> list  = new ArrayList <> (driver.getWindowHandles());
		 
		 driver.switchTo().window(list.get(0));
		 
		 System.out.println("The URL is : "+driver.getCurrentUrl());   // https://www.webdriveruniversity.com/
		 
	     driver.switchTo().window(list.get(1));
		 
		 System.out.println("The URL is : "+driver.getCurrentUrl());   // http://www.automationteststore.com
		 
		 driver.quit();
		 
		 
		 
		 
		
	}

}
