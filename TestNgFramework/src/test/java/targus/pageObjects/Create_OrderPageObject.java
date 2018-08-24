package targus.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import targus.pageLocators.CreateOrderPageLocators;

public class Create_OrderPageObject {

	private static WebElement element = null;

	public static WebElement CreateOrderButton(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.createOrderButton);
		return element;
	}

	public static WebElement DateClick(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.dateClickButton);
		return element;
	}

	public static WebElement CalendarWindow(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.calendarWindow);
		return element;
	}

	public static WebElement RightClickButton(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.RightClickButton);
		return element;
	}

	public static WebElement DeliveryAddressTextBox(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.deliveryAddressTextBox);
		return element;
	}

	public static WebElement DeliveryCityTextBox(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.deliveryCityTextBox);
		return element;
	}

	public static WebElement DeliveryPostCodeTextBox(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.deliveryPostCodeTextBox);
		return element;
	}

	public static WebElement CountrydropdownButton(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.CountrydropdownButton);
		return element;
	}

	public static WebElement CountrySelectionTextBox(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.CountrySelectionTextBox);
		return element;
	}

	public static WebElement ClickonCountry(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ClickonCountry);
		return element;
	}

	public static WebElement ConsigneeNameTextBox(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ConsigneeNameTextBox);
		return element;
	}

	public static WebElement BrandDropDownButton(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.BrandDropDownButton);
		return element;
	}

	public static WebElement BrandTextBoxSelection(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.BrandTextBoxSelection);
		return element;
	}

	public static WebElement ClickonBrand(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ClickonBrand);
		return element;
	}

	public static WebElement ApproverDropDown(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ApproverDropDown);
		return element;
	}

	public static WebElement ApproverTextBoxSelection(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ApproverTextBoxSelection);
		return element;
	}

	public static WebElement ClickonApprover(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ClickonApprover);
		return element;
	}

	public static WebElement ReasonOnRequestDropdownButton(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ReasonOnRequestDropdownButton);
		return element;
	}

	public static WebElement ReasonOnRequestFiltertextBox(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ReasonOnRequestFiltertextBox);
		return element;
	}

	public static WebElement CLickontheReasonRequestSelection(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.CLickontheReasonRequestSelection);
		return element;
	}

	public static WebElement TargusProductCodeDropDown(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.TargusProductCodeDropDown);
		return element;
	}

	public static WebElement TargusProductCodeFilterText(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.TargusProductCodeFilterText);
		return element;
	}

	public static WebElement TargusProductCodeTextBox(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.TargusProductCodeTextBox);
		return element;
	}

	public static WebElement TargusProductCodeSelection(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.TargusProductCodeSelection);
		return element;
	}

	public static WebElement QuantityTextBox(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.QuantityTextBox);
		return element;
	}

	public static WebElement SubMitButton(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.SubMitButton);
		return element;
	}

	public static WebElement placeOrderButton(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.placeOrderButton);
		return element;
	}

	public static WebElement ConfirmationYesButton(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ConfirmationYesButton);
		return element;
	}

	public static WebElement GetOrderNumber(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.GetOrderNumber);
		return element;
	}

	public static WebElement ConsigneePhoneNo(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ConsigneePhoneNo);
		return element;
	}

	public static WebElement CreateOrderText(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.CreateOrderText);
		return element;
	}

	public static WebElement OrderValuetext(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.OrderValuetext);
		return element;
	}

	public static WebElement CountryLabel(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.CountryLabel);
		return element;
	}

	public static WebElement BrandLabel(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.BrandLabel);
		return element;
	}
	
	public static WebElement ApproverLabel(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ApproverLabel);
		return element;
	}

	public static WebElement reasonforRequestLabel(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.reasonforRequestLabel);
		return element;
	}
	
	public static WebElement TargusProductCodeLabel(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.TargusProductCodeLabel);
		return element;
	}
	
	public static WebElement DescriptionLabel(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.descriptionLabel);
		return element;
	}
	
	public static WebElement costText(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.Costtext);
		return element;
	}
	
	public static WebElement LineTotalText(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.LineTotalText);
		return element;
	}
	
	public static WebElement OrderIDText(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.OrderIDText);
		return element;
	}
	
	
	
	

}
