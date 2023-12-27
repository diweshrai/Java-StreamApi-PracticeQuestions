package MediumLevelQuestionns;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EighteenQuestion {

	// Question No:18. How to count each element/word from 
//	the String ArrayList in Java8?
	
	
	public static void main(String[] args) {

List<String> lst = Arrays.asList("g1","g2","ab");


Map<String, Long>  lst2 = lst.stream()
							.collect(
							Collectors
							.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(lst2);
		
		
		
// Count all the element present in a String		
		
String s1 = "Hello how are you hi i am fine hhh";

Map<Character, Long> s2 = s1.toLowerCase().chars()
							.mapToObj(c-> (char) c)
							.filter(c -> !Character.isWhitespace(c))
							.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
System.out.println(s2);	


s2.forEach((ch , count)-> System.out.println("char is" + " "+ch+" " +"count is"+count));

// Count The max Element in string

Map.Entry<Character, Long> maxEntry = s2.entrySet().stream()
.max(Map.Entry.comparingByValue())
.orElse(null);

// Print the result
if (maxEntry != null) {
System.out.println("Character with Max Occurrences: " + maxEntry.getKey() +
    ", Occurrences: " + maxEntry.getValue());
} else {
System.out.println("No characters found.");
}



// count the target element in a String 



Character tvalue = 'h';

long s3 = s1.toLowerCase().chars()
			.filter(c-> c== tvalue)
			.count();

System.out.println("The count of h is "+s3);

	}

}
