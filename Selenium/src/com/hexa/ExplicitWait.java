package com.hexa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Eclipse-22-23\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement UN = driver.findElement(By.id("email"));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement e = w.until(ExpectedConditions.visibilityOf(UN));
		e.sendKeys("Yogi");
	}

}
