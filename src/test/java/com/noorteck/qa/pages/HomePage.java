package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "(//span[.='Transfer'])[2]")
	WebElement transferlink;

	@FindBy(xpath = "(//span[.='Loans'])[2]")
	WebElement loanslink;

	@FindBy(xpath = "(//span[.='LogOut'])[2]")
	WebElement logoutlink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void transferclick() {

		click(transferlink);
	}

	public void loanslink() {
		click(loanslink);
	}

	public void logoutlink() {
		click(logoutlink);
	}

}
