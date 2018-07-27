package cucumberTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	@Given("^I am on login page$")
	public void I_am_on_login_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		 System.out.println("Login Page");
	    //throw new PendingException();
	}

	@When("^I give tomsmith and SuperSecretPassword!$")
	public void I_give_tomsmith_and_SuperSecretPassword() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		 System.out.println("Enter username and password");
	   // throw new PendingException();
	   
	}

	@Then("^I should be login$")
	public void I_should_be_login() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		 System.out.println("Login");
	   // throw new PendingException();
	}
	
	
}
