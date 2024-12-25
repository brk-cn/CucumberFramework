package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefs", "utils"},
        tags = "",
        monochrome = true,
        plugin = {"summary", "pretty", "html:target/cucumber-reports.html"}
)
public class Runner extends AbstractTestNGCucumberTests {
}
