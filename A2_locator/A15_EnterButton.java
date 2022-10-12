package A2_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A15_EnterButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize(); 
		wd.get("https://www.google.com/");
		WebElement search= wd.findElement(By.name("q"));
		search.sendKeys("chennai");
		search.sendKeys(Keys.ENTER);//it is a keyboard functions, we are using keys.any function we have to perform in keyboard
	    
	}
	

}