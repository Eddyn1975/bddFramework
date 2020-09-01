package steps;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps {
	WebDriver driver;
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	String username = "";
	String password = "";

	@Given("^a valid user$")
	public void a_valid_user() {
		username = "demo@techfios.com";
		password = "abc123";
	}

	@When("^user goes to techfios website$")
	public void user_goes_to_techfios_website() {
		driver = BrowserFactory.startBrowser();
	}

	@Then("^techfios website should display$")
	public void techfios_website_should_display() {
		String expectedTitle = "Login - iBilling";
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		String actualTitle = loginpage.getPageTitle();
		Assert.assertEquals("Titles did not match", expectedTitle, actualTitle);
	}

	@When("^user logs in with valid credentials$")
	public void user_logs_in_with_valid_credentials() {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");
		login.clickSignInButton();
	}

	@Then("^Dashboard page should be displayed$")
	public void dashboard_page_should_be_displayed() {
		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.verifyDashBoardElement();
	}

}
