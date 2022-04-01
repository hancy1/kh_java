package com.uni.chap03_class.run;

import java.util.Scanner;
import com.uni.chap03_class.model.vo.Person;
import com.uni.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {

		Person p = new Person();

		p.setId("user01");
		p.setPwd("pass01");
		p.setName("이효리");
		p.setAge(29);
		p.setGender('F');
		p.setPhone("010-1111-2222");
		p.setEmail("lee@iei.or.kr");

		System.out.println(p.information());

		Scanner sc = new Scanner(System.in);

		System.out.println("변경할 이름: ");

		String name = sc.nextLine();

		// 이름변경
		p.setName(name);

		System.out.println(p.information());

		Product p1 = new Product();

		p1.setpName("삼성");
		p1.setPrice(1000000);
		p1.setBrand("갤럭시");

		Product p2 = new Product();

		p2.setpName("아이폰");
		p2.setPrice(1000000);
		p2.setBrand("애플");
		
		
		System.out.println(p1.information());
		System.out.println(p2.information());

		//DftProduct d = new DftProduct(); -> 다른 패키지라 불가능
		//디폴트 클래스는 패키지 외부에서 접근이 불가능(생성 자체가 불가) <-> public 클래스
	}

}
