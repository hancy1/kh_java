package com.uni.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTemplate {

	/*
	 * SingleTon Pattern: 클래스에 대한 객체가 프로그램 구동내내 한개만 작성되어 사용 하게 함. static 으로 작성
	 */

	// 기존 DB 처리 작업(select, insert, update, delete 등) 시 마다
	// 새로운 Connection 객체를 생성하여 DB와 연결하여 진행함
	// 이렇게 되면 한 사용자가 여러 개의 커넥션 객체를 만들어 DB와 접속을 하게 됨.
	// -> 여러 객체 생성으로 인한 메모리 낭비 + DB에는 접속 가능한 커넥션 객체 수 가 제한되어 있음.

	// 이를 해결하기 위하여 사용자당 커넥션 객체를 하나만 만들 수 있게 하여
	// 메모리 낭비 및 DB 연결 객체수 오버를 방지하게하는 싱글톤 패턴을 적용!

	// * 싱글톤(Single Tone) 패턴
	// 프로그램 구동 시 메모리에 객체를 딱 한개만 기록되게 하는 디자인 패턴
	// 모든 필드와 메소드를 static으로 선언하여
	// static 영역에 공용으로 사용할 수 있는 단 하나의 객체를 만듦.

	// 한 개의 공용 커넥션 객체를 저정할 참조변수 선언.
	// 외부에서 직접 접근을 할 수 없게 private 선언

	private static Connection conn = null;

	// DB연결을 위해 공융 커넥션 객체를 반환해주는 메소드
	public static Connection getConnection() {

		if (conn == null) {

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "STUDENT", "STUDENT");
				conn.setAutoCommit(false); // 자동으로 커밋되지 않게 함

			} catch (Exception e) {// 최상위 익셉션으로 잡아 한 번에 처리되게끔

				e.printStackTrace();
			}

		}

		return conn;
	}

	public static void close(Connection conn) {

		try {
			if (conn != null && !conn.isClosed()) {

				conn.close();

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void close(Statement stmt) {

		try {
			if (stmt != null && !stmt.isClosed()) {

				stmt.close();

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void close(ResultSet rset) {

		try {
			if (rset != null && !rset.isClosed()) {

				rset.close();

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void commit(Connection conn) {

		try {
			if (conn != null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void rollback(Connection conn) {

		try {
			if (conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
