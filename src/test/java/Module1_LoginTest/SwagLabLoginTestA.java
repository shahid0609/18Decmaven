package Module1_LoginTest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LIbraryFiles.BaseClass1;
import LIbraryFiles.UtilityCLass1;
import Module1.SwagLabHomePage1;
import Module1.SwagLabLoginPage1;
import Module1.SwagLabOpenMenuPage1;

public class SwagLabLoginTestA extends BaseClass1
{

	     SwagLabLoginPage1 login;
	     SwagLabHomePage1 home;
	     SwagLabOpenMenuPage1 menu;
	     int TCID1;
	
	
	
	
	@BeforeClass
	public void OpenBrowser() throws IOException
	{
		
		initialisebrowser();
		
		login = new  SwagLabLoginPage1(driver);
		home   = new SwagLabHomePage1(driver);
		menu   = new  SwagLabOpenMenuPage1(driver);
		
		
		
		
	}
	
	
	@BeforeMethod
	public void LoginToApp() throws IOException, InterruptedException
	{
		
		login.enterUsername(UtilityCLass1.getPFData("UN"));
		login.enterPassword(UtilityCLass1.getPFData("PWD"));
		login.clickOnLogin();
		
		Thread.sleep(2000);
		
		
		
	}
	
	
	@Test
	public void verifylogo() throws EncryptedDocumentException, IOException
	{
		
		TCID1=101;
		
		     String actLogoText = home.getSwagLabHomePageLogoText();
	                 String expLogoText = UtilityCLass1.getTD(0, 2);
	                 
	             Assert.assertEquals(actLogoText,expLogoText,"Failed;-Both results are diff");
		
		
		
		
	}
	
	
	@AfterMethod
	public void logoutfromApp(ITestResult s1) throws IOException, InterruptedException
	{
		
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			
			UtilityCLass1.captureSS(driver, TCID1);
			
			
			
		}
			
			
		  home.clickOnOpenMenu();
		
		  Thread.sleep(2000);
		  
		 menu.clickOnLogout();
		
		
		
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		
		
		
	  driver.quit();	
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
