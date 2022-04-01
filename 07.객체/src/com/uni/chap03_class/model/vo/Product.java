package com.uni.chap03_class.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;
	
//	public Product(){ 컨트롤+스페이스 
//		
//	}
	
	public Product() {
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
		
		return pName + " " + price + " " + brand;
//		String info;
//		return info = pName + " " + price + " " + brand;
	}
	
	DftProduct d = new DftProduct(); // 같은패키지라 디폴트가 가능
}

class DftProduct{ //디폴트 클래스
	
	private String dName;

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}
	
	
}
