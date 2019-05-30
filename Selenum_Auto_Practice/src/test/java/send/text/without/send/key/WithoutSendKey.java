package send.text.without.send.key;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.properties.PropertyReader;



public class WithoutSendKey {
	
	private WebDriver driver;
    private PropertyReader reader;
	private WebDriverWait wait;

	@BeforeClass
	public void initPage() {
		reader=new PropertyReader();
		String path = System.getProperty("user.dir");
		String fireFoxDriverPath = path + "//lib//geckodriver.exe";
		String chromeDriverPath = path + "//lib//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
	}
	
	@Test(priority=0)
	public void getText() {
		WebElement textValue=driver.findElement(By.xpath("//input[@name='q']"));
		
		JavascriptExecutor googleText=(JavascriptExecutor)driver;
				
		googleText.executeAsyncScript("arguments[0].value='pradeep Hyderabad'", textValue);
		
		//Reset the text box 
				
	}
	@Test(priority=1)
  public void clearText() {
	   driver.findElement(By.cssSelector("input.gLFyf gsfi")).clear();
    }
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
