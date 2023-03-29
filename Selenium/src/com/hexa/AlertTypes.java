package com.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTypes {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
	//1.Simple Alert
		//driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();      ///Doubttt
		//driver.switchTo().alert().accept();
	//1.a. Simple Delay Alert
        //driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
        //Thread.sleep(6000);
        //driver.switchTo().alert().accept();
	//2.Confirm Alert
		//driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();
		//driver.switchTo().alert().dismiss();//accept or Dismiss
	//3.Prompt Alert
        //driver.findElement(By.xpath("(//button[text()='Click me'])[4]")).click();
        //driver.switchTo().alert().sendKeys("Gopi Krish");
        //driver.switchTo().alert().dismiss();//accept or Dismiss
        
		//Gopi Topic
		JavascriptExecutor jsrefname = (JavascriptExecutor) driver; //ithu oru interface. Sometimes Selenium work agathu antha time la JavascriptExecutor vachu track panalam, most accurate
		Thread.sleep(3000);                                         //it is used interact with Javascript webElement
		WebElement scroll = driver.findElement(By.xpath("//span[text()='Modal Dialogs']"));
		//jsrefname.executeScript("arguments[0].scrollIntoView();", scroll);
		jsrefname.executeScript("window.scrollBy(0,-1000);");
		WebElement prompt = driver.findElement(By.xpath("(//button[text() = 'Click me'])[4]"));
		jsrefname.executeScript("arguments[0].click();", prompt);
		
		driver.switchTo().alert().sendKeys("Gopi Krishna");
		driver.switchTo().alert().accept();
	}

}
