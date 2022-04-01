package com.hw1.model.vo;

public class Product {

	private String productId;	//상품 아이디
	private String productName;	//상품명
	private String productArea;	//생산지
	private int price;			//가격
	private double tax;			//부가세비율
	
	public Product(){
		
	}
	
	public Product(int price, double tax) {
		this.price = price;
		this.tax = tax;
	}


	//set
	public void setProductId(String productId){
		this.productId = productId;		
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	//get
	public String getProductId() {
		return this.productId;
	}
	public String getProductName() {
		return this.productName;
	}
	public String getProductArea() {
		return this.productArea;
	}
	public int getPrice() {
		return this.price;
	}
	public double getTax() {
		return this.tax;
	}
	
	public String information() {
		
		String info = "productId: " + productId + " productName: " + productName + " productArea: " + productArea + " price: " + price + " tax: " + tax;
		return info;
	}
	
	public int pricetax() {
		
		int pt = (int) (this.price + this.price*this.tax);
		return pt;
	}
}
