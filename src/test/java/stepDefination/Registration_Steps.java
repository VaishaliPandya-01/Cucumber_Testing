package stepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.Login_Page;
import pages.Registration_page;

public class Registration_Steps {

	WebDriver driver = null;
	Registration_page registration;
	Login_Page login;

	@Before
	public void browser_is_open() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	
	@Given("user is on registration page")
	public void user_is_on_registration_page() {

		driver.get("https://juice-shop.herokuapp.com/#/register");

	}

	
	@When("^user enters (.*) (.*) (.*) (.*)$")
	public void user_enters_all_valid_data(String username,String password,String repassword,String securityAns) throws InterruptedException{

		registration = new Registration_page(driver);


		registration.dismissBtns();
		registration.emailIdtxt(username);
		registration.passwordtxt(repassword);
		registration.repPasswordtxt(repassword);
		registration.questionSelection();
		registration.QuestionAns(securityAns);
		Thread.sleep(5000);


	}
	

	@And("click on Register")
	public void click_on_register(){

		registration.registrationBtn();
		

	}


	@Then("user is navigated to login page")
	public void user_is_navigated_to_login_page() {

		login = new Login_Page(driver);
		login.loginPage();
	
	}	

}
