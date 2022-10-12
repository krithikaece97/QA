package A2_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A10_Id {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize(); 
		wd.get("https://www.bing.com/");
		WebElement search= wd.findElement(By.id("sb_form_q"));//we r identifying element using id. webelement is the return type
		search.sendKeys("chennai");//sendkey ill enter the given data
        search.submit();
	}

}
