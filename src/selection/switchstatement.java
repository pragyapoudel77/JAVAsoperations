package selection;

import java.util.Scanner;

public class switchstatement {
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
	
		public static void main(String[] args) {
			double basic_salary;
			String post;
			double total_salary;
			float bonus;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the post:");
			post= sc.next();
			
			
			if(post.equals("MD")) {
				basic_salary = 230000;
				bonus = 20;
				total_salary=(((bonus+100))*basic_salary)/100;
				System.out.println(total_salary);
				 
			}else if(post.equals("CEO")) {
				basic_salary = 250000;
				bonus = 25.79f;
				total_salary=((bonus+100)/100)*basic_salary;
				System.out.println(total_salary);
				 
				
			}else if(post.equals("MANAGER")) {
				basic_salary = 176000;
				bonus = 16;
				total_salary=((bonus+100)/100)*basic_salary;
				System.out.println(total_salary);
				 
			}else if(post.equals("HELPER")) {
				basic_salary = 145900;
				bonus =9;
				total_salary=((bonus+100)/100)*basic_salary;
				System.out.println(total_salary);
				 
			} else {
				System.out.println("Post mismatch");
				
			
				}
	
		}
	
}
