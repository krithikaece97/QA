package A8_ScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A58_Dimensions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		
		//wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		
		wd.get("https://www.google.com/");
		WebElement logo=	wd.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		Dimension dimension=	logo.getSize();//to find the height and width of the google logo
		int height=dimension.height;
		int width=dimension.width;
		System.out.println(height);
		System.out.println(width);
	}

}
