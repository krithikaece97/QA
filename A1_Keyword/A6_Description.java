package A1_Keyword;

import org.testng.annotations.Test;

public class A6_Description {
	@Test(description="Adding the numbers")//this description will bring a knowledge of what is happening in the testcase
	public void add() {
		System.out.println("add");
	}
	@Test
	public void sub() {
		System.out.println("sub");
	}
	@Test
	public void mul() {
		System.out.println("mul");
	}
	@Test
    public void div() {
    	System.out.println("div");
    }

}
