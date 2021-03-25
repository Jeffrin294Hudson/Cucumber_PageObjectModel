package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PhpTravelsLocators {
	
	
	@FindBy(how=How.XPATH,using=".//nav/a[1][contains(text(),'Demo')]")
	public WebElement DemoLink;
	
	

	
	
	
	
	

}
