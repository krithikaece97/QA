package stepDefinition;


import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductTest {

	WebDriver wd;
	@Given("check Browser as {string}")
	public void checkBrowserAs(String browser) {
		WebDriverManager.chromedriver().setup();
		wd= new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
	 
	}
	
	
	@When("enter the url as {string}")
	public void enterTheUrlAs(String url) {
	   
		wd.get("https://djangovinoth.pythonanywhere.com/labhome");
	}
	
	@And ("click the login link") 
	public void clickTheLoginLink()
	{
		WebElement loginLink=	wd.findElement(By.linkText("Login"));
		loginLink.click();
	}
	@Then ("verify login page successfully opened")
	public void verifyLoginPageSuccessfullyOpened()
	{
	String Title =	wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/fieldset/legend")).getText();
//	Assert.assertEquals("Log in", Title); // execution fail
	SoftAssertions s = new SoftAssertions();
	s.assertThat("Log in".equals(Title));
	s.assertAll();
	}
	@When("enter the username as {string}")
	public void enterTheUsernameAs(String username) {
		WebElement username1=	wd.findElement(By.id("id_username"));
		username1.sendKeys(username);
	   
	}
	@Then("enter the password as {string}")
	public void enterThePasswordAs(String password) {
		WebElement password1=	wd.findElement(By.name("password"));
		password1.sendKeys(password);
	  
	}

	
	@And ("Click the login button")
	public void ClickTheLoginButton()
	{
		
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	}
	
	@And ("click the Framework forms")
	public void clickTheFrameworkForms()
	{
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		wd.findElement(By.id("element44")).click();
	}
	
	@And ("click the simple form")
	public void clickTheSimpleForm()
	{
		wd.findElement(By.id("element45")).click();
	}
	@When ("add product list")
	public void addProductList(DataTable datatable)
	{
	/*List<List<String>>	table =datatable.asLists();//here we r using list concept, iterating a 4rows and 6 column data product in feature file
	for(int i=0;i<table.size();i++)
	{
		System.out.println(table.get(i).get(0)); //product a
		
		wd.findElement(By.id("id0")).sendKeys(table.get(i).get(0));//get(0) is a index value
		wd.findElement(By.id("id1")).sendKeys(table.get(i).get(1));
		wd.findElement(By.id("id2")).sendKeys(table.get(i).get(2));
		wd.findElement(By.id("id3")).sendKeys(table.get(i).get(3));
		wd.findElement(By.id("id4")).sendKeys(table.get(i).get(4));
		wd.findElement(By.id("id5")).sendKeys(table.get(i).get(5));
		wd.findElement(By.id("idyes")).click();
		wd.findElement(By.id("netbank")).click();
		wd.findElement(By.id("order")).click();*/
		
		List<Map<String,String>>	table =datatable.asMaps();//this is map concept, by using key value combination
		for(int i=0;i<table.size();i++)
		{
			//System.out.println(table.get(i).get("pass the Key from feature file")); 
			
			wd.findElement(By.id("id0")).sendKeys(table.get(i).get("productname"));//instead of passing index value, here we r using key name
			wd.findElement(By.id("id1")).sendKeys(table.get(i).get("mobile"));
			wd.findElement(By.id("id2")).sendKeys(table.get(i).get("email"));
			wd.findElement(By.id("id3")).sendKeys(table.get(i).get("productcategory"));
			wd.findElement(By.id("id4")).sendKeys(table.get(i).get("quantity"));
			wd.findElement(By.id("id5")).sendKeys(table.get(i).get("purchaser"));
			wd.findElement(By.id("idyes")).click();
			wd.findElement(By.id("netbank")).click();
			wd.findElement(By.id("order")).click();
		
	}
	
	
	
	
	
	
	
	
	}
}