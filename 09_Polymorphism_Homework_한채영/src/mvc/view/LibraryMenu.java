package mvc.view;

import java.util.Scanner;
import mvc.controller.LibraryManager;
import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryMenu {
	private LibraryManager lm = new LibraryManager();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		System.out.println("이름: ");
		String name = sc.nextLine();

		System.out.println("나이: ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("성별: ");
		char gender = sc.nextLine().charAt(0);

		Member mem = new Member(name, age, gender);

		lm.insertMember(mem);

		while (true) {
			System.out.println("=====메뉴=====");
			System.out.println("1. 마이페이지\n" + "2. 도서 전체 조회\n" + "3. 도서검색\n" + "4. 도서 대여하기\n" + "9. 프로그램 종료하기");
			System.out.println("메뉴: ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println(lm.myInfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			}

		}

	}

	public void selectAll() {
		Book[] bList = lm.selectAll();

		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서: " + bList[i]);
		}

	}

	public void searchBook() { // 키워드 넣은 후 출력이 안 됨.

		System.out.println("검색할 제목 키워드: ");
		String keyword = sc.nextLine();
		Book[] searchList = lm.searchBook(keyword); // LibraryManager의 searchBook() 메소드에 전달, 그 결과 값을 Book[] 자료형으로 받기

		for (Book bk : searchList) {

			if (bk instanceof AniBook) {
				System.out.println(((AniBook) bk).toString());
			} else if (bk instanceof CookBook) {
				System.out.println(((CookBook) bk).toString());
			}

		}
		sc.nextLine();
	}

	public void rentBook() {

		selectAll();

		System.out.println("대여할 도서 선택: ");
		int num = sc.nextInt();

		int result = lm.rentBook(num);

		switch (result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요");
			break;
		}

	}

}
