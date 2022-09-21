package basic3;

public class Ex03_CallbyString {

	public static void main(String[] args) {
		
		String a = new String("안녕");
		String b = new String("하이");
		
		add(a,b);
		System.out.println("A="+ a+ ", B=" + b);// 안녕하이, 하이

	}
	static void add(String a, String b) {
		
		a += b;
		System.out.println("A="+ a+ ", B=" + b);// 안녕하이, 하이
		
	}
}
//4,(2)(4), (6,2)(4,2), (안녕자바,자바)(안녕,자바), (6)(6)
// 0100 0010
// 0001 0000