package LoginWithMultipleData;
//In feature file, if we c parser exception error in console mns there is spacing mistake in scenario: like this. 
//In feature file, we can have multiple scenarios. But not a another feature file
//under scenario we can have multiple scenario

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@Login")

public class RunnerFile {
	
}