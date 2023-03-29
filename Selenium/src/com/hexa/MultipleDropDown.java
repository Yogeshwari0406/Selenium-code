package com.hexa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		WebElement ddnCommands = driver.findElement(By.name("selenium_commands"));
		Select s = new Select(ddnCommands);
		System.out.println(s.isMultiple());
		s.selectByVisibleText("Wait Commands");
		s.selectByIndex(1);
		s.selectByIndex(4);
//To get all selected options
		System.out.println("---All Selected Options---");
		List<WebElement> allOptions = s.getAllSelectedOptions();
		for (int i = 0; i < allOptions.size(); i++) {
			WebElement element = allOptions.get(i);
			System.out.println(element.getText());
		}
//To get First Selected Options
		System.out.println("---First Selected Option---");
		WebElement First = s.getFirstSelectedOption();
		System.out.println(First.getText());
// To deselect
		s.deselectByVisibleText("Wait Commands");
		s.deselectByIndex(4);
		s.deselectAll();
	}

}
