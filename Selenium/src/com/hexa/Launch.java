package com.hexa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) throws Throwable {
		//configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	// To launch URL
		driver.get("https://www.facebook.com/");
	// To get current URL
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	// To get title
		String title = driver.getTitle();
		System.out.println(title);
		WebElement txtUser = driver.findElement(By.id("email"));
	txtUser.sendKeys("Yogeshwari");
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("Balganesha");
	//WebElement btnlogin = driver.findElement(By.xpath("//button[@name='login']"));
	//btnlogin.click();
	WebElement createBtn = driver.findElement(By.xpath("(//a[@role='button'])[2]")); 
	createBtn.click();
	//driver.close();
	//to maximize window
	driver.manage().window().maximize();
	//WebElement CreateBtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));//alternative using text
	WebElement txtfacebook = driver.findElement(By.xpath("//h2[contains(text(),'share')]"));
	String text = txtfacebook.getText();
	System.out.println(text);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("YogiGopi");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Datchanamoorthy");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9899084755");
	}
	
	

}
