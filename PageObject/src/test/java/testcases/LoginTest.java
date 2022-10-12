package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
//we have to run a program here, bse here we have declare the values. 
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.LoginPage;//import the previous package class like loginpage and productpage to set a value for that.
import Pages.ProductPage;
@Test
public class LoginTest {
	WebDriver wd;//globally declaring webdriver variable
	
	public void loginTest()
	{
		WebDriverManager.chromedriver().setup();
		 wd= new ChromeDriver();
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
	
		LoginPage.enterUserName(wd, "Krithika");//if we hold the control button and click enterUserName we can directly go the implementation part
		LoginPage.enterPassword(wd,"Keerthi@15");
		LoginPage.clickLoginButton(wd);
	
		wd.get("https://djangovinoth.pythonanywhere.com/simpleform/");
		
		ProductPage.enterProduct(wd, "mobile");
		ProductPage.enterMobileNumber(wd, "100001111");
		ProductPage.enterEmailID(wd, "abcd@gmail.com");
		ProductPage.productCategory(wd);
		ProductPage.enterProductQuantity(wd, "10");
		ProductPage.enterPurchaserName(wd, "aaaaaaaaa");
		ProductPage.clickGST(wd);
		ProductPage.clickAvailablePayment(wd);
		ProductPage.clickOrderButton(wd);
		
	
}
}
