package baic1;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 제어문 : 프로그램 흐름을 변경하기 위해
 * 
 *  1) if
 *  2) switch
 *  3) for
 *  4) while / do ~ while
 *  5) break/ continue
 *  
 */

public class Ex02_control {

	public static void main(String[] args) {
	
		String id = null;
		
		Scanner input = new Scanner (System.in);
		System.out.println("주민입력->");
		id = input.nextLine();
		
		
		char sung = id.charAt(7);
		
		System.out.println(sung);
		// sung 변수에 문자가 1이거나 3이거나 9라면 남자를 출력
		// 그렇지 않고 문자가 2이거나 4이거나 0이라면 여자를 출력
		
		if ( sung == '1'||sung=='2'||sung =='3') {
			System.out.println("남자");
		}else if(sung =='2' ||sung=='4'||sung=='0'){
			System.out.println("여자");
		}
		char chul = id.charAt(8);
		System.out.println(chul);
		// chul 변수가 0이라면 '서울'
		// chul 변수가 1이라면 '인천/부산'
		// chul 변수가 2라면 '경기'
		// chul 변수가 9라면 '제주도'
		String home = null;
		switch (chul) {
		case '0' :
		     home = "서울";
		   break;
		case '1' :
			 home = "인천/부산";
			break;
		case '2' :
			 home = "경기도";
			break;
		case '9' : 
			 home = "제주도";
		}
		System.out.println( home + " 출신입니다.");
		
		System.out.println("==========================");
		
		//String id = "970617-1234567";
		
	    String nai = id.substring(0,2); // nai = "80"
	    System.out.println(nai);
		int sunai = Integer.parseInt(nai); // suni = 80;
			
		int age = 0;  //나이
		
		Calendar c =  Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		int century = (year / 100) * 100;
		
		int yearindex = year - century;
		int oldYear = century - 100;
		int youngYear = century;
		
		
		if (sunai > yearindex) {
			age = year - (oldYear + sunai) + 1;
		} else if (sunai <= yearindex) {
			age = year - (youngYear + sunai) + 1;
		}
		System.out.println(age);

		
		

	}

}
