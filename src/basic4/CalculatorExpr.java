package basic4;

import java.util.Scanner;

import basic3.Test2;

public class CalculatorExpr {


	private int num1 = 0;
	private int num2 = 0;
    


	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public CalculatorExpr() {}
	
	public int getAddition () {
		return  num1 + num2;
	}

	public int getSubtraction() {
		 return num1 - num2;
	}
	public int getMultiplication() {
			return num1 * num2;
	}
	public double getDivision() {
			return (double) num1 / num2;
	}

	public static void main(String[] args) {

		System.out.println("숫자를 입력해주세요");
		Scanner sc = new Scanner (System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		CalculatorExpr t = new CalculatorExpr();
        
		t.setNum1(num1);
		t.setNum2(num2);
		
		System.out.println("덧셈 : "+ t.getAddition());
		System.out.println("뺄셈 : "+ t.getSubtraction());
		System.out.println("곱셈 : "+ t.getMultiplication());
		System.out.println("나눗셈 : "+ t.getDivision());
		

		


	}
}
