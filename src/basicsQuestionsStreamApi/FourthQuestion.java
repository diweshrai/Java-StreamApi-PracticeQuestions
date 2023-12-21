package basicsQuestionsStreamApi;

import java.util.Arrays;
import java.util.List;

public class FourthQuestion {

	// Question No:4 -> Given the list of integers, find the first element of the
	// list using Stream functions?

	public static void main(String[] args) {

		// Method 1

		List<Integer> lst = Arrays.asList(10, 20, 5, 4, 2);

		lst.stream().findFirst().ifPresent(System.out::println);

	
		
		
		
		// Method 2
		
		
		for(Integer i : lst) {
			System.out.println(i);
			break;
		}
		
		
	
		
		
		//Method 3 
		
		
		Integer[] lst3 = lst.stream()
							.map(Integer::valueOf).    // Converting to Array
							toArray(Integer[]::new);

		for (int i = 0;;) {
			System.out.println(lst3[i]);
			break;
		}

		
		
		// Method 4
		
		int[] lst2 = { 5, 2, 3, 1 };

		for (int i = 0;;) {
			System.out.println(lst2[i]);
			break;
		}

	
	
	
	
	
	
	}

}
