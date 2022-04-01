package com.uni.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.uni.part01.object_vs_objectArray.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		// 1. 기본 자료형 배열
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		System.out.println(arr); // 주소값 출력
		System.out.println(arr[0]); // 값 출력
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// arr의 자료형 : int[] --> 레퍼런스변수 == 주소값을 가지는 변수
		// arr[index] 의 자료형 : int --> 일반변수 == 실제 값을 가지는 변수

		// 2. 객체를 여러 개 담을 때 객체 배열 사용
		Book[] books = new Book[3];
		// new Book(); // 기본 생성자가 없으면 실행파일에서 호출 불가. 부르기 위해선 기본 생성자를 만들거나 매개변수있는 생성자를 부르기

		// books의 자료형 : Book[] --> 레퍼런스변수 == 주소값을 가지는 변수
		// books[index] 의 자료형 : Book --> 레퍼런스변수 == 주소값을 가지는 변수
		// books[index] = 객체생성

		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();

		System.out.println(books); // 주소값 출력
		System.out.println(books[0]); // 값 출력

		// 실제 값이 들어가있는 곳은 books[index] 객체의 필드로 접근하면 됨
		System.out.println(books[0].getPrice());// books[0].getPrice()의 자료형은 int

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "번째 도서 정보 입력");
			System.out.println("제목 : ");
			String title = sc.nextLine();

			System.out.println("저자 : ");
			String author = sc.nextLine();

			System.out.println("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();

			System.out.println("출판사 : ");
			String publisher = sc.nextLine();

			books[i] = new Book(title, author, price, publisher);
		}

		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].information());
		}

		System.out.println("검색할 책 제목: ");
		String search = sc.nextLine();

		//일반 for문
		for (int i = 0; i < books.length; i++) {
			if (books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());

			} else {
				System.out.println("검색하신 책이 없습니다.");
			} 
			
			//for each문
			for(int num : arr) {
				System.out.println("num : " + num);
			}
			
			for(Book b : books) {
				System.out.println("b: " + b.information());
			}
		}

	}

}
