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
 * @see used to maintain all TC3_SelectHotelstep
 *
 */
public class TC3_SelectHotelstep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see maintain userShouldVerifyAfterSelectByHotelNameSuccessMessage
	 * @param expSelectHotelSuccessMsg
	 */
	@When("User should verify after select by hotel name success message {string}")
	public void userShouldVerifyAfterSelectByHotelNameSuccessMessage(String expSelectHotelSuccessMsg) {
		pom.getSelectHotelPage().selectHotel();
		WebElement element = pom.getBookHotelPage().getTxtSelectHotelSuccessMsg();
		String actSelectkHotelSuccessMsg = getText(element);
		Assert.assertEquals("Verify after select hotel success message", expSelectHotelSuccessMsg,
				actSelectkHotelSuccessMsg);

	}

	/**
	 * @see maintain userShouldVerifyAfterWithoutSelectHotelErrorMessage
	 * @param expSelectkHotelErrorMsg
	 */
	@Then("User should verify after without select hotel error message {string}")
	public void userShouldVerifyAfterWithoutSelectHotelErrorMessage(String expSelectkHotelErrorMsg) {
		pom.getSelectHotelPage().withoutSelectHotel();
		WebElement element = pom.getSelectHotelPage().getTxtSelectHotelErrorMsg();
		String actSelectHotelErrorMsg = getText(element);
		Assert.assertEquals("Verify after without select hotel error message", expSelectkHotelErrorMsg,
				actSelectHotelErrorMsg);

	}

}
