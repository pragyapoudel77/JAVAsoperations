package DataType;

import java.util.Scanner;

public class lenth_of_rectangle {
	public static void main(String[] args) {
		int length;
		int breadth;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of length");
		length=sc.nextInt();
		
		System.out.println("Enter the value of breadth");
		breadth =sc.nextInt();
		
		int Area_of_rectangle = length*breadth;
		System.out.println(Area_of_rectangle);
	}
}
