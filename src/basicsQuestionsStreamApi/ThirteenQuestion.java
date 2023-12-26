package basicsQuestionsStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThirteenQuestion {

//Question No:13. Write a Java 8 program to concatenate two Streams?	
	
	public static void main(String[] args) {

	List<String> lst1 = Arrays.asList("a","b");
	

	List<String> lst2 = Arrays.asList("c","d","e");
		
	List<String> concatStream = Stream.concat(lst1.stream(), lst2.stream())
								.collect(Collectors.toList());
	
	
	System.out.println(concatStream);
	
	
	}

}
