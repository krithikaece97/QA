package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A16_CreateTable {

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
		WebElement createtable = wd.findElement(By.id("element41"));
		createtable.click();
	    WebElement noofRows = wd.findElement(By.id("rows"));
	    noofRows.sendKeys("3");
	    WebElement noofColumn = wd.findElement(By.id("cols"));
	    noofColumn.sendKeys("3");
	    WebElement button = wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/div/div[5]/button"));
	    button.click();
	    WebElement table = wd.findElement(By.name("newtable"));//from table only we r fetching row
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++)//thsi ill execute the row
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
