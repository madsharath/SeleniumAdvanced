package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver d;
	
	@FindBy (xpath ="//a[text()='Register']")
	WebElement Regis;
		
	public void reg() {
		Regis.click();
	}
	
	public HomePage(WebDriver driver){
		this.d=driver;
		
	}
	
}
