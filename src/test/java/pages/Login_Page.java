package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	@FindBy (id="login-form") private WebElement login_Page;
	@FindBy (id="email") private WebElement emailId_text;
	@FindBy (id="password") private WebElement password_text;
	@FindBy (id="loginButton") private WebElement login_Btn;
	@FindBy (xpath="//*[@class='item-name'][contains(text(),'Apple Pomace')]//..//..//..//..//..//div[@style='display: flex; justify-content: center;']/button")
	private WebElement home_page;

	
	public void loginPage() {
		
		login_Page.isDisplayed();
	
	}
	
	
	public void emailIdTxt(String username) {

		emailId_text.sendKeys(username);
	}


	
	public void passwordTxt(String password) {

		password_text.sendKeys(password);
	}

	
	public void loginBtn() {

		login_Btn.click();
	}

	
	public void homePage() {

		home_page.isDisplayed();
	}

	
	WebDriver driver;
	public Login_Page (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


}
