package A1_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_OpenBrowser {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.get("https://www.google.com/");
	

	}

}
