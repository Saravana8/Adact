package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Features" }, glue = { "com.stepdef" })

public class TestRunnerClass {
	
	
	}
