package assignment4;

import demo.Person;

public class AccMain {
	
	private static int id=1000;
	public static int generateId()
	{
		return ++id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p1=new Person();
Account a1=new Account();
Account a2=new Account();
SavAcc s=new SavAcc(id, p1);
CurAcc c=new CurAcc(id, p1);
p1.setName("smith");
Person p2=new Person();
a1.setBalance(2000.0);
p2.setName("kathy");
a2.setBalance(3000);
a1.setAccNum(AccMain.generateId());
a2.setAccNum(AccMain.generateId());
a1.deposit(2000);
a2.withdraw(2000);
System.out.println("Balance of"+"+p1.getName()+" +"is:"+a1.getBalance());
System.out.println("Balance of"+"+p2.getName()+" +"is:"+a2.getBalance());
System.out.println(p1.toString());
System.out.println(p2.toString());
System.out.println(a1.toString());
System.out.println(a2.toString());
s.withdraw(4000);
c.withdraw(3000);

	}

}
