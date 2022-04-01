package com.kh.view;

import java.util.List;
import java.util.Scanner;

import com.kh.controller.ProductController;
import com.kh.model.vo.Product;
import com.kh.model.vo.ProductIO;

public class ProductMenu {

	private Scanner sc = new Scanner(System.in);
	ProductController pc = new ProductController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("=====상품 관리 프로그램=====");
			System.out.println("1. 전체조회");
			System.out.println("2. 상품 추가");
			System.out.println("3. 상품 수정");
			System.out.println("4. 상품 삭제");
			System.out.println("5. 상품 검색");
			System.out.println("6. 상품 입출고 메뉴");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 선택: ");
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1: 
				pc.selectAll();
				break;
			case 2:
				pc.insertProduct(inputProduct());
				break;
			case 3:
				pc.updateProduct(updateProduct());
				break;
			case 4:
				pc.deleteProduct(inputProductId()); //진행이 안 됨 
				break;
			case 5: 
				pc.searchProduct(inputProductId());
				break;
			case 6:
				productIOMenu();
				break;
			case 9:
				System.out.println("정말로 끝내시겠습니까?(y/n)");
				if('y' == sc.next().toLowerCase().charAt(0)) {
					pc.exitProgram();
					return;
				}
				break;
			}
					
			
		}
		
		
	}

	private void productIOMenu() {
		
		while(true)
		{
			System.out.println("========입출고 메뉴========");
			System.out.println("1. 전체 입출고 내역 조회");
			System.out.println("2. 입고 내역 조회");
			System.out.println("3. 출고 내역 조회");
			System.out.println("4. 상품 입고");
			System.out.println("5. 상품 출고");
			System.out.println("9. 메인메뉴로 돌아가기");
			System.out.println("메뉴 선택: ");
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1: 
				pc.displayPIOList();
				break;
			case 2:
				pc.PIOList("입고");
				break;
			case 3:
				pc.PIOList("출고");
				break;
			case 4:
				//상품 입고
				pc.updateProduct(inputPro()); 
				break;
			case 5:
				//상품 출고
				pc.updateProduct(outputPro());
				break;
			
			}
			
		}
		
		
		
		
	}

	private ProductIO outputPro() {
		
		ProductIO p = new ProductIO();
		
		sc.nextLine();
		System.out.println("상품ID: ");
		p.setProductId(sc.nextLine());
		System.out.println("출고 수량: ");
		p.setAmount(sc.nextInt());
		p.setStatus("출고");
		
		return p;
	}

	private ProductIO inputPro() {
		
		//System.out.println("\n입출고번호\t상품ID\t상품명\t입출고일\t입출고수량\t입출고상태");
		ProductIO p = new ProductIO();
		
		sc.nextLine();
		System.out.println("상품ID: ");
		p.setProductId(sc.nextLine());
		System.out.println("입고 수량: ");
		p.setAmount(sc.nextInt());
		p.setStatus("입고");
		
		return p;
	}

	private String inputProductId() {
		
		sc.nextLine();
		System.out.println("상품 아이디: ");
		String pid = sc.nextLine();
		
		return pid;
	}
	
	private Product updateProduct() {
		
		Product p = new Product();
		
		p.setProductId(inputProductId());
		
		System.out.println("상품명: ");
		p.setProductName(sc.nextLine());
		System.out.println("가격: ");
		p.setPrice(sc.nextInt());
		System.out.println("부가설명: ");
		sc.nextLine();
		p.setComment(sc.nextLine());
		System.out.println("재고: ");
		p.setStock(sc.nextInt());
			
		return p;
	}

	private Product inputProduct() {
		
		Product p = new Product();
		sc.nextLine();
		System.out.println("상품ID: ");
		p.setProductId(sc.nextLine());
		System.out.println("상품명: ");
		p.setProductName(sc.nextLine());
		System.out.println("가격: ");
		p.setPrice(sc.nextInt());
		System.out.println("부가설명: ");
		sc.nextLine();
		p.setComment(sc.nextLine());
		System.out.println("재고: ");
		p.setStock(sc.nextInt());
			
		return p;
	}

	public void displayProductList(List<Product> list) {
		System.out.println("==============상품 리스트==============");
		System.out.println("\n상품ID\t상품명\t가격\t부가설명\t재고수량");
		System.out.println("----------------------------------------------------------");

		for(Product p : list) {
			System.out.println(p);
		}		
	}
	
	public void displayPIOList(List<ProductIO> list) {
		System.out.println("==============입출고 리스트==============");
		System.out.println("\n입출고번호\t상품ID\t상품명\t입출고일\t입출고수량\t입출고상태");
		System.out.println("----------------------------------------------------------");

		for(ProductIO p : list) {
			System.out.println(p);
		}		
	}

	public void displaySuccess(String message) {

		System.out.println("서비스 요청 결과: " + message);
		
	}

	public void displayError(String message) {
		System.out.println("서비스 요청 결과: " + message);
		
	}
}
