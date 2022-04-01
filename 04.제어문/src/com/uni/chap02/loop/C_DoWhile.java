package com.uni.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {

	/*
	 * * do-while문
	 * 
	 * [초기식]
	 * 
	 * do{ 반복적으로 실행할 코드;
	 * 
	 * [증감식]
	 * 
	 * }while(조건식);
	 * 
	 * 
	 * 초기식 --> 무조건 한번은 실행 --> 증감식 조건식 --> true일 경우 실행 --> 증감식 조건식 --> true일 경우 실행
	 * --> 증감식 조건식 --> false일 경우 빠져나감
	 * 
	 * while문과 다른 점은 while문은 처음 수행될때도 조건식을 검사하고 나서 조건식이 true일 경우 실행되는데 do while문은 첫
	 * 실행은 조건식없이 무조건 수행된다는 점
	 * 
	 */

	public void method1() {
		int num = 1;
		do {
			System.out.println(num);
		} while (num == 0); // 조건이 맞지 않아도 무조건 do 구문은 실행됨
	}

	public void method2() {
		// 1 2 3 4 5

		int num = 1;
		do {
//			System.out.print(num+ " ");
//			num++;
			System.out.print(num++ + " ");
		} while (num <= 5);
	}

	public void method3() {

		// 1부터 어떤 랜덤값 (1~10사이의 랜덤한 숫자 ) 까지의 합계

		int random = (int) (Math.random() * 10 + 1);
		System.out.println("랜덤값: " + random);

		int sum = 0;
		int i = 1;

		do {
			sum += 1;
			i++;

		} while (i <= random);

		System.out.println("1부터 " + random + "까지의 합: " + sum);

	}

	public void method4() {
		// 사용자가 입력한 단 출력하기

		Scanner sc = new Scanner(System.in);
		System.out.println("단수(2~9)를 입력: ");

		int dan = sc.nextInt();

		if (dan > 1 && dan < 10) {
			int i = 1;
			do {
				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
				i++;
			} while (i < 10);
		} else {
			System.out.println("2~9까지의 양수를 입력해야 합니다.");
		}

	}

	public void method5() {

		// 사용자한테 문자열을 입력받아서 각 인덱스별로 문자를 각각 호출

		/*
		 * String str = "apple" a - > str.charAt(0) p - > str.charAt(1) p - >
		 * str.charAt(2) l - > str.charAt(3) e - > str.charAt(4)
		 * 
		 * apple의 문자열 길이 : 5 인덱스는 0~4 마지막 인덱스는 문자열 길이 - 1
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열 입력: ");

		String str = sc.nextLine();

		System.out.println("문자열의 길이 " + str.length());

		int i = 0;
		do {
			System.out.print(str.charAt(i) + " ");
			i++;
		} while (i < str.length());
	}

	public void method7() {

		// 계속 문자열을 입력 받고 그 문자열을 출력 하게끔
		// 하지만 그 문자열이 "exit" 가 아닐 때까지 반복

		Scanner sc = new Scanner(System.in);

		String str = "";

		do {
			System.out.println("문자열을 입력해주세요.");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while (!str.equals("exit"));

		System.out.println("exit를 입력해서 종료되었습니다.");
	}

	public void method8() {

		// 계속 문자열을 입력 받고 그 문자열을 출력 하게끔
		// 하지만 그 문자열이 "exit" 가 아닐 때까지 반복

		Scanner sc = new Scanner(System.in);

		String str = "";

		do {
			System.out.println("문자열을 입력해주세요.");
			str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			}
			System.out.println("str : " + str);
		} while (true);

		System.out.println("exit를 입력해서 종료되었습니다.");

	}
}