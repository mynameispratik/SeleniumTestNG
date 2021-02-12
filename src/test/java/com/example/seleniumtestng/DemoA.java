package com.example.seleniumtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoA {

	public WebDriver driver;

	@Test(priority = 0)
	public void search() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("yahoo");
		driver.findElement(By.name("btnK")).submit();
	}

	@Test(priority = 1)
	public void javaTPoint() throws Exception {
		driver.get("http://www.javatpoint.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 5000)");
		driver.findElement(By.linkText("Core")).click();//for test to pass "Core Java".

	}

}
