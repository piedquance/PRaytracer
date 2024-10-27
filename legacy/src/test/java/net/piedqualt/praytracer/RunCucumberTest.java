package net.piedqualt.praytracer;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
    features = {"src/test/ressources/net.piedqualt.praytracer/tuples.feature"}
)
public class RunCucumberTest {
    StepsDefinition steps;
}
