import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Duration1 {
	public static void main(String[] args) {
		
		String in=new String();
		String out=new String();
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter first date");
		in=s.nextLine();
		System.out.println("enter second date");
		out=s.nextLine();
		 
		LocalDate ed=LocalDate.parse(in);
		LocalDate ed1=LocalDate.parse(out);
		Period p=ed.until(ed1);
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
		
		
		
		
	}

}
