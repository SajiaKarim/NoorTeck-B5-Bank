package com.noorteck.qa.utils;

import com.noorteck.qa.pages.LoanPage;
import com.noorteck.qa.pages.TransferPage;

public class ObjInitialize extends Constants {
	
	 
	
	public  static void initializeClassObj() {
		//initialize each page class objects here..
		transferPageObj = new TransferPage();
		loanPageObj = new LoanPage();
		
	}

}
