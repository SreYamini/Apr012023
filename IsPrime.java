package week1.day1.assignments;

/*Hint: Iterate through all numbers from 2 to n-1 (input) and 
for every number check if it divides n (input). 
If we find any number that divides, print prime.
If nothing divides, then print non-prime*/

public class IsPrime {
	
	public static void main(String[] args) {
		
		int number = 4;
		int count=0;
		
		for (int i = 1; i <=number; i++) {
			
			if(number%i==0) {
				
				count=count+1;
				
			}
		}
			
			if(count==2)
			{
				System.out.println("The number is prime"+number);
			}
			
			else {
				System.out.println("The number is not prime"+number);
			}
			
		}
	}


