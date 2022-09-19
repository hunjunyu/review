package baic1;

/*
 * 반복문 : For, while, do~while
 * 
 * (1)for (초기치; 조건문; 증가치){
 *         반복구문
 *       }
 */

public class Ex03_for개념 {

	public static void main(String[] args) {
		
		// 1) 1부터 10까지 숫자 출력
		for (int a = 1; a<=5; a++) {
			System.out.print(a + "\t");
		}
		/*System.out.println();
		//2) 'a'부터 'z' 까지 출력	
		for (char ab = 'A';ab <= 'Z'; ab++ ) {
			System.out.print(ab+" ");
		}
		System.out.println();
		//2) 'a'부터 'z' 까지 출력	
		for (char ab = 'A';ab <= 'Z'; ab += 2 ) {
			System.out.print(ab+" ");
		}
		*/
		System.out.println();
		//2) 'a'부터 'z' 까지 출력	
		for (char ab = 'Z';ab >= 'A'; ab-- ) {
			System.out.print(ab+" ");
		}
		System.out.println();
		
		int b = 0;
		int count = 0;
		for (int a = 1; a<11; a++) {
		   count += a;
		  
		}
		System.out.println(count);
		
		for (int a = 1; a<11; a+=2) {
			System.out.print(a+ " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
