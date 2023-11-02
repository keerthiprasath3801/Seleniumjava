package Orangepackage;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition {
	
	UtilityClass data = new UtilityClass();
	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHome = new HomePageActions();
	
	@Given("User logins to application using url")
	public void user_logins_to_application_using_url() {
		HelperClass.openPage(data.url);
	    System.out.println("login page");
	    
	}

	@When("User provides valid username and password")
	public void user_provides_valid_username_and_password() {
		objLogin.login(data.username, data.password);
		System.out.println("Username and password");
	    
	}

	@When("User clicks login")
	public void user_clicks_login() {
		objLogin.clickLogin();
		System.out.println("login button");
	    
	}

	@Then("User should be able to successfully login and  HomePage is opened")
	public void user_should_be_able_to_successfully_login_and_home_page_is_opened() {
		Assert.assertTrue(objHome.getVerifyText().contains("Dashboard"));
		System.out.println("sucessfull login");
	    
	}
	
}
//}