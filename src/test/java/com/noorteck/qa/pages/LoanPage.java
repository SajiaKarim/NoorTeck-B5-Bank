package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoanPage  extends CommonUI{
	
	@FindBy(xpath="//*[@id=\"mat-input-0\"]")
	WebElement nametextfield;
	
	@FindBy(xpath="//*[@id=\"mat-input-1\"]")
	WebElement  addressfield;
	
	
	@FindBy(xpath="//*[@id=\"mat-select-0\"]/div/div[1]/span")
	WebElement loandropdown ;
	
	@FindBy(xpath="//*[@id=\"mat-option-2\"]/span")
	WebElement loandropdwon1 ;
	
	@FindBy(xpath="//*[@id=\"mat-input-2\"]")
	WebElement loanrepayyears ;
	
	
	@FindBy(xpath="//*[@id=\"cdk-step-content-0-0\"]/form/div/button/span")
	WebElement nextbutton1;
	
	@FindBy(xpath="//*[@id=\"mat-input-9\"]")
	WebElement  amounttextfield;

	@FindBy(xpath="//*[@id=\"mat-input-4\"]")
	WebElement mothersmaidentextfield;

	@FindBy(xpath="//*[@id=\"mat-input-5\"]")
	WebElement soialsecuritynumber;

	@FindBy(xpath="//*[@id=\"cdk-step-content-1-1\"]/form/div/button[2]")
	WebElement nextbutton2;

	@FindBy(xpath="//button[@class='v24DomSyncDenyAgent mat-raised-button mat-primary']")
	WebElement confirmbutton ;
	
	public LoanPage() {
		PageFactory.initElements( driver, this);
	}

	public void nametextfield(String name) {
		enter(nametextfield, name);
	}
		
	public void  addresstext(String addr) {
		enter(addressfield, addr);
	}
		
	public void loandropdown() {
		click(loandropdown);
	}
	
	public void loandropdown1() {
		click(loandropdwon1);
	}
	  
	public void loanrepayyeartextfield(String text) {
		enter(amounttextfield,text);
	}
	 
	
	
public void nextbutton1() {
	click(nextbutton1);
}
	
	public void amounttxtfield(String amt) {
	enter(amounttextfield, amt);
	}
	
	public void mothermaidentextfield(String mdtext) {
		enter(mothersmaidentextfield, mdtext);
	}
	
	public void securitynumbertextfield(String ssnum) {
		enter(soialsecuritynumber, ssnum);
	
	}
	
	public void nextbutton2() {
		click(nextbutton2);
	
	}
	
	
	public void confirmbutton() {
		click(confirmbutton);
	
	}
	
		
}

