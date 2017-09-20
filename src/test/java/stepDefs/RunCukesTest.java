package stepDefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"},
        format={"pretty","html:target/Reports"})

public class RunCukesTest {

    public static void main(String[] args) {

    }


}