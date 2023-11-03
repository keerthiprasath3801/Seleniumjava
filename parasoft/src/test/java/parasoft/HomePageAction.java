package parasoft;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.PageFactory;



public class HomePageAction {
	HomePageLocators homepageLocators ;
	
	public HomePageAction(){
		homepageLocators = new HomePageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), homepageLocators);
	}
	
	public String getVerifyText() {
		return homepageLocators.verifyText.getText();
	}
	public String LogingetVerifyText() {
		return homepageLocators.LoginverifyText.getText();
	}
 
}