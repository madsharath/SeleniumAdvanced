package test;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

public class GridTest {
  
	 WebDriver driver;
	 WebDriver driver1;
	
//  @Test
  public void openurl() {
	  driver.get("https://www.google.com");
	  driver1.get("https://www.google.com");
	  System.out.println(driver.getCurrentUrl());
  }
  
  
  
//  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  DesiredCapabilities ds= new DesiredCapabilities();
	  ds.setBrowserName("chrome");
	  driver = new RemoteWebDriver(new URL("http://10.231.143.210:4343/wd/hub"),ds);
	  driver1 = new RemoteWebDriver(new URL("http://10.231.143.210:4344/wd/hub"),ds);
	  
  }

}