package parasoft;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class ParaBankLoginPageLocators {
	
		@FindBy(xpath="//input[@name=\"username\"]")
		public WebElement username;
		@FindBy(xpath="//input[@name=\"password\"]")
		public WebElement Password;
		@FindBy(xpath="//input[@value=\"Log In\"]")
		public WebElement login;
	
}