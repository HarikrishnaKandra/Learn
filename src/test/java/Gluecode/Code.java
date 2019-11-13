package Gluecode;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Code 
{   public WebDriver driver;
    public Scenario scenario;
@Given("^user should login the  application$")
	public void user_should_login_the_application() throws Throwable
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\New folder (2)\\chromedriver.exe") ;
	   driver= new ChromeDriver();
	   driver.get("http://www.gmail.com");
	  driver.manage().window().maximize();
	
	   
   }
	/*@After
	public void closeBrowser (Scenario scenario) throws IOException
	{
	if (scenario.isFailed()) 
	{
		   try 
		   {
		    byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    File screenshot_with_scenario_name = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(screenshot_with_scenario_name,new File("./target/test-report/" + scenario.getName() + ".png"));
		    System.out.println(scenario.getName());
		    scenario.embed(screenshot, "image/png");
		   } catch (WebDriverException somePlatformsDontSupportScreenshots) 
		   {
		    System.err.println(somePlatformsDontSupportScreenshots.getMessage());
		   }
}

	}*/
	@When("^Enter the user name$")
	public void enter_the_user_name() throws Throwable
	{
	 driver.findElement(By.id("identifierId")).sendKeys("Hari");
	 
	    byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    File screenshot_with_scenario_name = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot_with_scenario_name,new File("./target/test-report/" + scenario.getName() + ".png"));
	    System.out.println(scenario.getName());
	    scenario.embed(screenshot, "image/png");
	 
	}
}
