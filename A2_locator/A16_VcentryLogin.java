package A2_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A16_VcentryLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/"); //link of that vcentry url
		WebElement loginLink = wd.findElement(By.linkText("Login"));//findelement of Login
		loginLink.click();
		WebElement username= wd.findElement(By.id("id_username"));//findelement of username
		username.sendKeys("Krithika");//pass the username
		WebElement password= wd.findElement(By.name("password"));//findelement of password
		password.sendKeys("Keerthi@15");//pass the password
		password.submit();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		
	}

}
