package assignment5;

public abstract class  Account2 {

	private long accountNumber;
	public double balance=500;
	private Person2 accountHolder;
	void deposit(double amount)
	{
		balance+=amount;
	}
	abstract void withdrawal(double amount);
	
	double getBalance()
	{
		return balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Person2 getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(Person2 accountHolder) {
		this.accountHolder = accountHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account2(long accountNumber, double balance, Person2 accountHolder) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolder = accountHolder;
	}
	public Account2(double balance2, Person2 accountHolder2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", accountHolder=" + accountHolder
				+ "]";
	}
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
	
	
}
