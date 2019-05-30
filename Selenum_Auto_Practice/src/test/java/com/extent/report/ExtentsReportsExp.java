package com.extent.report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.properties.PropertyReader;

public class ExtentsReportsExp {
	private WebDriver driver;
    private PropertyReader reader;
	@BeforeClass
	public void initPage() {
		reader=new PropertyReader();
		String path = System.getProperty("user.dir");
		String fireFoxDriverPath = path + "//lib//geckodriver.exe";
		String chromeDriverPath = path + "//lib//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get(reader.getApplicationURL());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test(priority = 0)
	public void getPassExtentReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/pradeepReport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("LoginTest");
		logger.log(Status.INFO, "login to google");

		logger.log(Status.PASS, "login to google verified");
		extent.flush();
		System.out.println("This is my extents reports");

		ExtentTest logger1 = extent.createTest("LoginTest");
		logger1.log(Status.FAIL, "login to google fail");
		extent.flush();
	}

}
