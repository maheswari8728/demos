package assignment3;

import java.util.Scanner;

public class Positive {
	static boolean res=true;
	
	public boolean sample()
	{
		System.out.println("enter string");
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		 
		for(int i=0;i<s1.length()-1;i++)
		{
			char p=s1.charAt(i);
			int asc=(int)p;
	        char p1=s1.charAt(i+1);
			int asc1=(int)p1;
	        if(asc>=asc1)
	        {
	        	res=false;
	        }
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		Positive st=new Positive();
		st.sample();
		if(res==false)
		{
			System.out.println("negative");
		
		}
		else
		{
			System.out.println("positive");
		}
		
	}

}
