package in.conceptarchitect.financeapp;

import java.util.Scanner;

import in.conceptarchitect.finance.Atm;
import in.conceptarchitect.finance.BankAccount;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atm hdfcSultanpur = new Atm();
		hdfcSultanpur.a1.show();
		hdfcSultanpur.a1.deposit(10000);
		hdfcSultanpur.a1.show();

		hdfcSultanpur.a1.creditInterest();
		hdfcSultanpur.a1.show();

		hdfcSultanpur.a1.withdraw(10000,"jfhf");
		hdfcSultanpur.a1.show();

		hdfcSultanpur.a1.changePassword("jfhf","new@jfhf");
        hdfcSultanpur.a1.show();	
       
        
		BankAccount.transfer(hdfcSultanpur.a1,1000, "new@jfhf", hdfcSultanpur.a2);
		 hdfcSultanpur.a1.show();
		
		
		
		
	}

}
