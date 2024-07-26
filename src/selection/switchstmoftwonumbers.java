package selection;

import java.util.Scanner;

public class switchstmoftwonumbers {
	public static void main(String[] args) {
		//   Q2> WAP to calculate +,-,*,/ of two int values using switch.
		
		int a;
		int b;
		int result;
		char operator;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		
		
		System.out.println("Enter the operator that you want to use");
		operator=sc.next().charAt(0);
		
		switch(operator) {
		case '+':
			result=a+b;
			System.out.println(result);
			break;
			
		case '-':
			result=a-b;
			System.out.println(result);
			break;
			
		case '*':
			result=a*b;
			System.out.println(result);
			break;
		
		case '/':
			result=a/b;
			System.out.println(result);
			break;
		
		default:
			System.out.println("Invalid Output");
		}
		
			
		
		
		
		
		
		
	}
}
