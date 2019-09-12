
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


import org.junit.runner.RunWith;

 
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin= {
                "json:target/cucumber/testCucumber.json",
                "html:target/cucumber/testCucumber.html",
                "pretty"
        },
        tags = {"~@ignored"}
)

public class runnerJUnit {

}