package Orangepackage;

import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {
	LoginPageLocators loginPageLocators = null;
	String strUserName, strPassword;   //read it from external file and store it here
	
	public LoginPageActions() {  //constructor
		this.loginPageLocators = new LoginPageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
	}
	
	//set username in textbox
	public void setUserName(String strUserName) {
		loginPageLocators.userName.sendKeys(strUserName);
	}
	
	//set password in textbox
	public void setPassword(String strPassword) {
		loginPageLocators.password.sendKeys(strPassword);
	}
	
	//set click
	public void clickLogin() {
		loginPageLocators.login.click();
	}
	
	public void login(String strUserName, String strPassword) {
		
		//fill username
		this.setUserName(strUserName);
		//fill password
		this.setPassword(strPassword);
	}

}

