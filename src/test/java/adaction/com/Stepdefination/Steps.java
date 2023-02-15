package adaction.com.Stepdefination;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import PageObjectManager.PageObjectManager;
import adaction.com.Baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends BaseClass {
	
	PageObjectManager obj = new  PageObjectManager(driver);
	@Given("User Launch the {string} Browser")
	public void user_launch_the_browser(String string) {
	      BrowserLaunch();
	      window_max();
	   
	}
	@Given("user Navigate the Url {string}")
	public void user_navigate_the_url(String string) {
	   getUrl(string);
	    
	}
	@Then("User Verify login page")
	public void user_verify_login_page() {
	   
	   
	}
	@Then("User Enter UserName\"\"")
	public void user_enter_user_name() {
	   
	   
	}
	@Then("User Enter Password\"\"")
	public void user_enter_password() {
	   
	}
	@Then("User Click the login Button")
	public void user_click_the_login_button() {
	    
	}
	@Then("User Verify login Sucessfull")
	public void user_verify_login_sucessfull() {
	    
	}



}
