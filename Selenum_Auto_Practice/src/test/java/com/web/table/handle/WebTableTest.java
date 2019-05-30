package com.web.table.handle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.properties.PropertyReader;

public class WebTableTest {

	private PropertyReader propertyReader;
	private WebDriver driver;
	private WebDriverWait wait;

	@BeforeClass
	public void initPage() {
		propertyReader = new PropertyReader();
		System.setProperty("webdriver.chrome.driver", propertyReader.getDriverPath());
		driver = new ChromeDriver();
		driver.get("https://datatables.net/manual/data/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(propertyReader.getImplicitExplicitWait(), TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, propertyReader.getImplicitExplicitWait());
	}

	@Test
	public void getTableData() {

		// table->tbody->tr->td
		WebElement firstRowFirstData = driver
				.findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[1]/td[1]"));
		System.out.println(firstRowFirstData.getText());

		WebElement secondRowFifthData = driver
				.findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[2]/td[5]"));
		System.out.println(secondRowFifthData.getText());
	}

}
