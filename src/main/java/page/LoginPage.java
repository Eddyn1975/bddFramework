package page;

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

	// Element Library
	
	@FindBy(how = How.XPATH, using = "//*[@class='login']/descendant::input[@id='username']")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@class='login']/descendant::input[@id='password']")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@class='login']/descendant::button[@name='login']")
	WebElement SIGNIN_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id='wrapper']//descendant::span[contains(text(),'Welcome TechFios')]")
	WebElement CLICK_ON_WELCOME_TECHFIOS;
	@FindBy(how = How.LINK_TEXT, using = "Edit Profile")
	WebElement CLICK_ON_EDIT_PROFILE;
	
	

	// Methods to interact with the elements
	public void enterUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	public void clickSignInButton() {
		SIGNIN_BUTTON.click();
	}
	public void clickWelcomeTechFios() {
		CLICK_ON_WELCOME_TECHFIOS.click();
	}
	public void clickEditProfile() {
		CLICK_ON_EDIT_PROFILE.click();
	}
	public String getPageTitle() {

		return driver.getTitle();
	}
	/*
	public String getCurrentURL() {

		return driver.getCurrentUrl();
	}
	*/
}
