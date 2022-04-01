package com.hw2.model.vo;

public class Book {

	private String title;		//도서명
	private int price;			//가격
	private double discountRate;//할인율
	private String author;		//저자명
	
	public Book(){
		
	}
	
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	//set
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//get
	public String getTitle() {
		return this.title;
	}
	public int getPrice() {
		return this.price;
	}
	public double getDiscountRate() {
		return this.discountRate;
	}
	public String getAuthor() {
		return this.author;
	}
	
	public String information() {
		String info = title + "  " + price + "  " + discountRate + "  " + author;
		return info;
	}
	
	public int dcprice() {
		return (int) (price-(price*discountRate));
	}
	
}
