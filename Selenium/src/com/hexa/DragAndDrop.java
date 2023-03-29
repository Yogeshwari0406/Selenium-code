package com.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\IRCTC TicketBooking\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
	driver.manage().window().maximize();
	//One Program
    WebElement Source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
    WebElement Destination = driver.findElement(By.xpath("//p[text()='Drop here']"));
    Actions a = new Actions(driver);
	a.dragAndDrop(Source, Destination).build().perform();
	
//	//Another program with error
//	WebElement Source = driver.findElement(By.xpath("((//table/tbody/tr)[22]"));
//
//	WebElement Destination = driver.findElement(By.xpath("((//table/tbody/tr)[24]"));
//	Actions a = new Actions(driver);
//	a.dragAndDrop(Source, Destination).build().perform();
	}
}
