package com.kh.model.vo;

public class Product {

	private String productId;
	private String productName;
	private int price;
	private String comment;
	private int stock;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productId, String productName, int price, String comment, int stock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.comment = comment;
		this.stock = stock;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String toString() {
		
		return productId +", "+ productName+", "+price+", "+comment+", "+stock;
		
	}
}
