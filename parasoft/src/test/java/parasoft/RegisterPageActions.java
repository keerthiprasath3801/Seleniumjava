//package parasoft;
//
//import org.openqa.selenium.support.PageFactory;
//
//
//
//public class RegisterPageActions {
//RegisterPageLocators registerPageLocators=null;
//	
//	
//	
//	public RegisterPageActions() {
//		this.registerPageLocators=new RegisterPageLocators();
//		PageFactory.initElements(HelperClass.getDriver(), registerPageLocators);
//	}
//	public void setFirstName(String strFistName) {
//		registerPageLocators.FirstName.sendKeys(strFistName);
//	}
//	public void setLastName(String strLastName) {
//		registerPageLocators.LastName.sendKeys(strLastName);
//	}
//	public void setAddress(String Address) {
//		registerPageLocators.Address.sendKeys(Address);
//	}
//	public void setCity(String strCity) {
//		registerPageLocators.City.sendKeys(strCity);
//	}
//	
//	
//	public void setState(String strState) {
//		registerPageLocators.State.sendKeys(strState);
//	}
//	
// 
//	public void setZipCOde(String strZip) {
//		registerPageLocators.ZipCode.sendKeys(strZip);
//	}
//	
//	public void setPhone(String strPhone) {
//		registerPageLocators.Phone.sendKeys(strPhone);
//	}
//	
//	public void setSSN(String strSSN) {
//		registerPageLocators.SSN.sendKeys(strSSN);
//	}
//	
//	public void setUserName(String strUserName) {
//		registerPageLocators.Username.sendKeys(strUserName);
//	}
//	public void setPassword(String strPassword) {
//		registerPageLocators.Password.sendKeys(strPassword);
//	}
//	public void setConfirm(String strConfirm) {
//		registerPageLocators.Confirm.sendKeys(strConfirm);
//	}
//	
//	
//	public void ClickRegister() {
//		registerPageLocators.Register.click();
//	}
//	public void Names(String strFistName,String strLastName) {
//		
//		this.setFirstName(strFistName);
//		this.setLastName(strLastName);
//		
//	}
//	public void Address( String Address) {
//		this.setAddress(Address);
// 
//		
//	}
//	public void cityState(String strCity,String strState) {
// 
//		this.setCity(strCity);
//		this.setState(strState);
//		
//	}
//	public void Zip( String strZip) {
//		this.setZipCOde(strZip);
// 
//		
//	}
//	public void Phone( String strPhone) {
//		this.setPhone(strPhone);
// 
//		
//	}
//	public void SSN( String strSSN) {
//		this.setSSN(strSSN);
// 
//		
//	}
//	public void UserName( String strUserName) {
//		this.setUserName(strUserName);
// 
//		
//	}
//	
//	public void Passwords( String strPassword,String strConfirm) {
//		this.setPassword(strPassword);
//		this.setConfirm(strConfirm);
//		
//	}
//}
// 