package com.usa.crossbrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Snippet {
	@Test
	public void mytest() throws MalformedURLException  {
	WebDriver driver;
	DesiredCapabilities capability = DesiredCapabilities.chrome();
	//capability.setBrowserName("firefox");
	capability.setPlatform(Platform.WIN10);
	URL url = new URL ("http://localhost:4444/wd/hub");
	driver = new RemoteWebDriver(url, capability);
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	}}
