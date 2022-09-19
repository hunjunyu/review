package baic1;

//import java.lang.*; String을 쓰려면 있어야하나 자동으로 옴.
import java.util.Scanner;

public class Ex01_Var {  // extends Object{
    // 멤버변수
	/*
	 * 자료형 (data type)
	 * 1. 기본형
	 * boolean
	 * char
	 * int/long
	 * double
	 * 
	 * 2. 참조형
	 *    ` 클래스
	 *    ` 배열
	 *     -> new 예약어를 통해서 객체를 생성
	 * 
	 * 
	 * (*) String
	 */

	public static void main(String[] args) {
		
		// 지역변수
		
	    // 문자열 변수 a 선언 
		String a = null;
		// 정수 변수 b 선언
		int b = 0;
        
		// 변수 b에 200 대입
		b=200;
		//변수 a에 "hello"을 지정
		a = "hello";
		// ******
		// a = new String ("Hello");
		
		
		System.out.println(a +" "+ b);
		System.out.println(a);
		System.out.println(b);
	}

}
