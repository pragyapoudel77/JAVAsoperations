package Assignment_1;

import java.util.Scanner;

public class Num7_Radius_Length_Volume {
	public static void main(String[] args) {
		float radius_cylinder;
		float Volume;
		float pi =3.14f;
		
		Scanner r_l_v = new Scanner(System.in);
		
		System.out.println("Enter the radius of cylinder");
		radius_cylinder = r_l_v.nextFloat();
		
		Volume=pi *radius_cylinder*radius_cylinder;
		System.out.println(Volume);
		
		
		
		
	}
}
