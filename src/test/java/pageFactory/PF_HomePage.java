package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_HomePage {

	@FindBy(id = "logout")
	WebElement btn_Logout;
	
	WebDriver driver;
	public PF_HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, PF_HomePage.class);
	}
}
