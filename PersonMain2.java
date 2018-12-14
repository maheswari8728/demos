package assignment5;

public class PersonMain2 {
	
	public static int id=1000;
	public static int generateId()
	{
		return ++id;
	}

	public static void main(String[] args) {
		
		Person2 person=new Person2();
		Person2 person1=new Person2();
		//SavingsAccount sc=new SavingsAccount(id,person);
		//CurrentAccount cc=new CurrentAccount(id,person1);
		person.setName("Smith");
		person.setBalance(2000.0);
		person1.setName("Kathy");
		person1.setBalance(3000.0);
		person.setAccountNumber(PersonMain2.generateId());
		person1.setAccountNumber(PersonMain2.generateId());
		person.deposit(2000.0);
		person1.withdrawal(2000.0);
		System.out.println("Balance of"+" "+person.getName()+" "+"is :"+person.getBalance());
		System.out.println("Balance of"+" "+person1.getName()+" "+"is :"+person1.getBalance());
		System.out.println(person.toString());
		System.out.println(person1.toString());
		//sc.withdraw(4000);
		//cc.withdraw(30000);
	}


}
