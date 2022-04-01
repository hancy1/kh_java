package com.uni.chap08_mvc.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;

	public Product() {

	}

	// alt shift s 눌러서 using field로 생성 가능
	public Product(String pName, int price, String brand) {
		super();
		this.pName = pName;
		this.price = price;
		this.brand = brand;

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String information() {
		return "name=" + pName + ", brand=" + brand + ", price=" + price;

	}

}
