package basicsQuestionsStreamApi;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThirdQuestion {

//	Question 3:-> How to find duplicate elements in a given integers list 
//				  in java using Stream functions?
	
	
	public static void main(String[] args) {
		
		
		List<Integer> lst = Arrays.asList(2,5,2,4,4,1,0);
		
		
		 Set<Integer> set = new HashSet();
         lst.stream()
               .filter(n -> !set.add(n))
               .forEach(System.out::println);
		
		
		
	}

}
