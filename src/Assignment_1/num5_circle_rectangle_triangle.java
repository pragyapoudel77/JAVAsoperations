package Assignment_1;

import java.util.Scanner;

public class num5_circle_rectangle_triangle {
	public static void main(String[] args) {
		
		//Area of a circle
		float radius;
		
		float PI=3.14f;
		
		float Area_of_circle;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value of radius");
		radius = sc.nextFloat();
		
		Area_of_circle = PI *radius *radius;
		
		System.out.println("Area of circle is"+Area_of_circle);
		
		
		//Area of rectangle 
		float length;
		float breadth;
		
		float Area_of_rectangle;
		
		Scanner l_b = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle");
		length = l_b.nextFloat();
		
		System.out.println("Enter the breadth of rectangle");
		breadth = l_b.nextFloat();
		
		Area_of_rectangle= length *breadth;
		System.out.println(Area_of_rectangle);
		
		//Area of triangle
		
		float base;
		float height;
		
		float Area_of_triangle;
		
		Scanner b_h=new Scanner(System.in);
		
		System.out.println("Enter the value of base of a traingle");
		base = b_h.nextFloat();
		
		System.out.println("Enter the value of height of a triangle");
		height = b_h.nextFloat();
		
		Area_of_triangle = (base*height)/2;
		System.out.println(Area_of_triangle);
		
		
		
		
		
		
		
		
		
	}
}
