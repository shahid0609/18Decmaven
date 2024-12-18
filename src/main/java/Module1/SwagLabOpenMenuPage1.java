package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabOpenMenuPage1 {

	
	      @FindBy(xpath="//a[text()='Logout']")  private WebElement logout;
	                   
	
	        
	      
	      public SwagLabOpenMenuPage1(WebDriver driver)
	          {
	        	  
	        	 PageFactory.initElements(driver, this); 
	        	  
	        	  
	        	  
	          }
	
	
	
	
	   
	      public void clickOnLogout()
	      {
	    	  
	    	  
	    	  logout.click();
	    	  
	    	  
	      }
	
	
	
	
	
	
	
	
	
	
	
	
}
