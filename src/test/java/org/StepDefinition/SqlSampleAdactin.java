package org.StepDefinition;

import org.Base.BaseClass;
import org.Pages.Employee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SqlSampleAdactin extends BaseClass {

	public static void main(String[] args) {

		SqlSampleAdactin sample = new SqlSampleAdactin();
		sample.booking();

	}

	public void booking() {
		browserLanch("https://adactinhotelapp.com/");
		maximizeWindow();
		Employee employee = getDataBaseValue();
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(employee.getName());
		WebElement txtPassWord = driver.findElement(By.id("password"));
		txtPassWord.sendKeys(employee.getPass());
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();

	}

}
