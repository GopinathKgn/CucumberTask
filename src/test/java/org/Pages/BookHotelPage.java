package org.Pages;

import java.util.List;

import org.Base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;

/**
 * 
 * @author K.G.N
 * 
 * @ see used to maintain all BookHotel WebElement Locator
 */
public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement txtSelectHotelSuccessMsg;

	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@FindBy(id = "address")
	private WebElement txtAddress;

	@FindBy(id = "cc_num")
	private WebElement txtCreditCardNo;

	@FindBy(id = "cc_type")
	private WebElement ddnCreditCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement ddnExpMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement ddnExpYear;

	@FindBy(id = "cc_cvv")
	private WebElement txtCvvNo;

	@FindBy(id = "book_now")
	private WebElement btnBookNow;

	@FindBy(id = "first_name_span")
	private WebElement txtFirstNameErrorMsg;

	@FindBy(id = "last_name_span")
	private WebElement txtLastNameErrorMsg;

	@FindBy(id = "address_span")
	private WebElement txtAddressErrorMsg;

	@FindBy(id = "cc_num_span")
	private WebElement txtCcNumberErrorMsg;

	@FindBy(id = "cc_type_span")
	private WebElement txtCcTypeErrorMsg;

	@FindBy(id = "cc_expiry_span")
	private WebElement txtCcExpiryErrorMsg;

	@FindBy(id = "cc_cvv_span")
	private WebElement txtCvvNumberErrorMsg;

	public WebElement getTxtFirstNameErrorMsg() {
		return txtFirstNameErrorMsg;
	}

	public WebElement getTxtLastNameErrorMsg() {
		return txtLastNameErrorMsg;
	}

	public WebElement getTxtAddressErrorMsg() {
		return txtAddressErrorMsg;
	}

	public WebElement getTxtCcNumberErrorMsg() {
		return txtCcNumberErrorMsg;
	}

	public WebElement getTxtCcTypeErrorMsg() {
		return txtCcTypeErrorMsg;
	}

	public WebElement getTxtCcExpiryErrorMsg() {
		return txtCcExpiryErrorMsg;
	}

	public WebElement getTxtCvvNumberErrorMsg() {
		return txtCvvNumberErrorMsg;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement geTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCardNo() {
		return txtCreditCardNo;
	}

	public WebElement getDdnCreditCardType() {
		return ddnCreditCardType;
	}

	public WebElement getDdnExpMonth() {
		return ddnExpMonth;
	}

	public WebElement getDdnExpYear() {
		return ddnExpYear;
	}

	public WebElement getTxtCvvNo() {
		return txtCvvNo;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getTxtSelectHotelSuccessMsg() {
		return txtSelectHotelSuccessMsg;
	}

	/**
	 * @see maintain bookHotelPayment
	 * @param dataTable
	 */
	public void bookHotelPayment(DataTable dataTable) {
		getTxtSelectHotelSuccessMsg();

		List<List<String>> asLists = dataTable.asLists();
		List<String> row = asLists.get(1);
		String creditCardNo = row.get(0);
		String creditCardType = row.get(1);
		String expMonth = row.get(2);
		String expYear = row.get(3);
		String cvvNo = row.get(4);
		clearText(getTxtCreditCardNo());
		insertValueText(getTxtCreditCardNo(), creditCardNo);
		elementClick(getDdnCreditCardType());
		insertValueText(getDdnCreditCardType(), creditCardType);
		insertValueText(getDdnExpMonth(), expMonth);
		insertValueText(getDdnExpYear(), expYear);
		insertValueText(getTxtCvvNo(), cvvNo);
		elementClick(getBtnBookNow());

	}

	/**
	 * @see maintain bookHotel
	 * @param firstname
	 * @param lastnamme
	 * @param address
	 */

	public void bookHotel(String firstname, String lastnamme, String address) {
		insertValueText(getTxtFirstName(), firstname);
		insertValueText(geTxtLastName(), lastnamme);
		insertValueText(getTxtAddress(), address);

	}

	/**
	 * @see maintain bookHotelWithOutEntryAnyFields
	 */

	public void bookHotelWithOutEntryAnyFields() {
		elementClick(getBtnBookNow());

	}

}
