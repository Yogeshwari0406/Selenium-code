package com.hexa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBy1Value2VisibleText3Index {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\SeleniumExamples\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(5000);
//To Select Month from create new account
	WebElement DropDownBtn = driver.findElement(By.id("month"));
	Select s = new Select(DropDownBtn);
	Thread.sleep(3000);
	//Select by Index - Method 1
    s.selectByIndex(1);
	//Select By visible text - Method 2
	Thread.sleep(3000);
	s.selectByVisibleText("Feb");
	Thread.sleep(3000);
    //Select By Value - Method 3
	s.selectByValue("11");
//To get all the options available in that given dropdown
	List<WebElement> options = s.getOptions();
   //Using for each/Enhanced For loop
	for (WebElement webElement : options) {
	String text = webElement.getText();
    System.out.println(text);
    }
//To Select Year from Create new account
		WebElement DropDownBtn1 = driver.findElement(By.id("year"));
		Select s1 = new Select(DropDownBtn1);
		Thread.sleep(3000);
		//Select by Index - Method 1
	    s1.selectByIndex(1);
		//Select By visible text - Method 2
		Thread.sleep(3000);
		s1.selectByVisibleText("2021");
		Thread.sleep(3000);
	    //Select By Value - Method 3
		s1.selectByValue("2022");
		List<WebElement> options1 = s1.getOptions();	
	    for (WebElement webElement1 : options1) {
		String text1 = webElement1.getText();
		System.out.println(text1);
	}
		
	//To Select Date from Create new account
		WebElement DropDownBtn2 = driver.findElement(By.id("day"));
		Select s2 = new Select(DropDownBtn2);
		Thread.sleep(3000);
		//Select by Index - Method 1
		s2.selectByIndex(1);//it will select date 2
		//Select By visible text - Method 2
		Thread.sleep(3000);
		s2.selectByVisibleText("11");
		Thread.sleep(3000);
		//Select By Value - Method 3
		s2.selectByValue("4");
		List<WebElement> options2 = s2.getOptions();
		for (WebElement webElement2 : options2) {
		String text2 = webElement2.getText();
		System.out.println(text2);
			}
		
//Using For loop going to select Date, Month, Year
//	List<WebElement> options3 = s.getOptions();
//	for (int i=0;i<options.size();i++){ 
//    WebElement DroDownBtn = options.get(i);
//    String text = DropDownBtn.getText();
//    System.out.println(text);
//	}
}

}
