package com.streamapi;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeAPIDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate date1 = LocalDate.of(2023, Month.APRIL, 12);

	}

}
