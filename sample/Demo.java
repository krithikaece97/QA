package sample;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.tutorialspoint.com/index.htm");
		
		Thread.sleep(3000);
		wd.findElement(By.linkText("Category")).click();  // By simply using linkText No need to inspect
		
		WebElement list = wd.findElement(By.id("categories-menu"));
		Actions a = new Actions(wd);
		a.moveToElement(wd.findElement(By.xpath("//ul[@id=\"categories-menu\"]//following::*[starts-with(@href,tutorials\"https://www.tutorialpoint.com/categories/marketing\")and@class=\"dropdown-item\"]"))).build().perform();
		Thread.sleep(2000);
		a.click().build().perform();
				

Thread.sleep(4000);
wd.findElement(By.xpath("//*[@class= 'slick-next slick-arrow' and @aria-label = 'Next']")).click();  // "and" Works double confirmed
Thread.sleep(4000);
wd.findElement(By.linkText("Programming Languages")).click();	// By simply using linkText No need to inspect

		
		
		
		
		
		
	}

	

}
