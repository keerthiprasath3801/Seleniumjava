package parasoft;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class RegisterPageLocators {
	@FindBy(xpath="//input[@id=\"customer.firstName\"]")
	public WebElement FirstName;
	@FindBy(xpath="//input[@id=\"customer.lastName\"]")
	public WebElement LastName;
	@FindBy(xpath="//input[@id=\"customer.address.street\"]")
	public WebElement Address;
	@FindBy(xpath="//input[@id=\"customer.address.city\"]")
	public WebElement City;
	@FindBy(xpath="//input[@id=\"customer.address.state\"]")
	public WebElement State;
	@FindBy(xpath="//input[@id=\"customer.address.zipCode\"]")
	public WebElement ZipCode;
	@FindBy(xpath="//input[@id=\"customer.phoneNumber\"]")
	public WebElement Phone;
	@FindBy(xpath="//input[@id=\"customer.ssn\"]")
	public WebElement SSN;
	@FindBy(xpath="//input[@id=\"customer.username\"]")
	public WebElement Username;
	@FindBy(xpath="//input[@id=\"customer.password\"]")
	public WebElement Password;
	@FindBy(xpath="//input[@id=\"repeatedPassword\"]")
	public WebElement Confirm;
	@FindBy(xpath="//input[@value=\"Register\"]")
	public WebElement Register;
 
}