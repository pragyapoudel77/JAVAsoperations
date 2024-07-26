package looping;

public class EnhanceForLoop {
	/*
	 * 
	 * 
	 * Enhanced For loop/ForEach loop
	 * 
	 *  #use to read data from collection(atleast array,list,set,map)
	 *  
	 *  
	 *  #syntax:
	 *  	for(data_type var : collection){
	 *  
	 *  		//statements
	 *  }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		int[] data = {24,3,4,56,73,23,44};
		
		int sum=0;
		
		for( int x:data) {  //x is variable;
			//System.out.println(x);
			sum=sum+x;
			
		}
		System.out.println(sum);
		
		
		
		
	}
}
