package asahi.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import asahi.pageLocators.LoginPageLocators;




public class LoginPageObject {
	
	private static WebElement element = null;

	public static WebElement UserNameTextBox(WebDriver driver) {
		element = driver.findElement(LoginPageLocators.UsernameTextBox);
		return element;
	}
	
	public static WebElement PasswordTextBox(WebDriver driver) {
		element = driver.findElement(LoginPageLocators.PasswordtextBox);
		return element;
	}
	
	public static WebElement SignInButton(WebDriver driver) {
		element = driver.findElement(LoginPageLocators.SignInButton);
		return element;
	}
	
	
	
	
	

}
