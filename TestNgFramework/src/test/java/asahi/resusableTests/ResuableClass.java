package asahi.resusableTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;



public class ResuableClass extends asahi.testRunner.Runner {

	private static WebElement element = null;
	public static By GrowelMessage=By.xpath("//div[@class='ui-growl-message']//child::span");
	public static By POOrderNUmber=By.xpath("//html//div[1]/table[1]/tbody[1]/tr[1]/td[2]");
	public static By gridBody=By.xpath("//td[@class='m-shipto-col']");
	public static By oneRecord=By.xpath("//div[@class='m-divTotalRecords']//span[text()='1']");
	public static By recordAvailability=By.xpath("//span[contains(text(),'Total Records:')]/following-sibling::span");

	public static void MessageValidation(WebDriver driver, String text) {
		element = driver.findElement(GrowelMessage);
		
		System.out.println("Element Text ::" + element.getText());
		System.out.println("expected text :: " + text);
		
		
		if(element.getText().contains(text)) {
			System.out.println("fine");
		}
		
		
		Assert.assertTrue(element.getText().contains(text), " Validation Failed");
		logger.log(Status.INFO, MarkupHelper.createLabel("Validation Passed", ExtentColor.ORANGE));

	}

	public static String GetPORequestNumber(WebDriver driver) {
		element = driver.findElement(POOrderNUmber);
		String num = element.getText();
		return num;

	}

	public static String GetText(WebElement element,WebDriver driver) {
		String  st = element.getText();
		return st;
	}
	
	public static int getTextinINT(WebElement element, WebDriver driver) {
		String st=element.getText();
		int result=Integer.parseInt(st);
		return result;
	}

	
		

	
	

}
