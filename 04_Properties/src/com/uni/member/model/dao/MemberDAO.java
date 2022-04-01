package com.uni.member.model.dao;

//static 메소드를 받아오기 위해 임포트할 때 static으로 받아줌
import static com.uni.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.uni.member.model.dto.Member;

/* 이전 프로젝트에서 Dao가 맡은 업무
1) JDBC드라이버 등록
2) DB 연결 Connection 객체생성
3) SQL 실행
4) 처리결과에 따른 트랜잭션처리(commit, rollback)
5) 자원 반환

이 때, 실제로 dao가 처리해야 업무는 SQL문을 DB로 전달하여 실행하고 반환값을 받아오는
3번의 역할만을 진행해야 함. 
 --> 3번 이외에 1,2,4,5 역할을 분리해야 함.
 
+ 1,2,4,5의 업무는 어디서든 공통적으로 이루어지는 공통 업무
 --> 한번에 묶어서 처리해주자
 --> 공통업무를 처리하기 위한
 JDBCTemplate 클래스 생성.
*/

public class MemberDAO {

	//기본 생성자 작성 전에 sql 구문을 읽어 올 properties참조 변수를 선언
	private Properties prop = null;
	
	//외부에서 .properties 파일을 읽어와서 prop 참조변수에 저장
	public MemberDAO() {	
		
		try {
			prop = new Properties();
			prop.load(new FileReader("resources/query.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Member> selectAll(Connection conn) {

		ArrayList<Member> list = null;

		Statement stmt = null; // 실행할 쿼리
		ResultSet rset = null; // select한 후 결과값 받아올 객체

		//String sql = "SELECT * FROM MEMBER"; // 자동으로 세미콜론을 붙여 실행시키기 때문에 따로 붙이지 말기
		String sql = prop.getProperty("selectAll");
		
		try {

			// 3. 쿼리문을 실행할 statement객체 생성
			stmt = conn.createStatement();

			// 4. 쿼리문 전송, 실행결과를 ResultSet으로 받기
			rset = stmt.executeQuery(sql);

			// 5. 받은 결과값을 객체에 옮겨서 저장하기
			list = new ArrayList<Member>();
			while (rset.next()) {
				Member m = new Member();

				m.setUserId(rset.getString("USERID"));
				m.setPassword(rset.getString("PASSWORD"));
				m.setUserName(rset.getString("USERNAME"));
				m.setGender(rset.getString("GENDER"));
				m.setAge(rset.getInt("AGE"));
				m.setEmail(rset.getString("EMAIL"));
				m.setPhone(rset.getString("PHONE"));
				m.setAddress(rset.getString("ADDRESS"));
				m.setHobby(rset.getString("HOBBY"));
				m.setEnrollDate(rset.getDate("ENROLLDATE"));
				list.add(m);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			close(rset);
			close(stmt);

		}
		return list;
	}

	public Member selectOne(Connection conn, String memberId) {

		Member m = null;
		PreparedStatement pstmt = null; // preparedStatement 로 받기
		ResultSet rset = null;

		//String sql = "SELECT * FROM MEMBER WHERE USERID = ?"; // 위치홀더 이용해서 입력값을 따로 받음
		String sql = prop.getProperty("selectOne");
		
		try {

			// 3. 쿼리문을 실행할 Preparestatement객체 생성
			pstmt = conn.prepareStatement(sql); // 인자로 sql(string)을 받기 때문에 위에서 먼저 지정해줘야함
			pstmt.setString(1, memberId); // 위치홀더(?)에 값 담기

			// 4. 쿼리문 전송, 실행결과를 ResultSet으로 받기
			rset = pstmt.executeQuery(); // 위에서 sql을 받았기 때문에 여기서 또 안 받아도 됨

			// 5. 받은 결과값을 객체에 옮겨서 저장하기

			if (rset.next()) { // 행이 하나니까 '행이 있으면'이라는 조건문으로 돌리기
				m = new Member();

				m.setUserId(rset.getString("USERID"));
				m.setPassword(rset.getString("PASSWORD"));
				m.setUserName(rset.getString("USERNAME"));
				m.setGender(rset.getString("GENDER"));
				m.setAge(rset.getInt("AGE"));
				m.setEmail(rset.getString("EMAIL"));
				m.setPhone(rset.getString("PHONE"));
				m.setAddress(rset.getString("ADDRESS"));
				m.setHobby(rset.getString("HOBBY"));
				m.setEnrollDate(rset.getDate("ENROLLDATE"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			// 자원 반납의 순서는 생성의 역순
			close(rset);
			close(pstmt);

		}
		return m;
	}

	public ArrayList<Member> selectOne1(Connection conn, String memberName) {
		ArrayList<Member> list = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		//String sql = "SELECT * FROM MEMBER WHERE USERNAME LIKE ?";
		String sql = prop.getProperty("selectOne1");
		
		try {

			// 3. 쿼리문을 실행할 statement객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + memberName + "%"); // LIKE를 사용했기 때문에 와일드카드 % 사용

			// 4. 쿼리문 전송, 실행결과를 ResultSet으로 받기
			rset = pstmt.executeQuery();

			// 5. 받은 결과값을 객체에 옮겨서 저장하기
			list = new ArrayList<Member>(); // list를 새로운 객체로 생성하는 과정가지기 안 하면 null로 인식됨

			while (rset.next()) { // 행이 하나니까 '행이 있으면'이라는 조건문으로 돌리기
				Member m = new Member();

				m.setUserId(rset.getString("USERID"));
				m.setPassword(rset.getString("PASSWORD"));
				m.setUserName(rset.getString("USERNAME"));
				m.setGender(rset.getString("GENDER"));
				m.setAge(rset.getInt("AGE"));
				m.setEmail(rset.getString("EMAIL"));
				m.setPhone(rset.getString("PHONE"));
				m.setAddress(rset.getString("ADDRESS"));
				m.setHobby(rset.getString("HOBBY"));
				m.setEnrollDate(rset.getDate("ENROLLDATE"));

				list.add(m);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			close(rset);
			close(pstmt);
		}
		return list;
	}

	public int insertMember(Connection conn, Member m) {

		int result = 0;
		PreparedStatement pstmt = null;
		// ResultSet rset = null; 인서트는 리절트셋을 반환하지 않기 때문에 해당 객체 불필요

		//String sql = "INSERT INTO MEMBER VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
		String sql = prop.getProperty("insertMember");
		
		System.out.println(sql);

		try {

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, m.getUserId());
			pstmt.setString(2, m.getPassword());
			pstmt.setString(3, m.getUserName());
			pstmt.setString(4, m.getGender());
			pstmt.setInt(5, m.getAge());
			pstmt.setString(6, m.getEmail());
			pstmt.setString(7, m.getPhone());
			pstmt.setString(8, m.getAddress());
			pstmt.setString(9, m.getHobby());

			result = pstmt.executeUpdate(); // 업뎃 후 처리한 행의 개수 리턴

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int updateMember(Connection conn, Member m) {

		int result = 0;
		PreparedStatement pstmt = null;
		// ResultSet rset = null; 업데이트는 리절트셋을 반환하지 않기 때문에 해당 객체 불필요

		//String sql = "UPDATE MEMBER SET PASSWORD = ?, EMAIL = ?, PHONE = ?, ADDRESS = ? WHERE USERID = ?";
		String sql = prop.getProperty("updateMember");
		
		System.out.println(sql);

		try {

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, m.getPassword());
			pstmt.setString(2, m.getEmail());
			pstmt.setString(3, m.getPhone());
			pstmt.setString(4, m.getAddress());
			pstmt.setString(5, m.getUserId());

			result = pstmt.executeUpdate(); // 업뎃 후 처리한 행의 개수 리턴

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int deleteMember(Connection conn, String memberId) {

		int result = 0;
		PreparedStatement pstmt = null;
		// ResultSet rset = null; 딜리트는 리절트셋을 반환하지 않기 때문에 해당 객체 불필요

		//String sql = "DELETE FROM MEMBER WHERE USERID = ?";
		String sql = prop.getProperty("deleteMember");

		System.out.println(sql);

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, memberId);

			result = pstmt.executeUpdate(); // 업뎃 후 처리한 행의 개수 리턴

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;

	}

	public ArrayList<Member> selectAllDeleteMember(Connection conn) {

		ArrayList<Member> list = null;
		Statement stmt = null;
		ResultSet rset = null;

		//String sql = "SELECT * FROM MEMBER_DEL";
		String sql = prop.getProperty("selectAllDeleteMember");

		try {

			// 3. 쿼리문을 실행할 statement객체 생성
			stmt = conn.createStatement();

			// 4. 쿼리문 전송, 실행결과를 ResultSet으로 받기
			rset = stmt.executeQuery(sql);

			// 5. 받은 결과값을 객체에 옮겨서 저장하기
			list = new ArrayList<Member>();
			while (rset.next()) {
				Member m = new Member();

				m.setUserId(rset.getString("USERID"));
				m.setPassword(rset.getString("PASSWORD"));
				m.setUserName(rset.getString("USERNAME"));
				m.setGender(rset.getString("GENDER"));
				m.setAge(rset.getInt("AGE"));
				m.setEmail(rset.getString("EMAIL"));
				m.setPhone(rset.getString("PHONE"));
				m.setAddress(rset.getString("ADDRESS"));
				m.setHobby(rset.getString("HOBBY"));
				m.setEnrollDate(rset.getDate("ENROLLDATE"));
			
				list.add(m);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			close(rset);
			close(stmt);

		}

		return list;
	}

}
