package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI {
	//locat the elment in store the value 
	
	@FindBy(xpath="//span[@class='mat-select-placeholder ng-tns-c12-2 ng-star-inserted']")
	WebElement originacc;
	
	@FindBy(xpath="//*[@id=\"mat-option-5\"]/span")
	WebElement originacc1 ;
	
	@FindBy(xpath="//*[@class='mat-select-placeholder ng-tns-c12-4 ng-star-inserted']")
	WebElement destinationacc;
	
	@FindBy(xpath="//span[.=' Retirement ']")
	WebElement destinationacc1;
	
	
	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement amounttext ;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement socialsc ;
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement atmpin ;
	
	@FindBy(xpath="//span[.='Transfer Funds']")
	WebElement  transferbutton;
	
	
	
	// create class constructor
	public TransferPage() {
		PageFactory.initElements( driver, this);
	}

public void originclick() {

	click(originacc);
	
}

public void originclick1()   {

click(originacc1);
}

public void destinationclick() {
click(destinationacc);
}


public void destinationclick1() {
	click(destinationacc1);
}

public void amounttexfield(String text) {
	enter(amounttext, text);
}
	
public void sociasecuritynumber(String text) {
	enter(socialsc,text);
}

	public void atmpintextfield(String pin) {
		enter(atmpin,pin);
	}

	public void transferbutton() {
		click(transferbutton);
	}
}
