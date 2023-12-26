package basicsQuestionsStreamApi;

import java.util.Arrays;
import java.util.List;

public class NinthQuestion {

//Question:9. Given a list of integers, sort all the values present in
//				it using Stream functions?	
	
	
	public static void main(String[] args) {
		
		
		List<Integer> lst = Arrays.asList(5,15,1,0,47,2);
		
		lst.stream()
		.sorted()
		.forEach(System.out::println);
		
		

	}

}
