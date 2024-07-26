package DataType;

import java.util.Scanner;

public class VariableTest {
	/*
	 * 
	 * Variable-used to store value in a program
	 * #Value Stored for processing
	 * 
	 * Syntax:
	 * data_type var_name
	 * 
	 * */
	public static void main(String[] args) {
		//find sum of 500 and 200
		//1.Data fixed
		//2.data collection
		//3.Data Storage
		//4.Data Processing
		//5.Result
		
		int a = 500;
		int b = 200;
		
		//Scanner class is used to read data from keyboard
		
		Scanner sc = new Scanner(System.in);//new is used to create object ;sc is variable,any name can be used;System.in -keyboard bata line
		
		System.out.println("Enter value of a ");
		a = sc.nextInt();//if a will be float,then it will be nextfloat() // nextInt() is a method
		
		System.out.println("Enter value of b");
		b=sc.nextInt();
		
		int sum = a+b;
		System.out.println("Total="+sum);
		
		//Find Area using scanner
		
		//Find S.I and Amount using scanner
		
		//Convert nepali currency in US Dollar using scanner
		
		//Find area and perimeter of rectangle using scanner
		
		
		
		
		
		
		
		
		
	}
	
	
	
}

