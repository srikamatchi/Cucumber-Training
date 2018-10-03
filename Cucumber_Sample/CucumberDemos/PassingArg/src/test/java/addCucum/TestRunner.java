package addCucum;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/resources/java/add.feature",
		glue="StepDef"
		)
		
public class TestRunner {

}
