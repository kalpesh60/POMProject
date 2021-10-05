package Testng.POMDemoQAPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
WebDriver driver;
	
	@FindBy(xpath = "//input[@id='userName']")
	WebElement uName;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement pwd;
	
	@FindBy(xpath = "//button[@id='login']")
	WebElement loginbtn1;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String arg) {
		uName.sendKeys(arg);
	}
	
	public void enterPassword(String arg) {
		pwd.sendKeys(arg);
	}
	
	public void clickLogin() {
		loginbtn1.click();
	}
}
