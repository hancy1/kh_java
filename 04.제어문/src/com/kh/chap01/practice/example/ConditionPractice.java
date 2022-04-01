package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {

		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n9. 종료");

		Scanner sc = new Scanner(System.in);

		System.out.println("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		switch (num) {

		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 9:
			System.out.println("프로그램이 종료됩니다.");
			break;
		}

	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 한 개 입력하세요 :");
		int num = sc.nextInt();

		if (num > 0 && num % 2 == 0) {
			System.out.println("짝수다");
		} else if (num > 0 && num % 2 == 1) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
		//가이드 답변
		// 중첩 if문으로 공통적인 조건을 먼저검사하고!
		/*if(num > 0) { 
			if(num % 2 == 0) {
				System.out.println("짝수다.");
			}else {
				System.out.println("홀수다.");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}*/

	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.println("국어 점수: ");
		int 국어 = sc.nextInt();
		System.out.println("수학 점수: ");
		int 수학 = sc.nextInt();
		System.out.println("영어 점수: ");
		int 영어 = sc.nextInt();

		int div = (국어 + 수학 + 영어) / 3;

		if ((국어 >= 40 && 수학 >= 40 && 영어 >= 40) && div >= 60) {
			System.out.println("국어 : " + 국어);
			System.out.println("수학 : " + 수학);
			System.out.println("영어 : " + 영어);
			System.out.println("합계 : " + (int) (국어 + 수학 + 영어));
			System.out.println("평균 : " + div);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}

	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1~12사이의 정수 입력 :");
		int month = sc.nextInt();

		switch (month) {

		case 1:
		case 2:
		case 12:
			System.out.println(month + "는 겨울입니다.");
			break;
			
		case 3:
		case 4:
		case 5:
			System.out.println(month + "는 봄입니다.");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println(month + "는 여름입니다.");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println(month + "는 가을입니다.");
			break;

		default:
			System.out.println(month + "는 잘못 입력된 달입니다.");
			break;
		}

		// 2. String 변수 사용해서 출력문은 한번만
				/*String season = null;
				
				switch(num) {
				case 12:
				case 1:
				case 2:
						season = "겨울";
						break;
				case 3:
				case 4:
				case 5: 
						season = "봄";
						break;
				case 6:
				case 7:
				case 8:
						season = "여름";
						break;
				case 9:
				case 10:
				case 11:
						season = "가을";
						break;
				default : 
						season = "잘못 입력된 달";
						break;
				}
				
				System.out.println(num + "월은 " + season + "입니다."); */
	}
	
	public void practice5() {
		
		String userId = "user1";
		String userPw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디: ");
		String InputId = sc.nextLine();
		
		System.out.println("비밀번호: ");
		String InputPw = sc.nextLine();	
		
		if(userId.equals(InputId) && userPw.equals(InputPw)) {
			System.out.println("로그인 성공");
		} else if (userId.equals(InputId) && !userPw.equals(InputPw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else {		
			System.out.println("아이디가 틀렸습니다.");
		}		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("권한을 확인하고자 하는 회원 등급: ");

//		String grade = sc.nextLine();
//				
//		switch(grade) {
		
		switch(sc.nextLine()) /*이런 식으로 바로 비교 가능*/ {
		
		case "관리자" : System.out.println("회원관리, 게시글 관리,\n게시글 작성, 댓글 작성,\n게시글 조회");
		break;
		
		case "회원" : System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		break;
		
		case "비회원" : System.out.println("게시글 조회");
		break;
		
		default : System.out.println("잘못 입력하셨습니다."); 
		break;
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해 주세요 :");
		int weight = sc.nextInt();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 :" + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if (bmi >= 25 && bmi <30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch(ch) {
		
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			break;
			
		case '%' :
			result = num1 % num2;
			break;
			
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");		
		}
	
		if (num1 > 0 && num2 > 0) {
			System.out.printf("%d %c %d %s %d", num1, ch, num2, "=", result);
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
				
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중간고사 점수: ");
		int score1 = sc.nextInt();
		System.out.println("기말고사 점수: ");
		int score2 = sc.nextInt();
		System.out.println("과제 점수: ");
		int score3 = sc.nextInt();
		System.out.println("출석 횟수: ");
		double num1 = sc.nextInt();
		System.out.println("========결과========");
		
		double score11 = score1*0.2; 
		double score22 = score2*0.3;
		double score33 = score3*0.3;
		double result = score11+score22+score33+num1;
				
		if(result >= 70 && num1 >= 14) {
			System.out.println("중간고사 점수(20) : " + score11);
			System.out.println("기말고사 점수(30) : " + score22);
			System.out.println("과제 점수(30) : " + score33);
			System.out.println("출석 점수(20) : " + num1);
			System.out.println("총점 : " + result);
			System.out.println("PASS");
		} else if (result < 70 && num1 >= 14) {
			System.out.println("FAIL [점수 미달] (총점 " + result + ")");
		} else if (result >= 70 && num1 < 14) {
			System.out.println("FAIL [출석 횟수 부족] (" + num1 + "/20)");
		} else {
			System.out.println("FAIL [출석 횟수 부족] (" + num1 + "/20)");
			System.out.println("FAIL [점수 미달] (총점 " + result + ")");
		}
	}
	
	public void practice10() {
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴출력\n2. 짝수/홀수\n3. 합격/불합격\n4. 계절\n5. 로그인\n6.권한 확인\n7. BMI\n8. 계산기\n9. Pass/Fail");
		System.out.println("선택: ");
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		switch(num) {
		
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
