package com.hexa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("customers"));
//To get Heading
	    List<WebElement> tHeading = table.findElements(By.tagName("th"));
	    for (int i = 0; i < tHeading.size(); i++) {
			WebElement heading = tHeading.get(i);
			System.out.println(heading.getText());
		}
//To get Rows
//	    List<WebElement> tRows = table.findElements(By.tagName("tr"));
//	    for (int j = 0; j < tRows.size(); j++) {
//	    	WebElement rows = tRows.get(j);
//	    	System.out.println(rows.getText());
//		}
//To get all the data
	    //List<WebElement> tRows = table.findElements(By.tagName("tr"));
	    //for (int i = 0; i < tRows.size(); i++) {
	    	//WebElement rows = tRows.get(i);
	    	//List<WebElement> tDatas = rows.findElements(By.tagName("td"));
	    	//for (int j = 0; j < tDatas.size(); j++) {
	    		//WebElement datas = tDatas.get(j);
	    		//System.out.println(datas.getText());
			//}
			
		//}
//To get particular value form the table
	  List<WebElement> tRows = table.findElements(By.tagName("tr"));
	    for (int i = 0; i < tRows.size(); i++) {
	    	WebElement rows = tRows.get(i);
	    	List<WebElement> tDatas = rows.findElements(By.tagName("td"));
	    	for (int j = 0; j < tDatas.size(); j++) {
	    		WebElement datas = tDatas.get(j);
	    		String text = datas.getText();
	    		//System.out.println(text);
	    		if (text.contains("Microsoft"))
	   {
			System.out.println(text);	
				}
			}
		}
		}

}
