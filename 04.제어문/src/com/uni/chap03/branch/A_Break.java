package com.uni.chap03.branch;

import java.util.Scanner;

public class A_Break {

	//break : 가장 가까운 반복문을 빠져나가는 문구 
	// 단 switch 문안의 break 는 switch 문을 빠져나가는 break

	public void method1() {
	
			//계속 문자열을 입력 받고 그 문자열을 출력 하게끔 
			//하지만 그 문자열이 "exit" 가 아닐 때까지 반복

			Scanner sc = new Scanner(System.in);
			/*for(;;) { //for에서 무한루프짤 때 공백/;;사용
			System.out.println("문자열 입력 : ");
			String str = sc.nextLine();
			System.out.println(str);
		} */
		/*while() { // -> 조건식을 적어줘야한다. while에서 무한루프일 때 true/false 적기
			System.out.println("문자열 입력 : ");
			String str = sc.nextLine();
			System.out.println(str);
		}*/

			String str = "";
			
			while (true) {
				System.out.println("문자열을 입력해주세요.");
				str = sc.nextLine();
				if(str.equals("exit")) {
					break;
				}
				System.out.println("str : " + str);
			}
			// 무한 반복문 안에서 break 가 없는 경우 다음 코드 오류 -> 
			//unreachable code 절대 도달 할수 없는 코드, 즉 절대 실행될 일 없는 코드이다.
			System.out.println("exit를 입력해서 종료되었습니다.");
		}
	
	public void method2() {
		
		// 매번 반복적으로 랜덤값 (1~10) 을 발생시킨 후 출력
		// 단, 그 랜덤값이 홀수일 경우 출력 하지않고 반복문을 빠져나간 후 " 프로그램을 종료 합니다 " 출력

		while(true) /*키워드: 매번 반복*/ {
			int random = (int) (Math.random() * 10 + 1);
			
			if(random % 2 == 1) {
				break;
			}
			System.out.println("랜덤 값: " + random);			
		}
		System.out.println("프로그램을 종료합니다");
	}
		
	}
	
