package com.kh.model.service;

import static com.kh.commmon.JDBCTemplate.*;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.kh.model.dao.ProductDao;
import com.kh.model.exception.ProductException;
import com.kh.model.vo.Product;
import com.kh.model.vo.ProductIO;


public class ProductService {

	public ArrayList<Product> selectAll() throws ProductException {
		
		Connection conn = getConnection();
		ArrayList<Product> list = new ProductDao().selectAll(conn);
		
		return list;
	}

	public int insertProduct(Product p) throws ProductException {
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

	public int updateProduct(Product p) throws ProductException {

		Connection conn = getConnection();
		int result = new ProductDao().updateProduct(conn, p); 
		
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		
		return result;
	}

	public int deleteProduct(String pId) throws ProductException {
		Connection conn = getConnection();
		int result = new ProductDao().deleteProduct(conn, pId); 
		
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		
		return result;
	}

	public List<Product> searchProduct(String pId) throws ProductException {
		Connection conn = getConnection();
		ArrayList<Product> list = new ProductDao().searchProduct(conn, pId);
		
		return list;
	}

	public ArrayList<ProductIO> selectAllPIO() throws ProductException {
		
		Connection conn = getConnection();
		ArrayList<ProductIO> list = new ProductDao().selectAllPIO(conn);
		
		return list;
	}

	public ArrayList<ProductIO> PIOList(String status) throws ProductException {
		Connection conn = getConnection();
		ArrayList<ProductIO> list = new ProductDao().PIOList(conn, status);
		
		return list;
	}

	public int updateProduct(ProductIO p) throws ProductException {
		
		Connection conn = getConnection();
		int result = new ProductDao().updateProduct(conn, p); 
		
		if (result > 0)
			commit(conn);
		else
			rollback(conn);
		
		return result;
	}

}
