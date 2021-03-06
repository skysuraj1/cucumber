package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;


public class LoginStepDefination extends TestBase {
	LoginPage loginpage;
	DatabasePage databasepage;
	
	@Before
	public void beforeRun() {
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		databasepage = new DatabasePage();
	}
	
	
	@Given("^User in on Techfios login page$")
	public void user_in_on_Techfios_login_page() throws Throwable {
	   
	}

	
	
	
	
	
	@Given ("^User is on Techfios login page$")
	public void User_is_on_Techfios_login_page() {
		
	 loginpage = PageFactory.initElements(driver, LoginPage.class);
		
	}
	

@When("^User enters username as \"([^\"]*)\"$")
public void user_enters_username_as(String username) throws Throwable {
  loginpage.insertUserName(username);
  Thread.sleep(3000);
}

@When("^User enters password as \"([^\"]*)\"$")
public void user_enters_password_as(String password) throws Throwable {
    loginpage.insertPassword(password);
    Thread.sleep(3000);
}

@And("^USer clicks on SignIn button$")
public void user_clicks_on_SignIn_button() throws Throwable {
    loginpage.clickSigninButton();
    Thread.sleep(3000);
}

@Then("^User should land on dashboard page$")
public void user_should_land_on_dashboard_page() throws Throwable {
	String dashboardPageTitle = driver.getTitle();
	Assert.assertEquals("Dashboard- iBilling", dashboardPageTitle);
  //  System.out.println("User landed on Dashboard Page");
	takeScreenshot(driver);
}

//sql
@When("^User enters \"([^\"]*)\" from mysql database$")
public void user_enters_from_mysql_database(String data) throws Throwable {
    switch(data) {
    case "username":
    	System.out.println("username from db : "+databasepage.getData("username"));
    	loginpage.insertUserName(databasepage.getData("username"));
    	Thread.sleep(3000);
    break;
    case "password":
    	System.out.println("password from db : "+databasepage.getData("password"));
    	loginpage.insertPassword(databasepage.getData("password"));
    	Thread.sleep(3000);
    break;
    default:
    	System.out.println("unable to enter data !");
    }
}




public void tearDown(){
	driver.quit();
	driver.close();
}
	
}
