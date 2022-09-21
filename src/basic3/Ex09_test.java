package basic3;

public class Ex09_test {

	public static void main(String[] args) {
		
		int sum = sumFunc(500);
		System.out.println("합 :"+ sum);
		

	}

	static int sumFunc(int i) {
		// sum =  1+2+3
		if (i ==1) return 1;
		
		return i +sumFunc(i-1);
	}
	
}
