package A3_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A18_Slider {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
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
		WebElement sliderLink = wd.findElement(By.id("element22"));
		sliderLink.click();
		Actions a = new Actions(wd);
		WebElement slider = wd.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Thread.sleep(2000);
		a.dragAndDropBy(slider, 100, 0).build().perform();
		Thread.sleep(2000);
		a.dragAndDropBy(slider, -100, 0).build().perform();
		

	}

}
