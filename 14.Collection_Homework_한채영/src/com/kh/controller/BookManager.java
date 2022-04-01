package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Book;

public class BookManager {
	
	private ArrayList<Book> bookList = new ArrayList<>(); 
	
	public BookManager() {

	}
	
	public void insertBook(Book book) {

		int lastNo = 0;

		try {
			lastNo = bookList.get(bookList.size() - 1).getbNo() + 1;
		} catch (IndexOutOfBoundsException e) { 
			lastNo = 1;
		} finally {
			book.setbNo(lastNo);
			bookList.add(book);
		}

	}

	public int deleteBook(int bNo) {

		for (int i = 0; i < bookList.size(); i++) {
			if (bNo == i) {
				bookList.remove(i);
				return 1;
			}
		}
		return 0;

	}

	public ArrayList<Book> searchBook(String title) {

		ArrayList<Book> searchList = new ArrayList<Book>();

		for (Book b : bookList) {

			if (b.getTitle().equals(title)) {
				searchList.add(b); // 서치리스트에 추가
			}
		}

		return searchList;
	}

	public ArrayList<Book> selectList() {
		return bookList;
	}

}
