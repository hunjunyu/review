Zpackage Singleton;

import java.util.Calendar;

public class Birth {
	
	
	public static void main(String[] args) {
		
		int year = 1997; //태어난 년도
		int age = 0;     // 나이
		int to = Calendar.getInstance().get(Calendar.YEAR); // 올해를 출력하는 변수
		age = (to - year)+1;
		System.out.println(age);
		
		
		
		
	}

}
