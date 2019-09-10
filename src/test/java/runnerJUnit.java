package test.java;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

 
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "json:target/cucumber/testCucumber.json",
                "html:target/cucumber/testCucumber.html",
                "pretty"
        },
        tags = {"~@ignored"}
)

public class runnerJUnit {

}