package runnerClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\features"},glue= {"stepDefinition"},tags="@validLogin"
            ,plugin= {"pretty",
            "html:reports/report.html",
             "junit:reports/report.junit",
             "json:reports/report.json"}) // if we are not declare pretty also report will generate

public class RunnerFile {
	
}