package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {
	
	public WebDriver driver;
	public LoginPage lp;

	@Given("^User Launch Chrome browser$")
	public void user_Launch_Chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe/");
		driver = new ChromeDriver();
	    lp = new LoginPage(driver);
	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_URL() throws Throwable {
	//  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enter_username_as_and_password_as(String username, String password) throws Throwable {
	   lp.setUsername(username);
	   lp.setPassword(password);
	}

	@When("^click on Login$")
	public void click_on_Login() throws Throwable {
	 lp.clickLogin();
	}

	@Then("^Page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title) throws Throwable {
	    // Need to capture the title (if it is the expected title)
		if(driver.getPageSource().contains("Invalid credentials")) {
			driver.close();
			Assert.assertTrue(false);
		}else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("^User click on \"([^\"]*)\"$")
	public void user_click_on(String Welcome) throws Throwable {
	   lp.clickWelcome();
	}

	@Then("^user click on log out link$")
	public void user_click_on_log_out_link() throws Throwable {
	 lp.clickLogout();
	}
}
