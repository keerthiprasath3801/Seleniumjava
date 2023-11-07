package Login;
import org.junit.Assert;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class LoginStepDefinition {
	
	LoginActions logac = new LoginActions();
	dataProperties data = new dataProperties();
	@Given("User landed at demo.opencart HomePage")
	public void user_landed_at_demo_opencart_home_page() {
	   HelperClass.openPage(data.url);
	   HelperClass.log.info("Landed in Home page");
	}
 
	@When("User clicks login link")
	public void user_clicks_login_link() {
		
	    logac.clicklogin();
	}
 
	@When("User enter the username and password")
	public void user_enter_the_username_and_password() {
	   logac.loginAccount(data.email, data.password);
	   HelperClass.log.info("Enters Valid Credentials");
	}
	@When("User enter the invalid username and password")
	public void user_enter_the_invalid_username_and_password() {
		 logac.loginAccount(data.email1,data.password1);
		    HelperClass.log.info("Enters Invalid Credentials");
	}
 
	@When("User clicks login button")
	public void user_clicks_login_button() {
		logac.clickLoginButton();
	}
 
	@Then("User see the login succesfull message")
	public void user_see_the_login_succesfull_message() {
	    Assert.assertTrue(logac.getVerifyText().contains("logsri5@gmail.com"));
	    
	    HelperClass.log.info("Login Successfull");
	    logac.clickLogout();
	}
 
	@Then("User see the error message")
	public void user_see_the_error_message() {
	  Assert.assertTrue(logac.getErrorText().contains("Login was unsuccessful. Please correct the errors and try again."));
	  HelperClass.log.info("Error Message occured");
	
	}
}