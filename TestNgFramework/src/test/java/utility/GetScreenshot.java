package utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class GetScreenshot {

	public static String Capture(WebDriver driver, String ScreenshotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "/ErrorScreenshots/" + ScreenshotName
				+ System.currentTimeMillis() + ".png";
		File destination = new File(dest);
		Files.copy(source, destination);
		return dest;
	}

}
