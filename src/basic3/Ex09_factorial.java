package basic3;

public class Ex09_factorial {
	public static void main(String[] args) {
		
		int fact = factorial(5);
		System.out.println("!="+ fact);
		
		
		
		
	}
	static int factorial(int i) {
		if(i==1) return 2;
		return i * factorial(i-1);
	}
	
	
}
/*
 * 
 *  5! = 5*4*3*2*1
 * 
 * 
*/
