import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pages.locators.PhpTravelsLocators;
import utils.Seledriver;


public class SampleActions  {

	//static WebDriver driver ;
	SampleLocator SampleLocator=null;
	
	/*@FindBy(how=How.XPATH,using=".//nav/a[1][contains(text(),'Demo')]")
	public WebElement DemoLink;*/
	
	public SampleActions()
	{
		this.SampleLocator = new SampleLocator();
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(Seledriver.getDriver(),10);
		//this.driver = driver;
		//PageFactory.initElements(factory, this.PhpTravelsLocators);
		
		PageFactory.initElements(Seledriver.getDriver(), SampleLocator);
		
	
	}
	
	public void clickDemoLink()
	{
		//Seledriver.getDriver().findElement(By.xpath("//a[@href='https://phptravels.com/demo'][contains(text(),'Demo')]")).click();
		SampleLocator.DemoLink.click();
	}
	
	/*public  String validateDemoPage()
	{
		String ActualStringDemo =driver.getTitle();
		return ActualStringDemo;
	}*/
	
	
}
