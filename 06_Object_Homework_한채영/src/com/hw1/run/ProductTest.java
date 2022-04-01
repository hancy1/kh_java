package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {

		Product a = new Product();

		a.setProductId("ssgnote9");
		a.setProductName("갤럭시노트9");
		a.setProductArea("경기도 수원");
		a.setPrice(960000);
		a.setTax(10.0);

		Product b = new Product();

		b.setProductId("lgxnote5");
		b.setProductName("LG스마트폰5");
		b.setProductArea("경기도 평택");
		b.setPrice(780000);
		b.setTax(0.7);

		Product c = new Product();

		c.setProductId("ktsnote3");
		c.setProductName("KT스마트폰3");
		c.setProductArea("서울시 강남");
		c.setPrice(250000);
		c.setTax(0.3);
		
		Product d = new Product(1200000, 0.05);
		
		d.setProductId("ssgnote9");
		d.setProductName("갤럭시노트9");
		d.setProductArea("경기도 수원");
		
		Product e = new Product(1200000, 0.05);

		e.setProductId("lgxnote5");
		e.setProductName("LG스마트폰5");
		e.setProductArea("경기도 평택");
		
		Product f = new Product(1200000, 0.05);

		f.setProductId("ktsnote3");
		f.setProductName("KT스마트폰3");
		f.setProductArea("서울시 강남");		
			
		
		System.out.println(a.information());
		System.out.println(b.information());
		System.out.println(c.information());
		System.out.println("================================");
		System.out.println(d.information());
		System.out.println(e.information());
		System.out.println(f.information());
		System.out.println("================================");
		System.out.println("상품명 = " + d.getProductName() + "\n부가세 포함 가격 = " + d.pricetax() + "원");
		System.out.println("상품명 = " + e.getProductName() + "\n부가세 포함 가격 = " + e.pricetax() + "원");
		System.out.println("상품명 = " + f.getProductName() + "\n부가세 포함 가격 = " + f.pricetax() + "원");
		
	}

}
