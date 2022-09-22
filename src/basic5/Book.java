package basic5;

public class Book {
	
	 private static int count;  // 공유화 가능 
	
	public Book() {
		count++;
		
	 
	}
	public static int getcount() {  // 스태틱 메소드 객체화 없이도 호출가능
		return count;
	
	}

}
/*
 * static 
 * 객체의 공유
 * 객체 생성보다 먼저 실행하기 때문에 클래스명 접근
 * 
 * 
 */
