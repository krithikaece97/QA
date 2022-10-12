package A1_Keyword;
//if a client tell me to skip a test case, enabled keyword is used here. like enabled=false

import org.testng.annotations.Test;

public class A5_Enabled {
	@Test(priority=1)
	public void add() {
		System.out.println("add");
	}
	@Test(priority=2)
	public void sub() {
		System.out.println("sub");
	}
	@Test(priority=3,enabled=false)// instead of false, we use true mns it is not skipped, it ill execute the testcase
	public void mul() {
		System.out.println("mul");
	}
	@Test(priority=4)
    public void div() {
    	System.out.println("div");
    }

}
