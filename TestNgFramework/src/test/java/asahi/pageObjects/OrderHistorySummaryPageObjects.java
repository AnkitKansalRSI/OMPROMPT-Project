package asahi.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import asahi.pageLocators.OrderHistorySummaryPageLocators;

public class OrderHistorySummaryPageObjects {	
	
	
	private static WebElement element = null;

	public static WebElement orderSummaryText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryPageLocators.orderSummaryText);
		return element;
	}
	
	public static WebElement soldTotext(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryPageLocators.soldTotext);
		return element;
	}
	
	public static WebElement requestByText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryPageLocators.requestByText);
		return element;
	}
	
	public static WebElement purchaseOrderText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryPageLocators.purchaseOrderText);
		return element;
	}
	
	public static WebElement requestedDeliveryDate(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryPageLocators.requestedDeliveryDate);
		return element;
	}
	
	public static WebElement shipTotext(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryPageLocators.shipTotext);
		return element;
	}
	
	public static WebElement transportTypeText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryPageLocators.transportTypeText);
		return element;
	}
	
	public static WebElement DeliveryInstruactions(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryPageLocators.DeliveryInstruactions);
		return element;
	}
	
	public static WebElement TotalQuantityText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryPageLocators.TotalQuantityText);
		return element;
	}
	
	public static WebElement CloneButton(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryPageLocators.CloneButton);
		return element;
	}

}
