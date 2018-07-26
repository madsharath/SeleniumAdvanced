package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {

	WebDriver d;
	@FindBy (id="gender-female")
	static WebElement ChkBox_Gender;
	
	@FindBy (id="FirstName")
	static WebElement FrstName;
	
	@FindBy (id="LastName")
	static WebElement LastName;
	
	@FindBy (id="Email")
	static WebElement Email;
	
	@FindBy (id="Password")
	static WebElement pass;
	
	@FindBy (id="ConfirmPassword")
	static WebElement CnfmPass;
	
	@FindBy (id="register-button")
	static WebElement RegButton;
	
	
	
	public static void registration(String frstname, String lastname, String email, String password, String conpass) {
		ChkBox_Gender.click();
		FrstName.sendKeys(frstname);
		LastName.sendKeys(lastname);
		Email.sendKeys(email);
		pass.sendKeys(password);
		CnfmPass.sendKeys(conpass);
		RegButton.click();
	}
		
	public Registration (WebDriver driver){
		this.d=driver;
	}
		
	
	
}
