package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.println("정수: ");
		int num = sc.nextInt();
		
		System.out.println("삼항연산자");
		System.out.println(num > 0 ? "양수다" : "양수가 아니다");
		System.out.println("if문");
		if(num > 0) {
			System.out.println("양수다.");
		} else {
			System.out.println("양수가 아니다.");
		}
		
	}
	
	public void practice2() {
		
		System.out.println("정수: ");
		int num = sc.nextInt();
		
		System.out.println("삼항연산자");
		System.out.println(num > 0 ? "양수다" : num == 0 ? "0이다" : "음수다");
		System.out.println("if문");
		if(num > 0) {
			System.out.println("양수다");
		} else if(num == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("음수다");
		}
	}
	
	public void practice3() {
		
		System.out.println("정수: ");
		int num = sc.nextInt();
		
		System.out.println("삼항연산자");
		System.out.println(num % 2 == 0? "짝수다" : "홀수다");
		
		System.out.println("if문");
		if(num % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다.");
		}
	}
	
	public void practice4() {
		
		System.out.println("인원수: ");
		int p = sc.nextInt();
		System.out.println("사탕개수: ");
		int c = sc.nextInt();
		
		System.out.println("1인당 사탕 개수: " + c/p);
		System.out.println("남는 사탕 개수: " + c%p);
	}
	
	public void practice5() {
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("학년(숫자만): ");
		int grade = sc.nextInt();
		System.out.println("반(숫자만): ");
		int cnum = sc.nextInt();
		System.out.println("번호(숫자만): ");
		int num = sc.nextInt();
		sc.nextLine(); //버퍼빼기
		System.out.println("성별(M/F): ");
		String gender = sc.nextLine();
		System.out.println("성적(소수점 아래 둘째 자리까지): ");
		double score = sc.nextDouble();
		
		System.out.println("삼항연산자");
		String gg = gender.equalsIgnoreCase("m") ? "남학생" : "여학생";
		System.out.println(grade + "학년 " + cnum + "반 " + num + "번 " + name + " " + gg + "의 성적은 " + score +"이다.");
		
		System.out.println("if문");
		String g = null;
		if(gender.equalsIgnoreCase("m")) {
			g = "남학생";
		} else if (gender.equalsIgnoreCase("f")) {
			g = "여학생";
		}
		
		System.out.println(grade + "학년 " + cnum + "반 " + num + "번 " + name + " " + g + "의 성적은 " + score +"이다.");
		
		
		
	}
	
	public void practice6() {
		
		System.out.println("나이: ");
		int age = sc.nextInt();
		
		System.out.println("삼항연산자");
		System.out.println(age <= 13 ? "어린이" : age > 19 ? "성인" : "청소년");
		
		System.out.println("if문");
		if(age <= 13) {
			System.out.println("어린이");
		} else if(age > 13 && age <= 19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
	}
	
	public void practice7() {
		
		System.out.println("국어: ");
		int kor = sc.nextInt();
		System.out.println("영어: ");
		int eng = sc.nextInt();
		System.out.println("수학: ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		
		
		System.out.println("삼항연산자");
		System.out.println(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격입니다" : "불합격입니다.");
		
		System.out.println("if문");
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice8() { 
		
		System.out.println("주민번호를 입력하세요(- 포함): ");
		String no = sc.nextLine();
		
		
		System.out.println("삼항연산자");
		System.out.println(no.charAt(7) == '1' || no.charAt(7) == '3' ? "남자" : "여자");
		
		System.out.println("if문");
		if(no.charAt(7) == '1' || no.charAt(7) == '3') {
			System.out.println("남자");
		} else if(no.charAt(7) == '2' || no.charAt(7) == '4') {
			System.out.println("여자");
		}
	}
	
	public void practice9() {
		
		System.out.println("정수1: ");
		int num1 = sc.nextInt();
		System.out.println("정수2: ");
		int num2 = sc.nextInt();
		System.out.println("입력: ");
		int num = sc.nextInt();
		
		System.out.println(num <= num1 || num > num2 ? "true" : "false");
		
		if(num <= num1 || num > num2) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}
	
	public void practice10() {
		System.out.println("입력1: ");
		int num1 = sc.nextInt();
		System.out.println("입력2: ");
		int num2 = sc.nextInt();
		System.out.println("입력3: ");
		int num3 = sc.nextInt();
		
		if(num1 == num2 && num1 == num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public void practice11() {
		
		System.out.println("A사원의 연봉: ");
		int asal = sc.nextInt();
		System.out.println("B사원의 연봉: ");
		int bsal = sc.nextInt();
		System.out.println("C사원의 연봉: ");
		int csal = sc.nextInt();
		
		double ay = asal*1.4;
		double by = bsal;
		double cy = csal*1.15;
				
		System.out.println("A사원의 인센티브 포함 연봉: " + ay);
		if(ay >= 3000) {
			System.out.println("3000이상");
		} else {
			System.out.println("3000미만");
		}
		
		System.out.println(ay >= 3000 ? "3000이상" : "3000미만");
		
		System.out.println("B사원의 인센티브 포함 연봉: " + by);
		if(by >= 3000) {
			System.out.println("3000이상");
		} else {
			System.out.println("3000미만");
		}
		
		System.out.println(by >= 3000 ? "3000이상" : "3000미만");
		
		System.out.println("C사원의 인센티브 포함 연봉: " + cy);
		if(cy >= 3000) {
			System.out.println("3000이상");
		} else {
			System.out.println("3000미만");
		}
		
		System.out.println(cy >= 3000 ? "3000이상" : "3000미만");
	}
}
