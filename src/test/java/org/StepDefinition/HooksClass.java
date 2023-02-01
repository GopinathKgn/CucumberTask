package org.StepDefinition;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.Base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * 
 * @author K.G.N
 *
 * @see used to maintain HooksClass
 */
public class HooksClass extends BaseClass {

	/**
	 * @see maintain beforeScenario
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		getBrowser(getPropertyFileValue("browser"));
		ApplnUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicitWait(60, TimeUnit.SECONDS);

	}

	/**
	 * @see maintain afterScenario
	 * @param scenario
	 */
	@After
	public void afterScenario(Scenario scenario) {
		scenario.attach(screenShot(), "image/png", "EveryScenario");
		quitWindow();
	}

}
