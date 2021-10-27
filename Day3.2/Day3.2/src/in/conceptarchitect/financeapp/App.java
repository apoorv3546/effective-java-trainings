package in.conceptarchitect.financeapp;

import in.conceptarchitect.finance.ATM;
import in.conceptarchitect.finance.Bank;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank B=new Bank(2254,"pa@ss",2500);

		ATM A=new ATM();
		
		A.withdraw(2254,"p@ss",2500);
		A.Deposit(2254, 3000);
		
		A.changePassword("p@ss","apoorv@");
		

		
		
	}

}
