package com.kh.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.model.service.ProductService;
import com.kh.model.vo.Product;
import com.kh.model.vo.ProductIO;
import com.kh.view.ProductMenu;

public class ProductController {

	public void selectAll() {
		
		ProductMenu pm = new ProductMenu();
		ArrayList<Product> list;
		
		list = new ProductService().selectAll();
		
		if(!list.isEmpty()) {
			pm.displayProductList(list);
		} else {
			System.out.println("데이터가 없습니다.");
		}
		
	}

	public void insertProduct(Product p) {
		
		ProductMenu pm = new ProductMenu();
		int result;
		result = new ProductService().insertProduct(p);
		
		if(result > 0) {
			pm.displaySuccess("상품이 추가됐습니다.");
		} else {
			pm.displayError("상품 추가를 실패했습니다.");
		}
		
	}

	public void exitProgram() {
	
		new ProductService().exitProgram();
		
	}

	public void updateProduct(Product p) {
		
		ProductMenu pm = new ProductMenu();
		int result;
		result = new ProductService().updateProduct(p);
		
		if(result > 0) {
			pm.displaySuccess("상품이 업데이트됐습니다.");
		} else {
			pm.displayError("상품 업데이트를 실패했습니다.");
		}
		
	}

	public void deleteProduct(String pId) {
		
		ProductMenu pm = new ProductMenu();
		int result;
		result = new ProductService().deleteProduct(pId);
		
		if(result > 0) {
			pm.displaySuccess("상품을 삭제했습니다.");
		} else {
			pm.displayError("상품 삭제를 실패했습니다.");
		}
	
	}

	public void searchProduct(String pId) {
		
		ProductMenu pm = new ProductMenu();
		List<Product> list;
		
		list = new ProductService().searchProduct(pId);
		
		if(!list.isEmpty()) {
			pm.displayProductList(list);
		} else {
			System.out.println("데이터가 없습니다.");
		}
		
		
	}

	//============입출고 리스트===============================
	public void displayPIOList() {
		ProductMenu pm = new ProductMenu();
		ArrayList<ProductIO> list;
		
		list = new ProductService().selectAllPIO();
		
		if(!list.isEmpty()) {
			pm.displayPIOList(list);
		} else {
			System.out.println("데이터가 없습니다.");
		}
		
	}

	public void PIOList(String status) {
		ProductMenu pm = new ProductMenu();
		ArrayList<ProductIO> list;
		
		list = new ProductService().PIOList(status);
		
		if(!list.isEmpty()) {
			pm.displayPIOList(list);
		} else {
			System.out.println("데이터가 없습니다.");
		}
		
	}

	public void updateProduct(ProductIO p) {
		
		ProductMenu pm = new ProductMenu();
		int result;
		result = new ProductService().updateProduct(p);
		
		if(result > 0) {
			pm.displaySuccess("상품이 입고됐습니다.");
		} else {
			pm.displayError("상품 입고 실패");
		}
		
	}

}
