package com.crossBrowser;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class IEBrowser {
	File f=new File("src/test/java");
	
	File fs=new File(f,"IEDriverServer.exe");
	
	@Test
	public void ieTest() throws InterruptedException {
		//System.setProperty("webdriver.ie.driver", "fs");
		//System.setProperty("webdriver.ie.driver","E:\\Pradeep_Pracite_Purpose2\\IEDriver\\IEDriver3.14\\IEDriverServer.exe");
		
		System.setProperty("webdriver.ie.driver", "E:\\Pradeep_Pracite_Purpose2\\IEDriver\\IE64bit\\IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver","E:\\Pradeep_Pracite_Purpose2\\IEDriver\\IE32BitLatest\\IEDriverServer.exe");
		
		/*DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
	    */  WebDriver driver=new InternetExplorerDriver();
	           
	      driver.get("Keys.DELETE");
	    driver.get("https://www.google.com/");
	    //driver.navigate().to("https://www.google.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	       
	       
	}

}
