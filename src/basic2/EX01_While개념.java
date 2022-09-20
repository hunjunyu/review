package basic2;

public class EX01_While개념 {

	public static void main(String[] args) {
		
		// 0. for문
		// 1 ~ 10까지 합을 구하세요
		
		/*int a = 0;
		for (int i = 1; i <11; i++) {
			a= a+i;		
		}
		System.out.println(a);
        */
		 
		// 초기치를 반복 블록 위로
		// 증가치를 반복문 끝으로
		//조건문만 남아서 for -> while
		
	  /*	int i =1;
		int a = 0;
		while (i<=10) {
			a = a+i;
			i++;
			
		}
		System.out.println(a);
		*/
		int a  = 0;
		int i = 1;
		do {
			a = a+i;
			i++;
		}while (i<=10);
		System.out.println(a);
		
		
		
		
		
	
	}

}
