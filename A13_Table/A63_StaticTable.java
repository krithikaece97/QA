package A13_Table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A63_StaticTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		WebElement tables = wd.findElement(By.id("element39"));
		tables.click();
		WebElement statictable = wd.findElement(By.id("element40"));
		statictable.click();
		WebElement table = wd.findElement(By.id("table1"));//from table only we r fetching row
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++)//this ill execute the row
		{
			List<WebElement> column = rows.get(i).findElements(By.tagName("td"));//column data will be under row....so we r fetching column data via row
			for(int j=0;j<column.size();j++)
			{
				String text = column.get(j).getText();// this will fetch all the row in data
				System.out.print(text + " ");//it ill print in the same line
			}
			System.out.println();
				
		}
		
		
		

	}

}
