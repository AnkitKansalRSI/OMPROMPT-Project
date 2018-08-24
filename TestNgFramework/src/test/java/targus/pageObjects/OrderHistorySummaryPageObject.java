package targus.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import targus.pageLocators.OrderHistorySummaryLocators;

public class OrderHistorySummaryPageObject {

	private static WebElement element = null;

	public static WebElement cloneButton(WebDriver driver) {

		element = driver.findElement(OrderHistorySummaryLocators.CloneButton);
		return element;
	}

	public static WebElement soldTotext(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.soldToText);
		return element;
	}

	public static WebElement RequestByText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.RequestByText);
		return element;
	}

	public static WebElement purchaseOrderText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.purchaseOrderText);
		return element;
	}

	public static WebElement reasonforRequestText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.reasonforRequestText);
		return element;
	}

	public static WebElement RequestDateText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.RequestDateText);
		return element;
	}

	public static WebElement requestedDeliveryDate(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.requestedDeliveryDate);
		return element;
	}

	public static WebElement consigneeName(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.consigneeName);
		return element;
	}

	public static WebElement deliverAddressText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.deliverAddressText);
		return element;
	}

	public static WebElement deliverCity(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.deliverCity);
		return element;
	}

	public static WebElement deliveryPostCode(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.deliveryPostCode);
		return element;
	}

	public static WebElement approverText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.approverText);
		return element;
	}

	public static WebElement BrandText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.BrandText);
		return element;
	}

	public static WebElement consigneePhone(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.consigneePhone);
		return element;
	}

	public static WebElement targusProductCodeText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.targusProductCodeText);
		return element;
	}

	public static WebElement descriptionText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.descriptionText);
		return element;
	}

	public static WebElement Quantitytext(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.Quantitytext);
		return element;
	}

	public static WebElement CostText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.CostText);
		return element;
	}

	public static WebElement LineTotalText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.LineTotalText);
		return element;
	}

	public static WebElement totalOrderValueText(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.totalOrderValueText);
		return element;
	}

	public static WebElement totalQuanitytext(WebDriver driver) {
		element = driver.findElement(OrderHistorySummaryLocators.totalQuanitytext);
		return element;
	}

}
