package chromeDevTool;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableList;

public class networkIntercept {
	
	
	
	@Test
	public void networkInterceptDemo() 
	{
	    WebDriver driver 	= new ChromeDriver (); 
		
	    DevTools devTools = ((ChromeDriver) driver).getDevTools();
  		
        devTools.createSession();
        
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        devTools.send(Network.setBlockedURLs(ImmutableList.of(".png", ".jpg")));
        
        driver.get("https://www.automationteststore.com/");
        devTools.send(Network.disable());
	}

}
