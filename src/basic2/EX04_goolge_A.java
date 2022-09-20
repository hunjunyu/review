package basic2;

import org.w3c.dom.css.Counter;

// * 문제  : 8의 숫자 세기(구글입사문제)


//1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?

//8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.

//(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)

//결과 : 4000

public class EX04_goolge_A {

	public static void main(String[] args) {


		int count = 0;
		for(int i = 1; i<=10000; i++) {

			int su = i;


			while(su!=0) {
				int  na = su%10;
				if( na == 8) {   
					count++;
				}
				su = su/10;
			}


		}
		System.out.println(count);





	}

}
