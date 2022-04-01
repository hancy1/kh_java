package com.kh.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.model.exception.ProductException;
import com.kh.model.service.ProductService;
import com.kh.model.vo.Product;
import com.kh.model.vo.ProductIO;
import com.kh.view.ProductMenu;

public class ProductController {

	public void selectAll() {

		ProductMenu pm = new ProductMenu();
		ArrayList<Product> list;

		try {
			list = new ProductService().selectAll();

			if (!list.isEmpty()) {
				pm.displayProductList(list);
			} else {
				pm.displayNoData();

			}

		} catch (ProductException e) {
			pm.displayError("상품 조회 실패. 관리자에게 문의하세요");
			System.out.println(e.getMessage());
		}

	}

	public void insertProduct(Product p) {

		ProductMenu pm = new ProductMenu();
		int result;
		try {
			result = new ProductService().insertProduct(p);

			if (result > 0) {
				pm.displaySuccess("상품이 추가됐습니다.");
			}

		} catch (ProductException e) {
			pm.displayError("상품 추가를 실패했습니다.");
			System.out.println(e.getMessage());
		}

	}

	public void updateProduct(Product p) {

		ProductMenu pm = new ProductMenu();
		int result;
		try {
			result = new ProductService().updateProduct(p);

			if (result > 0) {
				pm.displaySuccess("상품이 업데이트됐습니다.");
			}

		} catch (ProductException e) {
			pm.displayError("상품 업데이트를 실패했습니다.");
			System.out.println(e.getMessage());
		}

	}

	public void deleteProduct(String pId) {

		ProductMenu pm = new ProductMenu();
		int result;
		try {
			result = new ProductService().deleteProduct(pId);

			if (result > 0) {
				pm.displaySuccess("상품을 삭제했습니다.");
			}

		} catch (ProductException e) {
			pm.displayError("상품 삭제를 실패했습니다.");
			System.out.println(e.getMessage());
		}

	}

	public void searchProduct(String pId) {

		ProductMenu pm = new ProductMenu();
		List<Product> list;

		try {
			list = new ProductService().searchProduct(pId);

			if (!list.isEmpty()) {
				pm.displayProductList(list);
			} else {
				pm.displayNoData();
			}

		} catch (ProductException e) {
			pm.displayError("상품 조회 실패. 관리자에게 문의하세요");
			System.out.println(e.getMessage());
		}
	}

	// ============입출고 리스트===============================
	public void displayPIOList() {
		ProductMenu pm = new ProductMenu();
		ArrayList<ProductIO> list;

		try {
			list = new ProductService().selectAllPIO();

			if (!list.isEmpty()) {
				pm.displayPIOList(list);
			} else {
				pm.displayNoData();
			}

		} catch (ProductException e) {
			System.out.println("입출고 내역 조회를 실패했습니다.");
			System.out.println(e.getMessage());
		}
	}

	public void PIOList(String status) {
		ProductMenu pm = new ProductMenu();
		ArrayList<ProductIO> list;

		try {
			list = new ProductService().PIOList(status);

			if (!list.isEmpty()) {
				pm.displayPIOList(list);
			} else {
				pm.displayNoData();
			}

		} catch (ProductException e) {
			System.out.println(status + " 내역 조회 실패. 관리자에게 문의하세요.");
			System.out.println(e.getMessage());
		}

	}

	public void updateProduct(ProductIO p) {

		ProductMenu pm = new ProductMenu();
		int result;
		try {
			result = new ProductService().updateProduct(p);

			if (result > 0) {
				pm.displaySuccess("상품이 " + p.getStatus() + "됐습니다.");
			} 

		} catch (ProductException e) {
			
			if(p.getStatus().equals("입고")) {
				pm.displayError("상품 " + p.getStatus() + " 실패");
			} else {
				System.out.println("서비스 요청 실패: 출고하고자하는 제품의 재고수량이 부족합니다.");
			}
		}

	}

	public void exitProgram() {

		new ProductService().exitProgram();

	}

}
