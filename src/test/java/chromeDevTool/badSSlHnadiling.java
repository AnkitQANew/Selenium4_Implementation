package chromeDevTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v113.security.Security;
import org.testng.annotations.Test;

public class badSSlHnadiling {
    
	
		public static void main(String[] args) 
	{	
		 WebDriver driver 	= new ChromeDriver (); 
		 
		 driver.get("https://expired.badssl.com/");
		 
		 DevTools devTools = ((ChromeDriver) driver).getDevTools();
	  		
	     devTools.createSession();
	     
	     
	     devTools.send(Security.enable());
	     devTools.send(Security.setIgnoreCertificateErrors(true));
	     
	     
	     driver.get("https://expired.badssl.com/");
	     
	
	     
		 
		 
	}

}
