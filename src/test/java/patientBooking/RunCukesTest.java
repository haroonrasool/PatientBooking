package patientBooking;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        strict = true,
        dryRun = false,
        glue = {}, // Keep Empty
        tags = {"@Search", "@Sanity", "@wip"},
        plugin = "json:target/patientbooking.json"
)

public class RunCukesTest {
// Runner class by Haroon
}
