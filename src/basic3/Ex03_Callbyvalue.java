package basic3;

public class Ex03_Callbyvalue {

	public static void main(String[] args) {
		
		
		int a=10,b=20;
		add(a,b);  // add(10,20) // 출력 : a=30,b=20
		System.out.println("A="+ a+ ", B=" + b);// 출력 : a=10  ,b=20
	}
    static void add (int a, int b) {
    	a+=b; //a = a+b // a = 30
    	System.out.println("A="+ a+ ", B=" + b);//  a= 30,b=20
    	//16라인에서 다시 9라인으로갈때 이곳에서의 데이터는 없어진다, 하지만 return을 쓰게 된다면 단 하나의 값만 살려서 가져갈수 있다. 
    }
}
