package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java"},
        glue = {"stepDefinitions"},
        tags = "@RegressionTest"
)
//I gived features package name in features variable
// glue is where I define step definitions
// tag is also another critical variable, it will run only these tags
// I can give tag name to many features, that tag can be smoke-regression etc.

public class RunnerGeneral {

}
