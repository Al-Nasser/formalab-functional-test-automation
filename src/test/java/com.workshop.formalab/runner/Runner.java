package com.workshop.formalab.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        plugin = {"json:target/reports/cucumber.json"},
        glue = "com.workshop.formalab")
public class Runner {}
