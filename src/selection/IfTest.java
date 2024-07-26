package selection;

import java.util.Scanner;

public class IfTest {
	/*
	 * #if-use to implement single condition.
	 * 
	 * 
	 * #syntax :
	 * 
	 * if(condition){
	 * 
	 *		//Statements
	 * }
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		int salary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the salary");
		salary = sc.nextInt();
		
		if(salary<30000) {
			salary =salary+9000;
		}
		System.out.println("Your salary ="+salary);
		
		
		/*Area of circle where value of r is not 0 using scanner*/
		
		//Area of a circle
				float radius;
				
				float PI=3.14f;
				
				float Area_of_circle;
				
				Scanner pi_r = new Scanner(System.in);
				System.out.println("Enter the value of radius");
				radius = pi_r.nextFloat();
				
				
				
				if(radius!=0) {
					
					Area_of_circle = PI *radius *radius;
					
					System.out.println("Area of circle is"+Area_of_circle);
				}
		
	}
	
	
}
