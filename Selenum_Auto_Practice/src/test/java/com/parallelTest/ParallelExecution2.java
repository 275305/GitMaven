package com.parallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.properties.PropertyReader;

public class ParallelExecution2 {

	private WebDriver driver;
	private PropertyReader reader;

	@BeforeClass
	public void initPage() {
		reader = new PropertyReader();
		String path = System.getProperty("user.dir");
		String fireFoxDriverPath = path + "//lib//geckodriver.exe";
		String chromeDriverPath = path + "//lib//chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		String baseUrl = "https://s1.demo.opensourcecms.com/wordpress/wp-login.php";
		/* driver.get(baseUrl); */
		driver.navigate().to(baseUrl);
	}

	@Test
	public void testSuit() {

		WebElement userNameLoginPage = driver.findElement(By.xpath("//input[@id='user_login']"));
		userNameLoginPage.sendKeys("opensourcecms");
		WebElement userPasswordLoginPage = driver.findElement(By.xpath("//input[@id='user_pass']"));
		userPasswordLoginPage.sendKeys("opensourcecms");
	}

}
