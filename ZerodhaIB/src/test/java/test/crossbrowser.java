package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Base;
import zerodha.home;
import zerodha.login;
import zerodha.login2;

public class crossbrowser extends Base {

	WebDriver driver;
	 login log;
	 login2 log2;
	@BeforeTest
	@Parameters("browser")
	
	public void launchBrowser(String Browser) {
		System.out.println("Before Test");
		
		
		if(Browser.equals(("Chrome"))) {
			driver= openchromeBrowser();	
		}
		else if (Browser.equals(("Firefox"))) {
			driver= openFireFoxBrowser();
		
	}
	}	
	
	@BeforeClass
	public void POMobject() {
		 log = new login(driver);	
		 log2 = new login2(driver);
	}
		
	
		
		@BeforeMethod
		public void loginToApplication() throws InterruptedException {
			System.out.println("before method");
			driver.get("https://kite.zerodha.com/");
			log.enterUN();
			log.enterPWD();
			log.Clickbutton();
			Thread.sleep(2000);
			log2.enterPin();
			log2.Continue();
		}
@Test
  public void VerifyingOrdersPage() throws InterruptedException {
   System.out.println("testA");
   
   
   String url = driver.getCurrentUrl();
   String title = driver.getTitle();
   
   if(url.equals("") && title.equals(""))
   {
    System.out.println("PASS");
   }
   else
   {
    System.out.println("FAIL");
   }
   Thread.sleep(2000);
  }
  
  @Test
  public void VerifyingHoldingsPage() throws InterruptedException {
   System.out.println("testB");
   
   
   String url = driver.getCurrentUrl();
   String title = driver.getTitle();
   
   if(url.equals("") && title.equals(""))
   {
    System.out.println("PASS");
   }
   else
   {
    System.out.println("FAIL");
   }
   Thread.sleep(2000);
  }
  
  @Test
  public void VerifyingPositionsPage() throws InterruptedException {
   System.out.println("testB");
   
   String url = driver.getCurrentUrl();
   String title = driver.getTitle();
   
   
   if(url.equals("") && title.equals(""))
   {
    System.out.println("PASS");
   }
   else
   {
    System.out.println("FAIL");
   }
   Thread.sleep(2000);
   
  }
  
  @AfterMethod
  public void aftermethod() throws InterruptedException {
   System.out.println("After method");
   home hom = new home(driver);
   hom.PN();
   Thread.sleep(2000);
  hom.Log();
  Thread.sleep(2000);
  hom.CU();
  
  }
  
  @AfterClass
  public void afterclass() {
   System.out.println("After class");
    log =null;
    log2 = null;
   
  }
  
  @AfterTest
  public void closeBrowser1() {
   
   driver.quit();
   driver = null;
  System.gc();
   
   
  }
	
	

}
	

