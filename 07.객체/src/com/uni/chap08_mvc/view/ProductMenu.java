package com.uni.chap08_mvc.view;

import java.util.Scanner;

import com.uni.chap08_mvc.controller.ProductController;

//mvc 패턴중 view 패키지 : 사용자가 보게될 화면을 담당하는 부분 , 사용자가 보게되면 (print구문)은 반드시 view 패키지 내에서만 작성.
//scanner 사용도 view 패키지 안에서만 작성

public class ProductMenu {

	private Scanner sc = new Scanner(System.in); // 입력하기 위한 스캐너객체를 전역변수로 미리 생성해놓기
	private ProductController pc = new ProductController();// 사용자가 키보드로 값을 입력하고 어떤 기능을 요청하는 경우
															// 현재 이 클래스에서 처리하는 것이 아니고 controller에서 처리하도록 메소드를 호출할 것이기
															// 때문에 미리 생성

	// 1. 프로그램 시작하자마자 실행될 메소드
	public void mainmenu() {
		// 처음 제품 객체 생성을 위해서 입력해야 하는 내용

		System.out.println("제품명 : ");
		String name = sc.nextLine();

		System.out.println("브랜드명: ");
		String brand = sc.nextLine();

		System.out.println("가격: ");
		int price = sc.nextInt();

		pc.insertProduct(name, brand, price);

		while (true) {
			System.out.println("====메인메뉴====");
			System.out.println("1. 제품정보 조회");
			System.out.println("2. 제품정보 수정");
			System.out.println("9. 프로그램 종료");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {

			case 1:
				System.out.println(pc.selectProduct().information());
				break;

			case 2:
				updatePrice();
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("메뉴를 다시 선택해주세요.");
				break;
			}
		}
	}

	private void updatePrice() {
		System.out.println("수정할 가격을 입력해주세요 : ");
		int nPrice = sc.nextInt();
		pc.updatePrice(nPrice);

	}

}
