package com.kh.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.collection.silsub1.model.comparator.AscBoardDate;
import com.kh.collection.silsub1.model.comparator.AscBoardNo;
import com.kh.collection.silsub1.model.comparator.AscBoardTitle;
import com.kh.collection.silsub1.model.comparator.DescBoardDate;
import com.kh.collection.silsub1.model.comparator.DescBoardNo;
import com.kh.collection.silsub1.model.comparator.DescBoardTitle;
import com.kh.collection.silsub1.model.dao.BoardDao;
import com.kh.collection.silsub1.model.vo.Board;

public class BoardManager {

	private Scanner sc = new Scanner(System.in);
	private BoardDao bd = new BoardDao();

	public BoardManager() {
		// TODO Auto-generated constructor stub
	}

	public void writeBoard() {
		System.out.println("새 게시글 쓰기입니다.");

		int boardNo = 0; // 체크

		System.out.println("글 제목: ");
		String boardTitle = sc.nextLine();
		System.out.println("작성자: ");
		String boardWrtier = sc.nextLine();
		Date boardDate = new Date();
		boardDate.getDate();
		System.out.println("글 내용(exit 입력시 종료): "); // 체크

		// 아래 가이드 참고한 부분. 원래는 스트링빌더에 append써서 하려했는데 계속 오류떴었음
		String content = "";
		String str = "";

		while (true) {

			str = sc.nextLine();

			if (str.equals("exit")) {
				break;
			}

			content += str + "\n";
		}

		// 가이드 참고 부분. 처음에 그냥 돌렸더니 인덱스익셉션 발생.
		// 첫 글인 경우에는 익셉션이 발생하기 때문에 트라이캐치문으로 오류를 잡아줘야 한다.
		try {
			// 1) 기존의 게시글이 있을 경우(파일이 존재할 경우). 마지막 번호에 1을 더해 글 번호를 계속 늘림.
			bd.writeBoard(new Board(bd.getLastBoardNo() + 1, boardTitle, boardWrtier, boardDate, content));
		} catch (IndexOutOfBoundsException e) {
			// 2) 기존의 게시글이 없을 경우(파일이 존재하지 않을 경우). 글 번호를 1번으로 줌.
			bd.writeBoard(new Board(1, boardTitle, boardWrtier, boardDate, content));
		}

		System.out.println("게시글 쓰기 완료");
	}

	public void displayAllList() {

		ArrayList<Board> list = bd.displayAllList();

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public void displayBoard() {

		System.out.println("조회할 글 번호 : ");
		int num = sc.nextInt();

		Board b = bd.displayBoard(num);

		// 조회수를 올리기 위해 BoardDao의 upReadCount() 메소드에 해당 글 번호 전달
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력
		if (b == null) {
			System.out.println("조회된 글이 없습니다.");
		} else {
			System.out.println(b.toString());
			bd.upReadCount(num);
		}

	}

	public void modifyTitle() {
		System.out.println("수정할 글 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();

		Board b = bd.displayBoard(num);
		System.out.println(b.toString());

		System.out.println("변경할 글 제목: ");
		String title = sc.nextLine();

		bd.modifyTitle(num, title);
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력
	}

	public void modifyContent() {
		System.out.println("수정할 글 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();

		Board b = bd.displayBoard(num);
		System.out.println(b.toString());

		System.out.println("변경할 글 내용: ");
		String content = sc.nextLine();

		bd.modifyContent(num, content);
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력

	}

	public void deleteBoard() {
		// “삭제할 글 번호 : “ >> 입력 받음
		// BoardDao의 displayBoard() 메소드를 호출하여 해당 글 번호의 게시글 전달 받아 출력
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력
		// 있을 경우 “정말로 삭제하시겠습니까? (y/n) : “ >> 입력 받음
		// 대소문자 관계없이 Y 일 경우 BoardDao의 deleteBoard() 메소드에 해당 글 번호 전달

		System.out.println("삭제할 글 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();

		Board b = bd.displayBoard(num);
		System.out.println(b.toString());
		// 만약 없을 경우 “조회된 글이 없습니다.” 출력
		// 있을 경우 “정말로 삭제하시겠습니까? (y/n) : “ >> 입력 받음
		System.out.println("정말로 삭제하시겠습니까?(y/n)");
		String yn = sc.nextLine();
		if (yn.equalsIgnoreCase("y")) {
			bd.deleteBoard(num);
		} else if (yn.equalsIgnoreCase("n")) {
			System.out.println("취소하셨습니다.");
			return;
		}

	}

	public void searchBoard() {
		// “검색할 제목 : “ >> 입력 받음
		// BoardDao의 searchBoaard() 메소드에 입력 값 전달
		// 제목은 중복될 수 있기 때문에 결과값 다중  list로 결과값 전달받음
		// 결과값이 없으면 “검색 결과가 없습니다.” 출력
		// 결과값이 있으면 list출력

		System.out.println("검색할 제목 : ");
		String title = sc.nextLine();

		ArrayList<Board> list = bd.searchBoard(title);
		// 결과값이 없으면 “검색 결과가 없습니다.” 출력
		if (list.isEmpty()) { // 리스트가 비어있는 값을 알아낼 때 {
			System.out.println("검색결과가 없습니다.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));

			}
		}
	}

	public void saveListFile() {
		// BoardDao의 saveListFile()의 메소드 호출

		bd.saveListFile();

	}

	public void sortList(int item, boolean isDesc) {

		ArrayList<Board> a = bd.displayAllList();

		if (item == 1 && isDesc == true) {
			a.sort(new DescBoardNo());
		} else if (item == 1 && isDesc == false) {
			a.sort(new AscBoardNo());
		} else if (item == 2 && isDesc == true) {
			a.sort(new DescBoardDate());
		} else if (item == 2 && isDesc == false) {
			a.sort(new AscBoardDate());
		} else if (item == 3 && isDesc == true) {
			a.sort(new DescBoardTitle());
		} else if (item == 3 && isDesc == false) {
			a.sort(new AscBoardTitle());
		}

		System.out.println(a.toString());
	}

}
