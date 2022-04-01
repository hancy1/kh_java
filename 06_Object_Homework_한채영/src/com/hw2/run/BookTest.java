package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {

		Book a = new Book();

		a.setTitle(null);
		a.setPrice(0);
		a.setDiscountRate(0);
		a.setAuthor(null);

		System.out.println(a.information());

		Book b = new Book("자바의정석", 20000, 0.2, "윤상섭");

		System.out.println(b.information());

		System.out.println("===========================");
		Book c = new Book();

		c.setTitle("C언어");
		c.setPrice(30000);
		c.setDiscountRate(0.1);
		c.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(c.information());
	
		System.out.println("===========================");
		
		System.out.println("도서명 = " + c.getTitle() + "\n할인된 가격 = " + c.dcprice() + "원");
		System.out.println("도서명 = " + b.getTitle() + "\n할인된 가격 = " + b.dcprice() + "원");
		
	}

}
