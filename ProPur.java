package assignment3;

import java.time.LocalDate;
import java.util.Scanner;

public class ProPur {
	
	public static void main(String[] args) {
		
		String in=new String();
		String out=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the purchase date");
		in=sc.nextLine();
		LocalDate d=LocalDate.parse(in);
		System.out.println("enter the warentee month");
		int mon=sc.nextInt();
		System.out.println("enter the warentee year");
		int yr=sc.nextInt();
		
		LocalDate expd=d.plusYears(yr).plusMonths(mon);
		System.out.println(expd);
		
	}

}
