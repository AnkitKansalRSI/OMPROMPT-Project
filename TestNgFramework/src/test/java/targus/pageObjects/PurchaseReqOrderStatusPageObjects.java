package targus.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import targus.pageLocators.PurchaseOrderReqStatusLocators;

public class PurchaseReqOrderStatusPageObjects {	
	
	private static WebElement element=null;
	
	
	public static WebElement PurchaseReStatusButton(WebDriver driver) {
		element = driver.findElement(PurchaseOrderReqStatusLocators.PurchaseReStatusButton);
		return element;
	}
	
	public static WebElement SupplierNameText(WebDriver driver) {
		element = driver.findElement(PurchaseOrderReqStatusLocators.SupplierNameText);
		return element;
	}
	
	public static WebElement RequestNumberInputBox(WebDriver driver) {
		element = driver.findElement(PurchaseOrderReqStatusLocators.RequestNumberInputBox);
		return element;
	}
	
	public static WebElement PurchaseOrderReqPageText(WebDriver driver) {
		element = driver.findElement(PurchaseOrderReqStatusLocators.PurchaseOrderReqPageText);
		return element;
	}
	
	public static WebElement TotalRecords(WebDriver driver) {
		element = driver.findElement(PurchaseOrderReqStatusLocators.TotalRecords);
		return element;
	}
	
	public static WebElement oneRecord(WebDriver driver) {
		element = driver.findElement(PurchaseOrderReqStatusLocators.oneRecord);
		return element;
	}
	
	public static WebElement TotalValue(WebDriver driver) {
		element = driver.findElement(PurchaseOrderReqStatusLocators.TotalValue);
		return element;
	}
	
	public static WebElement OrderStatusText(WebDriver driver) {
		element = driver.findElement(PurchaseOrderReqStatusLocators.OrderStatusText);
		return element;
	}
	
	public static WebElement RequestNo(WebDriver driver) {
		element = driver.findElement(PurchaseOrderReqStatusLocators.RequestNo);
		return element;
	}
	
	
	
	
	

}
