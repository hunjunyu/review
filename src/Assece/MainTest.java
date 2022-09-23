package Assece;

import Asseceabt.ClassAssece;

public class MainTest extends ClassAssece {

	public static void main(String[] args) {
		
		MainTest acc = new MainTest();
		//acc.a = "프라이빗 변경";  // 프라이빗은 다른클래스에서는 변경 불가능.
		acc.b = "퍼블릭 변경";
		acc.c = " 프로텍티드 변경";  // 프로텍티드는 다른 패키지에서는 변경 불가능, 하지만 자식클래스로 변환하면 변경 가능
		//acc.d =" 디폴트 변경";  // 디폴트는 다른 패키지에서는 변경 불가능
		acc.output();

	}

}
