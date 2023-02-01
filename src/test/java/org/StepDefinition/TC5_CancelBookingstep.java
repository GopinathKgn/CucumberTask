package org.StepDefinition;

import java.io.IOException;

import org.Base.BaseClass;
import org.Manager.PageObjectManager;
import io.cucumber.java.en.When;

/**
 * 
 * @author K.G.N
 *
 * @see used to maintain all TC5_CancelBookingstep
 */
public class TC5_CancelBookingstep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see maintain
	 *      userShouldPerformCancelBookingByPassingTheGeneratedOrderIdInBookedItineraryPage
	 * @throws IOException
	 */

	@When("User should perform cancel booking by passing the generated order id in Booked Itinerary page")
	public void userShouldPerformCancelBookingByPassingTheGeneratedOrderIdInBookedItineraryPage() throws IOException {
		pom.getBookingConfirmPage().bookedItinerary();
		pom.getCancelBookingPage().cancelOrderId(getCellValue("Cucumber", 1, 0));

	}

	/**
	 * @see maintain
	 *      userShouldPerformCancelBookingByPassingTheExistingInBookedItineraryPage
	 * @param orderId
	 * @throws InterruptedException
	 */
	@When("User should perform cancel booking by passing the existing {string} in Booked Itinerary page")
	public void userShouldPerformCancelBookingByPassingTheExistingInBookedItineraryPage(String orderId)
			throws InterruptedException {
		pom.getBookingConfirmPage().bookedItinerary();
		pom.getCancelBookingPage().cancelOrderId(orderId);

	}

}
