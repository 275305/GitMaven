package data.provider.by.parameter;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.properties.PropertyReader;
public class DataProviderByParameter {

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

	@Test(dataProvider = "empDetails")
	public void testData(String empName, String empAddress) {

		System.out.println("empname=" + empName + "empDetails" + empAddress);

	}

	@DataProvider(name = "empDetails")
	public Object[][] getDataFromDataProvider() {
		return new Object[][] {

				{ "Smith", "USA" }, { "Jhon", "UK" }, { "Scoot", "IND" } };
	}

}
