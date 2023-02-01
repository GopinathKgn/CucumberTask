package org.StepDefinition;

import org.Base.BaseClass;

import org.Manager.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author K.G.N
 *
 * @see used to maintain all CommonStep
 */
public class CommonStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see maintain userShouldVerifyAfterLoginSuccessMessage
	 * @param expLoginSuccessMsg
	 */

	@Then("User should verify after login success message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String expLoginSuccessMsg) {
		WebElement element = pom.getSearchHotelPage().getTxtLoginSuccessMsg();
		String actLoginSuccessMsg = elementGetAttribute(element);
		Assert.assertEquals("Verify after login success message", expLoginSuccessMsg, actLoginSuccessMsg);

	}

	/**
	 * @see maintain userShouldVerifyAfterSearchHotelSuccessMessage
	 */

	@Then("User should verify after search hotel success message {string}")
	public void userShouldVerifyAfterSearchHotelSuccessMessage(String expSearchHotelSuccessMsg) {
		WebElement element = pom.getSelectHotelPage().getTxtSearchHotelSuccessMsg();
		String actSearchHotelSuccessMsg = getText(element);
		Assert.assertEquals("Verify after search hotel success message", expSearchHotelSuccessMsg,
				actSearchHotelSuccessMsg);

	}

	/**
	 * @see maintain userShouldVerifyAfterCancelBookingSuccessMessage
	 * @param expCancelBookingSuccessMsg
	 */
	@When("User should verify after cancel booking success message {string}")
	public void userShouldVerifyAfterCancelBookingSuccessMessage(String expCancelBookingSuccessMsg) {
		WebElement cancelBookingSuccessMsg = pom.getCancelBookingPage().getTxtCancelBookingSuccessMsg();
		String actcancelBookingSuccessMsg = cancelBookingSuccessMsg.getText();
		Assert.assertEquals("Verify after cancel booking success message", expCancelBookingSuccessMsg,
				actcancelBookingSuccessMsg);

	}

}
