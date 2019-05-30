package com.internetExplorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InternetExplorerDemo {
	String driverPath = "https://www.google.com/";
    public WebDriver driver;

    @BeforeClass
    public void startBrowser() {
        System.setProperty("webdriver.ie.driver", "E:\\Pradeep_Pracite_Purpose2\\IE32bitttt\\IEDriverServer.exe");
        
        driver = new InternetExplorerDriver();
        //driver.manage().window().maximize();
          

    }

    @Test
    public void navigateToUrl() {
        driver.get("https://www.google.com/");
    }

    @AfterClass
    public void endTest() {
        driver.close();
    }



}
