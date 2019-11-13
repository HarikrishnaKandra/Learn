package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Workplace\\E2E\\src\\test\\java\\Features\\Login.feature", //the path of the feature files
		glue={"Gluecode"}, //the path of the step definition files
		format= {"pretty","html:test-outout"},
		plugin = {"html:target/myreport"},
		monochrome = true//display the console output in a proper readable format		
		)
public class Runner {

}
