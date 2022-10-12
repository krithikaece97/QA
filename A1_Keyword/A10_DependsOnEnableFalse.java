package A1_Keyword;

import org.testng.annotations.Test;
//if we use a enabled=false in dependson method mns it ill not execute any test case, it ill show error
public class A10_DependsOnEnableFalse {

	@Test(enabled=false)
	public void login() {
		System.out.println("login");
	}
	@Test(dependsOnMethods = "login")
	public void search()
	{
		System.out.println("search");
	}
	@Test(dependsOnMethods = "search")
	public void book()
	{
		System.out.println("book");
	}
	@Test(dependsOnMethods = "book")
	public void cancel()
	{
		System.out.println("cancel");
	}

}
