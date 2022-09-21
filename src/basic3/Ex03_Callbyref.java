package basic3;

public class Ex03_Callbyref {

	public static void main(String[] args) {
		
		StringBuffer  a = new StringBuffer("안녕");
		StringBuffer  b = new StringBuffer("하이");
		
		add(a,b);
		System.out.println("A="+ a+ ", B=" + b);// 안녕하이, 하이

	}
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);//안녕하이
		System.out.println("A="+ a+ ", B=" + b);// 안녕하이, 하이
	}
}
/*

       문자열 처리 클래스
       
       -String
       
       -StirngBuffer/ StringBuilder
       
       
*/