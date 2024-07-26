package selection;

import java.util.Scanner;

public class LadderTest {
/*
 * 
 * 
 * 
 * ------------else if------
 * 
 * #syntax
 * 
 * if(condition-1){
 * 	//statements
 * 
 * }else if(condition-2){
 * 
 * }else if(condition-3){
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
	public static void main(String[] args) {
		float marks;
		float grades;
		
		Scanner division = new Scanner(System.in);
		
		System.out.println("Enter the marks and find out grades");
		
		marks=division.nextFloat();
		
		
		if(marks>=80) 
		{
			System.out.println("Distinction");
		}
		else if(marks>=60)
		{
			
			System.out.println("First Division");
		}
		else if(marks>=45) 
		{
			System.out.println("Second Division");
		}
		else if(marks>=32)
		{
			System.out.println("Third Division");
		} 
		else
		{
			System.out.println("Failed!!");
		}
		
	
	}
}
