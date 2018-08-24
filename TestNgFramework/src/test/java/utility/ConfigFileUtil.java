package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigFileUtil {

	public static Properties prop = null;

	public static void ConfigurationSettings() {

		try {
			File src = new File("./config.properties");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception==>" + e.getMessage());
		}

	}

	public static String TargusURLAddressDEV() {
		ConfigurationSettings();
		String url = prop.getProperty("TargusURLDEV");
		return url;
	}
	
	public static String TargusURLAddressSIT() {
		ConfigurationSettings();
		String url = prop.getProperty("TargusURLSIT");
		return url;
	}
	
	
	public static String AsahiURLAddressSIT() {
		ConfigurationSettings();
		String url = prop.getProperty("AsahiURLSIT");
		return url;
	}
	
	public static String AsahiURLAddressDEV() {
		ConfigurationSettings();
		String url = prop.getProperty("AsahiURLDEV");
		return url;
	}
	
	

	public static String Browser() {
		ConfigurationSettings();
		String browser = prop.getProperty("Browser");
		return browser;
	}

	public static String ScreenshotPath() {
		ConfigurationSettings();
		String screenpath = prop.getProperty("ScreenshotPath");
		return screenpath;
	}

	public static String IEdrivercall() {
		ConfigurationSettings();
		String iedriver = prop.getProperty("IEDriver");
		return iedriver;
	}

	public static String FirefoxDriverCall() {
		ConfigurationSettings();
		String firefoxdriver = prop.getProperty("FireFoxDriver");
		return firefoxdriver;
	}

	public static String ChromeDrivercall() {
		ConfigurationSettings();
		String chromedriver = prop.getProperty("ChromeDriver");
		return chromedriver;
	}
	
	public static String TargusNormalUSername() {
		ConfigurationSettings();
		String User=prop.getProperty("TargusUserName");
		return User;
	}
	
	public static String TargusNormalPassword() {
		ConfigurationSettings();
		String Pass=prop.getProperty("TargusPassword");
		return Pass;
	}
	
	public static String AsahiNormalUserName() {
		ConfigurationSettings();
		String Pass=prop.getProperty("AsahiUserName");
		return Pass;
	}
	
	public static String AsahiNormalPassword() {
		ConfigurationSettings();
		String Pass=prop.getProperty("AsahiPassword");
		return Pass;
	}
	
	public static String ApproverUSername() {
		ConfigurationSettings();
		String User=prop.getProperty("ApproverUsername");
		return User;
	}
	
	public static String ApproverPassword() {
		ConfigurationSettings();
		String User=prop.getProperty("ApproverPassword");
		return User;
	}
	
	public static String ApproverURL() {
		ConfigurationSettings();
		String User=prop.getProperty("ApproverorRejectURL");
		return User;
	}
	
	public static String Environment() {
		ConfigurationSettings();
		String User=prop.getProperty("Environment");
		return User;
	}
	
	

}
