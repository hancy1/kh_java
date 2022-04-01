package com.uni.part01.object_vs_objectArray.run;

import com.uni.part01.object_vs_objectArray.model.vo.Product;

public class ObjectArrayTest {

	public static void main(String[] args) {

		// 제품을 할당받을 Product 객체 배열 크기 : 3

		Product[] pro = new Product[3];
		
		//각 인덱스 별로 객체 생성
		pro[0] = new Product("no5", 1000, "샤넬");
		pro[1] = new Product("no5", 1000, "샤넬");
		pro[2] = new Product("no5", 1000, "샤넬");

		//for문으로 정보출력 pro의 값을 변수 p에 담아 pro의 수만큼 출력
		for(Product p : pro) {
			System.out.println(p.information());
		}
		
	}
}

