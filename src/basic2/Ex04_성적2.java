package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int kor [] = new int [3];
		System.out.println(kor.length + "명의 국어접수를 입력하세요 (ex.10/20/30)");
		String scdata = sc.nextLine();// "10/20/30"
		StringTokenizer st = new StringTokenizer(scdata,"/");
		for(int i= 0 ; i<kor.length;i++) {
			String str = st.nextToken();
			kor[i] = Integer.parseInt(str);
			System.out.println((i+1)+"번 학생의 국어 점수 : " + kor [i]);
		}
		

	}

}
