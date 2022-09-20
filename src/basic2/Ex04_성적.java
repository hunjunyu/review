package basic2;

import java.util.Scanner;

public class Ex04_성적 {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner (System.in);
		
		int kor [] = new int[5];
		
		for (int i= 0 ; i<kor.length;i++) {
			System.out.println((i+1)+"번 학생의 국어 점수를 입력 하세요 ->");
			kor[i] = sc.nextInt();
		}
        //출력
		for (int i= 0 ; i<kor.length;i++) {
		System.out.println((i+1)+"번 학생의 국어 점수 : " + kor [i]);
		}
		int b= 0;
		int c = 0;
		double d= 0;
		for (int i= 0 ; i<kor.length;i++) {
		    b = kor[i];
			b++;
			c +=b;	
			d=c;
		}
		System.out.println("학생들의 점수의 총점 : "+ c);
		System.out.println("학생들의 점수의 평균 :" + c/kor.length);
		System.out.println("학생들의 점수의 평균 :" + d/kor.length);
		
	}

}
