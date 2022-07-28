package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert1 {
     @Test
	public void softchiku() {
		
		SoftAssert softassert = new SoftAssert();
		
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedtext= "Search";
		
		System.setProperty("webdriver.chrome.driver", "C:\\cross browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		System.out.println("PASS Case");
		softassert.assertEquals(expectedtitle, actualtitle);
		
		 String actualtext = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext);
	}
	}
