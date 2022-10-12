package A9_StaleElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A51_StaleElementException {
	//Diff b/w get and navigate
	// get wont maintain history. navigate maintain history

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement search = wd.findElement(By.name("q"));
		search.sendKeys("chennai");
		search.submit();
		
		
		
		wd.navigate().back();
		PageFactory.initElements(wd, search);// this line represent the solution of stale element exception
		search.sendKeys("gunidy");
		
		search.submit();
		
		//this program will create staleElementException error
		
	}

}
