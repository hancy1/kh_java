package com.kh.commmon;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {

	private static Connection conn = null;

	public static Connection getConnection() {

		if (conn == null) {
			
			try {
				//외부에서 정보를 읽어와 저장할 Properties 객체 선언 및 생성
				Properties prop = new Properties();
				
				//driver.properties 파일 읽어오기
				prop.load(new FileReader("resources/driver.properties"));	
				
				Class.forName(prop.getProperty("driver"));
				conn = DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user"),prop.getProperty("password"));
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
