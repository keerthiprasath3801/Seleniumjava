package com.keerthiprasath.Techassessment3;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	RegisterAction regact = new RegisterAction();
//	Utilityclass1 data = new Utilityclass1();
	
	@Given("User lands in Opencart HomePage")
	public void user_opens_in_opencart_home_page() {
	    System.out.println("HomePage");
	    Helperclass.openPage("https://demowebshop.tricentis.com/");
	    Helperclass.log.info("WebPage Launched");
	}

	@When("User clicks Register link")
	public void user_clicks_register_link() {
		regact.clickRegister();
		Helperclass.log.info("User clicks register link");
	}
	@When("User enters Genter,Firstname,Lastname,E-Mail,Password and CPassword")
	public void user_enters_genter_firstname_lastname_e_mail_password_and_c_password(io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String,String>> signUpForm = dataTable.asMaps(String.class,String.class);
		    for(Map<String,String> data : signUpForm) {
		    	String gender = data.get("gender");
		    	String firstname = data.get("firstname");
		    	String lastname = data.get("lastname");
		    	String email = data.get("email");
		    	String password = data.get("password");
		    	String cpassword = data.get("Cpassword");
		    	regact.registerAccount(gender, firstname, lastname, email, password, cpassword);
		    }
	}

	@When("User click register button")
	public void user_click_register_button() {
	    regact.clickRegisterButton();
	    Helperclass.log.info("User clicks register button");
	}

	@Then("User get successfully registerd message and log out")
	public void user_get_successfully_registerd_message_and_log_out() {
	   Assert.assertTrue(regact.getVerifyText().contains("Your registration completed"));
	   Helperclass.log.info("Login succesfull");
	   regact.clickLogout();
	}
}
