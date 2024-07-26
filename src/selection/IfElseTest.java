package selection;

import java.util.Scanner;

public class IfElseTest {
/*use to take exactly 2 conditions
 * use to check exactly 2 conditions
 * 
 * #syntax:
 * 
 * if(condition){
 * 	//statements
 * }else{
 * 	//statements
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number");
		n =sc.nextInt();
		
		if((n%2)==0) {
			//System.out.println(n+" is positive number");
			System.out.println(n+" is an even number");
		}else {
			System.out.println(n+"is an odd number");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
