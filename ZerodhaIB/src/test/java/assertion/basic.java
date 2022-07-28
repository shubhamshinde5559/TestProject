package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class basic {
	@Test
	public void titletest() {

	String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
	System.setProperty("webdriver.chrome.driver", "C:\\cross browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	String actualtilte = driver.getTitle();
	Assert.assertEquals(expectedtitle, actualtilte);
	driver.close();
	}
	}

