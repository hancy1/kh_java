package com.uni.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.uni.member.model.dto.Member;

/* 1.Connection 객체연결하기 
 * 2.Statement 객체 생성하기 
 * 3.ResultSet 객체 생성하기 
 * 4.Sql작성하기 
 * 5.ResultSet  결과담기 
 * 6.list 에 객체 하나씩 담기 
 * 7.close 하기 (자원반납 - 생성의 역순)
 */

public class MemberDao {

	public ArrayList<Member> selectAll() {
		
		ArrayList<Member> list = null;
		
		Connection conn = null; //DB 연결할 객체
		Statement stmt = null; //실행할 쿼리
		ResultSet rset = null; //select한 후 결과값 받아올 객체
		
		String sql = "SELECT * FROM MEMBER"; //자동으로 세미콜론을 붙여 실행시키기 때문에 따로 붙이지 말기
		
		
		try {
		//1. JDBC driver 등록처리: 해당 database 벤더 사가 제공하는 클래스 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
			
		// 2.등록된 클래스를 이용해서 db연결
		// 드라이버타입@ip주소:포트번호:db이름(SID)
		// orcl:사용자정의설치 , thin : 자동으로 설치 //ip주소 -> (:@127.0.0.1)localhost 로 변경해도됨
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "STUDENT", "STUDENT");
			System.out.println("conn = " + conn); //성공하면 connection 정보, 실패하면 null값		
			
			//3. 쿼리문을 실행할 statement객체 생성
			stmt = conn.createStatement();
			
			//4. 쿼리문 전송, 실행결과를 ResultSet으로 받기
			rset = stmt.executeQuery(sql);
			
			//5. 받은 결과값을 객체에 옮겨서 저장하기
			list = new ArrayList<Member>();
			while(rset.next()) {
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
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				//자원 반납의 순서는 생성의 역순
				rset.close();
				stmt.close();
				conn.close(); 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}		
		return list;
	}

