package basicsQuestionsStreamApi;

import java.util.Arrays;
import java.util.List;

public class SixthQuestion {

//	Question No:6 -> Given a list of integers, find the maximum value
//					element present in it using Stream functions?
	
	public static void main(String[] args) {
	
		
		
		// Method 1
		 
		List<Integer> lst  = Arrays.asList(10,2,1,80,5);
		
		
		Integer maxVal=  lst.stream().max(Integer::compare).get();
		
		  System.out.println(maxVal);
		  
		  
		  
		  // Method 2
		  
		  int maxNum =0;
		  
		  for(Integer i : lst) {
			  
			  if(i>maxNum) {
				  maxNum=i;
			  }
			  
			  
		  }
		 
		  
		  System.out.println(maxNum);

	}

}
