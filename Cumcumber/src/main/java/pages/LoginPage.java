package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Login Data
	String userName = "demo@techfios.com";
	String password = "abc123";

	// storing element with By class
	//By userNameField = By.xpath("//input[@id='username']");
	//By passWordField = By.xpath("//*[@id=\"password\"]");
	//By signInButtonField = By.xpath("/html/body/div/div/div/form/div[3]/button");

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGNIN_BUTTON_ELEMENT;

	// Individual Methods
	public void insertUserName(String username) {
		USERNAME_ELEMENT.sendKeys(username);
	}

	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}

	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}

	public  void tearDown() {
		driver.close();
		driver.quit();
	}

	public String getPageTitle() {
		driver.getTitle();
		return getPageTitle();
	}
	


}
