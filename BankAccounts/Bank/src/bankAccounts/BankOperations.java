package bankAccounts;

class BankOperations {
	
	
	public static void main(String[] args) {
		NewBankAccount account1 = new NewBankAccount(123456789);
		//System.out.println();
		System.out.println(account1.getAccountN0());
		account1.setName("Apoorv Srivastava");
		System.out.println(account1.getName());
		account1.setPassword("sample");
		account1.setInterestRate((float) 5.5);
		account1.deposit(100);
		System.out.println(account1.getBalance());
		account1.creditMonthlyInterest();
		System.out.println(account1.getBalance());
		account1.withdraw(50, "sample");
		System.out.println(account1.getBalance());
		
	}
	

}
