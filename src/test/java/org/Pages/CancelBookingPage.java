package org.Pages;

import org.Base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author K.G.N
 * 
 * @see used to maintain all CancelBookingPage WebElement locator
 */
public class CancelBookingPage extends BaseClass {

	public CancelBookingPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "order_id_text")
	private WebElement txtOrderId;

	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;

	@FindBy(xpath = "//input[@name='ids[]']")
	private WebElement chkBox;

	@FindBy(name = "cancelall")
	private WebElement btnCancel;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement btnCancelOrderId;

	@FindBy(id = "search_result_error")
	private WebElement txtcancelBookingSuccessMsg;

	public WebElement getTxtCancelBookingSuccessMsg() {
		return txtcancelBookingSuccessMsg;
	}

	public WebElement getBtnCancelOrderId() {
		return btnCancelOrderId;
	}

	public WebElement getTxtOrderId() {
		return txtOrderId;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getChkBox() {
		return chkBox;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	/**
	 * @see maintain cancelOrderId
	 * @param orderId
	 */
	public void cancelOrderId(String orderId) {

		insertValueText(getTxtOrderId(), orderId);
		elementClick(getBtnGo());
		elementClick(getChkBox());
		elementClick(getBtnCancelOrderId());
		alertOk();

	}

}
