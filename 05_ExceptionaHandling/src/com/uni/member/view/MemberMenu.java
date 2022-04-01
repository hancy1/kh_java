package com.uni.member.view;

import java.util.List;
import java.util.Scanner;

import com.uni.member.controller.MemberController;
import com.uni.member.model.dto.Member;

public class MemberMenu {

	private static Scanner sc = new Scanner(System.in);
	private MemberController mController = new MemberController();

	public void mainMenu() {

		int choice;

		do {
			System.out.println("\n*******회원관리프로그램*******");
			System.out.println("1. 회원 전체 조회"); //SELECT
			System.out.println("2. 회원 아이디 조회"); //SELECT
			System.out.println("3. 회원 이름 조회"); //SELECT
			System.out.println("4. 회원 가입"); //INSERT
			System.out.println("5. 회원 정보 변경"); //UPDATE
			System.out.println("6. 회원 탈퇴"); //DELETE
			System.out.println("7. 탈퇴 회원 조회");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("번호선택: ");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				mController.selectAll();
				break;
			case 2:
				mController.selectOne(inputMemberId());
				break;
			case 3:
				mController.selectOne1(inputMemberName());
				break;
			case 4:
				mController.insertMember(inputMember());
				break;
			case 5:
				mController.updateMember(updateMember());
				break;
			case 6:
				mController.deleteMember(inputMemberId());
				break;
			case 7:
				mController.selectAllDeleteMember();
				break;
			case 9:
				System.out.println("정말로 끝내시겠습니까?(y/n)");
				if('y' == sc.next().toLowerCase().charAt(0)) {
					mController.exitProgram();
					return;
				}
				break;
			default:
				System.out.println("번호를 잘못 입력하였습니다.");
				
			}
						
		} while (true);
		
	}
	private Member updateMember() {
		Member m = new Member();
		
		m.setUserId(inputMemberId());
		
		System.out.println("암호: ");
		m.setPassword(sc.next());
		
		System.out.println("이메일: ");
		m.setEmail(sc.next());
		
		System.out.println("주소: ");
		sc.nextLine();
		m.setPhone(sc.nextLine());
		
		System.out.println("전화번호(-빼고 입력): ");
		m.setAddress(sc.next());
				
		return m;
	}
	private Member inputMember() {
		
		Member m = new Member();
		System.out.println("회원정보를 입력하세요 >> ");
		System.out.println("아이디: ");
		m.setUserId(sc.next());
		System.out.println("비밀번호: ");
		m.setPassword(sc.next());
		System.out.println("이름: ");
		m.setUserName(sc.next());		
		System.out.println("성별(m/f): ");
		m.setGender(sc.next().toUpperCase());
		System.out.println("나이: ");
		m.setAge(sc.nextInt());
		System.out.println("이메일: ");
		m.setEmail(sc.next());
		System.out.println("전화번호(-빼고): ");
		m.setPhone(sc.next());
		System.out.println("주소");
		sc.nextLine();
		m.setAddress(sc.nextLine());
		System.out.println("취미(,로 공백없이 입력)");
		m.setHobby(sc.next());
		
		return m;

	}
	private String inputMemberName() {
		System.out.println("조회할 회원의 이름 입력: ");
		return sc.next();
	}
	
	private String inputMemberId() {
		
		System.out.println("아이디 입력: ");
		return sc.next();
	}
	//리턴된 리스트(여러 행) 출력용 메소드
	public void displayMemberList(List<Member> list) {
		System.out.println("\n 조회된 전체 회원 정보는 다음과 같습니다.");
		System.out.println("\n아이디\t이름\t성별\t나이\t이메일\t전화번호\t주소\t취미\t가입일");
		System.out.println("----------------------------------------------------------");

		for(Member m : list) {
			System.out.println(m);
		}		
	}
	
	//아이디로 조회된 회원 한 명에 대한 정보 출력하는 메소드
	public void displayMember(Member m) {
		System.out.println("\n 조회된 전체 회원 정보는 다음과 같습니다.");
		System.out.println("\n아이디\t이름\t성별\t나이\t이메일\t전화번호\t주소\t취미\t가입일");
		System.out.println("----------------------------------------------------------");		
		System.out.println(m);
		
	}
	
	//실패에 대한 에러메세지 출력용 메소드
	public void displayError(String message) {
		System.out.println("서비스 요청 처리 실패: " + message);
		
	}
	//성공메세지 출력
	public void displaySuccess(String message) {
		System.out.println("서비스 요청 결과 : " + message);
		
		
	}
	
	//데이터없을 때 출력하는 메세지
	public void displayNoData() {
		System.out.println("조회된 데이터가 없습니다.");
	}

}
