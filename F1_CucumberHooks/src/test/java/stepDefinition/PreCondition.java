package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class PreCondition {
 // BackGround: To run all the Scenario we need to check these steps is present or not 
	@Given ("verify network")
	public void verifyNetwork()
	{
		System.out.println("network is properly connected");
	}
	@And ("check excel data")
	public void checkExcelData()
	{
		System.out.println("Excel data");
	}
	
	
	
	
	
}