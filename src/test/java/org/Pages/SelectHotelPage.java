package org.Pages;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author K.G.N
 * 
 * @see used to maintain all SelectHotelPage WebElement Locator
 *
 */
public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement txtSeachHotelSuccesssMsg;

	@FindBy(id = "radiobutton_0")
	private WebElement rdoBtnSelect;

	@FindBy(id = "continue")
	private WebElement btnContinue;

	@FindBy(id = "radiobutton_span")
	private WebElement txtSelectHotelErrorMsg;

	public WebElement getTxtSelectHotelErrorMsg() {
		return txtSelectHotelErrorMsg;
	}

	public WebElement getRdoBtnSelect() {
		return rdoBtnSelect;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtSearchHotelSuccessMsg() {
		return txtSeachHotelSuccesssMsg;
	}

	/**
	 * @see maintain selectHotel
	 */

	public void selectHotel() {
		elementClick(getRdoBtnSelect());
		elementClick(getBtnContinue());

	}

	/**
	 * @see maintain withoutSelectHotel
	 */

	public void withoutSelectHotel() {
		elementClick(getBtnContinue());

	}
}
