package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//here we are using data provider concept,
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.LoginPage;
import Pages.ProductPage;

public class LoginTest {
	WebDriver wd;
	@Test(dataProvider = "product")
	public void loginTest(String username,String password,String productName,String mobilenumber,String email,String quantity
			,String purchaserName)
	{
		WebDriverManager.chromedriver().setup();
		 wd= new ChromeDriver();
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
		LoginPage.enterUserName(wd, username);
		LoginPage.enterPassword(wd,password);
		LoginPage.clickLoginButton(wd);
	
		wd.get("https://djangovinoth.pythonanywhere.com/simpleform/");
		
		ProductPage.enterProduct(wd, productName);
		ProductPage.enterMobileNumber(wd, mobilenumber);
		ProductPage.enterEmailID(wd, email);
		ProductPage.productCategory(wd);
		ProductPage.enterProductQuantity(wd,quantity);
		ProductPage.enterPurchaserName(wd, purchaserName);
		ProductPage.clickGST(wd);
		ProductPage.clickAvailablePayment(wd);
		ProductPage.clickOrderButton(wd);
		
	}
	@DataProvider(name="product")
	public static Object[][] getProductDetails()
	{
		Object[][] data=new Object[2][7];
		data[0][0]="Krithika";
		data[0][1]="Keerthi@15";
		data[0][2]="aaaaa";
		data[0][3]="1111111";
		data[0][4]="aaaa@gmail.com";
		data[0][5]="10";
		data[0][6]="aaaaaaaaa";
		
		data[1][0]="Krithika";
		data[1][1]="Keerthi@15";
		data[1][2]="bbbbb";
		data[1][3]="22222222";
		data[1][4]="bbbbb@gmail.com";
		data[1][5]="20";
		data[1][6]="bbbbbbbb";
			
			return data;
						
						
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
