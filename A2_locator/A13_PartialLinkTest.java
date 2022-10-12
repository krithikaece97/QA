package A2_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A13_PartialLinkTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize(); 
		wd.get("https://www.google.com/");
		WebElement gmail = wd.findElement(By.partialLinkText("Gmai"));//it ill be partial text
		gmail.click();

	}

}
