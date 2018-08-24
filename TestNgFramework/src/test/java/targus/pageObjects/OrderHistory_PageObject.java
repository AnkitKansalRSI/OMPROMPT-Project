package targus.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import targus.pageLocators.OrderHistoryPageLocators;
import targus.resusableTests.ResuableClass;

public class OrderHistory_PageObject {
	
	
	private static WebElement element = null;

	public static WebElement orderHistoryButton(WebDriver driver) {
		
		element=driver.findElement(OrderHistoryPageLocators.orderHistoryButton);		
		return element;
	}
	
	
	public static WebElement Viewlabel(WebDriver driver) {
		element=driver.findElement(OrderHistoryPageLocators.viewLabel);
		return element;
	}
	
	public static WebElement orderNumberTextbox(WebDriver driver) {
		element=driver.findElement(OrderHistoryPageLocators.orderNumberTextbox);
		return element;
	}
	
	public static WebElement RecordsAvailability(WebDriver driver) {
		element=driver.findElement(ResuableClass.recordAvailability);
		return element;
	}

	
	public static WebElement orderHistorytext(WebDriver driver) {
		element=driver.findElement(OrderHistoryPageLocators.orderHistorytext);
		return element;
	}
	
	public static WebElement statusText(WebDriver driver) {
		element=driver.findElement(OrderHistoryPageLocators.statusText);
		return element;
	}
	
	public static WebElement viewButton(WebDriver driver) {
		element=driver.findElement(OrderHistoryPageLocators.viewButton);
		return element;
	}
	
	public static WebElement requestByText(WebDriver driver) {
		element=driver.findElement(OrderHistoryPageLocators.RequestByText);
		return element;
	}
	
	
	
}
