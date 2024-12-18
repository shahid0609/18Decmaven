package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage1 {

	

	  @FindBy(xpath ="//div[@class='app_logo']")                 private WebElement logo;
	  @FindBy(xpath ="//button[@id='react-burger-menu-btn']")   private WebElement openMenu;
	
	
	
	
	public SwagLabHomePage1(WebDriver driver)
	{
		
	
		PageFactory.initElements(driver , this);
		
		
	}
	
	
	
	
	public String getSwagLabHomePageLogoText()
	{
		
		      String LogoText = logo.getText();
		
		        return LogoText;
		
		
		
	}
	
	
	
	public void clickOnOpenMenu()
	{
		
		
		
		openMenu.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
