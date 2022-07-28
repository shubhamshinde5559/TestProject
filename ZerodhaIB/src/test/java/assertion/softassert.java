package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	@Test
	public void titletest() {
	         SoftAssert softassert = new SoftAssert();
	         
	String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
	String expectedtext ="Search";
	System.setProperty("webdriver.chrome.driver", "C:\\cross browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	String actualtilte = driver.getTitle();
	System.out.println("Verifying Title");
	softassert.assertEquals(expectedtitle, actualtilte,"Title Verification Passed");

	String actualtext=driver.findElement(By.xpath("//*[@id='gh-btn']")).getAttribute("value");
	System.out.println("Verifying Text");
	softassert.assertEquals(actualtext, expectedtext, "Text Verification passed");

	System.out.println("Closing browser");
	driver.close();
	softassert.assertAll();
	}
	}

