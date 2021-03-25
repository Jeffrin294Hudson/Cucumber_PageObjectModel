package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

public class Seledriver {
	
	private static Seledriver seledriver;
	private static WebDriver driver;
	
	 //initialize timeouts
    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;
	
	private   Seledriver()
	{
		System.setProperty("webdriver.chrome.driver", "H:\\learning\\s_ws\\selenium related\\executables\\chromedriver_1.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //waitDriver = new WebDriverWait(driver, TIMEOUT);
	        //driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
	        //driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
	public static WebDriver getDriver() {
        return driver;
    }
	
	
	
	public static void setDriver()
	{
		if (seledriver == null)
				{
			seledriver = new Seledriver();
				}
		
	}
	
	 public static void tearDown() {
	        if (driver != null) {
	            driver.close();
	            driver.quit();
	        }
	        seledriver = null;
	    }

	public static void openPage(String url) {
		driver.get(url);
		
	}

	 public static void waitForPageToLoad()
	    {
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	    }
	 
	 

	public static void click(WebElement element) {
		element.click();
		
	}
	
	    }
