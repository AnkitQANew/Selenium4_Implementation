package chromeDevTool;



import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.ConnectionType;



public class networkContition_1 {
	
	
	
	
	public void networkContition_Demo2G(DevTools devTools) 
	{	
		
        devTools.send(Network.enable(Optional.of(1000000), Optional.empty(), Optional.empty()));
        devTools.send(Network.emulateNetworkConditions(false, 100, 200000, 100000, Optional.of(ConnectionType.CELLULAR2G))); 
	}
	
	
	public void networkContition_DemoWIFI(DevTools devTools) 
	{	
		
        devTools.send(Network.enable(Optional.of(1000000), Optional.empty(), Optional.empty()));
        devTools.send(Network.emulateNetworkConditions(false, 100, 200000, 100000, Optional.of(ConnectionType.WIFI))); 
	}
	
	
	

	 @Test
      public void emulateNetworkConnection_2G() 
   {	
  		WebDriver driver 	= new ChromeDriver (); 
  	
  		DevTools devTools = ((ChromeDriver) driver).getDevTools();
  		
        devTools.createSession();
        
        networkContition_Demo2G(devTools);
        
       long startTime =   System.currentTimeMillis();
        
        driver.get("https://www.automationteststore.com/");
        
       long endTime =  System.currentTimeMillis();
       
       long pageLoadtime =  endTime - startTime ;
       
       System.out.println("Total pageload time in 2G connection is   "+pageLoadtime); 
       
       driver.close();    
      
	}
	 
	 
	 @Test
     public void emulateNetworkConnection_WIFI() 
  {	
 		WebDriver driver 	= new ChromeDriver (); 
 	
 	   DevTools devTools = ((ChromeDriver) driver).getDevTools();
 		
       devTools.createSession();
       
       networkContition_DemoWIFI(devTools);
       
      long startTime =   System.currentTimeMillis();
       
       driver.get("https://www.automationteststore.com/");
       
      long endTime =  System.currentTimeMillis();
      
      long pageLoadtime =  endTime - startTime ;
      
      System.out.println("Total pageload time in WIFI is   "+pageLoadtime); 
      
      driver.close();    
     
	} 
	 
	 
	 
	 
	 

}
