
import utils.Seledriver;

public class SampleDemo {

	public static void main(String[] args) {

		
		
		Seledriver.setDriver();
		Seledriver.openPage("https://phptravels.com");
		
		
		SampleActions x = new SampleActions();
		
		x.clickDemoLink();
		
		
		

		/*driver.findElement(By.xpath("/html/body/header/div/nav/a[1]")).click();

		String ActualStringPricing =driver.getTitle();
		String ExpectedStringPricing  = "Demo Script Test drive - PHPTRAVELS";
		if (ActualStringPricing.equals(ExpectedStringPricing))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");*/
		}
	}


