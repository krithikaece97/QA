package A2_Annotations;
//we use before method and after method annotation, that ill be implemented in before and after in every test case 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A11_BeforeMethodAfterMethod {
	@BeforeMethod
	public void browserOpened(){
		System.out.println("browser opened");
	}
	
	@AfterMethod
	public void browserClosed() {
		System.out.println("browser closed");
	}
	@Test
	public void login() {
		System.out.println("login");
	}
	@Test
	public void search()
	{
		System.out.println("search");
	}
	@Test
	public void book()
	{
		System.out.println("book");
	}
	@Test
	public void cancel()
	{
		System.out.println("cancel");
	}
}
