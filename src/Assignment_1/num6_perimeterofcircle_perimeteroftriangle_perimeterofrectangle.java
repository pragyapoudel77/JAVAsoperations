package Assignment_1;

import java.util.Scanner;

public class num6_perimeterofcircle_perimeteroftriangle_perimeterofrectangle {
	public static void main(String[] args) {
		
		//Perimeter of circle
		
		
		float pi=3.14f;
		float radius;
		float perimeter_of_circle;
		
		Scanner pi_r = new Scanner(System.in);
		
		System.out.println("Enter the value of radius");
		radius = pi_r.nextFloat();
		
		perimeter_of_circle = 2 * pi*radius;
		System.out.println(perimeter_of_circle);
		
		
		//Perimeter of triangle
		//perimeter = (side1 + side2 + side3)
		
		float side1;
		float side2;
		float side3;
		
		float perimeter_of_triangle;
		Scanner side_1_2_3 = new Scanner(System.in);
		
		System.out.println("Enter the length of side1");
		side1= side_1_2_3.nextFloat();
		
		System.out.println("Enter the length of side2");
		side2= side_1_2_3.nextFloat();
		
		System.out.println("Enter the length of side3");
		side3 = side_1_2_3.nextFloat();
		
		perimeter_of_triangle = side1 + side2 +side3;
		System.out.println(perimeter_of_triangle);
		
		
		
		
		
		
	}
}
