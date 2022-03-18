package com.it_academy.tests.onliner.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-htmlreport/CucumberTestRunner",
                "json:target/json-files/CucumberTestRunner.json",
                "junit:target/junit_cucumber.xml"},
        monochrome = true,
        tags = "@smoke",
        glue = "com.it_academy.tests.onliner",
        features = "classpath:com.it_academy.tests.onliner.features"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}

