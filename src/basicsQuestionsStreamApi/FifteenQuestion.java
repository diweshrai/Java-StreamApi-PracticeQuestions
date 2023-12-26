package basicsQuestionsStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FifteenQuestion {

//Question No:15. Write a Java 8 program to sort an array 
//				and then convert the sorted array into Stream?	
	
	public static void main(String[] args) {
	
		
		int arr[] = { 99, 55, 203, 99, 4, 91 };
		
	      Arrays.parallelSort(arr);
		
		
	  List<Integer> lst=   Arrays.stream(arr).
			  				boxed()
			  				.collect(Collectors.toList());
		
System.out.println(lst);
	  
				

int arr2[] = { 99, 55, 203, 99, 4, 91 };


List<Integer> lst1 =Arrays.stream(arr2)
							.boxed()
							.sorted()
							.collect(Collectors.toList());


System.out.println(lst1);


	}

}
