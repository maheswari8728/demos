
package demo;  //method overloading  method

import accounttypes.CurrAcc;
import accounttypes.SavAcc;

public class Client  {
	public static void main(String[] args) {
		
		SavAcc s1=new SavAcc();
		s1.mtd();
		s1.display();
		s1.add();
		s1.add(5,7);
		s1.add(6,2,9);
		CurrAcc s2=new CurrAcc();
		s2.mtd1();
		s2.display();
		
	}


}
