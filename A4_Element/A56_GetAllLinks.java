package A4_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A56_GetAllLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		List<WebElement> links = wd.findElements(By.tagName("a"));//list means we have to use for loop
		for(int i=0;i<links.size();i++)
		{
			String text =links.get(i).getText();
			if(!text.isEmpty()) {//to avoid space between the tag and console...so we have to use this line, this line will print the not a empty line
			//it ill prevent from nosuchexception error
			System.out.println(text);
			}
		}

	}

}
