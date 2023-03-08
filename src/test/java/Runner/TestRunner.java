package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Run",
        plugin = {"json:target/cucumber-report/cucumber.json"},
        features = "classpath:features.OrangeHRM",
        glue = {"StepsDefinition"}
)

public class TestRunner {
}
