package data.driven.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PhpTravels {
	WebDriver driver;
	
	@BeforeClass
	public void initialPage() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Pradeep_Pracite_Purpose2\\Chrome\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		 String baseUrl="https://phptravels.com/";
		 
		 driver.get(baseUrl);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		
		
	}
	
	@Test(priority=0)
	public void clickOnPopUp() throws Exception{
		   WebElement noThanksButton=driver.findElement(By.xpath("//button[contains(text(),'No Thanks')]"));
		    noThanksButton.click();
		    Actions actions=new Actions(driver);
		    //actions.sendKeys(Keys.ESCAPE).build().perform();
		    
		    WebElement closeCrossWindowpopup=driver.findElement(By.xpath("//div[@class='mc-closeModal']"));
		    
		    closeCrossWindowpopup.click();
		    System.out.println("close cross_popup");
		    Thread.sleep(3000);
	}
	@Test(priority=1)
	public void featureMenu()throws Exception {
		Actions action=new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//nav[@id='main-menu']//span[contains(text(),'Features')]"))).build().perform();
		System.out.println("feature menu");
		 Thread.sleep(3000);
		
	}
	@Test(priority=2)
	public void hotelModuleFeature() throws Exception {
		WebElement hotelLinkFeature=driver.findElement(By.xpath("//a[contains(text(),'Hotels Module')]"));
		 hotelLinkFeature.click();
		Thread.sleep(3000);
		
		WebElement pricingLinkHotelModule=driver.findElement(By.xpath("//span[@class='hero-slogan']//b[text()='Pricing']"));
		pricingLinkHotelModule.click();
		Thread.sleep(3000);
		
	}
	
	
	
	@AfterClass
	public void tearDown()throws Exception {
		
		driver.quit();
		
		Thread.sleep(4000);
		
	}
	
	

}
