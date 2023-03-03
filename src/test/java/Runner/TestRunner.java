package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepsDefinition.frontend.StepsDefinition"},
        plugin = {"json:target/cucumber-reports/cucumber.json"},
        monochrome = true,
        tags = "" //for tag add in your Runner config - VM option: -D cucumber.filter.tags="@Run"
)

public class TestRunner {
}
