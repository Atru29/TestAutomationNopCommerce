package com.nopcommerce.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "summary",
                "html:target/cucumber-reports/html-report.html",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },

        features = "src/test/resources/features",
        glue = {"com.nopcommerce.glue", "com.nopcommerce.utils"},
        tags = "@RegistroConCredencialesValidas",
        monochrome = false,
        dryRun = false,
        publish = true)
public class TestRunner {
}