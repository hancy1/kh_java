package com.uni.member.controller;

	import java.util.ArrayList;
import java.util.List;

import com.uni.member.model.dao.MemberDAO;
import com.uni.member.model.dto.Member;
import com.uni.member.model.service.MemberService;
import com.uni.member.view.MemberMenu;

	public class MemberController {

		public void selectAll() {
			
			MemberMenu menu = new MemberMenu();
			ArrayList<Member> list = new MemberService().selectAll();
			
			if(!list.isEmpty()) {
				menu.displayMemberList(list);
			} else {
				menu.displayError("해당하는 데이터가 없습니다.");
			}
		}

		public void selectOne(String memberId) {
			
			MemberMenu menu = new MemberMenu();
			Member m = new MemberService().selectOne(memberId);
			
			if(m != null) {
				menu.displayMember(m);
			} else {
				menu.displayError(memberId + "에 해당하는 데이터가 없습니다.");
			}
			
		}

		public void selectOne1(String memberName) {
			
			MemberMenu menu = new MemberMenu();
			List<Member> list = new MemberService().selectOne1(memberName); //여러 행을 받을 수 있기 때문에 list로 담음
			
			if(!list.isEmpty()) {
				menu.displayMemberList(list);
			} else {
				menu.displayError(memberName + "에 해당하는 데이터가 없습니다.");
			}
		}

		public void insertMember(Member m) {
			
			int result = new MemberService().insertMember(m); // 인서트를 하면 성공행개수가 리턴됨 그래서 int로 받음
			
			
			if(result > 0) {
				new MemberMenu().displaySuccess("회원가입성공");
			} else {
				new MemberMenu().displayError("회원가입실패");
			}
		
		}

		public void updateMember(Member m) {
			
			int result = new MemberService().updateMember(m); // 업데이트를 하면 성공행개수가 리턴됨 그래서 int로 받음	
			
			if(result > 0) {
				new MemberMenu().displaySuccess("회원정보 수정 성공");
			} else {
				new MemberMenu().displayError("회원정보 수정 실패");
			}
			
		}

		public void deleteMember(String memberId) {
			
			int result = new MemberService().deleteMember(memberId); // 딜리트를 하면 성공행개수가 리턴됨 그래서 int로 받음	
			
			if(result > 0) {
				new MemberMenu().displaySuccess("회원정보 삭제 성공");
			} else {
				new MemberMenu().displayError("회원정보 삭제 실패");
			}
			
		}

		public void exitProgram() {
			
			new MemberService().exitProgram();
			
		}

		public void selectAllDeleteMember() {
			
			MemberMenu menu = new MemberMenu();
			List<Member> list = new MemberService().selectAllDeleteMember();
			
			if(!list.isEmpty()) {
				menu.displayMemberList(list);
			} else {
				menu.displayError("해당하는 데이터가 없습니다.");
			}
			
			
		}

	}
