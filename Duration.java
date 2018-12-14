import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Duration {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the date");
		String s=scan.nextLine();
		
		LocalDate eDate=LocalDate.parse(s);
		
		LocalDate d=LocalDate.now();
		Period period=eDate.until(d);
	    System.out.println(period.getDays());
	    System.out.println(period.getMonths());
	    System.out.println(period.getYears());
	
	}
}
