package com.Myntra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpath {
	
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\97155\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement productcount=driver.findElement(By.xpath("//li[@class=\"product-base\"]//descendant::h4[contains(text(),'Bio Finish T-shirt')]\r\n"
			));
}
}
