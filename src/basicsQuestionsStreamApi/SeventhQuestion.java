package basicsQuestionsStreamApi;

import java.util.LinkedHashMap;

import java.util.function.Function;
import java.util.stream.Collectors;

public class SeventhQuestion {

//  Question 7:-> Given a String, find the first non-repeated
//	character in it using Stream functions?	
	
	
	public static void main(String[] args) {
		

		String myString = "Hi, How Are You";
		


Character result = myString.chars()
					.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
					.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //har ek elemet ko store kia hashmap like
					
// phela h store hua with h, i store with i , now h stores in before h we stores like this h: h,h at last 
// h:h,h -  i:i  - o:o,o - w:w - a:a - r:r  - e:e  - y:y - u:u 
// now count all the elements with key that will store slike this 
// h:2 - i:1 - o:2 - w:1 - a:1 - r:1 - e:1 - y:1 - u:1
// these all are stores till now 					
					
					
					
					.entrySet()   // This converts the map entries into a set of Map.Entry objects.
					.stream()
					.filter(e-> e.getValue()==1L)
// now here we are getting only those elements which are having 1 value with keys 
// like which occurs 1 times in the string..
// so this will only stores these elements i:1 - w:1 - a:1 - r:1 - e:1 - y:1 - u:1					
					
					
					.map(e-> e.getKey())
					.findFirst()
// this find first will get the first charcter from this i:1 - w:1 - a:1 - r:1 - e:1 - y:1 - u:1						
// the first element is i:1.					
					
					.get();

// return the i.

System.out.println(result);
		
	}

}
