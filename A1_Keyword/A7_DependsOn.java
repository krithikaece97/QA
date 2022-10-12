package A1_Keyword;

import org.testng.annotations.Test;
//this dependson is basically a recurrsion testing....it ill properly check from starting to end ...real tym we ill use this...
//in this case if we use priority mns, it ill execute if one testcase break also... based on the scenario we will decide dependson or priority
public class A7_DependsOn {
	
	@Test
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
