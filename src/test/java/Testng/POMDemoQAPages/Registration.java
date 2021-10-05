package Testng.POMDemoQAPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	WebDriver driver;
	
	@FindBy(xpath = "//button[@id='newUser']")
	WebElement regBtn;
	
	@FindBy(xpath = "//input[@id='firstname']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='userName']")
	WebElement uName;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement pwd;
	
	@FindBy(xpath = "//button[@id='gotologin']")
	WebElement loginBtn;
	
	public Registration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterFirstName(String arg) {
		firstName.sendKeys(arg);
	}
	
	public void enterLastName(String arg) {
		lastName.sendKeys(arg);
	}
	
	public void enterUserName(String arg) {
		uName.sendKeys(arg);
	}
	
	public void enterPassword(String arg) {
		pwd.sendKeys(arg);
	}
	
	public void clickRegistration() {
		regBtn.click();
	}
	
	public void goToLogin() {
		loginBtn.click();
	}
}
