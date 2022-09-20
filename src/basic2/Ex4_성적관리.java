package basic2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex4_성적관리 {

	public static void main(String[] args) {
		/*​
입력할 학생수를 입력하세요. 4
4명의 국어, 영어, 수학 점수를 받아 결과 출력하기

1째 학생의 성적을 입력 -> 88/77/66 // a1 a2 a3

2째 학생의 성적을 입력 -> 50/40/70 // b1 b2 b3
   
3째 학생의 성적을 입력 -> 44/33/22 // c1 c2 c3

4째 학생의 성적을 입력 -> 55/50/70 // d1 d2 d3

​

[결과]

1째 학생의 총점 xxx 이고 평균은 ooo 입니다 // a+a+a = a1, a1/a.legth

2째 학생의 총점 xxx 이고 평균은 ooo 입니다// b+b+b = b1, b1/b.legth

3째 학생의 총점 xxx 이고 평균은 ooo 입니다// c+c+c = c1, c1/c.legth

4째 학생의 총점 xxx 이고 평균은 ooo 입니다// d+d+d = d1, d1/d.leght

​

------------------------------------------------------------

국어과목  총점 xxx 이고 평균은 ooo 입니다 // a1+b1+c1+d1 = k, k/k.legth

영어과목  총점 xxx 이고 평균은 ooo 입니다 // a2+b2+c2+d2 = e e/e.legth

수학과목  총점 xxx 이고 평균은 ooo 입니다 // a3+b3+c3+d3 = m m/m.legth
		 */
    
		
		Scanner sc = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		System.out.println("학생 수를 입력하시오");
		int a1 = ss.nextInt();
		int a [] []  = new int [a1] [3];  // a에 값을 3개를 만듬.


		for (int i = 0; i< a.length; i++) {
			System.out.println((i+1)+"번째 학생의 국어, 영어, 수학 성적을 입력하시요");
			String a2 = sc.nextLine();
			StringTokenizer a3 = new StringTokenizer(a2,"/");
			String a4 = a3.nextToken();

			for(int j = 0; j< a[i].length; j++) {
				a[i] [j] = Integer.parseInt(a4);

			}
		}


		for (int t = 0; t < a.length; t ++) {
			int sum =0;
			for(int k = 0; k < a[t].length; k++) {

				sum = sum + a[t][k];


			}
			System.out.println((t+1)+"번째 학생의 총점은 : " + sum+ "이고 평균은 : "+ sum/a.length);
		}
		System.out.println("================================================================");

		int tt = 0;
		int t1 = 0;
		int t2 = 0;

		for (int t = 0; t < a.length; t ++) {

			for(int k = 0; k < a[t].length; k++) {
				int sum = 0;
				if(t == 0) {//국어값
					tt = tt+a[t][k];
				}
				if(t==1) {//영어값
					t1 = t1+a[t][k];
				}
				if(t==2) {//수학값
					t2 = t2 +a[t][k];
				}

			}

		}


		System.out.println("국어의 총점은 : "+ tt+ "이고 평균은 : "+ tt/a1);
		System.out.println("영어의 총점은 : "+ t1+ "이고 평균은 : "+ t1/a1);
		System.out.println("수학의 총점은 : "+ t2 + "이고 평균은 : "+ t2/a1);





		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
