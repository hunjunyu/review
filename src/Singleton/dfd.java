package Singleton;

public class dfd {
	static void method( int i ) throws Exception {
		if ( i % 2 == 0 ) throw new Exception();
	}

	public static void main(String[] args) {
		for( int i=0; i <= 4 ; i++ ) {
			try{
				method( i );
				System.out.println("try");
			}catch( Exception ex ) {
				System.out.println("catch");
			}
		}
	}
}
