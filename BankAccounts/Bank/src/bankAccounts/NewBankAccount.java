package bankAccounts;

 class NewBankAccount {

	  final private long accountN0;
	private String name;
	   private String password;
	private double balance= 0;
	 private float interestRate;
	 
	  
   public NewBankAccount(long accountN0) {
	this.accountN0 = accountN0;
	// TODO Auto-generated constructor stub
}

	

	/**
	 * @return the accountN0
	 */
	public long getAccountN0() {
		return accountN0;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
    /**
     * deposit amount
     */
	public void deposit(double amount) {
		
		if (amount>0) {
			this.balance= balance+amount;
			return;
		}
		return;
	}
	
	/**
	 * withdraw
	 */
	 public void  withdraw( double amount, String password) {
		if (amount<=this.balance && password==this.password ) {
			balance=balance-amount;
			return;
		}
		return;
	 }

	/**
	 * @return the interestRate
	 */
	public float getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	/** 
	 * credit monthly interest
	 */
	  void creditMonthlyInterest() {
		  this.balance+=(this.balance*this.interestRate/1200);
		  return;
	  }
	  
	 }
