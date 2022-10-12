package runnerClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//cucumber also generate report by using plugin keyword, plugin mns neatly it ill generate report(remove unwanted thing)
//if we execute this prg and refresh it mns left side we have report folder
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\features"},glue= {"stepDefinition"},tags="@validLogin"
		,plugin= {"pretty",
	            "html:reports/report.html",
	             //formatname:packagename.filename.extension
	             "junit:reports/report.junit",
	             "json:reports/report.json"}) // if we are not declare pretty also report will generate)

public class RunnerFile {
	
}
//@CucumberOptions(tags="@validLogin and @admin") // will check both tags
//@CucumberOptions(tags="@validLogin or @admin")  // either one tag is present also it will run the Scenario 
//@CucumberOptions(tags=" not @validLogin")   // except not tag will execute rest of the tags
