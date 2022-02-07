package com.noorteck.qa.test;

import java.awt.datatransfer.Transferable;

import javax.sql.rowset.spi.TransactionalWriter;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoanPage;
import com.noorteck.qa.pages.TransferPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) throws InterruptedException {
		String url="https://usdemo.vee24.com/#/transactions";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		HomePage h1=new HomePage();
		LoanPage l1=new LoanPage();
		TransferPage t1=new TransferPage();
		Thread.sleep(3000);
		h1.transferclick();
		t1.originclick();
		t1.originclick1();
		t1.destinationclick();
		t1.destinationclick1();
		t1.amounttexfield("1000");
		t1.sociasecuritynumber("12346");
		t1.atmpintextfield("1235");
		t1.transferbutton();
	}
	
}


