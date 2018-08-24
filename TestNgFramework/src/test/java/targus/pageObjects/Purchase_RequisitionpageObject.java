package targus.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import targus.pageLocators.PurchaseOrderReqLocators;
import targus.resusableTests.ResuableClass;

public class Purchase_RequisitionpageObject {

	private static WebElement element = null;
	private static List<WebElement> ele = null;

	public static WebElement PurchaseReqButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[text()='Purchase Requisition']"));
		return element;
	}

	public static WebElement InternalCommentsTextBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//textarea[@ng-reflect-name='internalComments']"));
		return element;
	}

	public static WebElement SupplierDropDown(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'Supplier Name & Id')]"));
		return element;
	}

	public static WebElement SupplierRefrenceText(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='supplierreference']"));
		return element;
	}

	public static WebElement SupplierNotesText(WebDriver driver) {
		element = driver.findElement(By.xpath("//textarea[@name='suppliernotes']"));
		return element;
	}

	public static WebElement descriptionText(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@class='noborder ng-pristine ng-valid ng-touched']"));
		return element;
	}

	public static WebElement SupplierDropDownArrow(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//div[@class='ng-tns-c7-4 ui-dropdown ui-widget ui-state-default ui-corner-all ui-helper-clearfix ui-dropdown-open']//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right']//span[@class='ui-clickable fa fa-fw fa-caret-down']"));
		return element;
	}

	public static WebElement SupplierText(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[contains(@class,'ui-dropdown-filter')]"));
		return element;
	}

	public static WebElement SupplierComments(WebDriver driver) {
		element = driver.findElement(By.xpath("//textarea[@autoresize='autoResize']"));
		return element;
	}

	public static WebElement GLText(WebDriver driver) {
		element = driver.findElement(By.xpath("//li[contains(@class, 'ui-dropdown-item')]"));
		return element;
	}

	public static List<WebElement> GLDropDown(WebDriver driver) {
		ele = driver.findElements(By.cssSelector(".ui-dropdown-trigger"));
		return ele;
	}

	public static List<WebElement> GLTextSelection(WebDriver driver) {
		ele = driver.findElements(By.xpath("//li[contains(@class, 'ui-dropdown-item')]"));
		return ele;
	}

	public static WebElement LineItems_Description(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//*[@id=\"view-table\"]/div/div/p-datatable/div/div[2]/table/tbody/tr[1]/td[4]/span[2]/input"));
		return element;
	}

	public static WebElement LineItems_Price(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//*[@id=\"view-table\"]/div/div/p-datatable/div/div[2]/table/tbody/tr[1]/td[5]/span[2]/input"));
		return element;
	}

	public static WebElement LineItems_Quantity(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//*[@id=\"view-table\"]/div/div/p-datatable/div/div[2]/table/tbody/tr[1]/td[6]/span[2]/input"));
		return element;
	}

	public static WebElement SubmitRequestButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Submit Request')]"));
		return element;
	}

	public static WebElement ConfirmationWindowYes(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Yes')]"));
		return element;
	}

	public static WebElement Supplier_Click(WebDriver driver) {
		element = driver.findElement(By.xpath("//li[contains(@class, 'ui-dropdown-item')]"));
		return element;
	}

	public static WebElement GrowelMessageText(WebDriver driver) {
		element = driver.findElement(ResuableClass.GrowelMessage);
		return element;
	}

	public static WebElement EmailIDTextBox(WebDriver driver) {
		element = driver.findElement(PurchaseOrderReqLocators.EmailIDTextBox);
		return element;
	}

	public static WebElement TotalOrderValue(WebDriver driver) {
		element = driver.findElement(PurchaseOrderReqLocators.TotalOrderValue);
		return element;
	}

}
