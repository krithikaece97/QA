package LoginWithMultipleData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	@Given("check Browser as {string}")
	public void checkBrowserAs(String browser) {
	    
	   System.out.println("open the browser ---------"+browser);
	}
	@When("enter the url as {string}")
	public void enterTheUrlAs(String url) {
	   
	   System.out.println("enter the url -------"+url);
	}
	@When("enter the username as {string}")
	public void enterTheUsernameAs(String username) {
	   System.out.println("enter the username -----"+username);
	   
	}
	@Then("enter the password as {string}")
	public void enterThePasswordAs(String password) {
	   
	   System.out.println("enter the password------"+password);
	}



	@And ("click the login button") 
	public void clickTheLoginButton()
	{
		System.out.println("----------------CLicklogin");
	}
	@Then ("verify login page successfully opened")
	public void verifyLoginPageSuccessfullyOpened()
	{
		System.out.println("-------------------- verifylogin");
	}
	
	@And ("Click the login button")
	public void ClickTheLoginButton()
	{
		System.out.println("---------------- click login button");
	}
	
	@And ("validate the homepage loaded successfully")
	public void validateThehomepageLoadedSuccessfully()
	{
		System.out.println("------------------- validate the login");
	}
	
}