package finalz;

class Parent{
	final String filed = "부모님꺼";
	public void home() {
	    System.out.println("부모님이 만드신거");
	}
}

class Child extends Parent{
	 Child(){
		 
	 }
//	public void home () {
//		System.out.println("내가 탕진함");
//	}
}


public class Test {
	public static void main(String[] args) {
		Parent p = new Child ();
		System.out.println(p.filed);
		p.home();
		
		
	}

}
