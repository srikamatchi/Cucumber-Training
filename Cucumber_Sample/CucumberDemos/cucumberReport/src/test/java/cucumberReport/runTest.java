package cucumberReport;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class) 
@CucumberOptions( 
		//format= {"json:target/Destination/cucumber.json"}
		plugin= {"html:target/destination/"}
   )
public class runTest {

}
