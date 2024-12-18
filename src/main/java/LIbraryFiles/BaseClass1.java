package LIbraryFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass1 {

	
	public  WebDriver driver;
	   
	
	
	public void initialisebrowser() throws IOException
	{
		
		 

		 driver  = new  ChromeDriver();
		driver.manage().window().maximize();
		  driver.get(UtilityCLass1.getPFData("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		  
		 
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
