package selGridImplentation;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class standaloneGrid {
	
	
	

	WebDriver driver ;
	@Test
	public void webElement_ScreenshotDemo() throws IOException 
	{    
        ChromeOptions grid_options = new ChromeOptions ();
		grid_options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		grid_options.addArguments("start-maximized");
		driver = new RemoteWebDriver(new URL ("http://localhost:4444/"),grid_options);
		
		 WebDriver driver 	= new ChromeDriver (); 
		 driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
		 driver.manage().window().maximize();
		 File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 WebElement element  = driver.findElement(By.xpath("//h2[@name='contactme']"));
		 srcFile = element.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcFile, new File("./auto2_test_store.png"));
		 driver.quit();

	}

	
	

}
