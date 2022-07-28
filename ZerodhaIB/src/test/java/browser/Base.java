package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver openchromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\cross browser\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		return driver;
		}
		public static WebDriver openFireFoxBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\cross browser\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;

		}
		}

