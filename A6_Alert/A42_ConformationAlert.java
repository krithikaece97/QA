package A6_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A42_ConformationAlert {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver wd = LoginScenario.loginVcentryApplication();
			wd.get("https://djangovinoth.pythonanywhere.com/alert/");
		
			WebElement alert = wd.findElement(By.id("id2"));
			alert.click();
			Alert a = wd.switchTo().alert();//alert returntype is Alert. switchTo is used for targetelement. This line is for alert window
			Thread.sleep(1000);
			
			a.dismiss();//to click cancel
	}

}
