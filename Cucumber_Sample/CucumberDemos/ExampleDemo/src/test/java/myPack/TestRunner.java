package myPack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/resource/java/Ecommerce.feature",
		tags= "@SmokeTest",
		plugin="html:target/reports"
		)
public class TestRunner {
}
