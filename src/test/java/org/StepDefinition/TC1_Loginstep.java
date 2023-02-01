package org.StepDefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.Base.BaseClass;
import org.Manager.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


/**
 * 
 * @author K.G.N
 *
 * @see used to maintain all TC1_Loginstep
 */
public class TC1_Loginstep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see maintain userIsOnTheAdactinPage
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Given("User is on the adactin page")
	public static void userIsOnTheAdactinPage() throws FileNotFoundException, IOException, InterruptedException {

	}

	/**
	 * @see maintain userShouldPerformLogin
	 * @param username
	 * @param password
	 */

	@When("User should perform login {string},{string}")
	public void userShouldPerformLogin(String username, String password) {
		pom.getLoginPage().login(username, password);

	}

	/**
	 * @see maintain userShouldPerformLoginWithEnterKey
	 * @param username
	 * @param password
	 * @throws AWTException
	 */
	@When("User should perform login {string},{string} with Enter Key")
	public void userShouldPerformLoginWithEnterKey(String username, String password) throws AWTException {
		pom.getLoginPage().loginWithEnterKey(username, password);

	}

	/**
	 * @see maintain userShouldVerifyAfterLoginWithInvalidCredentialErrorMessage
	 * @param expLoginErrorMsg
	 */
	@Then("User should verify after login with invalid credential error message {string}")
	public void userShouldVerifyAfterLoginWithInvalidCredentialErrorMessage(String expLoginErrorMsg) {
		WebElement element = pom.getLoginPage().getTxtLoginErrorMsg();
		String actLoginErrorMsg = getText(element);
		boolean b = actLoginErrorMsg.contains(expLoginErrorMsg);
		Assert.assertTrue("Verify After login with invalid credential error message contains", b);

	}
}