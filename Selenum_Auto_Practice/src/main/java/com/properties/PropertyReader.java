package com.properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class PropertyReader {

	private final String propertyFilePath = "configs\\Configration.properties";
	BufferedReader br;
	private Properties properties;

	public PropertyReader() {

		try {
			br = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(br);
			} catch (IOException e) {

				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}// constructor close

	public String getUploadUrl() {
		String urlUpload = properties.getProperty("urlUpload");
		if (urlUpload != null)
			return urlUpload;
		else
			throw new RuntimeException("url is not specified in configration.properties file");
	}

	public String getApplicationURL() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("ulr not specified in configration.properties file");
	}

	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath not specified in configration.properties file");
	}

	public long getImplicitExplicitWait() {
		String implicitWait = properties.getProperty("implicitlywait");
		if (implicitWait != null)
			return Long.parseLong(implicitWait);
		else
			throw new RuntimeException("implicitwait not specified in configration.properties file");
	}

	public String roundTrip() {
		String roundTrip = properties.getProperty("roundtrip");
		if (roundTrip != null)
			return roundTrip;
		else
			throw new RuntimeException("round trip is not specified in configration.properties file");

	}

	public String chooseFileTab() {
		return properties.getProperty("chooseFileTab");

	}
    public String chooseCheckBox() {
    	return properties.getProperty("chooseCheckBox");
    }
    public String submitFileTab() {
    	return properties.getProperty("submitFileTab");
    }
	public List<WebElement> roundtrep() {
		String str1 = properties.getProperty("roundtrip");

		return null;

	}

}
