package assignment3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateAge();
	}
		
		static void calculateAge()
		{
			System.out.println("enter date of birth");
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
           LocalDate dob=LocalDate.parse(s);
           LocalDate ld=LocalDate.now();
		
		Period  period=dob.until(ld);
		System.out.println(period.getYears());
		
	}

}
