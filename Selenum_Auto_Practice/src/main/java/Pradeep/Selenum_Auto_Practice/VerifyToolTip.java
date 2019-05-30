package Pradeep.Selenum_Auto_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyToolTip {

	private WebDriver driver;

	@Test(priority = 0)
	public void initialPage() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Pradeep_Pracite_Purpose2\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();

		String baseUrl = "https://www.google.com/";

		driver.get(baseUrl);

		driver.manage().window().maximize();
	}

	// @Test(priority=1)
	public void getToolTip() {
		/* assert the tooltipvalue */

		String expectedValue = "Google apps";
		WebElement tooltipMenu = driver.findElement(By.xpath("//a[@class='gb_x gb_Vb']"));

		Actions tooltipAction = new Actions(driver);
		tooltipAction.clickAndHold().moveToElement(tooltipMenu).perform();

		WebElement tooltipText = driver.findElement(By.xpath("//a[@title='Google apps']"));

		String actualValue = tooltipText.getAttribute("title");
		System.out.println("actualValue" + actualValue);

		Assert.assertEquals(actualValue, expectedValue);
	}

	@Test(priority = 2)
	public void scrollDown() throws Exception {

		WebElement googleApp_Menue = driver.findElement(By.xpath("//a[@class='gb_x gb_Vb']"));
		WebElement more_Tab = driver.findElement(By.xpath("//a[contains(text(),'More')]"));

		googleApp_Menue.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,150)", "");

		more_Tab.click();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void even_More_from_Google() throws Exception {
		WebElement evenMore_Tab = driver.findElement(By.xpath("//a[contains(text(),'Even more from Google')]"));
		evenMore_Tab.click();

		WebElement ourClient_Tab = driver.findElement(By.xpath(" //a[contains(text(),'Our products')]"));
		ourClient_Tab.click();

		WebElement getStarted_DropDown = driver
				.findElement(By.xpath("//a[@data-glue-modal-trigger='menulay-search-get-started']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,250)", "");
		getStarted_DropDown.click();

	}

}
