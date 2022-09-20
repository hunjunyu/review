package basic2;

import java.util.Scanner;

public class Ex04_369_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 값을 넣어주세요.");
		
		int unm = sc.nextInt();
		int b = 0;
		int a = 0;
		int count = 0;
		for(int i = 1; i <=unm;i++) {
			int su = i;
			int su2 = i;
			while (su!=0) {
			int na = su%10;	
			if(na ==3|na==6|na==9) {
				System.out.print(i+ " ");
				count++;
			    break;
			}
			su = su/10;
			
			}
			
		}
		System.out.println(" 에 숫자 3,6,9가 포함되어 총"+count+"회의 손뼉을 칩니다.");
	
			
			
		


	}

}
