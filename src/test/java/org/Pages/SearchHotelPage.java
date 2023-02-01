package org.Pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author K.G.N
 *
 * @see used to maintain all SearchHotelPage webelement locator
 */
public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "location")
	private WebElement ddnLocation;

	@FindBy(id = "username_show")
	private WebElement txtLoginSuccessMsg;

	@FindBy(id = "hotels")
	private WebElement ddnHotesls;

	@FindBy(id = "room_type")
	private WebElement ddnRoomType;

	@FindBy(id = "room_nos")
	private WebElement ddnRoomNo;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement ddnAdultInRoom;

	@FindBy(id = "child_room")
	private WebElement ddnChildrenInRoom;

	@FindBy(id = "Submit")
	private WebElement btnSearch;

	@FindBy(id = "checkin_span")
	private WebElement txtcheckInDateErrorMsg;

	@FindBy(id = "checkout_span")
	private WebElement txtcheckOutDateErrorMsg;

	@FindBy(id = "location_span")
	private WebElement txtselectLocationErrorMsg;

	public WebElement getTxtSelectLocationErrorMsg() {
		return txtselectLocationErrorMsg;
	}

	public WebElement getTxtCheckInDateErrorMsg() {
		return txtcheckInDateErrorMsg;
	}

	public WebElement getCheckOutDateErrorMsg() {
		return txtcheckOutDateErrorMsg;
	}

	public WebElement getDdnLocation() {
		return ddnLocation;
	}

	public WebElement getTxtLoginSuccessMsg() {
		return txtLoginSuccessMsg;
	}

	public WebElement getDdnHotesls() {
		return ddnHotesls;
	}

	public WebElement getDdnRoomType() {
		return ddnRoomType;
	}

	public WebElement getDdnRoomNo() {
		return ddnRoomNo;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getDdnAdultInRoom() {
		return ddnAdultInRoom;
	}

	public WebElement getDdnChildrenInRoom() {
		return ddnChildrenInRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	/**
	 * @see maintain searchCommanStep
	 * @param location
	 * @param numberOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 */

	public void searchCommanStep(String location, String numberOfRooms, String checkInDate, String checkOutDate,
			String adultsPerRoom) {
		insertValueText(getDdnLocation(), location);
		insertValueText(getDdnRoomNo(), numberOfRooms);
		clearText(getTxtCheckInDate());
		insertValueText(getTxtCheckInDate(), checkInDate);
		clearText(getTxtCheckOutDate());
		insertValueText(getTxtCheckOutDate(), checkOutDate);
		elementClick(getDdnAdultInRoom());
		insertValueText(getDdnAdultInRoom(), adultsPerRoom);

	}

	/**
	 * @see maintain searchHotel
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param numberOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 * @param childrenPerRoom
	 */

	public void searchHotel(String location, String hotels, String roomType, String numberOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childrenPerRoom) {

		searchCommanStep(location, numberOfRooms, checkInDate, checkOutDate, adultsPerRoom);
		insertValueText(getDdnHotesls(), hotels);
		insertValueText(getDdnRoomType(), roomType);
		insertValueText(getDdnChildrenInRoom(), childrenPerRoom);
		elementClick(getBtnSearch());

	}

	/**
	 * @see maintain searchHotelManatoryFields
	 * @param location
	 * @param numberOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 */

	public void searchHotelManatoryFields(String location, String numberOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom) {
		searchCommanStep(location, numberOfRooms, checkInDate, checkOutDate, adultsPerRoom);
		elementClick(getBtnSearch());

	}

	/**
	 * @see maintain searchHotelWithOutEnterAnyFields
	 */
	public void searchHotelWithOutEnterAnyFields() {
		elementClick(getBtnSearch());

	}

}
