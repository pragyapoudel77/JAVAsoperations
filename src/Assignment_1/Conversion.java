package Assignment_1;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		//F = (9/5 × °C) + 32
		//F-32=(9/5 * C)
		//5(F-32)=9C
		//C=(5(F-32))/9
		
		int Farenheit;
		int Celsius;
		String x;
		
		Scanner F_C= new Scanner(System.in);
		
		System.out.println("Enter the value of Celsius");
		Celsius=F_C.nextInt();
		
		System.out.println("Enter the value of Farenheit");
		Farenheit=F_C.nextInt();
		
		System.out.println("Enter x");
		x=F_C.next();
		
		if(x.equals("Farenheit")) {
			Farenheit =(9/5 *Celsius)+32;
			System.out.println(Farenheit);
		} else if(x.equals("Celsius")){
			Celsius =((Farenheit-32)*5)/9;
			System.out.println(Celsius);
		}else {
			System.out.println("Invalid input");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
