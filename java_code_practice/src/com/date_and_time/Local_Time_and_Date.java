/**
 * Date and Time and formating of it
 * 
 * Find Date time of zone using Zone id
 * 
 */
package com.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Local_Time_and_Date {
	public static void main(String[] args) {
		
		//Local Date
		LocalDate ldate= LocalDate.now();
		System.out.println(ldate);
		
		
		//Local Time
		LocalTime ltime= LocalTime.now();
		System.out.println(ltime);
		
		//Local Date Time
		LocalDateTime ldatetime=LocalDateTime.now();
		System.out.println(ldatetime);
		
		
		//Formated Date Time
		System.out.println("Before Formating : "+ ldatetime);
		
		DateTimeFormatter dformate=DateTimeFormatter.ofPattern("E dd-MMM-yyyy HH:mm:ss");
		//MM--> 01,10 but MMM->jan,feb
		//E --> Represent Day Name
		
		String dfor=ldatetime.format(dformate);
		
		System.out.println("After Formating :-- "+dfor);
		
		
		
		//Finding Time from zone id
		ZoneId zid1=ZoneId.of("Asia/Kolkata");
		ZoneId zid2=ZoneId.of("Asia/Tokyo");
		
		LocalTime ltime1= LocalTime.now(zid1);
		LocalTime ltime2= LocalTime.now(zid2);
		
		System.out.println(ltime1);
		System.out.println(ltime2);
		
		
		
		//Compare two time of different zones
		System.out.println(ltime1.isBefore(ltime2));
		
		
		
		//Finding System Default Time Zone
		ZoneId zone=ZoneId.systemDefault();
		
		System.out.println(zone);
		
		
		//Finding Id of Default zone
		
		String id=zone.getId();
		
		System.out.println(id);
	}
}
