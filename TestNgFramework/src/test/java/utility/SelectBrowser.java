package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelectBrowser {
	
	public static WebDriver driver=null;
	public static void BrowserandURL(String URL, String Browser)    {
		
		
        if (Browser.contains("Firefox"))
        {
        	System.setProperty("webdriver.gecko.driver",ConfigFileUtil.FirefoxDriverCall());
            driver = new FirefoxDriver();
        }
        else if (Browser.contains("Chrome"))        	
        {
        	System.setProperty("webdriver.chrome.driver",ConfigFileUtil.ChromeDrivercall());
            driver = new ChromeDriver();
        }
        else if (Browser.contains("IE"))
        {
        	System.setProperty("webdriver.edge.driver",ConfigFileUtil.IEdrivercall());
            driver = new EdgeDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.navigate().to(URL);
    }

    public static void BrowserTearDown()
    {
    	if(driver!=null) {
    		driver.quit();	
    	}
        
    }

}
