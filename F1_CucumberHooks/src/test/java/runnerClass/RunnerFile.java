package runnerClass;
import org.junit.runner.RunWith;
//background is only for client purpose, background can be declared in feature file only
//hooks can be declared in program part

//interview questions: if we r using  a hooks and background in program, if i trigger a program wat ill execute first?? hooks --> background--> scenario
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