package assignment4;

public class Account {
	private long accNum;
	private double balance=500;
	private Person accHolder;
	
	public long getAccountNumber()
	{
		return accNum;
	}
	public void setAccNum(long accNum)
	{
		this.accNum=accNum;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public Person getAccHolder()
	{
		return accHolder;
	}
	public void setAccHolder(Person accHolder)
	{
		this.accHolder=accHolder;
	}
   void deposit(double amount) {
		
		balance+=amount;
	}
	
	void withdraw(double amount) {
		
		balance-=amount;
	}
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accNum + ", balance=" + balance + ", accountHolder=" + accHolder
				+ "]";
	}
		
}