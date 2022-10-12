package A7_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A47_JavaScriptExecutorEnable {

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
		WebElement javascriptlink = wd.findElement(By.id("element30"));
		javascriptlink.click();
		//WebElement enablerdisablelink = wd.findElement(By.id("element35"));
		//enablerdisablelink.click();
		wd.get("https://djangovinoth.pythonanywhere.com/enabledOrDisabled/");
		WebElement disable = wd.findElement(By.id("dis"));
		
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("arguments[0].removeAttribute('disabled')", disable);
		js.executeScript("arguments[0].value= 'chennai'", disable);
 
	}

}
