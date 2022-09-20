package basic2;

import java.util.Scanner;

/*
 * for : 반복 횟수가 정해진 경우
 * while : 반복 횟수를 모르는 경우
 * do ~ while : 반복 횟수를 모르는 경우 (조건을 나중에 비교)
 * 
 * 
 */


public class Ex02_반복문구분 {

	public static void main(String[] args) {
		// 구구단의 단수를 입력받아서 해당 단의 구구단을 출력

		//System.out.println("몇번을 반복을 할까요");
		//System.out.println("구구단 단수를 입력해주세요.");

		Scanner sc = new Scanner(System.in);
		//int su = sc.nextInt();
		

		//for 문
		/*int a = sc.nextInt();

		for (int b= 0; b<su; b++) {
			for (int i = 1; i<=9; i++ ) {
			System.out.printf("%d * %d = %d\t",a ,i, a * i);
			
			}
			System.out.println();
		}
		*/
        /*while (true) {
        	
        	System.out.println("=========구구단중 원하는 단수를 입력하세요 =====");
        	int i = sc.nextInt();
        	for(int j = 1; j <=9; j++) {
        		System.out.printf("%d * %d = %d\t",i ,j, i * j);
        	}
        	System.out.println("반복을 종료 (Y)");
        	sc.nextLine();
        	String answer = sc.nextLine();
        	if(answer.equalsIgnoreCase("Y"))break;
        }
        */

		do {
			System.out.println("====구구단중 원하는 단수를 입력하세요 =====");
			int a = sc.nextInt();

			for(int i = 1; i<10; i++) {
				System.out.print(a*i+" ");
			}
			System.out.println();
			System.out.println("반복을 종료 (Y)");
			sc.nextLine();
			String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("Y"))break;

		}while(true);






	}

}
