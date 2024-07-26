package switchstm;

import java.util.Scanner;

public class switchstm {
	
		/*   Q1>  WAP to calculate total salary of following post :
		 *   
		 *      post         basic salary      bonus   total salary 
		 *    ---------     --------------    -------  --------------
		 *    MD                 230000         20%         ?
		 *    CEO                250000         25.79%      ?
		 *    MANAGER            176000         16 %        ?
		 *    HELPER             145900         9%          ?
		 *  ---------------------------------------------------
		 *  
		 *  Q2> WAP to calculate +,-,*,/ of two int values using switch.
		 *  
		 *    char op = sc.next().chatAt(0);
		 */
		
		
	public static void main() {
		double basic_salary;
		String post;
		double total_salary=1;
		float bonus;
		
		Scanner sc = new Scanner(System.in);
		post= sc.nextLine();
		System.out.println("Enter the post:");
		
		if(post.equals("MD")) {
			basic_salary = 230000;
			bonus = 20;
			total_salary=((bonus+100)/100)*total_salary;
		}else {
			basic_salary = 250000;
			bonus = 25.79f;
			total_salary=((bonus+100)/100)*total_salary;
		}
		
		
	}
}
