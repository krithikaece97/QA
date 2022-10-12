package A3_MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A22_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		WebElement loginLink = wd.findElement(By.linkText("Login"));
		loginLink.click();
		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("Krithika");
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("Keerthi@15");
		password.submit();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		WebElement actionLink = wd.findElement(By.id("element20"));
		actionLink.click();
		WebElement mousehoverlink = wd.findElement(By.id("element27"));
		mousehoverlink.click();
		Actions a = new Actions(wd);
		WebElement resume = wd.findElement(By.id("id11"));
		WebElement item = wd.findElement(By.id("id13"));
		WebElement havoc = wd.findElement(By.id("id17"));
		a.moveToElement(resume).build().perform();
		Thread.sleep(2000);
		a.moveToElement(item).build().perform();
		Thread.sleep(2000);
		a.moveToElement(havoc).build().perform();
	}

}
