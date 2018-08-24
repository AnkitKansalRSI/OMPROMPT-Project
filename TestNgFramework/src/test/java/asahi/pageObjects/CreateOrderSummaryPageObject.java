package asahi.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import asahi.pageLocators.CreateOrderSummaryPageLocators;

public class CreateOrderSummaryPageObject {	
	
	private static WebElement element = null;

	public static WebElement SoldToText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.SoldToText);
		return element;
	}
	
	public static WebElement RequestByText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.RequestByText);
		return element;
	}
	
	public static WebElement PurchaseOrderText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.PurchaseOrderText);
		return element;
	}
	
	public static WebElement RequestedDeliveryDate(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.RequestedDeliveryDate);
		return element;
	}
	
	public static WebElement TransportTypeText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.TransportTypeText);
		return element;
	}
	
	public static WebElement ShipToText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.ShipToText);
		return element;
	}
	
	public static WebElement TotalQuantityText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.TotalQuantityText);
		return element;
	}
	
	public static WebElement PlaceOrderButton(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.PlaceOrderButton);
		return element;
	}
	
	public static WebElement YesButton(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.YesButton);
		return element;
	}

	public static WebElement OrderSubmissionWindow(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.OrderSubmissionWindow);
		return element;
	}
	
	public static WebElement DeliveryInstructionsText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.DeliveryInstructionsText);
		return element;
	}
}
