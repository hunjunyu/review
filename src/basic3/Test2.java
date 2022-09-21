package basic3;

import java.util.Scanner;

public class Test2 {
	
	static char checkUpper (char ch) {
		if (Character.isLowerCase(ch) == true) {
			Character.toUpperCase(ch);
		}else {
		
		}return Character.toUpperCase(ch)	;
		
	}

	public static void main(String[] args) {
		/*
  (문제 2) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오. 

        함수명 : checkUpper

        인자 : char

        리턴(반환) : char
		 */
		
		System.out.println("영문자를 입력하세요");

		Scanner sc = new Scanner (System.in);
		String eng = sc.next();
		char ch = eng.charAt(0);
		
		char a = checkUpper(ch);
		
		System.out.println(a);
		
		
		
		
	}

}
