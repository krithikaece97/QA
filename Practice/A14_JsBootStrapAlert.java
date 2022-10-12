package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A14_JsBootStrapAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		WebElement loginlink = wd.findElement(By.linkText("Login"));
		loginlink.click();
		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("Krithika");
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("Keerthi@15");
		password.submit();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		WebElement elementlink = wd.findElement(By.id("element10"));
		elementlink.click();
		wd.get("https://djangovinoth.pythonanywhere.com/bootstrapalert/no/");
		//WebElement bootstraplink = wd.findElement(By.id("element16"));
		//bootstraplink.click();
		WebElement infolink = wd.findElement(By.id("info"));
		infolink.click();
		WebElement alertmsg = wd.findElement(By.xpath("/html/body/main/div/div[2]/div"));
		String text = alertmsg.getText();
		System.out.println(text);
		
		

	}

}
