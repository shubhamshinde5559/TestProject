package test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import zerodha.home;
import zerodha.login;
import zerodha.login2;

public class Test2 {

   WebDriver driver;	
	@BeforeClass
	public void launchbrowser() throws InterruptedException {
		System.out.println("Before class");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubham\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions opt =new ChromeOptions();
        opt.addArguments("--disable-notifications");
	     driver = new ChromeDriver(opt);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
	}	
		@BeforeMethod
		public void logintoApplication() throws InterruptedException {
			System.out.println("Before Method");
		
	
login log = new login(driver);
		
		log.enterUN();
		log.enterPWD();
		log.Clickbutton();
		
	    Thread.sleep(3000);
		
		login2 log2 = new login2 (driver);
		log2.enterPin();
		log2.Continue();
		
		Thread.sleep(3000);
		}
		@Test (invocationCount=2)
		public void VerifyingOrdersPage() throws InterruptedException {
			System.out.println("Test A");
			
	      home hom = new home(driver);
          hom.OR();
          String URL = driver.getCurrentUrl();
          String title = driver.getTitle();
          if (URL.equals(URL) && title.equals(title)) {
        	  System.out.println("Pass");
          }
          else {
        	  System.out.println("Fails");
          }
          Thread.sleep(2000);
		}
          @Test (dependsOnMethods="VerifyingOrdersPage",priority=-1)
          public void VerifyingHoldingsPage() throws InterruptedException {
        	  System.out.println("Test B");
    	      home hom = new home(driver);
            hom.Hold();
            String URL = driver.getCurrentUrl();
            String title = driver.getTitle();
            if (URL.equals(URL) && title.equals(title)) {
          	  System.out.println("Pass");
            }
            else {
          	  System.out.println("Fails");
            }
            Thread.sleep(2000);
  		}
          
          @Test (priority=-2)
          public void VerifyingPositionsPage() throws InterruptedException {
        	  System.out.println("Test C");
    	      home hom = new home(driver);
            hom.Pos();
            String URL = driver.getCurrentUrl();
            String title = driver.getTitle();
            if (URL.equals(URL) && title.equals(title)) {
          	  System.out.println("Pass");
            }
            else {
          	  System.out.println("Fails");
            }
            Thread.sleep(2000);
  		}
          
          @Test
          public void VerifyingFundsPage() throws InterruptedException {
        	  System.out.println("Test D");
    	      home hom = new home(driver);
            hom.Fu();
            String URL = driver.getCurrentUrl();
            String title = driver.getTitle();
            if (URL.equals(URL) && title.equals(title)) {
          	  System.out.println("Pass");
            }
            else {
          	  System.out.println("Fails");
            }
            Thread.sleep(2000);
  		}
          @Test (enabled=false)
          public void VerifyingAppsPage() throws InterruptedException {
        	  System.out.println("Test E");
    	      home hom = new home(driver);
            hom.Ap();
            String URL = driver.getCurrentUrl();
            String title = driver.getTitle();
            if (URL.equals(URL) && title.equals(title)) {
          	  System.out.println("Pass");
            }
            else {
          	  System.out.println("Fails");
            }
            Thread.sleep(2000);
  		}
          
          @Test (invocationCount=2)
          public void VerifyingSensex() throws InterruptedException {
        	  System.out.println("Test F");
    	      home hom = new home(driver);
            hom.SV();
            String URL = driver.getCurrentUrl();
            String title = driver.getTitle();
            if (URL.equals(URL) && title.equals(title)) {
          	  System.out.println("Pass");
            }
            else {
          	  System.out.println("Fails");
            }
            Thread.sleep(2000);
  		}
          
          @AfterMethod
          public void aftermethod() throws InterruptedException {
        	//  Actions act = new Actions(driver);
        	// WebElement ProfileName = driver.findElement(By.xpath("//span[text()='OKP335']"));
        	// WebElement logout = driver.findElement(By.xpath("//a[@target='_self']"));
        	//  act.moveToElement(ProfileName).click().moveToElement(logout).click().build().perform();
    	      home hom = new home(driver);
               hom.PN();
        	  Thread.sleep(2000);
        	  hom.Log();
        	  hom.CU();
        	  
}
          @AfterClass
          public void afterclass() {
        	  System.out.println("afterclass");
        	  driver.close();
          }
                    

}
