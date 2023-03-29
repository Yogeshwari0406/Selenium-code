package com.hexa;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/Acnos-Steel-Strap-Analog-Couple/dp/B07SV4XK3G/ref=sr_1_17?crid=1CF671UTHY8I7&keywords=pair+watch&qid=1663312346&sprefix=pair+watch%2Caps%2C335&sr=8-17");
		driver.manage().window().maximize();
		TakesScreenshot tk =(TakesScreenshot)driver;
		File Source = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(Source);
	//Screenshot Using FileUtils for that need to download commons-io-2.4 jar file form google
		File Destination = new File("D:\\Yogi\\GetScreenshotAs Example.gif");
		File Destination1 = new File("D:\\Yogi\\GetScreenshotAs Example.pdf");
		FileUtils.copyFile(Source, Destination);
		FileUtils.copyFile(Source, Destination1);
		
	//Screenshot using File Handler
		//File Destination = new File("C:\\Users\\USER\\eclipse-workspace\\Selenium\\src\\Screenshot\\Gopi.png");
		//FileHandler.copy(Source, Destination);
		
	}

}
