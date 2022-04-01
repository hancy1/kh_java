package com.uni.chap01.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * * if-else문
	 * 
	 * 이 조건일 경우 얘실행시키고 그 조건이 아니라면 무조건 얘 실행시키는 구문
	 * 
	 * if(조건식){ .. 실행 코드1 .. }else { .. 실행 코드2 .. }
	 * 
	 * 조건식의 결과가 true인 경우 실행코드 1 수행 후 if-else문 빠져나감 하지만 조건식의 결과가 false 인 경우 무조건 실행 코드
	 * 2 수행
	 */

	/*
	 * * if-else if문
	 * 
	 * 같은 비교 대상으로 여러개의 조건을 제시할 경우
	 * 
	 * if(조건식1){ .. 실행 코드 1 .. }else if(조건식2){ .. 실행 코드 2 .. }else if(조건식3) { .. 실행
	 * 코드 3 .. }[else { .. 위의 조건들이 다 false일 경우 실행할 코드 .. }]
	 * 
	 * 조건식 1의 결과가 true일 경우 실행 코드 1 수행하고 빠져나감 하지만 조건식1의 결과가 false일 경우 조건식2 실행 조건식2의
	 * 결과가 true일 경우 실행 코드 2 수행하고 빠져나감 아니면 그 뒤의 조건식 실행.. 이렇게 구동 단 else문이 제시되어 있을 경우
	 * 위의 조건이 다 false가 나오게 되면 무조건 else 구문 실행
	 * 
	 */

	public void method1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하세요.");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다.");
		} else if (num < 0) {
			System.out.println("음수다.");
		} else {
			System.out.println("0이다.");
		}
	}

	public void method2() {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하세요.");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

	public void method3() {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름");
		String name = sc.nextLine();

		System.out.println("학년(숫자만)");
		int grade = sc.nextInt();

		System.out.println("반(숫자만)");
		int classNum = sc.nextInt();

		System.out.println("번호(숫자만)");
		int num = sc.nextInt();

		sc.nextLine();

		System.out.println("성별(M/F)");
		char gender = sc.nextLine().charAt(0);

		System.out.println("성적(소수점 둘째자리까지)");
		double score = sc.nextDouble();

		// 남학생인지 여학생인지 둘다 아닌 경우 잘못입력하였습니다 단순if문으로만 //어려웠던 부분 다시 해보기!

		String student = "";

		if (gender == 'M' || gender == 'm') {
			student = "남학생";
		} else if (gender == 'F' || gender == 'f') {
			student = "여학생";
		} else {
			System.out.println("잘못 입력했습니다.");
			return; // 뒤에 있는 메소드를 호출하지 않고 메인 메소드(이 메소드를 호출한 곳)로 돌아감
		}
		System.out.println(
				grade + "학년 " + classNum + "반 " + num + "번 " + name + " " + student + "의 성적은 " + score + "입니다.");

	}

	public void method4() {

		Scanner sc = new Scanner(System.in);

		// 나이가 13살 이하는 어린이, 14살부터 19살까지 청소년, 20살부터 성인

		System.out.println("나이 입력");
		int age = sc.nextInt();

		String result = "";

		if (age <= 13) {
			result = "어린이";
		} else if (age <= 19) {
			result = "청소년";
		} else {
			result = "성인";
		}
		// if-else에서 if구문은 위의 조건구문을 만족하지 못하고 아래로 내려왔기 때문에
		// 당연히 위의 조건의 반대조건을 내부적으로 포함하고 있다.

		System.out.println(result);
	}

	public void method5() {

		// 입력된 값이 본인 이름이 맞는지 확인하는 메소드
		Scanner sc = new Scanner(System.in);

		System.out.println("이름");
		String name = sc.nextLine();

		// String 비교시 String 클래스에서 제공하는 equals() 메소드 이용해서 비교한다.
		if (name.equals("이효리")) {
			System.out.println("본인입니다.");
		} else {
			System.out.println("본인이 아닙니다.");
		}
	}

	public void method6() {

		// 사용자에게 키보드로 정수를 입력 받아 점수별로 등급을 나눠서 점수와 등급을 출력하는 메소드

		// 90점 이상은 A등급
		// 90점 미만 80점 이상은 B등급
		// 80점 미만 70점 이상은 C등급
		// 70점 미만 60점 이상은 D등급
		// 60점 미만은 F등급

		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();

//		if (score >= 90) {
//			System.out.println("A등급");
//		} else if (score < 90 && score >= 80) {
//			System.out.println("B등급");
//		} else if (score < 80 && score >= 70) {
//			System.out.println("C등급");
//		} else if (score < 70 && score >= 60) {
//			System.out.println("D등급");
//		} else {
//			System.out.println("F등급");
//		}

		String grade = "";

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("당신의 등급은 " + grade + "등급입니다.");

	}

}
