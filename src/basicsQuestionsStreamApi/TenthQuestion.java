package basicsQuestionsStreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TenthQuestion {

//Question No 10. Given a list of integers, sort all the values present 
//					in it in descending order using Stream functions?	
	
	public static void main(String[] args) {
		
		List<Integer> lst = Arrays.asList(10,15,8,49,25,98,98,32,15);

		//int[] lst2 = {66,2,8,10,15,74};
		
		
		lst.stream()
		.sorted(Collections.reverseOrder())
		.forEach(System.out::println);
		
		
		
		
		
		
	}

}
