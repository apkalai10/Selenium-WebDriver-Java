package com.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class JavaDates {

	
	public static void main(String[] args)  {
		
      Date d = new Date();
      System.out.println(d); //Mon Feb 26 17:34:58 IST 2024
      
      Calendar c = Calendar.getInstance();
      System.out.println(c.getTime()); //Mon Feb 26 17:34:58 IST 2024
      
      SimpleDateFormat sdf = new SimpleDateFormat("EddMMMyy");
      System.out.println(sdf.format(d)); //Mon26Feb24
      
      LocalDate myObj = LocalDate.now(); 
      System.out.println(myObj); //2024-02-26
      
      LocalTime myObj1 = LocalTime.now();
      System.out.println(myObj1); //17:34:59.216052700
      
      LocalDateTime myObj2 = LocalDateTime.now();
      System.out.println(myObj2); //2024-02-26T17:34:59.216052700
      
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EddMMMyy");
      System.out.println(dtf.format(myObj2)); //Mon26Feb24
      
     
      

	}

}
