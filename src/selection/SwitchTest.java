package selection;

public class SwitchTest {
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Dherai option,--yeta value check huncha
	 * 
	 * switch(variable){
	 * 		case "Ram":
	 * 			//Statements
	 * 			  break;
	 * 
	 * 		case "":
	 * 			//Statements
	 * 			  break;
	 * 
	 * 		case 3:
	 * 			//Statements
	 * 				break;
	 * 		default:  
	 * 
	 *  
	 *  Case can be character, digit,symbols,etc
	 *  
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		int day=3;
		
		
		
		switch(day) {
			case 1:
				System.out.println("Sunday");
				break;
			
			case 2: 
				System.out.println("Monday");
				break;
			
			case 3:
				System.out.println("Tuesday");
				break;
				
			case 4:
				System.out.println("Wednesday");
				break;
				
			case 5:
				System.out.println("Thursday");
				break;
			
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
				
			default:
				System.out.println("Invalid input");
			}
		
	}
	
}
