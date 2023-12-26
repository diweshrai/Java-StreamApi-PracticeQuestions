package basicsQuestionsStreamApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwelveQuestion {

// Quesstion No:12-> 12. How will you get the current date and time using Java 8 Date
//							and Time API?	
	
	public static void main(String[] args) {
		
		System.out.println("Current Local Date"+ LocalDate.now());
		
		System.out.println("Local Time"+ LocalTime.now());
		
		System.out.println("Local Date And Time "+LocalDateTime.now());
	
		

		
// Question Get All the dates btw two dates 		
		
LocalDate sDate  = LocalDate.of(2023, 12, 13);
LocalDate eDate  = LocalDate.of(2023, 12, 17);


long noOfDays = ChronoUnit.DAYS.between(sDate, eDate);


//********** USing Stream APi

List<LocalDate> lst =  Stream.iterate(sDate, date -> date.plusDays(1))
.limit(noOfDays + 1)
.collect(Collectors.toList());
	

System.out.println(noOfDays);
System.out.println(lst);






//  ********** Using Simple For Loop 

List<LocalDate> lst2 = new ArrayList<>();

for(LocalDate date= sDate; !date.isAfter(eDate); date=date.plusDays(1)) {
	System.out.println(date+" days"+ date.getDayOfWeek());
	lst2.add(date);
}


System.out.println(lst2);



	}
	
	
}
