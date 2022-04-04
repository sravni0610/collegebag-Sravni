package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = "@Students",
		
		features = "src\\test\\resources\\functionaltests",
				glue= {"stepDefinition"}
		)

public class TestRunner {

}
