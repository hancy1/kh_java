package com.kh.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.println("메뉴번호를 입력하세요: ");

		int menu = sc.nextInt();

		if (menu == 3) {
			System.out.println("조회 메뉴입니다.");
		}
	}

	public void practice2() {

		System.out.println("숫자를 한 개 입력해주세요: ");
		int num = sc.nextInt();

		if (num % 2 == 0 && num > 0) {
			System.out.println("짝수다");
		} else if (num % 2 == 1 && num > 0) {
			System.out.println("홀수다");
		} else if (num < 0) {
			System.out.println("양수만 입력해주세요.");
		}
	}

	public void practice3() {

		System.out.println("국어점수: ");
		int kor = sc.nextInt();
		System.out.println("영어점수: ");
		int eng = sc.nextInt();
		System.out.println("수학점수: ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = sum / 3;

		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("국어: " + kor);
			System.out.println("영어: " + eng);
			System.out.println("수학: " + math);
			System.out.println("합계: " + sum);
			System.out.println("평균: " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice4() {

		int menu = sc.nextInt();
		switch (menu) {
		case 1:
		case 2:
		case 12:
			System.out.println(menu + "월은 겨울입니다.");
			break;
		case 4:
		case 5:
		case 3:
			System.out.println(menu + "월은 봄입니다.");
			break;
		case 7:
		case 8:
		case 6:
			System.out.println(menu + "월은 여름입니다.");
			break;
		case 10:
		case 11:
		case 9:
			System.out.println(menu + "월은 가을입니다.");
			break;
		default:
			System.out.println(menu + "월은 잘못 입력된 달입니다.");
			break;
		}

	}

	public void practice5() {
		String id = "user1";
		String pwd = "1234";

		System.out.println("아이디: ");
		String inputId = sc.nextLine();
		System.out.println("비밀번호: ");
		String inputPwd = sc.nextLine();

		if (inputId.equals(id) && inputPwd.equals(pwd)) {
			System.out.println("로그인성공");
		} else if (inputId.equals(id) && !inputPwd.equals(pwd)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (!inputId.equals(id) && inputPwd.equals(pwd)) {
			System.out.println("아이디가 틀렸습니다.");
		}
	}

	public void practice6() {

		System.out.println("권한을 확인하려는 회원 등급: ");
		String mem = sc.nextLine();

		switch (mem) {

		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		}
	}

	public void practice7() {

		System.out.println("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();

		double bmi = kg / (height * height);

		System.out.println("BMI지수: " + bmi);
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
	}

	public void practice8() {

		System.out.println("피연산자1: ");
		int num1 = sc.nextInt();
		System.out.println("피연산자2: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("연산자 입력(+,-,*,/,%): ");
		char ch = sc.nextLine().charAt(0);

		switch (ch) {
		case '+':
			System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
			break;
		case '-':
			System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
			break;
		case '*':
			System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
			break;
		case '/':
			System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
			break;
		case '%':
			System.out.printf("%d %s %d = %d", num1, '%', num2, num1 % num2);
			break;

		}
	}

	public void practice9() {
		System.out.println("중간고사 점수: ");
		int mid = sc.nextInt();
		System.out.println("기말고사 점수: ");
		int fin = sc.nextInt();
		System.out.println("과제 점수: ");
		int task = sc.nextInt();
		System.out.println("출석 횟수: ");
		int check = sc.nextInt();

		double mid2 = mid * 0.2;
		double fin2 = fin * 0.3;
		double task2 = task * 0.3;
		double sum = mid2 + fin2 + task2 + check;

		if (sum >= 70 && check >= 20 * 0.7) {

			System.out.println("=====결과=====");
			System.out.println("중간 고사 점수(20) : " + mid2);
			System.out.println("기말 고사 점수(30) : " + fin2);
			System.out.println("과제 점수 (30) : " + task2);
			System.out.println("출석 횟수 (20) : " + check);

			System.out.println("총점: " + sum);
			System.out.println("PASS!!");

		} else if (sum < 70 && check >= 20 * 0.7) {
			System.out.println("=====결과=====");
			System.out.println("FAIL [점수 미달] (총점: " + sum + ")");

		} else if (sum >= 70 && check < 20 * 0.7) {
			System.out.println("=====결과=====");
			System.out.println("FAIL [출석 횟수 부족] (" + check + "/20)");
		} else {
			System.out.println("=====결과=====");
			System.out.println("FAIL [출석 횟수 부족] (" + check + "/20)");
			System.out.println("FAIL [점수 미달] (총점: " + sum + ")");
		}
	}

	public void practice10() {

		System.out.println("실행할 기능을 선택하세요");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.println("선택: ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		}

	}

}
