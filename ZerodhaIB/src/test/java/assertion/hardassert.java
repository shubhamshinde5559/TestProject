package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {
	@Test
	public void titletest() {   //without softassert // hard_assert

	String expectedtitle = "Electronics, artsCars, Fashion, Collectibles & More | eBay";  //we put arts in title for forcefully fail the case.
	String expectedtext ="Search";
	System.setProperty("webdriver.chrome.driver", "C:\\cross browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");

	String actualtilte = driver.getTitle();
	System.out.println("Verifying Title");

	Assert.assertEquals(expectedtitle, actualtilte,"Title Verification failed");

	String actualtext=driver.findElement(By.xpath("//*[@id='gh-btn']")).getAttribute("value");
	System.out.println("Verifying Text");

	Assert.assertEquals(actualtext, expectedtext, "Text Verification failed");

	System.out.println("Closing browser");

	driver.close();
	}
	}

