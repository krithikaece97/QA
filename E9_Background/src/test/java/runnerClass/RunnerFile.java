package runnerClass;
import org.junit.runner.RunWith;
//if we use background in feature file, it automatically check the precondition file(class).
//if we have 5 scenario in common function or method means we have to use background
//before executing scenarios it ill execute background first
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