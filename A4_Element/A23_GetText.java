package A4_Element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A23_GetText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement search = wd.findElement(By.name("q"));
		search.sendKeys("chennai");
		search.submit();
		WebElement clickwiki = wd.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3"));//xpath
		clickwiki.click();
		WebElement para = wd.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/p[2]"));//xpath
		String text=para.getText();
		System.out.println(text);
		
	}

}
