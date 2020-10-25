package com.tixqik.object;

import com.tixqik.behavior.PurchasingTopFrame;
public class Payment {
	public String cardname;
	//private double cardnumber;
	
	Payment(){
		super();
	}
	public Payment(String cm) {
		super();
		cardname = cm;
	}
	public String getCardName () {
		return cardname;
	}
	public void setCardName(String cm) {
		cardname = cm;
	}
}
