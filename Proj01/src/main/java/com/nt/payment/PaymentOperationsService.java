package com.nt.payment;

public class PaymentOperationsService {
	public String doCreditCardPayment() {
		return "credit card payment is done";
	}
	public String doDebitCardPayment() {
		return "debit card payment is done";
	}
	public String UPIPayment() {
		return "UPI Payment is done";
	}
	public void Unkn() {
		System.out.println("gg");
	}
}
