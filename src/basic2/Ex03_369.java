package basic2;

/*
 * 문제
 * 
 * 1부터 50까지 숫자 중에서 3,6,9의 해당되는 숫자라면 
 * 그 갯수만큼 "짝"이라는 글자를 출력하고
 * 그렇지 않으면 그 숫자를 출력
 * 
 *
 * ex) 26
 * 6->
 * 2->
 *
 */  
 

public class Ex03_369 {

	public static void main(String[] args) {
	
		for(int i = 1; i<=1000; i++) {
			
			int su = i;
			boolean su369 = false;
			
			while(su!=0) {
			int  na = su%10;
			if( na == 3||na==6||na==9) 
			{
				System.out.print("짝");
				su369 = true;
			}
			su = su/10;
			}
			if(su369)System.out.println();
			else System.out.println(i);
		}
		
		
		

	}

}
