package A7_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A43_JavaScriptSendValues {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		WebElement search = wd.findElement(By.name("q"));
		//search.sendKeys("chennai");//without sendkeys function, we can achieve through javascript
		
		
		
		
		//JavaScriptExecutor is a interface. we can't create object in interface. webdriver wd is also interface.
		//to connecting interface-interface here we r using type casting... (JavaScriptExecutor) wd this is type casting.
		//argument[0].value is default one.. to pass the data in sendkeys here we have to use this arguments. 
		
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("arguments[0].value='chennai'", search);
		
	}

}
