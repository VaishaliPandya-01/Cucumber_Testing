package stepDefination;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.Login_Page;

public class Login_Steps {
	
	WebDriver driver = null;
	Login_Page login;
	
	@Before
	public void Browser_is_open() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().window().maximize();
	}
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		driver.get("https://juice-shop.herokuapp.com/#/login");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username , String password) {
		
		login= new Login_Page(driver);
		
		login.emailIdTxt(username);
		login.passwordTxt(password);
	
	}

	@When("click on login")
	public void click_on_login() {
		
		login.loginBtn();
	}
	

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	   
		login.homePage();
	}


}
