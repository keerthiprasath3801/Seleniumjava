package Login;

import org.openqa.selenium.support.PageFactory;

public class LoginActions {
	LoginLocators logloc ;
	
	public LoginActions() {
		logloc = new LoginLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), logloc);
	}
	public void clickLogout() {
		logloc.logOut.click();
	}
	public void clicklogin() {
		logloc.loginLink.click();
	}
	public void setEmail(String email) {
		logloc.email.sendKeys(email);
	}
	public void setPassword(String password) {
		logloc.password.sendKeys(password);
	}
	
	public void clickLoginButton() {
		logloc.loginButton.click();
	}
	public String getVerifyText() {
		return logloc.verifyText.getText();
	}
	public String getErrorText() {
		return logloc.errorText.getText();
	}
	
	public void loginAccount(String email, String password) {
		setEmail(email);
		setPassword(password);
	}
}