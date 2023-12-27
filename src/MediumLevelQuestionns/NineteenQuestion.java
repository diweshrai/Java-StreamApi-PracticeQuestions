package MediumLevelQuestionns;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NineteenQuestion {

//Question No:19. How to find only duplicate elements with 
//      	its count from the String ArrayList in Java8?	
	
	public static void main(String[] args) {
		
		List<String> lst1 = Arrays.asList("aa", "bb","aa");
		
		
Map<String , Long> m1 = lst1.stream()
							.filter(a-> Collections.frequency(lst1,a )>1)
							.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
System.out.println(m1);


	}

}
