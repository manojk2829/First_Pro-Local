package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = "src/test/resources/featuresFile",          // Path to feature files
	    glue = "pack",                // Package where step definition classes are
	    plugin = { "pretty", "html:target/cucumber-reports/cucumber.html" },  // Plugins for reporting
	    monochrome = true,                       // For better readability in console output
	    tags = "@tag"                          // Optionally, add a tag to run specific scenarios
	)
	public class RunnerTest extends AbstractTestNGCucumberTests {
	}
