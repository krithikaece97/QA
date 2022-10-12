package A8_ScreenShot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A57_CoordinatesPoint {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		
		//wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		
		wd.get("https://www.google.com/");
		WebElement logo=	wd.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));//xpath of google logo
		Point point=	logo.getLocation();//to get google logo location. getlocation is a returntype of point
		int x=	point.x;//image has x and y axis point. point returntype is int. point ill only identify the location of the logo
		int y= point.y;	
		System.out.println(x);
		System.out.println(y);
		
		

		

	}

}
