package inherit;

public class MainTest {

	public static void main(String[] args) {
		
		//Umma u = new Umma();
		//u.job();
		//u.gene();
	
//		Darther d = new Darther();
//		d.study();
//		d.job();
//		d.gene();
		
		//Darther c = Umma();
		
		//부모변수에 자식객체 생성이 가능
		//Umma d = new Darther();
		//d.gene();
		//d.job();
		//d.study();
		
		//형변환 : (casting)
		/*
		 * 1> 기본형끼리
		 * 2> 참조형에서 상속관계있는 경우만 가능
		 * 
		 *  String a = new String ("~");
		 *  StirngBuffer sb = (StringBuffer)s; --> x
		 */
		
		//Umma u = new Umma();
		//Darther d = (Darther)u;
		
		Darther d = new Darther();
		Umma u = (Umma)d;          // up casting
		Darther d2 = (Darther)u;   // down casting
		
		
		
		
		
		
		
		
		
		
		

	}

}
