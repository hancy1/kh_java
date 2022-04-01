package com.kh.model.dao;

import static com.kh.commmon.JDBCTemplate.*;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.model.exception.ProductException;
import com.kh.model.vo.Product;
import com.kh.model.vo.ProductIO;

public class ProductDao {

	// 기본 생성자 작성 전에 sql 구문을 읽어 올 properties참조 변수를 선언
	private Properties prop = null;

	public ProductDao() {

		try {
			prop = new Properties();
			prop.load(new FileReader("resources/pro_query.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Product> selectAll(Connection conn) throws ProductException {

		ArrayList<Product> list = null;
		Statement stmt = null;
		ResultSet rset = null;

		String sql = prop.getProperty("selectAll");

		try {
			stmt = conn.createStatement();

			rset = stmt.executeQuery(sql);

			list = new ArrayList<Product>();
			while (rset.next()) {

				Product p = new Product();

				p.setProductId(rset.getString("PRODUCT_ID"));
				p.setProductName(rset.getString("P_NAME"));
				p.setPrice(rset.getInt("PRICE"));
				p.setComment(rset.getString("DESCRIPTION"));
				p.setStock(rset.getInt("STOCK"));

				list.add(p);
			}
		} catch (Exception e) {
			throw new ProductException("selectAll 에러 : " + e.getMessage());
		} finally {

			close(rset);
			close(stmt);

		}
		return list;

	}

	public int insertProduct(Connection conn, Product p) throws ProductException {

		int result = 0;
		PreparedStatement pstmt = null;

		String sql = prop.getProperty("insertProduct");

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, p.getProductId());
			pstmt.setString(2, p.getProductName());
			pstmt.setInt(3, p.getPrice());
			pstmt.setString(4, p.getComment());
			pstmt.setInt(5, p.getStock());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			throw new ProductException("insertProduct 에러 : " + e.getMessage());
		} finally {

			close(pstmt);

		}

		return result;
	}

	public int updateProduct(Connection conn, Product p) throws ProductException {

		int result = 0;
		PreparedStatement pstmt = null;

		String sql = prop.getProperty("updateProduct");

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, p.getProductName());
			pstmt.setInt(2, p.getPrice());
			pstmt.setString(3, p.getComment());
			pstmt.setInt(4, p.getStock());
			pstmt.setString(5, p.getProductId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			throw new ProductException("updateProduct 에러 : " + e.getMessage());
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int deleteProduct(Connection conn, String pId) throws ProductException {

		int result = 0;
		PreparedStatement pstmt = null;

		String sql = prop.getProperty("deleteProduct");
		//deleteProduct=DELETE FROM PRODUCT_STOCK WHERE PRODUCT_ID = ?

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pId);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			throw new ProductException("deleteProduct 에러 : " + e.getMessage());
		} finally {
			close(pstmt);
		}

		return result;
	}

	public ArrayList<Product> searchProduct(Connection conn, String pId) throws ProductException {

		ArrayList<Product> list = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String sql = prop.getProperty("searchProduct");

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pId);
			rset = pstmt.executeQuery();

			list = new ArrayList<Product>();

			while (rset.next()) {
				Product p = new Product();

				p.setProductId(rset.getString("PRODUCT_ID"));
				p.setProductName(rset.getString("P_NAME"));
				p.setPrice(rset.getInt("PRICE"));
				p.setComment(rset.getString("DESCRIPTION"));
				p.setStock(rset.getInt("STOCK"));

				list.add(p);
			}

		} catch (Exception e) {
			throw new ProductException("searchProduct 에러 : " + e.getMessage());
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	public ArrayList<ProductIO> selectAllPIO(Connection conn) throws ProductException {

		ArrayList<ProductIO> list = null;
		Statement stmt = null;
		ResultSet rset = null;

		String sql = prop.getProperty("PIOselectAll");

		try {
			stmt = conn.createStatement();

			rset = stmt.executeQuery(sql);

			list = new ArrayList<ProductIO>();
			while (rset.next()) {

				ProductIO p = new ProductIO();

				p.setAmount(rset.getInt("AMOUNT"));
				p.setIdDate(rset.getDate("IO_DATE"));
				p.setIoNum(rset.getInt("IO_NUM"));
				p.setpName(rset.getString("P_NAME"));
				p.setProductId(rset.getString("PRODUCT_ID"));
				p.setStatus(rset.getString("STATUS"));

				list.add(p);
			}
		} catch (Exception e) {
			throw new ProductException("selectAllPIO 에러 : " + e.getMessage());
		} finally {

			close(rset);
			close(stmt);

		}
		return list;

	}

	public ArrayList<ProductIO> PIOList(Connection conn, String status) throws ProductException {
		ArrayList<ProductIO> list = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String sql = prop.getProperty("displayPIList");

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, status);
			rset = pstmt.executeQuery();

			list = new ArrayList<ProductIO>();
			while (rset.next()) {

				ProductIO p = new ProductIO();

				p.setAmount(rset.getInt("AMOUNT"));
				p.setIdDate(rset.getDate("IO_DATE"));
				p.setIoNum(rset.getInt("IO_NUM"));
				p.setpName(rset.getString("P_NAME"));
				p.setProductId(rset.getString("PRODUCT_ID"));
				p.setStatus(rset.getString("STATUS"));

				list.add(p);
			}
		} catch (Exception e) {
			throw new ProductException("PIOList 에러 : " + e.getMessage());
		} finally {

			close(rset);
			close(pstmt);

		}
		return list;

	}

	public int updateProduct(Connection conn, ProductIO p) throws ProductException {
		
		int result = 0;
		PreparedStatement pstmt = null;

		String sql = prop.getProperty("IOProduct");

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, p.getProductId());
			pstmt.setInt(2, p.getAmount());
			pstmt.setString(3, p.getStatus());
			
			
				
				
			
			
			result = pstmt.executeUpdate();

		} catch (Exception e) {		
			throw new ProductException("updateProduct 에러 : " + e.getMessage());
		} finally {
			close(pstmt);
		}

		return result;
	}

}
