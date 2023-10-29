package waitsStrategy;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class pageLoadStrategy 
{     
	
	  @Test
	  public void normalStrategy() 
	 
	  {
		    // *****  By default Normal is set to browser if none is provides 
		  
			ChromeOptions  obj_ChromeOptions = new ChromeOptions ();
			obj_ChromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			
			WebDriver driver 	= new ChromeDriver (obj_ChromeOptions); 
			
			driver.get("https://www.flipkart.com/");
			
			driver.quit();

	  }
	  	  	  
	  @Test
	  public void eagerStrategy() 
		 
	  {
		    // ***** In EAGER Strategy webDriver does not wait to load the complete content, it just wait till DOMContentLoaded event fire is return. 
		  
			ChromeOptions  obj_ChromeOptions = new ChromeOptions ();
			obj_ChromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
			
			WebDriver driver 	= new ChromeDriver (obj_ChromeOptions); 
			
			driver.get("https://www.flipkart.com/");
			
			driver.quit();
	  }
	  
	  @Test
	  public void NoneStrategy() 
		 
	  {
		    // ***** In None Strategy webDriver does not even wait to load the all elements of the page.
		  
			ChromeOptions  obj_ChromeOptions = new ChromeOptions ();
			obj_ChromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
			
			WebDriver driver 	= new ChromeDriver (obj_ChromeOptions); 
			
			driver.get("https://www.flipkart.com/");
			
			driver.quit();
	  }	  
	  
	  

}
