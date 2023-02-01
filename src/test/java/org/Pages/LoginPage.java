package org.Pages;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author K.G.N
 *
 * @see used to maintain all LoginPage WebElement Locator
 */
public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement btnLogin;

	@FindBy(xpath = "//b[contains(text(),'Invalid Login details or Your Password might have expired. ')]")
	private WebElement txtLoginErrorMsg;

	public WebElement getTxtLoginErrorMsg() {
		return txtLoginErrorMsg;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	/**
	 * @see maintain loginCommanStep
	 * @param username
	 * @param password
	 */
	private void loginCommanStep(String username, String password) {
		insertValueText(getTxtUserName(), username);
		insertValueText(getTxtPassword(), password);

	}

	/**
	 * @see maintain login
	 * @param username
	 * @param password
	 */
	public void login(String username, String password) {
		loginCommanStep(username, password);
		elementClick(getBtnLogin());
	}

	/**
	 * @see maintain loginWithEnterKey
	 * @param username
	 * @param password
	 * @throws AWTException
	 */
	public void loginWithEnterKey(String username, String password) throws AWTException {
		loginCommanStep(username, password);
		Robot robot = new Robot();
		for (int i = 0; i < 2; i++) {
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	/**
	 * @see maintain loginInvalidCredentials
	 * @param username
	 * @param password
	 */
	public void loginInvalidCredentials(String username, String password) {
		loginCommanStep(username, password);
		elementClick(getBtnLogin());
	}

}
