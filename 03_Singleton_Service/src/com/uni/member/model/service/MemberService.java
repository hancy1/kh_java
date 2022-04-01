package com.uni.member.model.service;

import static com.uni.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.uni.member.model.dao.MemberDAO;
import com.uni.member.model.dto.Member;

/* Service 클래스에서 메소드 작성 방법
 * 1) Controller로 부터 인자를 전달받음
 * 2) Connection 객체 생성
 * 3) Dao 객체 생성
 * 4) Dao로 생성한 Connection 객체와 인자를 전달
 * 5) Dao 수행 결과를 가지고 비즈니스 로직 및 트랜잭션 관리를 함 */

public class MemberService {

	public ArrayList<Member> selectAll() {
		
		Connection conn = getConnection();
		
		ArrayList<Member> list = new MemberDAO().selectAll(conn);
		
		return list;
	}

	public Member selectOne(String memberId) {
		
		Connection conn = getConnection(); 
		Member m = new MemberDAO().selectOne(conn, memberId);
		
		return m;
	}

	public List<Member> selectOne1(String memberName) {
		
		Connection conn = getConnection(); 
		List<Member> list = new MemberDAO().selectOne1(conn, memberName);
		
		return list;
	}

	public int insertMember(Member m) {
		
		Connection conn = getConnection();
		int result = new MemberDAO().insertMember(conn, m);
		
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		System.out.println(result); // 결과 값 몇 나오는지 확인
		
		return result;
	}

	public int updateMember(Member m) {
		
		Connection conn = getConnection();
		int result = new MemberDAO().updateMember(conn, m);
		
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		System.out.println(result); // 결과 값 몇 나오는지 확인
		
		return result;
	}

	public int deleteMember(String memberId) {
		
		Connection conn = getConnection();
		int result = new MemberDAO().deleteMember(conn, memberId);
		
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		System.out.println(result); // 결과 값 몇 나오는지 확인
		
		return result;
	}

	public void exitProgram() {
		
		close(getConnection());
		
	}

	public List<Member> selectAllDeleteMember() {
		
		Connection conn = getConnection();
		
		ArrayList<Member> list = new MemberDAO().selectAllDeleteMember(conn);
		
		return list;
	}

	
	

	
	
	
}
