package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3_DragAndDrop {

	public static void main(String[] args) {
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
		WebElement doubleclicklink = wd.findElement(By.id("element25"));
		doubleclicklink.click();
		Actions a = new Actions(wd);
		WebElement source = wd.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		WebElement target = wd.findElement(By.xpath("//*[@id=\"trash\"]"));
		a.dragAndDrop(source, target).build().perform();
		
		WebElement source1 = wd.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
		WebElement target1 = wd.findElement(By.xpath("//*[@id=\"trash\"]"));
		a.dragAndDrop(source1, target1).build().perform();
	
		WebElement source2 = wd.findElement(By.xpath("//*[@id=\"gallery\"]/li[3]/img"));
		WebElement target2 = wd.findElement(By.xpath("//*[@id=\"trash\"]"));
		a.dragAndDrop(source2, target2).build().perform();
	
		WebElement source3 = wd.findElement(By.xpath("//*[@id=\"gallery\"]/li[4]/img"));
		WebElement target3 = wd.findElement(By.xpath("//*[@id=\"trash\"]"));
		a.dragAndDrop(source3, target3).build().perform();





	}

}
