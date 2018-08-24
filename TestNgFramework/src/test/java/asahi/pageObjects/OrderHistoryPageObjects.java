package asahi.pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import asahi.pageLocators.OrderHistoryPageLocators;
import asahi.resusableTests.ResuableClass;


public class OrderHistoryPageObjects {
	
	
	
	
	private static WebElement element = null;

	public static WebElement EyeButton(WebDriver driver) {
		element = driver.findElement(OrderHistoryPageLocators.EyeButton);
		return element;
	}
	
	public static WebElement OrderNumberTextBox(WebDriver driver) {
		element = driver.findElement(OrderHistoryPageLocators.OrderNumberTextBox);
		return element;
	}
	
	public static WebElement OrderHistoryButton(WebDriver driver) {
		element = driver.findElement(OrderHistoryPageLocators.OrderHistoryButton);
		return element;
	}
	
	public static WebElement RecordsAvailability(WebDriver driver) {
		element=driver.findElement(ResuableClass.recordAvailability);
		return element;
	}
	
	
	
	public static WebElement orderStatusText(WebDriver driver) {
		element=driver.findElement(OrderHistoryPageLocators.orderStatusText);
		return element;
	}

	
	public static WebElement OrderNumber(WebDriver driver) {
		element=driver.findElement(OrderHistoryPageLocators.OrderNumber);
		return element;
	}
}
