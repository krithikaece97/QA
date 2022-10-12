package A1_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A5_GetTitle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize(); 
		wd.get("https://www.google.com/");
		
		String data = wd.getTitle();// it will get the title of the url, getTitle return type is string
		System.out.println(data);
	}

}
