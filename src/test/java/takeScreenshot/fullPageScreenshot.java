package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fullPageScreenshot 
{
	
	@Test
	public void take_fullpage_screenshot() throws IOException 
	{
		WebDriver driver 	= new ChromeDriver (); 
	    
		 driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 
		 driver.manage().window().maximize();
		 
		 
		   WebElement element  = driver.findElement(By.xpath("//h2[@name='contactme']"));
		   
		 
		 File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 
		 
		 FileUtils.copyFile(srcFile, new File("./auto_test_store.png"));
		 
		 driver.quit();
		 
		 
	    
	
	       
	}
	

}
