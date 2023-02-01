package org.TestRunner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.Base.BaseClass;
import org.Report.Reporting;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/**
 * 
 * @author K.G.N
 * @see used to maintain TestRunnerClass
 */
@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE, dryRun = false, stepNotifications = true, monochrome = true, plugin = {
		"pretty", "json:target\\AdactinHotel.json",
		"rerun:\\target\\AdactinHotelFailureScenario.txt" }, features = "src\\test\\resources\\Features", glue = "org.StepDefinition")
public class TestRunnerClass extends BaseClass {

	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		Reporting.generateJvmReport(getProjctPath() + "\\target\\AdactinHotel.json");

	}

}
