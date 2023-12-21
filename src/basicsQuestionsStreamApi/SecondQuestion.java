package basicsQuestionsStreamApi;

import java.util.Arrays;
import java.util.List;

public class SecondQuestion {
	
//	Question No:2->     Given a list of integers, find out all the numbers starting with 1 
//							using Stream functions?
			
	
	
	
  public static void main(String[] args) {
	
	 
	  List<Integer> lst = Arrays.asList(10, 5,8,21,11,14,74,190);
	  
	 // First we have to convert all the integer to String to Find The Elements 
	  // After converting int to String USing map() -> we can use filter to startsWith("1")
	  
	  
	  lst.stream().map(e-> e+"")               //  Converting Integer to String
	  			  .filter(i-> i.startsWith("1"))
	  			  .forEach(System.out::println);
	  
	  
	  
	  
	  
	  
}


}
