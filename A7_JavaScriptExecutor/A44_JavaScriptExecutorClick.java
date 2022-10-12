package A7_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A44_JavaScriptExecutorClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement search = wd.findElement(By.linkText("Gmail"));
		
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("arguments[0].click()", search);

	}

}
