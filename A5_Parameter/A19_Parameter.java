package A5_Parameter;
//if we convert the parameter class file in to a xml file mns... we have to run a program in xml file
//key and value combination
//we store the parameter in string concept,both java file and xml file parameter should be in same form
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class A19_Parameter {
	@Parameters({"BROWSER","URL","USERNAME","PASSWORD"})//these are key values in string concept
	@Test
	public void login(String browser,String url, String username, String password)//variables
	{
		System.out.println("open browser -" + browser);
		System.out.println("Enter URL -" +url);
		System.out.println("Enter username -" +username);
		System.out.println("Enter passord -" +password);
		
	}

}
