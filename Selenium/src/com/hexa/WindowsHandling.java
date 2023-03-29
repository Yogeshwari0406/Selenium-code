package com.hexa;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement Search = driver.findElement(By.name("keyword"));
	    Search.sendKeys("iPhone",Keys.ENTER);
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("(//img[@class='product-image'])[1]")).click();
	    driver.findElement(By.xpath("//img[@title='Apple iPhone 7 Soft Silicon Cases Wow Imagine - Blue']")).click();
//To get parent window id
	    String Par = driver.getWindowHandle();
	    System.out.println(Par);
//To get all window id
	    Set<String> All = driver.getWindowHandles();
	    System.out.println(All);
//Switching to single child window
	    for (String x : All) {
			if(!Par.equals(x)) {
				driver.switchTo().window(x);
			}
			}
			driver.findElement(By.xpath("//span[text()='add to cart']")).click();
			driver.findElement(By.xpath("//i[@class='trustpayIcon footerIconsImg']")).click();
			
//Switching to Multiple child windows using count
		//To get Parent 1 window Id
			String Par1 = driver.getWindowHandle();
			System.out.println(Par1);
		//To get all 1 window Id
			Set<String> All1 = driver.getWindowHandles();
			System.out.println(All1);
			int count = 0;
			for (String y : All1) {
				if(count==2)
				{
					driver.switchTo().window(y);
				}
				count++;
				}
//To get text form webpage
			
			WebElement Txt = driver.findElement(By.xpath("//h2[text()='RULES FOR ACCEPTING SHIPMENTS']"));
			System.out.println(Txt.getText());
			Actions a = new Actions(driver);
			WebElement doubleClick = driver.findElement(By.xpath("//h1[contains(text(),'Your')]"));
			a.doubleClick(doubleClick).perform(); //doubt Click only one word		
	    }
	}

