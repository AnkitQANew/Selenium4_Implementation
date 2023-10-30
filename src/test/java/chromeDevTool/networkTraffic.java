package chromeDevTool;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.ConnectionType;
import org.openqa.selenium.devtools.v85.network.Network;
import org.testng.annotations.Test;

public class networkTraffic {
	
	
	@Test
	public void  trackNetwork_Call() 

	{   
 		WebDriver driver 	= new ChromeDriver (); 
		
	    DevTools devTools = ((ChromeDriver) driver).getDevTools();
  		
        devTools.createSession();
        
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        
        devTools.addListener(Network.requestWillBeSent(),
                entry -> {
                    System.out.println("Request URL: " + entry.getRequest().getUrl() + "\n"
                            + " with Method: " + entry.getRequest().getMethod());
                });
        
        driver.get("https://www.automationteststore.com/");
        devTools.send(Network.disable()); //Stop capturing network traffic
        
        driver.quit();

	}

}
