package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TestBase;

public class LoginStepDefination extends TestBase {
	
	@Given ("^User is on Techfios login page$")
	
	public void User_is_on_Techfios_login_page() {
		initDriver();
		driver.get("https://techfios.com/billing/?ng=login");
	}
	
	

@When("^User enters username as \"([^\"]*)\"$")
public void user_enters_username_as(String userName) throws Throwable {
   
}

@When("^User enters password as \"([^\"]*)\"$")
public void user_enters_password_as(String password) throws Throwable {
    
}

@And("^USer clicks on SignIn button$")
public void user_clicks_on_SignIn_button() throws Throwable {
    
}

@Then("^User should land on dashboard page$")
public void user_should_land_on_dashboard_page() throws Throwable {
    
}


	
}
