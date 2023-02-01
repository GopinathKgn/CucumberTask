package org.Pages;

import org.Base.BaseClass;

public class Employee extends BaseClass {

	private String name;
	private String pass;

	public Employee(String testCaseNo, String name, String pass) {
		this.name = name;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}

}
