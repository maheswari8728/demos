import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
                                     //user entered input date format
public class ParDate {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter date in dd/mm/yyyy format:");
		String input=scanner.nextLine();
		
		LocalDate enteredDate=LocalDate.parse(input,formatter);
		System.out.println("Entered Date"+enteredDate);
		scanner.close();
		
		
	}
}
