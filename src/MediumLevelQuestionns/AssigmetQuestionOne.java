package MediumLevelQuestionns;

public class AssigmetQuestionOne {

//Question.No:1-> 1. Write a program that tells if all digits of a number can divide
//	it. If not, it suggests the number that should be added to it such
//	that all its digits can divide it.
	
	public static void main(String[] args) {
		

	int num = 123;
	
	int i;
	
	int res;
	
	
	int temp = 123;
	
	int temp2 = 123;
	
	int temp3 =0;
	
		while(num!=0) {
		
		if(num%10 == 0) {	
		num = num/10;
		
		}
		
		
		else if(temp%(num%10)==0) {
	
			num= num/10;
			System.out.println("in if block");
		}
		
		else{
			
			num = temp+1;
			temp3 = num;
			
		System.out.println("in else block");
		}
		
		
		
		
		
		
		}
		
		
	res= temp3-temp2;
	
	if(res<=0) {
		res= 0;
		System.out.println("No Need to add any Number to "+temp2);
	}
		
	else {
		System.out.println("we have to add "+res);
	}
		
	
	
	
		
	}

}
