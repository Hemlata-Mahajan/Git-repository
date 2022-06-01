package com.jbk.demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class demo {
	@Test
	public void Test01(){
System.setProperty("webdriver.chrome driver", "chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("file:///C:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
Assert.assertEquals(driver.getTitle(),"JavaByKiran | Log in");
}
}
	


