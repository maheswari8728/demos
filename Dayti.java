import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Dayti {
	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		System.out.println(d);
		LocalDate independanceDay=LocalDate.of(1947,Month.AUGUST,15); 
		System.out.println(independanceDay);
		LocalDate obj=LocalDate.MAX;
		System.out.println(obj);
		LocalDate c=LocalDate.MIN;
		System.out.println(c);
	System.out.println(d.isLeapYear());
	System.out.println(d.withDayOfMonth(31));
	System.out.println(d.minusDays(3));
	System.out.println(d.plusDays(10));
	System.out.println(d.lengthOfMonth());
	
		ZonedDateTime currentTime=ZonedDateTime.now();
		System.out.println("India:"+currentTime);
		ZonedDateTime currentTimeInParis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(currentTimeInParis);
		
		
		DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(d.format(formatter));
		DateTimeFormatter fo=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(d.format(fo));
		DateTimeFormatter form=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(d.format(form));
		DateTimeFormatter format=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(d.format(format));
		
		LocalDate birthDate=LocalDate.of(1996,Month.SEPTEMBER,15);
		Period period=birthDate.until(d);
		System.out.println(period.getDays());
		System.out.println(period.getMonths());
		System.out.println(period.getYears());
		
		
				}

}
