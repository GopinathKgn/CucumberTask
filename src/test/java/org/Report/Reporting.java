package org.Report;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * @see used to maintain Reporting
 */
public class Reporting {

	public static void generateJvmReport(String jsonFile) {

		// 1. Mention the path of JVM Report

		File file = new File("C:\\Users\\K.G.N\\eclipse-workspace\\OMRBranchAutomation\\target");

		// 2. Create the object for configuration class
		Configuration configuration = new Configuration(file, "Adactin Automation");

		// 3. K,V ---> browser, version,sprint,OS
		configuration.addClassifications("Browser", "chrome");
		configuration.addClassifications("Version", "108");
		configuration.addClassifications("OS", "WIN10");
		configuration.addClassifications("Sprint", "34");

		// 4.Create object for reportBuilder class

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);

		// 5. Generate JVM report
		builder.generateReports();
	}
}