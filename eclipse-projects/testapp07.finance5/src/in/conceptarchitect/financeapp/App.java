package in.conceptarchitect.financeapp;

import java.util.Scanner;

import in.conceptarchitect.finance.Atm;
import in.conceptarchitect.finance.BankAccount;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atm hdfcSultanpur = new Atm();
		hdfcSultanpur.a1.show();
		hdfcSultanpur.a1.deposit(200000);
		hdfcSultanpur.a1.creditInterest();
		hdfcSultanpur.a1.withdraw(500,"jfhf");
		hdfcSultanpur.a1.changePassword("jfhf","new@jfhf");
       hdfcSultanpur.a1.show();		
		

		
		
		
		
	}

}
