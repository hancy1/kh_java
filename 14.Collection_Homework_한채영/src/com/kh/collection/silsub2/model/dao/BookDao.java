package com.kh.collection.silsub2.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.collection.silsub2.model.vo.Book;

public class BookDao {

	private HashMap<String, Book> bookMap;
	
	public BookDao() {
		// TODO Auto-generated constructor stub
	}
	
	public BookDao(HashMap<String, Book> map) {
		
	}
	
	public int getLastBookNo() {
		return 0;
		
	}
	
	public void addBook(Book book) {
		
	}
	
	public Book deleteBook(String key) {
		return null;
		
	}
	
	public String searchBook(String title) {
		return title;
		
		
	}
	
	public Book selectBook(String key) {
		return null;
		
	}
	
	public HashMap<String, Book> selectAll(){
		return bookMap;
		
	}
	
	public ArrayList<Book> sortedBookList(){
		return null;}
	
	
	
}
