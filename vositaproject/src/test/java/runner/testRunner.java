package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/features"},
        glue = {"stepDefinations"},


        plugin = {
                "pretty",
                "html:target/cucumberReports/cucumber-pretty.html",
                "json:target/cucumberReports/cucumber-TestReport.json",
                "rerun:target/cucumberReports/rerun.txt",
                "junit:target/cucumberReports/cukes.xml",
        },
        dryRun = false,
        tags = "@Runner")
public class testRunner {

}