package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PF_LoginPage {

	@FindBy(id = "name")
	@CacheLookup // for basic web application only.
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login")
	WebElement btn_login;
  
	@FindBy(partialLinkText = "honda")
	List<WebElement> myLinks;
	
	@FindBy(how = How.ID, using="name")
	WebElement abc;
	
	WebDriver driver;

	public PF_LoginPage(WebDriver driver) {
		this.driver = driver;
//		PageFactory.initElements(driver, PF_LoginPage.class);
//		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), PF_LoginPage.class);
	}

	public void enterUsername(String userName) {
		username.sendKeys(userName);
	}

	public void enterPassword(String passWord) {
		password.sendKeys(passWord);
	}

	public void clickOnLogin() {
		btn_login.click();
	}
}
