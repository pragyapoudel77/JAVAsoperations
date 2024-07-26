package looping;

public class DoWhileTest {
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * Do {
		 * //Statements
		 * } while(conditions);
		 * 
		 * 
		 * 
		 * 8*1=8
		 * 8*2=16
		 * ...
		 * ..
		 * 8*10=80
		 * 
		 * */
		int j=8;
		int i=1;
		
		do {
			System.out.println(j+"x"+i+"="+(j*i));
			i++;
		}while(i<=10);
		/*
		for(int i=1;i<=10;i++) {
			int j=8;
				j=j*i;
				System.out.println(j);
		}
		*/
		
		
	}
}
