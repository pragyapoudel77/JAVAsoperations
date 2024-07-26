package DataType;

import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		
		
		double Area = Math.pow(a,2);;
		System.out.println(Area);
	}
	
}
