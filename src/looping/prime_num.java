package looping;

import java.util.Scanner;

public class prime_num {
	public static void main(String[] args) {
		// 1
		int n;
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		n = sc.nextInt();
		
      	int cnt = 0;
		 
		for(int i=2; i<n; i++) {
			
			  if(n%i == 0) {
				  cnt++;
				  break;
			  }
		}
		
		
		if(cnt == 0) {
			System.out.println(n+"  is prime");
		}else {
			System.out.println(n+" is not prime");
		}
		
		
		
	}
	
	
	/*
	 * 
	 * 
	 * 1.WAP to check prime number.
	 * 2.WAP to print prime numbers between 1 to 100
	 * 3.WAP to count prime numbers of given range.
	 * 4.WAP to reverse given number
	 * 5.WAP to find sum of digits of a given number
	 *  
	 * 
	 * */
}
