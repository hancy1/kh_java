package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.BookManager;
import com.kh.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in); // 생성
	private BookManager bm = new BookManager(); // 생성

	public BookMenu() {
	}

	public void mainMenu() {

		while (true) {
			System.out.println("***도서 관리 프로그램***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 검색 출력");
			System.out.println("4. 전체 출력");
			System.out.println("0. 끝내기");
			System.out.println("메뉴 번호 선택: ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				insertBook();
				break;
			case 2:
				deleteBook();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				selectList();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			}

		}

	}

	public void insertBook() {// 도서 추가
		
		System.out.println("도서제목: ");
		String title = sc.nextLine();
		System.out.println("도서장르(1:인문 / 2:자연과학 / 3:의료 / 4:기타): ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.println("도서저자: ");
		String author = sc.nextLine();
		
		//Book bk = new Book(title, category, author);
		bm.insertBook(new Book(title, category, author));
		System.out.println("도서 추가 완료");
		
	}

	public void deleteBook() {// 도서 삭제
		
		System.out.println("도서번호: ");
		int bNo = sc.nextInt();
		
		int result = bm.deleteBook(bNo);
		
		if(result == 1) {
			System.out.println("성공적으로 삭제");
		} else if(result == 0) {
			System.out.println("삭제할 도서가 존재하지 않습니다.");
		}
		
	}

	public void searchBook() {// 도서 검색
		
		System.out.println("도서제목: ");
		String title = sc.nextLine();
		
		ArrayList<Book> searchList = bm.searchBook(title);
		
		if(searchList == null) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		} else if (searchList != null) {
			for(Book a : searchList) {
				System.out.println(a.toString());
			}
		}
		
	}

	public void selectList() {// 전체 조회
		
		ArrayList<Book> bookList = bm.selectList();
		
		if(bookList == null) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		} else if (bookList != null) {
			for(Book a : bookList) {
				System.out.println(a.toString());
			}
		}
		
	}

}
