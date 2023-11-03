package parasoft;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
public class UtilityClass1 {
	String strConfirm,strSSN,strPhone,strZip,strState,strCity,Address,strLastName,strFistName, strUserName,strPassword,strUrl;
	public UtilityClass1(){
		credentials();
	}
	public void credentials() {
		File file = new File("C:\\Users\\ksrinivasan2\\eclipse-workspace\\parasoft\\src\\test\\resources\\Feature\\Data1.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch(FileNotFoundException e) {
			e.printStackTrace();			
		}
		Properties property = new Properties();
		try {
			property.load(fileInput);
		} catch(IOException e) {
			e.printStackTrace();
		}
		strUrl=property.getProperty("url");
		strFistName = property.getProperty("FirstName");
		strLastName = property.getProperty("LastName");
		Address = property.getProperty("Address");
		strCity = property.getProperty("City");
		strState = property.getProperty("State");
		strZip = property.getProperty("ZipCode");
		strPhone = property.getProperty("Phone");
		strSSN = property.getProperty("SSN");
		strUserName = property.getProperty("username");
		strPassword = property.getProperty("password");
		strConfirm = property.getProperty("Confirm");
	}
 
}