	public Member selectOne(String memberId) {
		
		Member m = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM MEMBER WHERE USERID = '" +memberId+ "'";
		
		try {
			//1. JDBC driver 등록처리: 해당 database 벤더 사가 제공하는 클래스 등록
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("드라이버 등록 성공");
				
			// 2.등록된 클래스를 이용해서 db연결
			// 드라이버타입@ip주소:포트번호:db이름(SID)
			// orcl:사용자정의설치 , thin : 자동으로 설치 //ip주소 -> (:@127.0.0.1)localhost 로 변경해도됨
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "STUDENT", "STUDENT");
				System.out.println("conn = " + conn); //성공하면 connection 정보, 실패하면 null값		
				
				//3. 쿼리문을 실행할 statement객체 생성
				stmt = conn.createStatement();
				
				//4. 쿼리문 전송, 실행결과를 ResultSet으로 받기
				rset = stmt.executeQuery(sql);
				
				//5. 받은 결과값을 객체에 옮겨서 저장하기
				
				if(rset.next()) { //행이 하나니까 '행이 있으면'이라는 조건문으로 돌리기
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
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
				try {
					//자원 반납의 순서는 생성의 역순
					rset.close();
					stmt.close();
					conn.close(); 
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
			}	
		return m;
	}

	public ArrayList<Member> selectOne1(String memberName) {
		ArrayList<Member> list = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM MEMBER WHERE USERNAME = '" +memberName+ "'";
		
		try {
			//1. JDBC driver 등록처리: 해당 database 벤더 사가 제공하는 클래스 등록
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("드라이버 등록 성공");
				
			// 2.등록된 클래스를 이용해서 db연결
			// 드라이버타입@ip주소:포트번호:db이름(SID)
			// orcl:사용자정의설치 , thin : 자동으로 설치 //ip주소 -> (:@127.0.0.1)localhost 로 변경해도됨
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "STUDENT", "STUDENT");
				System.out.println("conn = " + conn); //성공하면 connection 정보, 실패하면 null값		
				
				//3. 쿼리문을 실행할 statement객체 생성
				stmt = conn.createStatement();
				
				//4. 쿼리문 전송, 실행결과를 ResultSet으로 받기
				rset = stmt.executeQuery(sql);
				
				//5. 받은 결과값을 객체에 옮겨서 저장하기
				list = new ArrayList<Member>(); //list를 새로운 객체로 생성하는 과정가지기 안 하면 null로 인식됨
				
				while(rset.next()) { //행이 하나니까 '행이 있으면'이라는 조건문으로 돌리기
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
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				
				try {
					//자원 반납의 순서는 생성의 역순
					rset.close();
					stmt.close();
					conn.close(); 
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
			}	
		return list;
	}

	public int insertMember(Member m) {
		
		int result = 0;
		Connection conn = null;
		Statement stmt = null;
		//ResultSet rset = null; 인서트는 리절트셋을 반환하지 않기 때문에 해당 객체 불필요
		
		String sql = "INSERT INTO MEMBER VALUES ("
					+"'" + m.getUserId() + "', "
					+"'" + m.getPassword() +"', "
					+"'" + m.getUserName() +"', "
					+"'" + m.getGender() +"', "
					+ m.getAge() +", "
					+"'" + m.getEmail() +"', "
					+"'" + m.getPhone() +"', "
					+"'" + m.getAddress() +"', "
					+"'" + m.getHobby() +"', "
					+ "sysdate )";
		
		System.out.println(sql);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "STUDENT", "STUDENT");
			System.out.println("conn = " + conn); //성공하면 connection 정보, 실패하면 null값		
			

			stmt = conn.createStatement();
			conn.setAutoCommit(false); //자동으로 커밋되지 않게 함
			result = stmt.executeUpdate(sql); //업뎃 후 처리한 행의 개수 리턴
			
			if(result>0) conn.commit();
			else conn.rollback();
			System.out.println(result); // 결과 값 몇 나오는지 확인
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();				
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
		
		return result;
	}

	public int updateMember(Member m) {
		
		int result = 0;
		Connection conn = null;
		Statement stmt = null;
		//ResultSet rset = null; 업데이트는 리절트셋을 반환하지 않기 때문에 해당 객체 불필요
		
		String sql = "UPDATE MEMBER SET "
				+ " PASSWORD = '" + m.getPassword() + "' , "
				+ " EMAIL = '" + m.getEmail() + "' , "
				+ " PHONE = '" + m.getPhone() + "' , "
				+ " ADDRESS = '" + m.getAddress() + "' "
				+ " WHERE USERID = '" + m.getUserId() + "'";
										
		System.out.println(sql);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "STUDENT", "STUDENT");
			System.out.println("conn = " + conn); //성공하면 connection 정보, 실패하면 null값		
			
			stmt = conn.createStatement();
			conn.setAutoCommit(false); //자동으로 커밋되지 않게 함
			result = stmt.executeUpdate(sql); //업뎃 후 처리한 행의 개수 리턴
			
			if(result>0) conn.commit();
			else conn.rollback();
			System.out.println(result); // 결과 값 몇 나오는지 확인
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();				
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
		
		return result;
	}

	public int deleteMember(String memberId) {
		
		int result = 0;
		Connection conn = null;
		Statement stmt = null;
		//ResultSet rset = null; 딜리트는 리절트셋을 반환하지 않기 때문에 해당 객체 불필요
		
		String sql = "DELETE FROM MEMBER WHERE USERID = '" + memberId +"'";
										
		System.out.println(sql);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "STUDENT", "STUDENT");
			System.out.println("conn = " + conn); //성공하면 connection 정보, 실패하면 null값		
			

			stmt = conn.createStatement();
			conn.setAutoCommit(false); //자동으로 커밋되지 않게 함
			result = stmt.executeUpdate(sql); //업뎃 후 처리한 행의 개수 리턴
			
			if(result>0) conn.commit();
			else conn.rollback();
			System.out.println(result); // 결과 값 몇 나오는지 확인
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();				
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
		
		return result;

	}

}
