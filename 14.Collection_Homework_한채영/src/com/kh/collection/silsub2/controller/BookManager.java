package com.kh.collection.silsub2.controller;

import java.util.HashMap;
import java.util.Scanner;

import com.kh.collection.silsub2.model.dao.BookDao;
import com.kh.collection.silsub2.model.vo.Book;

public class BookManager {

	private Scanner sc = new Scanner(System.in);
	private BookDao bd = new BookDao();
	
	public BookManager() {
		// TODO Auto-generated constructor stub
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
		return null;
		
	}
	
	public Book[] sortedBookList() {
		return null;
		
	}
	
	public void printBook(Book[] br) {
		
	}
}
