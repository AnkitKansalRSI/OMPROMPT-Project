package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	
	public static void VisibleElement (WebDriver driver, By Locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, 1000000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
        
        //wait.until(ExpectedConditions.presenceOfElementLocated(Locator)); 
    }

    public static void ClickableElement(WebDriver driver,By Locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(Locator));
    }
    
    public static void InvisibleElement(WebDriver driver,By Locator) {
    	WebDriverWait wait=new WebDriverWait(driver,100);
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(Locator));
    }

}
