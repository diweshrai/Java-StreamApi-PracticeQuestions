package basicsQuestionsStreamApi;

import java.util.Arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Eleventhquestion {

//Question no	11. Given an integer array nums, return true if any value appears
//	at least twice in the array, and return false if every element is distinct.
	
	public static void main(String[] args) {
		
		int[] inputNums = {1,5,4,7,1};
		
		try {
			boolean res = myFirst(inputNums);
			System.out.println(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
	}
	

	

		
		public static boolean myFirst(int[] nums) {
			List<Integer> lst = Arrays.stream(nums).
								boxed()
								.collect(Collectors.toList());
			
			// Boxed here is used to convert int to Integer
			
			
			
			
			// HashSet only have unique values it only add the unique values
			// when we pass the list to hashSet it only add the unique values and remove 
			// all the dublicates values only.....
			Set<Integer> set = new HashSet<>(lst);
			
			
			
			
			if(set.size() == lst.size()) {
				
				System.out.println(set.size()+ "and" + lst.size());
				
				return false;
			
				
				
			
			}
			 
			System.out.println("set is "+ set);
			System.out.println("list is "+ lst);
			
			System.out.println(set.size()+ "and" + lst.size());
			
			return true;
			
			
			
		}
		
		
	
	
}






