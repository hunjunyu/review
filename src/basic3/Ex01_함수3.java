package basic3;

public class Ex01_함수3 {

	public static void main(String[] args) {
		
		int [] arr = add();
	    // a와 b 값을 받아서 합한 결과를
		//여기서 출력
		int sum1=0;
		int sum = 0;
	    sum = arr[0]+arr[1];
	    for (int i = 0; i < arr.length; i ++) {
	    	sum1 = sum1 + arr[i];
	    	
	    }
	    System.out.println(sum1);
	    System.out.println(sum);
	}
	
	static int [] add() {
		int a = 10, b= 20;
		int [] arr = {a,b};
		
		return arr;
	}
}
