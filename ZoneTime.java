package assignment3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ZoneTime {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1=new String();
		System.out.println("enter time zone(Europe/Paris)");
		s1=sc.nextLine();
		ZonedDateTime zd=ZonedDateTime.now(ZoneId.of(s1));
		System.out.println(zd);
	
	}
	

}
