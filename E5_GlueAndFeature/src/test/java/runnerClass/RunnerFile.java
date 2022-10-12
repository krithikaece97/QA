package runnerClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//here we are creating separate separate package, for merging this we are using glue here. 
//to specify a feature file we have to use that path, to identify stepDefinition we have to use glue here. 
//to merge all to run the prg we are using glue here
//in real tym we have stepDefintion package under that we have all methods
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\features"},glue= {"stepDefinition"},tags="@validLogin")

public class RunnerFile {
	
}
//@CucumberOptions(tags="@validLogin and @admin") // will check both tags
//@CucumberOptions(tags="@validLogin or @admin")  // either one tag is present also it will run the Scenario 
//@CucumberOptions(tags=" not @validLogin")   // except not tag will execute rest of the tags
