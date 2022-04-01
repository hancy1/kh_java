package com.uni.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.uni.member.model.dto.Member;
import com.uni.member.model.exception.MemberException;
import com.uni.member.model.service.MemberService;
import com.uni.member.view.MemberMenu;

public class MemberController {

	public void selectAll() {

		MemberMenu menu = new MemberMenu();
		ArrayList<Member> list;
		try {
			list = new MemberService().selectAll();

			if (!list.isEmpty()) {
				menu.displayMemberList(list);
			} else {
				menu.displayNoData();
			}

		} catch (MemberException e) {
			menu.displayError("회원전체 조회 실패, 관리자에게 문의하세요");
			System.out.println(e.getMessage());
		}
	}

	public void selectOne(String memberId) {

		MemberMenu menu = new MemberMenu();
		Member m;
		try {
			m = new MemberService().selectOne(memberId);

			if (m != null) {
				menu.displayMember(m);
			} else {
				menu.displayNoData();
			}
			
		} catch (MemberException e) {
			menu.displayError("회원 조회 실패, 관리자에게 문의하세요");
			System.out.println(e.getMessage());
		}

	}

	public void selectOne1(String memberName) {

		MemberMenu menu = new MemberMenu();
		List<Member> list;
		try {
			list = new MemberService().selectOne1(memberName);
		 // 여러 행을 받을 수 있기 때문에 list로 담음

		if (!list.isEmpty()) {
			menu.displayMemberList(list);
		} else {
			menu.displayNoData();
		}
		
		} catch (MemberException e) {
			
			menu.displayError("회원 이름 검색 실패, 관리자에게 문의하세요");
			System.out.println(e.getMessage());
		}
		
		
	}

	public void insertMember(Member m) {

		int result;
		try {
			result = new MemberService().insertMember(m);
		
		if (result > 0) {
			new MemberMenu().displaySuccess("회원가입성공");
		}
		
		} catch (MemberException e) {
			
			new MemberMenu().displayError("회원가입실패");
			System.out.println(e.getMessage());
		} // 인서트를 하면 성공행개수가 리턴됨 그래서 int로 받음


	}

	public void updateMember(Member m) {

		int result;
		try {
			result = new MemberService().updateMember(m);
		// 업데이트를 하면 성공행개수가 리턴됨 그래서 int로 받음

		if (result > 0) {
			new MemberMenu().displaySuccess("회원정보 수정 성공");
		} 
		
		} catch (MemberException e) {
			new MemberMenu().displayError("회원정보 수정 실패");
			System.out.println(e.getMessage());
		} 

	}

	public void deleteMember(String memberId) {

		int result;
		try {
			result = new MemberService().deleteMember(memberId);
		 // 딜리트를 하면 성공행개수가 리턴됨 그래서 int로 받음

		if (result > 0) {
			new MemberMenu().displaySuccess("회원정보 삭제 성공");
		} 
		
		} catch (MemberException e) {
			new MemberMenu().displayError("회원정보 삭제 실패");
			System.out.println(e.getMessage());
		}

	}

	public void exitProgram() {

		new MemberService().exitProgram();

	}

	public void selectAllDeleteMember() {

		MemberMenu menu = new MemberMenu();
		List<Member> list;
		try {
			list = new MemberService().selectAllDeleteMember();
		

		if (!list.isEmpty()) {
			menu.displayMemberList(list);
		} else {
			menu.displayNoData();
		}
		
		} catch (MemberException e) {
			menu.displayError("탈퇴회원 조회실패, 관리자에게 문의하세요.");
			System.out.println(e.getMessage());
		}

	}

}
