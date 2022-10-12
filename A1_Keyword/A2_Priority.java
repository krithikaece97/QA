package A1_Keyword;
//1.  if we use  @Test annotation means output ill be in ascending order. In real tym it is not applicable
//2. for that purpose we r using priority. we can priority which window we want in 1,2,3....

import org.testng.annotations.Test;

public class A2_Priority {
	@Test(priority=1)
	public void add() {
		System.out.println("add");
	}
	@Test(priority=2)
	public void sub() {
		System.out.println("sub");
	}
	@Test(priority=3)
	public void mul() {
		System.out.println("mul");
	}
	@Test(priority=4)
    public void div() {
    	System.out.println("div");
    }
}
