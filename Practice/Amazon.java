package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

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
		//List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
		for(int i=0;i<=rows.size();i++)
		{
			List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
			if(i==2)
			{
				for(int j=0;j<=column.size();j++)
				{
					if(j==1)
					{
					System.out.println( column.get(j).getText());
					}
				}
			}
		}
		
		
		

	}

}
