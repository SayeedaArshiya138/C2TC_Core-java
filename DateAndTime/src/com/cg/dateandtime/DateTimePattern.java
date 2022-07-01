package com.cg.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime myDateobj = LocalDateTime.now();
		System.out.println("Before Formatting" +myDateobj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = myDateobj.format(myFormatObj);
		System.out.println("After Formatting : "+ formattedDate);

	}

}
