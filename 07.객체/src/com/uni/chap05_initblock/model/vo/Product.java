package com.uni.chap05_initblock.model.vo;

public class Product {

	// 1. 아무 초기화없이 Product 객체 생성해서 출력시 JVM이 정한 기본 값으로 객체생성되어있음

	// 인스턴스변수(= 멤버변수)
	/*
	 * private String pName; private int price; // 클래스변수(= static) private static
	 * String brand;
	 */

	// 2. 필드에 명시적 초기화를 한 후 객체 생성해서 출력
	private String pName = "갤럭시";
	private int price = 1000000;
	private static String brand = "삼성";
	private static int pNo = 0;

	// 3. static 블록: 클래스 변수를 초기화시키는 블럭으로 프로그램 시작시 딱 한 번만 초기화. 클래스 초기화
	static {

		// pName = "G"; -> static블록에서는 인스턴스 변수를 초기화 못 함
		// price = 1000;
		brand = "엘지";

	}

	// 4. 인스턴스 블록: 인스턴스 변수를 초기화시키는 블럭으로 인스턴스(객체)생성 시마다 초기화됨.
	{
		pName = "G3";
		price = 1000;
		brand = "애플"; // --> 객체 생성 이후에 값을 초기화하는 인스턴스블럭의 초기화값으로 덮어쓰게됨
		pNo++;
	
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Product.brand = brand; // static이기 때문에 클래스명.변수명으로 표시
	}

	@Override // toString으로 받으면 객체만 적어도 표현 가능
	public String toString() {
		return "Product [pNo = " + pNo + ", pName=" + pName + ", price=" + price + ", brand=" + brand + "]";
	}

}
