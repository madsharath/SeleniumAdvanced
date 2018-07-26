package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Registration;
import utility.ExcelData;

public class Registration_test {
  
	WebDriver driver;
	Registration rg;
	HomePage hm;
	ExcelData ex;

 @Test
  public void register_test() throws IOException {
  
		hm.reg();
//		rg.registration();
		ex.gettestdata();
		String str = driver.getCurrentUrl();

	
  
  }
   
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\shm\\chromedriver.exe");
	  driver = new ChromeDriver();  
	  driver.get("http://demowebshop.tricentis.com");
	  rg = PageFactory.initElements(driver, Registration.class);
	  hm = PageFactory.initElements(driver, HomePage.class); 
	  ex = new ExcelData();
  }

}
