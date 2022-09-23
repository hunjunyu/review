package Singleton;

import java.util.Scanner;

public class Bank {
	String name = "자바맨";      //예금주
	String number = "937702-00-011289";    //계좌번호
	static int change  = 50000;      //잔액
	static int inmoney  = 0;         //입금 금액
	static int outmoney  = 0;        // 출금 금액

	Bank(){}

	public void output (int outmoney) {
		if (outmoney <= change) {
			change -= outmoney;
			System.out.println("인출할 금액 : " + outmoney+ "잔액 : "+ change);
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}	

	public void input (int inmoney) {
		change = change + inmoney;
		System.out.println("입금한 금액 :" + inmoney + "잔액 :"+ change);

	}

	public String toStirng () {
		return "예금주 : "+ name + " 계좌번호 : "+ number + " 잔액 : "+ change; 
	}



	public static void main(String[] args) {

		System.out.println("인출할 금액을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank ();
		b.output(sc.nextInt());
		System.out.println("입금할 금액을 입력해주세요.");
		b.input(sc.nextInt());
		System.out.println(b.toStirng());
		
	}

}
