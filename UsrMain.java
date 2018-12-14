package assignment6;

import java.util.Scanner;

public class UsrMain {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=s.nextInt();
		try 
		{
		if(age<18)
		throw new AgeException("Invalid age");
		else
			System.out.println("valid age");
		
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}

	}

}
