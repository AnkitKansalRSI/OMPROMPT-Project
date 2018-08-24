package targus.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import targus.pageLocators.ApproverPageLocators;


public class ApproverPageObject {
	
	private static WebElement element = null;

	public static WebElement ApproveButton(WebDriver driver) {
		element = driver.findElement(ApproverPageLocators.ApproveButton);
		return element;
	}
	
	public static WebElement RejectButton(WebDriver driver) {
		element = driver.findElement(ApproverPageLocators.RejectButton);
		return element;
	}
	
	public static WebElement YesButton(WebDriver driver) {
		element = driver.findElement(ApproverPageLocators.OrderApprovalConfirmationYES);
		return element;
	}
	
	public static WebElement NoButton(WebDriver driver) {
		element = driver.findElement(ApproverPageLocators.OrderApprovalConfirmationNo);
		return element;
	}
	
	public static WebElement OrderValueText(WebDriver driver) {
		element = driver.findElement(ApproverPageLocators.OrderValueText);
		return element;
	}
	
	public static WebElement RejectWindow(WebDriver driver) {
		element = driver.findElement(ApproverPageLocators.RejectWindow);
		return element;
	}
	
	public static WebElement ReasonforRejectInput(WebDriver driver) {
		element = driver.findElement(ApproverPageLocators.ReasonforRejectInput);
		return element;
	}
	
	public static WebElement RejectButtonWindow(WebDriver driver) {
		element = driver.findElement(ApproverPageLocators.RejectButtonWindow);
		return element;
	}
	
	
	

}
