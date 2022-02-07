package com.noorteck.qa.test;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoanPage;
import com.noorteck.qa.utils.CommonUI;

public class Testclass {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://usdemo.vee24.com/#/transactions";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		HomePage h2 = new HomePage();
		LoanPage l2 = new LoanPage();
		h2.loanslink();
		l2.nametextfield("sajia");
		l2.addresstext("abc123efg");
		l2.loandropdown();
		Thread.sleep(4000);
		l2.loandropdown1();
		l2.loanrepayyeartextfield("2");
		Thread.sleep(4000);
		l2.nextbutton1();
		l2.amounttxtfield("1000");
		l2.mothermaidentextfield("abcd");
		l2.securitynumbertextfield("1235");
		l2.nextbutton2();
		l2.confirmbutton();

	}

}
