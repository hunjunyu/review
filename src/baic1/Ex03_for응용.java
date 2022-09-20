package baic1;

public class Ex03_for응용 {

	public static void main(String[] args) {
	
	for (int b=0; b < 26; b++) {	
		 for(char a ='A'; a <= 'A'+b ; a++) {
		  System.out.print(a);
	     }	 
		 System.out.println();
	  
    }
	System.out.println();
	

	for (int b=0; b < 26; b++) {	
		 for(char a ='A'; a <= 'Z'-b ; a++) {
		  System.out.print(a);
	     }	 
		 System.out.println();
	  
    }
	
	System.out.println();
	
	for (int b=0; b < 26; b++) {	
		 for(char a ='Z'; a >= 'Z'-b ; a--) {
		  System.out.print(a);
	     }	 
		 System.out.println();
	  
   }
	System.out.println();
	
	for (int b=0; b < 26; b++) {	
		 for(char a = (char) ('A'+b); a <= 'Z' ; a++) {
			 
		  System.out.print(a);
	     }	 
		 System.out.println();
	  
   }
	for(int i = 0; i < 26; i++) {
		for(char a = (char) ('A'+i); a <= 'Z'; a++) {
		System.out.print(a);
		}//for
		System.out.println();
		}//for
	
	for(int i = 0; i < 26; i++) {
		for(int j = 0; j < i; j++) {
		System.out.print(" ");
		}//for
		for(char a = (char) ('A'+i); a <= 'Z'; a++) {
		System.out.print(a);
		}//for
		System.out.println();
		}//for
	
	for(int i = 0; i < 26; i++) {
		for (int j = 0; j<i;j++) {
		System.out.print(" ");
		}
		for (char a = (char)('A'+i);a <='Z'; a++) {
		System.out.print(a);
		}
		System.out.println();
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
}
