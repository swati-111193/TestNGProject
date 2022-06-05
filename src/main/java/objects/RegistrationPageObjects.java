package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageObjects {
	
	@FindBy(name = "firstName")
	public WebElement Fname;
	
	@FindBy(name = "lastName")
	public WebElement Lname;
	
	@FindBy(name = "phone")
	public WebElement Phone;
	
	@FindBy(id = "userName")
	public WebElement Email;
	
	@FindBy(name = "address1")
	public WebElement Address;
	
	@FindBy(name = "city")
	public WebElement City;
	
	@FindBy(name = "state")
	public WebElement State;
	
	@FindBy(name = "postalCode")
	public WebElement PostCode;
	
	@FindBy(name = "country")
	public WebElement Country;
	
	@FindBy(name = "email")
	public WebElement UserName;
	
	@FindBy(name = "password")
	public WebElement Password;
	
	@FindBy(name = "confirmPassword")
	public WebElement CPassword;
	
	@FindBy(name = "submit")
	public WebElement SubBtn;

}
