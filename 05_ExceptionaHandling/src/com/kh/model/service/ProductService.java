package com.kh.model.service;

import static com.kh.commmon.JDBCTemplate.*;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.kh.model.dao.ProductDao;
import com.kh.model.vo.Product;
import com.kh.model.vo.ProductIO;


public class ProductService {

	public ArrayList<Product> selectAll() {
		
		Connection conn = getConnection();
		ArrayList<Product> list = new ProductDao().selectAll(conn);
		
		return list;
	}

	public int insertProduct(Product p) {
		Connection conn = getConnection();
		int result = new ProductDao().insertProduct(conn, p); 
		
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		
		return result;
	}

	public void exitProgram() {
		
		commit(getConnection());
		
	}

	public int updateProduct(Product p) {

		Connection conn = getConnection();
		int result = new ProductDao().updateProduct(conn, p); 
		
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		
		return result;
	}

	public int deleteProduct(String pId) {
		Connection conn = getConnection();
		int result = new ProductDao().deleteProduct(conn, pId); 
		
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		
		return result;
	}

	public List<Product> searchProduct(String pId) {
		Connection conn = getConnection();
		ArrayList<Product> list = new ProductDao().searchProduct(conn, pId);
		
		return list;
	}

	public ArrayList<ProductIO> selectAllPIO() {
		
		Connection conn = getConnection();
		ArrayList<ProductIO> list = new ProductDao().selectAllPIO(conn);
		
		return list;
	}

	public ArrayList<ProductIO> PIOList(String status) {
		Connection conn = getConnection();
		ArrayList<ProductIO> list = new ProductDao().PIOList(conn, status);
		
		return list;
	}

	public int updateProduct(ProductIO p) {
		
		Connection conn = getConnection();
		int result = new ProductDao().updateProduct(conn, p); 
		
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		
		return result;
	}

}
