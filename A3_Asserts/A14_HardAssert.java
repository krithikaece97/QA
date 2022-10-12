package A3_Asserts;
//in hardassert, if one testcase fail mns it ill will stop the remaining testcase... here we use priority bse of ascending order problem
//actual and expected is not equal so that testcase ill not execute
//hardassert will gives wat error it occurs in console
//hardassert is also called as assert
import org.testng.Assert;
import org.testng.annotations.Test;

public class A14_HardAssert {
	@Test(priority=1)
	public void title()
	{
		System.out.println("validating the title");
		String actual= "google";
		String expected= "Google";
		
		Assert.assertEquals(actual, expected);
		System.out.println("validation is complete");
	}
	@Test(priority=2)
	public void login()
	{
		System.out.println("login page");
	}

}
