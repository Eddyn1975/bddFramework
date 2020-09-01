package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.BasePage;

public class BrowserFactory {

	// global, so all methods can use
	static WebDriver driver;

	public static WebDriver startBrowser() {
		// Set Chrome Driver Properties
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		return driver;
	}
	public static void closeAllBrowsers() throws InterruptedException {
		BasePage.waitForImplicitWaitly();
		driver.close();
		driver.quit();
	}
}
