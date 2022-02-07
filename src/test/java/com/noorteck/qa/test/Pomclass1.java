package com.noorteck.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass1 {
	@FindBy(xpath="/html/body/app-root/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[3]/ul/li[2]/a/span")
	private WebElement tranferlink;
	
	@FindBy(xpath="//*[@class='mat-select-placeholder ng-tns-c12-2 ng-star-inserted']")
	private WebElement originaccount1;
	
	@FindBy(xpath="//*[@id=\"mat-option-5\"]/span")
	private WebElement originaccount2;
	
	
	@FindBy(xpath="//*[@class='mat-select-placeholder ng-tns-c12-4 ng-star-inserted']")
	private WebElement destinationaccount1;
	
	@FindBy(xpath="//*[@id=\"mat-option-7\"]/span")
	private WebElement destinationaccount2;
	
	@FindBy(xpath="//*[@id=\"mat-input-0\"]")
	private WebElement amountfield;
	
	@FindBy(xpath="//*[@id=\"mat-input-1\"]")
	private WebElement socialsecuirtynumberfield;
	
	@FindBy(xpath="//*[@id=\"mat-input-2\"]")
	private WebElement pincodefield;
	
	@FindBy(xpath="//button[@class='v24DomSyncDenyAgent mat-raised-button mat-primary']")
	private WebElement transferbutton;
	
	@FindBy(partialLinkText ="Success! Funds successfully transferred.")
	private WebElement verifytext;
	
	public Pomclass1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void transferlinkclick()
	{
		tranferlink.click();
	}
	
	public void originaccountdpwn1()
	{
		originaccount1.click();
	}
	
	public void origindpdwn2()
	{
		originaccount2.click();
	}
	
	public void destinationacc1()
	{
		destinationaccount1.click();
	}
	
	public void destinationacc2()
	{
		destinationaccount2.click();
	}
	
	
	public void amountfield(String amt)
	{
		amountfield.sendKeys(amt);
	}
	
	
	public void socialsecurity(String num)
	{
	socialsecuirtynumberfield.sendKeys(num);
	}
	
		public void pintextfield(String code)
		{
			pincodefield.sendKeys(code);
			
		}
		
		
		public void transferbutton()
		{
			transferbutton.click();
		}
		
		
		public void verifytextmessage()
		{
			boolean b = verifytext.isDisplayed();
			System.out.println(b);
		}
		
		@FindBy(xpath="/html/body/app-root/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[3]/ul/li[4]/a/span")
		private WebElement loanlink;
		
		@FindBy(xpath="//*[@id=\"mat-input-0\"]")
		private WebElement nametextfield;
		
		@FindBy(xpath="//*[@id=\"mat-input-1\"]")
		private WebElement addresstextfield;
		
		@FindBy(xpath="//div[@class='mat-select-arrow']")
		private WebElement loantypedp;
		
		@FindBy(xpath="//span[.=' Retirement ']")
		private WebElement loanrepaydp1;
		
		@FindBy(xpath="//*[@id=\"mat-input-2\"]")
		private WebElement repaytextfield;
		
		@FindBy(xpath="//*[@id=\"mat-input-2\"]")
		private WebElement yearrepay;
		
		@FindBy(xpath="//span[@class='mat-button-wrapper']")
		private WebElement  nextbuttn ;
		
		public void loanlink()
		{
			loanlink.click();
		}
		
		
		public void nametextfield(String name)
		{
			nametextfield.sendKeys(name);
		}
		
		public void addresstextfield(String add)
		{
			addresstextfield.sendKeys(add);
		}
		
		public void loanrepaydpdwn() {
			loantypedp.click();
		}
		
		public void loanrepaydwn()
		{
			loanrepaydp1.click();
		}
		
		public void loanrepayyear(String year)
		{
			yearrepay.sendKeys(year);
		}
		
		public void nextbutton() {
			nextbuttn.click();
			
		}
		
}
