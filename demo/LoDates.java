package demo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class LoDates {
	public static void main(String[] args) {
		
		LocalDate cd1=LocalDate.of(2017, Month.SEPTEMBER, 15);
		LocalDate cd2=LocalDate.of(2018, Month.DECEMBER, 5);
		Period period=cd1.until(cd2);
		System.out.println(period.getDays());
		System.out.println(period.getMonths());
		System.out.println(period.getYears());
		
	}

}
