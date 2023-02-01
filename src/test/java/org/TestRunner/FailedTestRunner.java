package org.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * 
 * @author K.G.N
 * @see used to maintain all FailedTestRunner
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "@target\\AdactinHotelFailureScenario.txt", glue = "org.StepDefinition")
public class FailedTestRunner {

}
