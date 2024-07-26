package DataType;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		
		float P;
		float T;
		float R;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the value of P");
		P = sc.nextFloat();
		
		System.out.println("Enter the value of T");
		T = sc.nextFloat();
		
		System.out.println("Enter the value of R");
		R = sc.nextFloat();
		
		
		float Simple_Interest = (P*T*R)/100;
		System.out.println("The value of Simple Interest is:"+Simple_Interest);
	}
}
