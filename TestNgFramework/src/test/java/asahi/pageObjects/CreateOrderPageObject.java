package asahi.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import asahi.pageLocators.CreateOrderPageLocators;


public class CreateOrderPageObject {
	
	private static WebElement element = null;

	public static WebElement CreateOrderButton(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.CreateOrderButton);
		return element;
	}
	
	public static WebElement ShiptoDropDown(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ShiptoDropDownButton);
		return element;
	}
	
	public static WebElement ShiptoSelection(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ShipToTexttoEnter);
		return element;
	}
	
	public static WebElement ShiptoClick(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ShipToClick);
		return element;
	}
	
	public static WebElement DateClick(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.dateClick);
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
	
	public static WebElement DeliveryInstructionTextBox(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.DeliveryInstructionTextBox);
		return element;
	}
	
	public static WebElement ProductCodeDropDown(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ProductCodeDropDown);
		return element;
	}
	
	public static WebElement ProductCodeTextBox(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ProductCodeTextBox);
		return element;
	}
	
	public static WebElement ProductCodeSelect(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ProductCodeSelect);
		return element;
	}
	
	public static WebElement UOMDropDown(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.UOMDropDown);
		return element;
	}
	
	public static WebElement UOMFilterTextBox(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.UOMFilterTextBox);
		return element;
	}
	
	public static WebElement SubmitOrderButton(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.SubmitOrderButton);
		return element;
	}
	
	public static WebElement UOMSelection(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.UOMSelection);
		return element;
	}
	
	public static WebElement shipTotextLabel(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.shipTotextLabel);
		return element;
	}
	
	
	public static WebElement productCodetext(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.productCodetext);
		return element;
	}
	
	public static WebElement descriptionText(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.productCodetext);
		return element;
	}
	
	public static WebElement UOMText(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.productCodetext);
		return element;
	}	
	
	public static WebElement KegPickUpDropdownButton1(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.KegPickUpDropdownButton1);
		return element;
	}
	
	public static WebElement KegPickUpDropdownButton2(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.KegPickUpDropdownButton2);
		return element;
	}
	
	public static WebElement KegPickUpDropdownButton3(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.KegPickUpDropdownButton3);
		return element;
	}
	
	public static WebElement KegPickUpDropdownButton4(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.KegPickUpDropdownButton4);
		return element;
	}
	
	public static WebElement KegPickupinputBox1(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.KegPickupinputBox1);
		return element;
	}
	
	public static WebElement KegPickupinputBox2(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.KegPickupinputBox2);
		return element;
	}
	
	public static WebElement KegPickupinputBox3(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.KegPickupinputBox3);
		return element;
	}
	
	public static WebElement KegPickupinputBox4(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.KegPickupinputBox4);
		return element;
	}
	
	public static WebElement KegPickupClick1(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.KegPickupClick1);
		return element;
	}
	
	public static WebElement KegPickupClick2(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.KegPickupClick2);
		return element;
	}
	
	public static WebElement KegPickupClick3(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.KegPickupClick3);
		return element;
	}
	
	public static WebElement KegPickupClick4(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.KegPickupClick4);
		return element;
	}
	
	public static WebElement plusSign1(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.plusSign1);
		return element;
	}
	
	public static WebElement minusSign1(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.minusSign1);
		return element;
	}
	
	public static WebElement plusSign2(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.plusSign2);
		return element;
	}
	
	public static WebElement minusSign2(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.minusSign2);
		return element;
	}
	
	public static WebElement plusSign3(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.plusSign3);
		return element;
	}
	
	public static WebElement minusSign3(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.minusSign3);
		return element;
	}
	
	public static WebElement plusSign4(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.plusSign4);
		return element;
	}
	
	public static WebElement minusSign4(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.minusSign4);
		return element;
	}	
	
	public static WebElement tablePlusSign1(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.tablePlusSign1);
		return element;
	}
	
	public static WebElement tablePlusSign2(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.tablePlusSign2);
		return element;
	}
	
	public static WebElement tablePlusSign3(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.tablePlusSign3);
		return element;
	}
	
	public static WebElement ProductCodeDropDown1(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ProductCodeDropDown1);
		return element;
	}
	
	public static WebElement ProductCodeTextBox1(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ProductCodeTextBox1);
		return element;
	}
	
	public static WebElement ProductCodeSelect1(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ProductCodeSelect1);
		return element;
	}
	
	public static WebElement UOMDropDown1(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.UOMDropDown1);
		return element;
	}
	
	public static WebElement UOMFilterTextBox1(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.UOMFilterTextBox1);
		return element;
	}
	
	public static WebElement UOMSelection1(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.UOMSelection1);
		return element;
	}
	
	public static WebElement ProductCodeDropDown2(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ProductCodeDropDown2);
		return element;
	}
	
	public static WebElement ProductCodeTextBox2(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ProductCodeTextBox2);
		return element;
	}
	
	public static WebElement ProductCodeSelect2(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.ProductCodeSelect2);
		return element;
	}
	
	public static WebElement UOMDropDown2(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.UOMDropDown2);
		return element;
	}
	
	public static WebElement UOMFilterTextBox2(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.UOMFilterTextBox2);
		return element;
	}
	
	public static WebElement UOMSelection2(WebDriver driver) {
		element = driver.findElement(CreateOrderPageLocators.UOMSelection2);
		return element;
	}
	
	
	
	
	
	
}
