//package parasoft;
//
//import org.testng.Assert;
//
//
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
// 
//public class RegisterPageDefinition {
//	RegisterPageActions objRegister = new RegisterPageActions();
//	UtilityClass1 data = new UtilityClass1();
//	HomePageAction objHome = new HomePageAction();
//	@Given("User is on Parabank Register page")
//	public void user_is_on_parabank_register_page() {
//		HelperClass.openPage(data.strUrl);
//	    System.out.println("Register page");
//	}
// 
//	@When("User enters First Name and Last Name")
//	public void user_enters_first_name_and_last_name() {
//		objRegister.Names(data.strFistName, data.strLastName);
//		   System.out.println("FirstName and LastName");
//	}
// 
//	@When("User enters Address")
//	public void user_enters_address() {
//		objRegister.Address(data.Address);
//		   System.out.println("Address");
// 
//	}
// 
//	@When("User enters City and State")
//	public void user_enters_city_and_state() {
//		objRegister.cityState(data.strCity, data.strState);
//		   System.out.println("City and State");
//	}
// 
//	@When("User enters Zip Code")
//	public void user_enters_zip_code() {
//		objRegister.Zip(data.strZip);
//		   System.out.println("ZipCode");
//	}
// 
//	@When("User enters Phone Number")
//	public void user_enters_phone_number() {
//		objRegister.Phone(data.strPhone);
//		   System.out.println("PhoneNumber");
//	}
// 
//	@When("User enters SSN")
//	public void user_enters_ssn() {
//		objRegister.SSN(data.strSSN);
//		   System.out.println("SSN");
//	}
// 
//	@When("User enters Username")
//	public void user_enters_username() {
//		objRegister.UserName(data.strUserName);
//		   System.out.println("UserNAme");
//	}
// 
//	@When("User enters Password and Confirm Password")
//	public void user_enters_password_and_confirm_password() {
//		objRegister.Passwords(data.strPassword, data.strConfirm);
//		   System.out.println("Password and Confirm PasswordS");
// 
//	}
// 
//	@When("User clicks Register")
//	public void user_clicks_register() {
//		objRegister.ClickRegister();
//		   System.out.println("Register button");
//	}
// 
//	@Then("User should be able to Register sucessfully")
//	public void user_should_be_able_to_register_sucessfully() {
//		Assert.assertTrue(objHome.getVerifyText().contains("This username already exists."));
//		System.out.println("Username already exist");
//	    
//	}
// 
// 
//}