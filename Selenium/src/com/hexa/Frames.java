package com.hexa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
	//Removing frame by using webElement
		WebElement Click = driver.findElement(By.xpath("//iframe[@frameborder='0']"));
		driver.switchTo().frame(Click);
	//Removing frame using Frame index number, Frame starts with 0, 1, 2
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@data-layer='4'])[1]")).click();
	//To find number of frame
		 driver.switchTo().parentFrame();
         List<WebElement> NoOfFrame = driver.findElements(By.tagName("iframe"));
         System.out.println(NoOfFrame.size());
    //Alternate method to find No of Frame - Gopi
		//List<WebElement> NoOfFrame = driver.findElements(By.xpath("//iframe"));
		//System.out.println(NoOfFrame.size());
	}

}
