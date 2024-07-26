package selection;

import java.util.Scanner;

public class NestedTest {
/*
 * 
 * 
 * nested if-else
 * 
 *   # syntax :
 *   
 *   if(){
 *   
 *   	if(){
 *   
 *   		}
 *   	else{
 *   	}
 *   
 *   }	else{
 *   }
 * 
 * 
 * 
 * 
 * */
	
	public static void main(String[] args) {
		String citizen;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your citizenship");
		citizen = sc.next();
		
		
		if(citizen.equals("nepali")) { 
			
			//for string only equals 

			System.out.println("Enter your age");
			age = sc.nextInt();
			
			if(age>=18) {
				System.out.println("You can vote");
				
			}else {
				System.out.println("You are underage!!");
			}
		}else {
			System.out.println("Invalid citizen!!");
		}
	}
}
