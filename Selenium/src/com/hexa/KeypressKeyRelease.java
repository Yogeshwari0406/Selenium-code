package com.hexa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//In Facebook application type Username then copy and paste in Password
public class KeypressKeyRelease {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\IRCTC TicketBooking\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys("Yogeshwari");
		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_Y);
//		r.keyPress(KeyEvent.VK_O);
//		r.keyPress(KeyEvent.VK_G);
//		r.keyPress(KeyEvent.VK_I);
//		r.keyRelease(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		driver.findElement(By.id("pass")).click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
	}

}
