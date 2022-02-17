package org.sampless;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = {"src\\test\\resources\\Adactins.feature"},
   //path of step definition file
   glue = "org.adacatinpack",dryRun = false

   )


	public class TestRunner {
	
	}

