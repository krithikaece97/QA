package A7_Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A21_SingleMethodSingleDataProvider {
	@Test(dataProvider = "testdata")//here we have to pass dataprovider=dataprovider name, which is initialize in dataprovider testcase
	public void login(String browser,String url,String username,String password)//this method is same as parameter
	{
		System.out.println("open browser -"+browser);
		System.out.println("Enter url -"+url);
		System.out.println("Enter username --"+username);
		System.out.println("Enter password --"+password);
	}
	@DataProvider(name="testdata")
	public Object[][] intializedata()//here we r using array concept// if we use return mns void should be neglegible..it turns to object
	{
		// single data pass single dimension
		//               [iterator] [data]
		//Object[][] i=new Object[2][4];
		
		Object[][] data=new Object[3][4];
		//1st iteration
		data[0][0]="chrome";//order should be same as above
		data[0][1]="google";
		data[0][2]="abc1";
		data[0][3]="pass1";
		//2 nd iteration
		data[1][0]="firefox";
		data[1][1]="firefox";
		data[1][2]="abc2";
		data[1][3]="pass2";
		//3rd iteration
		data[2][0]="Edge";
		data[2][1]="edge";
		data[2][2]="abc3";
		data[2][3]="pass3";
		
		return data;//to return the values
	}
	            
}
