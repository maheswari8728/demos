package demo;

import java.util.Scanner;

public class AgeExMain {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ur age::");
        int age=s.nextInt();
         try
         {
        	 if(age<18)
        		 throw new AgeExp("valid age");
        	 else
        		 System.out.println("valid age");
        		 
         }
		catch(AgeExp e)
         {
			System.out.println("e");
         }
		
	}

}
