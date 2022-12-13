package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
		plugin = {"pretty", "html:target/registraion.html"}, //reporting purpose
		monochrome=true,  //console output
		//tags = "@registration or @login", //tags from feature file
		features = {"src/test/resources/features/registration.feature"}, //location of feature files
		glue= "stepDefination") //location of step definition files


public class TestRunner {

}