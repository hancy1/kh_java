package com.uni.operator;

public class B_InDecrease {

	/*
	 * * 증감연산자(단독사용시는 그냥 1증가) ++ : 값을 1 증가시키는 연산자 ++값 (전위 연산자), 값++ (후위 연산자) -- : 값을
	 * 1 감소시키는 연산자 --값 (전위 연산자), 값-- (후위 연산자)
	 * 
	 * (증감연산자)값 : 전위 연산자 --> 선증감 후처리 값(증감연산자) : 후위 연산자 --> 선처리 후증감
	 */

	public void method1() {

		// 전위연산자 테스트
		int num1 = 10;
		System.out.println("전위연산자 적용 전 num1 값: " + num1); // 10
		System.out.println("1회 수행 후 값: " + ++num1); // 11
		System.out.println("2회 수행 후 값: " + ++num1); // 12
		System.out.println("3회 수행 후 값: " + ++num1); // 13
		System.out.println("전위연산자 적용 후 num1 값: " + num1); // 13

		// 후위연산자 테스트
		int num2 = 10;
		System.out.println("후위연산자 적용 전 num2 값: " + num2); // 10
		System.out.println("1회 수행 후 값: " + num2++); // 10출력 후 11로 증가
		System.out.println("2회 수행 후 값: " + num2++); // 11출력하고 12로 증가
		System.out.println("3회 수행 후 값: " + num2++); // 12출력하고 13으로 증가
		System.out.println("후위연산자 적용 후 num2 값: " + num2); // 13

	}

	public void method2() {

		// 전위연산자 테스트
		int a = 10;
		int b = ++a;
		System.out.println("a : " + a + ", b: " + b);

		// 후위연산자 테스트
		int c = 10;
		int d = c++;
		System.out.println("c : " + c + ", d: " + d);

		System.out.println("==============================");

		int num = 20;
		System.out.println("현재 num : " + num); // 20

		System.out.println("++num : " + ++num); // 21
		System.out.println("num++ : " + num++); // 21(22)

		System.out.println("--num : " + --num); // 21
		System.out.println("num-- : " + num--); // 21(20)

		System.out.println("현재 num : " + num); // 20

	}

	public void method3() {

		int num1 = 20;
		int result = num1++ * 3; // result:60 num1: 20(21)

		System.out.println(result);
		System.out.println(num1);

		int num2 = 20;
		int result2 = ++num2 * 3; // result:63 num2: 21

		System.out.println(result2);
		System.out.println(num2);

	}

	public void method4() {

		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(a++); // a:10(11)
		System.out.println((++a) + (b++)); // a:12 b:20(21) 합:32
		System.out.println((a++) + (--b) + (--c)); // a:12(13) b:20 c:29 합:61

		System.out.println("a값: " + a);
		System.out.println("b값: " + b);
		System.out.println("c값: " + c);

	}

}
