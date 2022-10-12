package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\Vcentry\\F3_CucumberDataTable\\src\\test\\resources\\features"}, tags="@product"
            ,plugin= {"pretty",
            "html:reports/report.html",
             "junit:reports/report.junit",
             "json:reports/report.json"}) // if we are not declare pretty also report will generate



public class RunnerFile {

}
