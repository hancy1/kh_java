package com.kh.collection.silsub2.view;

import java.util.Scanner;

import com.kh.collection.silsub2.controller.BookManager;
import com.kh.collection.silsub2.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();

	public BookMenu() {
	}

	public void mainMenu() {

		while (true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색 출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
System.out.println("메뉴 번호 선택: ");
int menu = sc.nextInt();
			switch(menu) {
			case 1:
				inputBook();
				break;
			case 2: 
				bm.sortedBookList();
				// sortedBookList() 실행
				//=> Book[] 리턴 받아 printBookList(Book[]) 실행
				break;
			case 3:
				bm.deleteBook(null);
				// deleteBook (inputBookNo()이 리턴한 도서 번호) 실행
				//=> Book 리턴 받아 null이 아닐 경우 “성공적으로 삭제”
				//null일 경우 “삭제할 글이 존재하지 않음”
				break;
			case 4: 
				// searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
				//=> key 리턴 받아 null일 경우 “조회한 글이 존재하지 않음”
				//null이 아닐 경우 selectBook(key) 출력
				bm.searchBook(null);
				break;
			case 5:
				bm.selectAll();
				break;
			case 6:
				System.out.println("종료합니다.");
				break;
				
			}
		}
	}

	public Book inputBook() {
		return null;

	}

	public String inputBookNo() {
		return null;

	}

	public String inputBookTitle() {
		return null;

	}

}
