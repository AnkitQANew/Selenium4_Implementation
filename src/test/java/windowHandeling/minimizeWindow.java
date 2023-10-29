package windowHandeling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class minimizeWindow {
	
	
	@Test
	public void minimizeWindow_Demo() 
	{
		 WebDriver driver 	= new ChromeDriver (); 
	    
		 driver.get("https://www.webdriveruniversity.com/");
		 
		 driver.manage().window().minimize();
		 
		 

	}
	

}
