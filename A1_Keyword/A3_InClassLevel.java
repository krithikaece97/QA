package A1_Keyword;
//Client does not want a particular order r priority based test case..client just want to execute all the test case mns we can go for classlevel

import org.testng.annotations.Test;
@Test
public class A3_InClassLevel {
	
	public void add() {
		System.out.println("add");
	}
	
	public void sub() {
		System.out.println("sub");
	}
	
	public void mul() {
		System.out.println("mul");
	}
	
    public void div() {
    	System.out.println("div");
    }
}
