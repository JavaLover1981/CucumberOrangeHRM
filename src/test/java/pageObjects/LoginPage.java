package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// Below each element needs to have action method.....
	@FindBy(id="txtUsername")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@value='LOGIN']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath = "//a[@id='welcome']")
	@CacheLookup
	WebElement WelcomePaul;
	
	@FindBy(xpath = "//*[@id='welcome-menu']/ul/li[3]/a")
	@CacheLookup
	WebElement linkLogout;
	
	// Action methods...
	public void setUsername(String username) {
		txtUsername.clear();
		txtUsername.sendKeys(username);
	}

	public void setPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickWelcome() {
		WelcomePaul.click();
	}
	
	public void clickLogout() {
		linkLogout.click();
	}
}
