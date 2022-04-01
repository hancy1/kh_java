package com.uni.run;

import com.uni.first.A_MethodPrinter;
	//컨트롤 시프트 O 하면 알아서 임포르해줌 맞게됐는지 확인필수!

public class Run_A {

	public static void main(String[] args) {
		/* 1) 실행할 메소드가 있는 클래스를 생성 (new)
		 * [표현볍] 클래스명 사용할 이름 = new 클래스명();
		 */
		A_MethodPrinter a = new A_MethodPrinter();
		
		/* 2) 생성 후 메소드 실행 (호출)
		 * [표현볍] 사용할 이름.실행할 메소드명();
		 */
//		a.methodA(); //사용할 이름.메소드명() 으로 호출
//		a.methodB();
//		a.methodC();

		a.methodA();
	}

}
