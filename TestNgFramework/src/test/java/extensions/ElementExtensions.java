package extensions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementExtensions {

	public static void EnterText(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static boolean IsDisplayed(WebElement element) {
		boolean result;
		try {
			result = element.isDisplayed();

		} catch (Exception e) {
			result = false;

		}

		return result;
	}

	public static void ClickOnIt(WebElement element) {
		element.click();

	}
	
	public static void ClickonListElement(List<WebElement> ele,int index) {
		ele.get(index).click();
	}

	public static void SelectByText(WebElement element, String text) {
		Select oSelect = new Select(element);
		oSelect.selectByVisibleText(text);

	}

	public static void SelectByIndex(WebElement element, int index) {
		Select oSelect = new Select(element);
		oSelect.selectByIndex(index);
	}

	public static void SelectByValue(WebElement element, String text) {
		Select oSelect = new Select(element);
		oSelect.selectByValue(text);

	}
	
	

}
