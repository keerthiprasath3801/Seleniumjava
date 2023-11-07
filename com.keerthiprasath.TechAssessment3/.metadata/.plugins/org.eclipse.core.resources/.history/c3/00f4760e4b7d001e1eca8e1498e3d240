package com.keerthiprasath.Techassessment3;
import org.openqa.selenium.support.PageFactory;

public class RegisterAction {
	RegisterLocators regloc;
	
	RegisterAction(){
		regloc = new RegisterLocators();
		
		PageFactory.initElements(Helperclass.getDriver(), regloc);
	}
	
	public void clickRegister() {
		regloc.registerlink.click();
	}
	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			regloc.genderMale.click();
		}else {
			regloc.genderFemale.click();
		}
	}
	public void setFirstname(String firstname) {
		regloc.firstname.sendKeys(firstname);
	}
	public void setLastname(String lastname) {
		regloc.lastname.sendKeys(lastname);
	}
	public void setEmail(String email) {
		regloc.email.sendKeys(email);
	}
	public void setPassword(String password) {
		regloc.password.sendKeys(password);
	}
	public void setCPassword(String cpassword) {
		regloc.cpassword.sendKeys(cpassword);
	}
	public void clickRegisterButton() {
		regloc.registerButton.click();
	}
	public String getVerifyText() {
		return regloc.verifyText.getText();
	}
	public void clickLogout() {
		regloc.logOut.click();
	}
	
	public void registerAccount(String gender,String firstname,String lastname,String email,String password,String cpassword) {
		setGender(gender);
		setFirstname(firstname);
		setLastname(lastname);
		setEmail(email);
		setPassword(password);
		setCPassword(cpassword);
	}
}
