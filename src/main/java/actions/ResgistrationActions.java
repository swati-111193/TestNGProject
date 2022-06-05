package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import objects.RegistrationPageObjects;

public class ResgistrationActions extends RegistrationPageObjects{
	public static WebDriver driver;
	
	RegistrationPageObjects s = PageFactory.initElements(driver, RegistrationPageObjects.class);

	public void contactInfo() {
		s.Fname.sendKeys("");
		s.Lname.sendKeys("");
		s.Phone.sendKeys("");
		s.Email.sendKeys("");
	}
	
	public void MailingInfo() {
		s.Address.sendKeys("");
		s.City.sendKeys("");
		s.State.sendKeys("");
		s.PostCode.sendKeys("");
		Select countryDropDown = new Select(s.Country);
		countryDropDown.selectByIndex(4);
	}
	

	public void userInfo() {
		s.UserName.sendKeys("");
		s.Password.sendKeys("");
		s.CPassword.sendKeys("");
	
}


	public void clickOnBtn() {
	s.SubBtn.click();
}


	
	
}
