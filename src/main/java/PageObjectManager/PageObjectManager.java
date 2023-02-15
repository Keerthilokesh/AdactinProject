package PageObjectManager;

import org.openqa.selenium.WebDriver;

import adaction.com.Baseclass.BaseClass;
import adaction.com.Locators.LoginPage;

public class PageObjectManager extends BaseClass {
	
	public PageObjectManager(WebDriver driver) {
		this.driver= driver;
	}



	private LoginPage Loginpage;

	public LoginPage getLoginpage() {
		
		if (Loginpage==null) {
			Loginpage=new LoginPage(driver);
		}
		return Loginpage;
	}
	
	
	
	
	
	
	
	
	
}
