package org.StepDefinition;

import java.io.IOException;


import org.Base.BaseClass;
import org.Manager.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


/**
 * 
 * @author K.G.N
 *
 * @see used to maintain all TC4_BookHotelstep
 */
public class TC4_BookHotelstep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see maintain userShouldEnterBookHotelPageDetailsAnd
	 * @param firstname
	 * @param lastnamme
	 * @param address
	 */
	@When("User should enter book hotel page details {string},{string} and {string}")
	public void userShouldEnterBookHotelPageDetailsAnd(String firstname, String lastnamme, String address) {
		pom.getBookHotelPage().bookHotel(firstname, lastnamme, address);

	}

	/**
	 * @see maintain userShouldPerformPayment
	 * @param dataTable
	 */
	@When("User should perform payment")
	public void userShouldPerformPayment(DataTable dataTable) {
		pom.getBookHotelPage().bookHotelPayment(dataTable);

	}

	/**
	 * @see maintain userShouldVerifyAfterBookHotelSuccessMessageAndSaveTheOrderId
	 * @param expBookHotelSuccessMsg
	 * @throws IOException
	 */
	@Then("User should verify after book hotel success message {string} and save the order id")
	public void userShouldVerifyAfterBookHotelSuccessMessageAndSaveTheOrderId(String expBookHotelSuccessMsg)
			throws IOException {
		WebElement element = pom.getBookingConfirmPage().getTxtBookHotelSuccessMsg();
		String actBookHotelSuccessMsg = getText(element);
		Assert.assertEquals("Verify after book hotel success message", expBookHotelSuccessMsg, actBookHotelSuccessMsg);
		pom.getBookingConfirmPage().bookingConfirmation();

	}

	/**
	 * @see maintain userShouldVerifyAfterWithoutEnterAnyFieldsErrorMessageAnd
	 * @param expFirstNameErrorMsg
	 * @param explastNameErrorMsg
	 * @param expAddressErrorMsg
	 * @param expccNumberErrorMsg
	 * @param expccTypeErrorMsg
	 * @param expccExpiryErrorMsg
	 * @param expcvvNumberErrorMsg
	 */

	@Then("User should verify after without enter any fields error message {string},{string},{string},{string},{string},{string}, and {string}")
	public void userShouldVerifyAfterWithoutEnterAnyFieldsErrorMessageAnd(String expFirstNameErrorMsg,
			String explastNameErrorMsg, String expAddressErrorMsg, String expccNumberErrorMsg, String expccTypeErrorMsg,
			String expccExpiryErrorMsg, String expcvvNumberErrorMsg) {
		pom.getBookHotelPage().bookHotelWithOutEntryAnyFields();
		WebElement firstNameErrorMsg = pom.getBookHotelPage().getTxtFirstNameErrorMsg();
		String actFirstNameErrorMsg = firstNameErrorMsg.getText();
		WebElement lastNameErrorMsg = pom.getBookHotelPage().getTxtLastNameErrorMsg();
		String actLastNameErrorMsg = lastNameErrorMsg.getText();
		WebElement addressErrorMsg = pom.getBookHotelPage().getTxtAddressErrorMsg();
		String actAddressErrorMsg = addressErrorMsg.getText();
		WebElement ccNumberErrorMsg = pom.getBookHotelPage().getTxtCcNumberErrorMsg();
		String actCcNumberErrorMsg = ccNumberErrorMsg.getText();
		WebElement ccTypeErrorMsg = pom.getBookHotelPage().getTxtCcTypeErrorMsg();
		String actCcTypeErrorMsg = ccTypeErrorMsg.getText();
		WebElement ccExpiryErrorMsg = pom.getBookHotelPage().getTxtCcExpiryErrorMsg();
		String actCcExpiryErrorMsg = ccExpiryErrorMsg.getText();
		WebElement cvvNumberErrorMsg = pom.getBookHotelPage().getTxtCvvNumberErrorMsg();
		String actCvvNumberErrorMsg = cvvNumberErrorMsg.getText();

		Assert.assertEquals("Verify after without enter any fields error message", expFirstNameErrorMsg,
				actFirstNameErrorMsg);
		Assert.assertEquals("Verify after without enter any fields error message", explastNameErrorMsg,
				actLastNameErrorMsg);
		Assert.assertEquals("Verify after without enter any fields error message", expAddressErrorMsg,
				actAddressErrorMsg);
		Assert.assertEquals("Verify after without enter any fields error message", expccNumberErrorMsg,
				actCcNumberErrorMsg);
		Assert.assertEquals("Verify after without enter any fields error message", expccTypeErrorMsg,
				actCcTypeErrorMsg);
		Assert.assertEquals("Verify after without enter any fields error message", expccExpiryErrorMsg,
				actCcExpiryErrorMsg);
		Assert.assertEquals("Verify after without enter any fields error message", expcvvNumberErrorMsg,
				actCvvNumberErrorMsg);

	}

}
