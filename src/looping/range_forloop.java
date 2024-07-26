package looping;

import java.util.Scanner;

public class range_forloop {
	public static void main(String[] args) {
		
		int i;
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the first number");
		a=sc.nextInt();
		
		System.out.println("Enter the last number");
		b=sc.nextInt();
		
		for(i=a;i<=b;i++) {
			System.out.println(i);
		}

		
	}
}
