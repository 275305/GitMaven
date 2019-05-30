package data.provider.by.parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.properties.PropertyReader;

public class ParameterWithTestngXml {
	private PropertyReader propertyReader;
	private WebDriver driver;
	private WebDriverWait wait;
	
	@BeforeTest
	public void initPage() {
		propertyReader = new PropertyReader();
		System.setProperty("webdriver.chrome.driver", propertyReader.getDriverPath());
		driver = new ChromeDriver();
		driver.get(propertyReader.getApplicationURL());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(propertyReader.getImplicitExplicitWait(), TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, propertyReader.getImplicitExplicitWait());
	}
	
	@Test
	@Parameters({"empName","empAddress"})
	public void testParameterWithXml(String empName,String empAddress) {
		
		System.out.println("empname="+empName+"empAddress="+empAddress);
		
	}


}
