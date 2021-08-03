package Rappi;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
//        plugin = {"pretty", "html:target/cucumber-reports"},
		plugin = {"pretty"},
		features = "classpath:features"
)
public class RunnerSumadora {
}
