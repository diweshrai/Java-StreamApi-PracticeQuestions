package basicsQuestionsStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SixteenQuestion {

//Question No:16. How to use map to convert object into
//					Uppercase in Java 8?


	
	public static void main(String[] args) {
		
		List<String> lst1 = Arrays.asList("a","ab", "hello");
		
		List<String> lst2 = lst1.stream()
								.map(String::toUpperCase)
								.collect(Collectors.toList());
		
		System.out.println(lst2);
								

	}

}
