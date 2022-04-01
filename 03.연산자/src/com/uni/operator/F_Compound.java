package com.uni.operator;

public class F_Compound {

	/*
	 * * 복합 대입 연산자 : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * 				  연산처리 속도가 훨씬 빠르므로 사용을 권장한다. 
	 * 
	 * +=, -=, *=, /=, %=
	 * 
	 * a = a + 3;	=>   a += 3;
	 * a = a - 3;	=>	 a -= 3;
	 * a = a * 3;	=>	 a *= 3;
	 * a = a / 3;	=> 	 a /= 3;
	 * a = a % 3;	=> 	 a %= 3;
	 * 
	 * 
	 * 	증감 연산자(++ --)와 비슷해 보이지만 증감연산자는 값을 1씩만 증감이 된다.
	        하지만 복합 대입 연산자는 내가 원하는 숫자만큼 증감을 시킬 수 있다.
	 */

	public void method1() {
		
		int num = 12;
		System.out.println("num : " + num);
		
		//num을 3 증가시키기
		num = num + 3;
		System.out.println("num : " + num);
		
		//num을 3 증가시키기
		num += 3 ;
		System.out.println("num : " + num);

		//num을 5 감소시키기
		num -= 5;

		//num을 6배 증가시키기
		num *= 6;
		
		//num을 2배 감소시키기
		num /= 2;
		
		//num을 4로 나눴을 때 나머지
		num %= 4;
		
		System.out.println("num : " + num);
		
		//String에서도 연산 가능
		
		String str = "Hello";
		System.out.println(str); //"Hello"
		
		str += "World";
		System.out.println(str); //"HelloWorld"
		
		str += 1;
		System.out.println(str); //"HelloWorld1"

	}
}
