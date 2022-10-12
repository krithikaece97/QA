package A1_Keyword;

import org.testng.annotations.Test;
//if we want to execute a particular testcase in multiple tym mns we have to use invocationcount (to cross check whether this method is working)
public class A8_InvocationCount {
	
	@Test(invocationCount = 4)
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
