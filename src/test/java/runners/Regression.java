package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps",
        tags = "@regression",
        plugin = {"pretty","html:target/cucumber.html"},
        dryRun = false
)


public class Regression {
}
