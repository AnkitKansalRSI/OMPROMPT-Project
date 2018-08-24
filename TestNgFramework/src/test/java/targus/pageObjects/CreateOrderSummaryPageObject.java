package targus.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import targus.pageLocators.CreateOrderSummaryPageLocators;

public class CreateOrderSummaryPageObject {

	private static WebElement element = null;

	public static WebElement soldTotext(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.soldToText);
		return element;
	}

	public static WebElement RequestByText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.RequestByText);
		return element;
	}

	public static WebElement purchaseOrderText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.purchaseOrderText);
		return element;
	}

	public static WebElement reasonforRequestText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.reasonforRequestText);
		return element;
	}

	public static WebElement RequestDateText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.RequestDateText);
		return element;
	}

	public static WebElement requestedDeliveryDate(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.requestedDeliveryDate);
		return element;
	}

	public static WebElement consigneeName(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.consigneeName);
		return element;
	}

	public static WebElement deliverAddressText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.deliverAddressText);
		return element;
	}

	public static WebElement deliverCity(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.deliverCity);
		return element;
	}

	public static WebElement deliveryPostCode(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.deliveryPostCode);
		return element;
	}
	
	public static WebElement approverText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.approverText);
		return element;
	}
	
	public static WebElement BrandText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.BrandText);
		return element;
	}
	
	public static WebElement consigneePhone(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.consigneePhone);
		return element;
	}
	
	public static WebElement targusProductCodeText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.targusProductCodeText);
		return element;
	}
	
	public static WebElement descriptionText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.descriptionText);
		return element;
	}
	
	public static WebElement Quantitytext(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.Quantitytext);
		return element;
	}
	
	public static WebElement CostText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.CostText);
		return element;
	}
	
	public static WebElement LineTotalText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.LineTotalText);
		return element;
	}
	
	public static WebElement totalOrderValueText(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.totalOrderValueText);
		return element;
	}
	
	public static WebElement totalQuanitytext(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.totalQuanitytext);
		return element;
	}
	
	public static WebElement placeOrderButton(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.placeOrderButton);
		return element;
	}
	
	public static WebElement CurrencyLabel(WebDriver driver) {
		element = driver.findElement(CreateOrderSummaryPageLocators.CuurencyLabel);
		return element;
	}
	
	

}
