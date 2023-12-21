package basicsQuestionsStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionFirst {

	
//	Question no:1 ->	 Given a list of integers, find out all the even numbers 
//						 that exist in the list using Stream functions?
	public static void main(String[] args) {
		
		
		List<Integer> lst = Arrays.asList(5,2,7,8,10,15);
	
//		First Method
		
		List<Integer> AllEvenNumbers = lst.stream().filter(e-> e%2==0).collect(Collectors.toList());
		
		System.out.println(AllEvenNumbers);


//      Second Method		

		
		lst.stream().filter(e->e%2==0).forEach(System.out::println);
		
		
	}

}
