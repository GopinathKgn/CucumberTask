package org.Pages;

import java.io.IOException;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author K.G.N
 * 
 * @ see used to maintain all BookingConfirmPage WebElement Locator
 */
public class BookingConfirmPage extends BaseClass {

	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement txtBookHotelSuccssMsg;

	@FindBy(id = "order_no")
	private WebElement txtorderNumber;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement btnBookedItinerary;

	public WebElement getTxtBookHotelSuccessMsg() {
		return txtBookHotelSuccssMsg;
	}

	public WebElement getTxtOrderNumber() {
		return txtorderNumber;
	}

	public WebElement getBtnBookedItinerary() {
		return btnBookedItinerary;
	}

	/**
	 * @see maintain bookingConfirmation
	 * 
	 * @throws IOException
	 */
	public void bookingConfirmation() throws IOException {
		WebElement element = getTxtOrderNumber();
		String orderId = getAttribute(element);
		System.out.println("OrderId:" + orderId);
		writeCellData("Cucumber", 1, 0, orderId);

	}

	/**
	 * @see maintain bookedItinerary
	 */
	public void bookedItinerary() {
		elementClick(getBtnBookedItinerary());

	}

}
