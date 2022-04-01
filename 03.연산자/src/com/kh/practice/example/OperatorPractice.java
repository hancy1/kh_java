package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println("정수: " + num);
		System.out.println(num > 0 ? "양수다" : "양수가 아니다.");
	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수: ");
		int num = sc.nextInt();

		System.out.println(num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다"));

	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println("정수: " + num);
		System.out.println(num % 2 == 0 ? "짝수다" : "홀수다");

	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("인원 수: ");
		int people = sc.nextInt();
		
		System.out.println("사탕 개수: ");
		int candy = sc.nextInt();
		
		int per = candy / people;
		int num = candy % people;
		
		System.out.println("1인당 사탕 개수: " + per);
		System.out.println("남는 사탕 개수: " + num);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		
		System.out.println("학년(숫자만): ");		
		int num1 = sc.nextInt();		
		
		System.out.println("반(숫자만): ");	
		int num2 = sc.nextInt();
		
		System.out.println("번호(숫자만): ");	
		int num3 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("성별(M/F): ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("성적(소수점 아래 둘째자리까지: ");
		double score = sc.nextDouble();

		System.out.println(gender == 'M' || gender == 'm' ? num1 + "학년 " + num2 + "반 " + num3 + "번 " + name + " 남학생의 성적은 " + score + "이다." : num1 + "학년 " + num2 + "반 " + num3 + "번 " + name + " 여학생의 성적은 " + score + "이다." ); }
		
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이: ");
		int age = sc.nextInt();
				
		System.out.println(age <= 13 ? "어린이" : (age > 13 && age <= 19 ? "청소년" : "성인"));
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("국어: ");
		int 국어 = sc.nextInt();
		
		System.out.println("영어: ");
		int 영어 = sc.nextInt();
		
		System.out.println("수학: ");
		int 수학 = sc.nextInt();
		
		int sum = 국어 + 영어 + 수학;
		double div = sum / 3;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + div);
		
		System.out.println(국어>=40 && 영어>=40 && 수학>=40 && div>=60 ? "합격" : "불합격");
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요(-포함)");
		char idnum = sc.nextLine().charAt(7);
	
		System.out.println(idnum == '2' ? "여자" : "남자");
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("정수1: ");
		int num1 = sc.nextInt();
		System.out.println("정수2: ");
		int num2 = sc.nextInt();
				
		System.out.println("입력: ");
		int num3 = sc.nextInt();
		
		System.out.println((num3 <= num1 || num3 > num2) ? "true" : "false" );
						
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("입력1: ");
		int num1 = sc.nextInt();
		System.out.println("입력2: ");
		int num2 = sc.nextInt();				
		System.out.println("입력3: ");
		int num3 = sc.nextInt();
		
		System.out.println(num1 == num2 && num2 == num3 ? "true" : "false");
		
	}
}
