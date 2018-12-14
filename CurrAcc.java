package assignment4;

public class CurrAcc extends Account{
	
	int overdraftLimit=5000;
    
    public void CurAcc(double balance,Person accHolder)
    {
    	super(accNum, balance,accHolder);
    }
    public void withdraw(double money)
    {
    	
        if(overdraftLimit-money>0)
        	super.withdraw(money);
        else
            System.out.println("cannot withdraw above your account overdraft limit");
    }

}
