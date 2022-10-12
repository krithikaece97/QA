package validateLoginWithData;
//In feature file, if we c parser exception error in console mns there is spacing mistake in scenario: like this. 
//In feature file, we can have multiple scenarios. But not a another feature file
//under scenario we can have multiple scenario
//diff b/w scenario and scenario outline? If we want to execute a single data mns we can go for scenario, if we want to execute
//multiple scenario mns we have to go for scenario outline by using a example keyword

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@Login")

public class RunnerFile {
	
}