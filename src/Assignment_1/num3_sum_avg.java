package Assignment_1;

import java.util.Scanner;

public class num3_sum_avg {
	public static void main(String[] args) {
		float a;
		float b;
		float sum;
		float average;
		
		Scanner sum1 = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		a = sum1.nextFloat();
		
		System.out.println("Enter the value of b");
		b = sum1.nextFloat();
		
		sum = a +b;
		System.out.println(sum);
		

		average = (a+b)/2;
		System.out.println(average);
		
		
		
		
		
	}
}
