package com.uni.first;

public class B_ValuePrinter {
	/*
	 *  ** 원칙 ** 
	 *  1. 클래스명 --> 대문자로 시작
	 *  2. 패키지명 --> 소문자로 시작
	 *  3. 메소드명 --> 소문자로 시작
	 *  4. 변수명    --> 소문자로 시작
	 *  
	 *  단, 여러개의 단어가 있을 때는 단어 앞자리마다 대문자로 !! == 낙타 표기법(개발자간의 예의)
	 *  
	 *  ex) 클래스명 Methodprinter --> MethodPrinter
	 *      메소드명 testprint --> testPrint
	 *  
	 *  그리고 항상 의미있게 이름짓자!!
	 */
	
	public void printvalue() {
		//1. 숫자출력 -> 따옴표없이
		System.out.println(123); //정수값
		System.out.println(1.23);//실수값
		
		//2. 문자 -> 작은 따옴표로 한 글자 표시
		System.out.println('a');
		System.out.println('b');

		//3. 문자열 -> 큰따옴표
		System.out.println("a");
		System.out.println("안녕하세요.");
		
		//4. 연산한 값도 출력 가능
		System.out.println(123+456);
		System.out.println(1.23-4.56);
		
		//5. 문자와 숫자의 연산이 가능
		System.out.println('a'+1);
		
		//6. 문자열("")과 그 이외의 값 연산 -> 문자열화
		System.out.println("hi"+'a');
		System.out.println("hi"+1234);
		System.out.println("hi"+1234+2468);
		System.out.println("hi"+(1234+2468));
		System.out.println(1234+2468+"반갑습니다.");

		
	}
	

}
