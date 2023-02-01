package org.StepDefinition;

import org.Base.BaseClass;
import org.Manager.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

/**
 * 
 * @author K.G.N
 * 
 * @see used to maintain all TC2_SearchHotelstep
 *
 */
public class TC2_SearchHotelstep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see maintain userShouldEnterAnd
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param numberOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 * @param childrenPerRoom
	 */
	@Then("User should enter {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldEnterAnd(String location, String hotels, String roomType, String numberOfRooms,
			String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {

		pom.getSearchHotelPage().searchHotel(location, hotels, roomType, numberOfRooms, checkInDate, checkOutDate,
				adultsPerRoom, childrenPerRoom);

	}

	/**
	 * @see maintain userShouldEnterOnlyManatoryFieldsAnd
	 * @param location
	 * @param numberOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 */
	@Then("User should enter only manatory fields {string},{string},{string},{string} and {string}")
	public void userShouldEnterOnlyManatoryFieldsAnd(String location, String numberOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom) {
		pom.getSearchHotelPage().searchHotelManatoryFields(location, numberOfRooms, checkInDate, checkOutDate,
				adultsPerRoom);

	}

	/**
	 * @see maintain
	 *      userShouldVerifyAfterSearchHotelWithInvalidCheckInDateAndCheckOutDateCredentialErrorMessageAnd
	 * @param expCheckInDateErrorMsg
	 * @param expCheckOutDateErrorMsg
	 */

	@Then("User should verify after search hotel with invalid CheckIn Date and CheckOut Date credential error message {string} and {string}")
	public void userShouldVerifyAfterSearchHotelWithInvalidCheckInDateAndCheckOutDateCredentialErrorMessageAnd(
			String expCheckInDateErrorMsg, String expCheckOutDateErrorMsg) {
		WebElement element = pom.getSearchHotelPage().getTxtCheckInDateErrorMsg();
		String actCheckInDateErrorMsg = getText(element);
		WebElement element2 = pom.getSearchHotelPage().getCheckOutDateErrorMsg();
		String actCheckOutDateErrorMsg = getText(element2);
		Assert.assertEquals("Verify after search hotel with invalid cheeckInDate error message ",
				expCheckInDateErrorMsg, actCheckInDateErrorMsg);
		Assert.assertEquals("Verify after search hotel with invalid cheeckOutDate error message ",
				expCheckOutDateErrorMsg, actCheckOutDateErrorMsg);

	}

	/**
	 * @see maintain
	 *      userShouldVerifyAfterSearchHotelWithoutEntryAnyFieldsErrorMessage
	 * @param expSelectLocationErrorMsg
	 */
	@Then("User should verify after search hotel without entry any fields error message {string}")
	public void userShouldVerifyAfterSearchHotelWithoutEntryAnyFieldsErrorMessage(String expSelectLocationErrorMsg) {
		pom.getSearchHotelPage().searchHotelWithOutEnterAnyFields();
		WebElement element = pom.getSearchHotelPage().getTxtSelectLocationErrorMsg();
		String actSelectLocationErrorMsg = getText(element);
		Assert.assertEquals("Verify afetr search hotel without entry any fields error message",
				expSelectLocationErrorMsg, actSelectLocationErrorMsg);

	}

}
