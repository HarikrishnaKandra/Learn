package Runner;


import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "D:\\Workplace\\E2E\\src\\test\\java\\Features\\Login.feature", //the path of the feature files
                  glue={"Gluecode"}, //the path of the step definition files
                  format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
                 monochrome = true//display the console output in a proper readable format
)
@Test
public class testngrunner extends AbstractTestNGCucumberTests
{

}
