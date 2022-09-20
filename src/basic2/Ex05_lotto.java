package basic2;

public class Ex05_lotto {

	public static void main(String[] args) {
		// 
		int [] lotto = new int [6];
		// 값지정		
		/*
		for (int i = 0; i <lotto.length; i++) {
			
			lotto[i] = (int)(Math.random()*45 + 1);
			
		}
			
		for(int i=lotto.length-1;i>0 ;i-- ) {
			for (int j = 0;j<i ;j++ ) {
				if(lotto[j]>lotto[j+1]) {
					int temp= lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1]= temp;
				}
			}
		}
		
		for (int i = 0; i <lotto.length; i++) {
			System.out.print(lotto[i]+ " ");
		}
		*/	

		for (int a = 0; a <lotto.length; a++) {
			lotto[a] = (int)(Math.random()*45+1);
		}
		
		for (int  a= lotto.length-1; a > 0; a--) {
			for (int b = 0; b<a; b++) {
				if (lotto [b+1]> lotto [b]) {
					int tem = lotto[b+1];
					lotto[b+1] = lotto [b];
					lotto[b] = tem;

				}
			}System.out.print(lotto[a] + " ");
		}
			
		

		
		
		


		
	}

}
