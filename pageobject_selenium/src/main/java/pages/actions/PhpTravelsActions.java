package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import pages.locators.PhpTravelsLocators;
import utils.Seledriver;
import utils.SeleniumDriver;



public class PhpTravelsActions  extends SampleLocator
{

	
	
	PhpTravelsLocators y = null;
	
	
	public PhpTravelsActions()
	{
		this.y = new PhpTravelsLocators();
		
		PageFactory.initElements(SeleniumDriver.getDriver(), y);

		
		
		
	}
	
	
	
	public void clickDemoLink()
	{
		
		y.DemoLink.click();
		
	}
	
	
	
}
