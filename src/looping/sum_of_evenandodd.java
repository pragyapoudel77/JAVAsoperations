package looping;

public class sum_of_evenandodd {
	public static void main(String[] args) {
		int i;
		int sum=0;
		int evensum=0;
		int k;
		
		for(i=300;i<=500;i++) {
			
			if((i%2)!=0) {
				
				sum=sum+i;
			}
			
		}
		
			for(k=300;k<=500;k++) {
			
			if((k%2)==0) {
				
				evensum=evensum+k;
			}
			
		}
		System.out.println("Sum of odd numbers:"+sum);
		System.out.println("Sum of odd numbers:"+evensum);
	}
}
