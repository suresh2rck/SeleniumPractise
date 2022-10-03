package com.tcf.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='amount']")
	private WebElement amount_txt;

	public WebElement getamount_txt() {
		return amount_txt;

	}

	public Homepage(WebDriver mdriver) {

		this.driver = mdriver;
		PageFactory.initElements(driver, this);
	}

}
