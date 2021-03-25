package steps;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.PhpTravelsActions;
import utils.Seledriver;
import utils.SeleniumDriver;


public class Demo {
	
	
	PhpTravelsActions x; 
	
	
	
	
	@After
    public static void tearDown(Scenario scenario) {
    	
    	WebDriver driver=Seledriver.getDriver();
    	System.out.println(scenario.isFailed());
    	 if (scenario.isFailed()) {
             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshotBytes, "image/png");
          
         }
    	 SeleniumDriver.tearDown();
    }

	
	@Given("^I am on the home page \"([^\"]*)\"$")
	public void i_am_on_the_home_page(String url)  
	{
		SeleniumDriver.setUpDriver();
		SeleniumDriver.openPage(url);
		
		
	    	}


	@And("^I click on Demo link$")
	public void i_click_on_Demo_link()  {
		
		x	= new PhpTravelsActions();
		x.clickDemoLink();
	}

	

}
