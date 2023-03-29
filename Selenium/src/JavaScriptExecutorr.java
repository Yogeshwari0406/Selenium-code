import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorr {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Eclipse-22-23\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;//narrow typecasting
		js.executeScript("document.getElementById('email').value='Yogi';");
		Thread.sleep(5000);
		js.executeScript("alert('Enter Password');");
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
	}

}
