package Testng.POMDemoQAPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	@FindBy(xpath = "//button[@id='gotoStore']")
	WebElement bookStore;
	
	@FindBy(xpath = "//input[@id='searchBox']")
	WebElement searchBox;
	
	@FindBy(xpath = "//span[@id='basic-addon2']")
	WebElement searchClick;
	
	@FindBy(linkText = "Git Pocket Guide")
	WebElement book;
	
	@FindBy(xpath = "//button[contains(text(),'Add To Your Collection')]")
	WebElement collection;
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void goToBookStore() {
		bookStore.click();
	}
	
	public void searchBook(String arg) {
		searchBox.sendKeys(arg);
	}
	
	public void clickOnSearch() {
		searchClick.click();
	}
	
	public void clickOnBook() {
		book.click();
	}
	
	public void addToCollection() {
		collection.click();
	}
}
