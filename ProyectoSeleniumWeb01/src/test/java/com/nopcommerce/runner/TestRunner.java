package com.nopcommerce.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber/cucumber-report.html",
                "json:target/cucumber/cucumber.json"},
        features = "src/test/resources/features",
        glue = {"com.nopcommerce.glue", "com.nopcommerce.utils"},
        tags = "@LogInConCredencialesValidas")
public class TestRunner {
}