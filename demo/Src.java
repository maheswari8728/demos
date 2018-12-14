package demo;

import java.util.Scanner;

public class Src {
	
	public static void main(String[] args) {
		int upChar=0;
		int loChar=0;
		Scanner scanner=new Scanner(System.in);
		/*while(true)
		{*/
			System.out.println("whats your name?");
			String input=scanner.nextLine();
			if(!input.isEmpty())
			{
				for(char ch:input.toCharArray())
				{
					if(!Character.isDigit(ch) && Character.isAlphabetic(ch))
					{
						
				    if(Character.isUpperCase(ch))
				    {
				    	upChar++;
				    }
				    else
				    {
				    	loChar++;
				    }
				    }
				}
				
			}
				
		
		System.out.println("Your name is"+input);
		System.out.println("upchar count"+upChar);
		System.out.println("lochar count"+loChar);
		scanner.close();
	}
}
