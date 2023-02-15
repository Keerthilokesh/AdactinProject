package adaction.com.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adaction.com.Baseclass.BaseClass;

public class LoginPage extends BaseClass {
          
	public LoginPage(WebDriver cdriver) {
	this.driver= cdriver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "img[alt='AdactIn Group']")
	private WebElement Adaction_Logo;

	public WebElement getAdaction_Logo() {
		return Adaction_Logo;
	}
	
	
	
	
	
	
	
	
	
	
	
}
