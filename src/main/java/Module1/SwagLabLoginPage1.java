package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage1 {

	
	//Step1: Declaration
	
	@FindBy(xpath ="//input[@name='user-name']")   private WebElement UN;
	@FindBy(xpath ="//input[@id='password']")      private WebElement PWD;
	 @FindBy(xpath="//input[@id='login-button']")   private WebElement loginbtn;
	 @FindBy(xpath="//input[@id='login-button']")   private WebElement errorMsg;
	
	       
	 // Step2: Initialization
	                   
	   public  SwagLabLoginPage1(WebDriver driver)               
	   {
		   
		     PageFactory.initElements(driver, this) ;
		   
		   
		   
	   }
	
	
	// step3 Usage
	   
	   public void enterUsername( String username)
	  {
		   
		   UN.sendKeys(username);
		   
		   
	   }
	
	  public void enterPassword(String password)
	{
		
		
		PWD.sendKeys(password);
		
		
	}
	
	public void clickOnLogin()
	{
		
		
		loginbtn.click();
		
		
	}
	
	
	
	//  driver.findelement me convert karne k liye initialization karna pademga yaha hame PageFactory na kaa inbuit class hai
	
	
	
	
	
	
	
	
	
	
	
	
	
}
