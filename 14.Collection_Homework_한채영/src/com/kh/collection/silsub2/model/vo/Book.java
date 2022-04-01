package com.kh.collection.silsub2.model.vo;

public class Book implements Comparable{

	private String boardNo; // 도서 번호
private int category;
private String title;
private String author;

public Book() {
}

public Book(int category, String title, String author) {
	super();
	this.category = category;
	this.title = title;
	this.author = author;
}

public String getBoardNo() {
	return boardNo;
}

public void setBoardNo(String boardNo) {
	this.boardNo = boardNo;
}

public int getCategory() {
	return category;
}

public void setCategory(int category) {
	this.category = category;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

@Override
public String toString() {
	return "Book [boardNo=" + boardNo + ", category=" + category + ", title=" + title + ", author=" + author + "]";
}

public int compareTo(Object arg0) {
	return category;
	
}
	
}