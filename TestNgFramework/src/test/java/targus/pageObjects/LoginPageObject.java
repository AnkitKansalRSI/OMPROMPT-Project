package targus.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	private static WebElement element = null;

	public static WebElement Username(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='inputEmail3']"));
		return element;
	}

	public static WebElement Password(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='inputPassword3']"));
		return element;
	}

	public static WebElement SignIn_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
		return element;
	}

	
}
