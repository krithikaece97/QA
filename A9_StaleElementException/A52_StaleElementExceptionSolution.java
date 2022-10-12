package A9_StaleElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A52_StaleElementExceptionSolution {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
		//solution 1
		WebElement search = wd.findElement(By.name("q"));
		search.sendKeys("chennai");
		search.submit();
		
		
		
		wd.navigate().back();
		WebElement search1 = wd.findElement(By.name("q"));
		
		
		
		//solution2
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).submit();
		wd.navigate().back();
		wd.findElement(By.name("q")).sendKeys("guindy");
		wd.findElement(By.name("q")).submit();
		search1.sendKeys("gunidy");
		search1.submit();
		

	}

}
