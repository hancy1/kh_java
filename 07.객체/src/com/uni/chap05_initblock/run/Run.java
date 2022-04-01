package com.uni.chap05_initblock.run;

import com.uni.chap05_initblock.model.vo.Product;

public class Run {

	public static void main(String[] args) {

		Product p = new Product();
		System.out.println(p.toString()); //toString으로 받으면 객체만 적어도 표현 가능
		//System.out.println(p);
		
		Product p2 = new Product();
		System.out.println(p2.toString()); 
		
		Product p3 = new Product();
		System.out.println(p3.toString()); 
		
		// 순서
		// 1. JVM이 정한 기본값으로 객체 생성됨 
		// 2. 명시적 초기화 ex) String name = "홍길동";
		// 3. 클래스 초기화 블럭
		// 4. 인스턴스 초기화 블럭
		
		// 클래스 변수의 초기화 순서
		// JVM이 정한 기본값 -> 명시적 초기값 -> 초기화 블록
		
		// 인스턴스 변수의 초기화 순서
		// JVM이 정한 기본값 -> 명시적 초기값 -> 초기화 블록 -> 매개변수가 있는 생성자

		
				
	}

}
