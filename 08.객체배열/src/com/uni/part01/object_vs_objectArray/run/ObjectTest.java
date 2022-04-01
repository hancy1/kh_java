package com.uni.part01.object_vs_objectArray.run;

import java.util.Scanner;

import com.uni.part01.object_vs_objectArray.model.vo.Book;

public class ObjectTest {

	public static void main(String[] args) {

		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;

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

			if (i == 0) {
				bk1 = new Book(title, author, price, publisher);

			} else if (i == 1) {
				bk2 = new Book(title, author, price, publisher);

			} else if (i == 2) {
				bk3 = new Book(title, author, price, publisher);
			}

		}
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());

		// 도서 제목으로 검색
		System.out.println("검색할 책 제목: ");
		String find = sc.nextLine();
		
		if (find.equals(bk1.getTitle())) {
			System.out.println(bk1.information());
			
		} else if (find.equals(bk2.getTitle())) {
			System.out.println(bk2.information());
			
		} else if (find.equals(bk3.getTitle())) {
			System.out.println(bk3.information());
			
		} else {
			System.out.println("검색한 도서가 없습니다.");
		}

	}
}
