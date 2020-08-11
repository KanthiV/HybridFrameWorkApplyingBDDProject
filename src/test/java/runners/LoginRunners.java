package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/features/", tags = {"@database"}, glue = {
 "steps" },
 dryRun = false,
 monochrome = true,
 plugin = {"pretty", "html:test-output"}
 )
public class LoginRunners {




}
 // tags = {"@smoke", "@sprint"} this means @smoke AND @sprint
 // tags = {"@smoke, @sprint"} this means @smoke OR @sprint