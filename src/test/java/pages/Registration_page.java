package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_page {
	
	@FindBy (xpath = "//button//span[text()='Dismiss']") private WebElement Dismiss_btn;
	@FindBy (xpath= "//*[@aria-label='cookieconsent']//div/a") private WebElement Dismiss_btn1;
	@FindBy (id="emailControl") private WebElement emailId_txt;
	@FindBy (id="passwordControl") private WebElement password_txt;
	@FindBy (id="repeatPasswordControl") private WebElement repPassword_txt;
	@FindBy (xpath = "//div[@id='mat-select-value-1']/span") private WebElement question_dropdwn;
	@FindBy (xpath = "//span[text()=' Name of your favorite pet? ']") private WebElement question_select;
	@FindBy (id="securityAnswerControl") private WebElement qtnAns_txt;
	@FindBy (id="registerButton") private WebElement registration_btn;
	



	public  void  dismissBtns() {
		Dismiss_btn.click();
		Dismiss_btn1.click();
	} 



	public void emailIdtxt(String username) {

		emailId_txt.sendKeys(username);
	}



	public void passwordtxt(String password) {

		password_txt.sendKeys(password);
	}



	public void repPasswordtxt(String repassword) {

		repPassword_txt.sendKeys(repassword);
	}



	public void questionSelection() {

		question_dropdwn.click();
		question_select.click();

	}


	public void QuestionAns(String securityAns) {

		qtnAns_txt.sendKeys(securityAns);

	}



	public void registrationBtn() {

		registration_btn.click();
	}



	WebDriver driver;
	public Registration_page (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
