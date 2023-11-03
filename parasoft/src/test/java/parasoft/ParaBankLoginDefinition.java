//package parasoft;
//
//
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class ParaBankLoginDefinition {
//	ParaBankLoginActions objLogin = new ParaBankLoginActions();
//	UtilityClass1 data = new UtilityClass1();
//	HomePageAction objHome = new HomePageAction();
//	@Given("User is on Parabank Login page")
//	public void user_is_on_parabank_login_page() {
//		HelperClass.openPage(data.strUrl);
//	    System.out.println("login page");
//	}
//
//	@When("User enters ParaBank Username and Password")
//	public void user_enters_para_bank_username_and_password() {
//		objLogin.login(data.strUserName, data.strPassword);
//		   System.out.println("Username and password");
//	}
//
//	@When("User clicks ParaBank login")
//	public void user_clicks_para_bank_login() {
//		
//		   objLogin.clickLogin();
//		   System.out.println("login button");
//	}
//
//	@Then("User should be able to login sucessfully in ParaBank")
//	public void user_should_be_able_to_login_sucessfully_in_para_bank() {
//		Assert.assertTrue(objHome.LogingetVerifyText().contains("Accounts Overview"));
//		   System.out.println("sucessfull login");
//
//	}
//
//
//
//
//}