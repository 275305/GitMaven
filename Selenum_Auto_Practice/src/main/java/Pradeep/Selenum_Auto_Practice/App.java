package Pradeep.Selenum_Auto_Practice;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 

{     static WebDriver driver;
    public static void main( String[] args )
    {
    	
 	    App app=new App();
 	    
 	    app.initialPage();
 	    app.getDemoMenu();
 	    
 	    app.teatDown();
 	      
 	      
 	     
    }
    
    
    public  void initialPage() {
    	System.setProperty("webdriver.chrome.driver","E:\\Pradeep_Pracite_Purpose2\\Chrome\\chromedriver.exe");
  	   
   	   driver=new ChromeDriver();
   	 String baseUrl="https://phptravels.com/";
     	driver.get(baseUrl);   
    
   	      //to maximize window
   	      /*ChromeOptions options=new ChromeOptions();
   	      options.addArguments("--start-maximized");
   	      driver=new ChromeDriver(options);*/
   	    
   	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    public void getDemoMenu() {
    	
    	WebElement demoTab=driver.findElement(By.xpath("//li[@class='user-login']//a[contains(text(),'Demo')]"));
    	   demoTab.click();
    	   
    	   WebElement checkoutPricing=driver.findElement(By.xpath("//span[@class='hero-slogan']//b[text()='Pricing']"));
                 
              checkoutPricing.click();
    }
    public  void teatDown() {
    	 driver.quit();
    	
    }
}
