package Testng.POMDemoQASetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Testng.POMDemoQAPages.Home;
import Testng.POMDemoQAPages.Login;
import Testng.POMDemoQAPages.Registration;

public class Setup {
	WebDriver driver;

	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:/Users/kalpe/eclipse-workspace/SeleniumProjectPOM/Driver/chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.demoqa.com/login");
	}
	
	@Test(priority = 0)
	public void navigate_to_homepage_click_on_getstarted2() throws InterruptedException {
		Registration objRegn = new Registration(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

			//scroll down on the webpage
			js.executeScript("window.scrollBy(0, 200)");

		objRegn.clickRegistration();
		
		objRegn.enterFirstName("Kalpesh");
		objRegn.enterLastName("Dhalpe");
		objRegn.enterUserName("kalpesh1234");
		objRegn.enterPassword("kal12345");
			
			//scroll down on the webpage
			js.executeScript("window.scrollBy(0, 400)");
			Thread.sleep(3000);
		objRegn.goToLogin();
	}
	
	@Test(priority = 1)
	public void navigate_to_homepage_click_on_getstarted1() throws InterruptedException {
		Login objLogin = new Login(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
			
			//scroll down on the webpage
			js.executeScript("window.scrollBy(0, 400)");
			
		objLogin.enterUserName("kalpesh123");
		objLogin.enterPassword("Kalpesh@123");
		Thread.sleep(3000);
		
			//scroll down on the webpage
			js.executeScript("window.scrollBy(0, 400)");
			
		objLogin.clickLogin();
	}
	
	@Test(priority = 2)
	public void navigate_to_homepage_click_on_getstarted() throws InterruptedException {
		Home objHome = new Home(driver);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
			//scroll down on the webpage
			js.executeScript("window.scrollBy(0, 1500)");

		objHome.goToBookStore();
		objHome.searchBook("git");
		objHome.clickOnSearch();
		objHome.clickOnBook();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, 1500)");
		objHome.addToCollection();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
}
