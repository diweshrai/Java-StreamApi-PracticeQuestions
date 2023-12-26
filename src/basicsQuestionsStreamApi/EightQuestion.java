package basicsQuestionsStreamApi;


import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EightQuestion {
	
// Question no:8
   //Given a String, find the first repeated character in it using Stream functions?	
	
public static void main(String[] args) {
	
	
	String myLine = "Hi how are you";
	
	
	Character result = myLine.chars()
					.mapToObj(e -> Character.toLowerCase(Character.valueOf((char) e)))
					.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new , Collectors.counting()))
					.entrySet()
					.stream()
					.filter(e-> e.getValue() > 1L)
					.map(e-> e.getKey())
					.findFirst()
					.get();
	
	
	System.out.println(result);
	
	
}

}
