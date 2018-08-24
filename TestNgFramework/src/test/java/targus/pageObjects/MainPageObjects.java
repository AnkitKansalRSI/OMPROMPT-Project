package targus.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageObjects {

	private static WebElement element = null;

	public static WebElement NewBugLink(WebDriver driver) {
		element = driver.findElement(By.linkText("New"));
		return element;
	}

	public static WebElement SelectSeverity(WebDriver driver) {
		element = driver.findElement(By.id("bug_severity"));
		return element;
	}

	public static WebElement SelectPriority(WebDriver driver) {
		element = driver.findElement(By.id("priority"));
		return element;
	}

	public static WebElement WriteSummary(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='short_desc']"));
		return element;
	}

	public static WebElement SubmitaBugButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='commit']"));
		return element;
	}

	public static WebElement HeaderofPage(WebDriver driver) {
		element = driver.findElement(By.xpath("//p[contains(text(),'Bugzilla – Welcome to Bugzilla')]"));
		return element;
	}

	public static WebElement SaveChanges(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='commit_top']"));
		return element;
	}

}
