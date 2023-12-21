package basicsQuestionsStreamApi;

import java.util.Arrays;
import java.util.List;

public class FifthQuestion {

//		Question No:5-> Given a list of integers, find the total number of elements present
//					in the list using Stream functions?
	
	
	public static void main(String[] args) {
		
		//Method 1
		
		List<Integer> lst =  Arrays.asList(10,2,1,5,4);
		
		long count =lst.stream().count();  // Return All the Counted Values
		
		System.out.println(count);
		
		
		
	// Method 2
	
		
		
		int totalCount =0;
		
		
		for(Integer i :lst) {
			totalCount++;
		}
		
		System.out.println(totalCount);
		
		
		

	}

}
