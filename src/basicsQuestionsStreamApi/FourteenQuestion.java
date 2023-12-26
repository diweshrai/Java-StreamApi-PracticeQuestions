package basicsQuestionsStreamApi;

import java.util.Arrays;
import java.util.List;

public class FourteenQuestion {

	
//Question No:14. Java 8 program to perform cube on list 
//					elements and filter numbers greater than 50.	
	
	public static void main(String[] args) {
		
		
		List<Integer> lst = Arrays.asList(1,6,8,7,4);
		
		lst.stream()
			.map(i-> i*i*i)
			.filter(i-> i>50)
			.forEach(System.out::println);
		

	}

}
