package com.uni.first; //패키지명은 항상 소문자로 시작

public class A_MethodPrinter { // 클래스명은 항상 대문자로 시작

	public void methodA() {// 메소드명은 항상 소문자로 시작
		System.out.println("mehthodA 출력문");
		methodB();
	}

	public void methodB() {
		System.out.println("mehthodB 출력문");
		int a = methodC(1000);
		System.out.println(a);
	}

	public int methodC(int intValue) {
		System.out.println("mehthodC 출력문" + intValue);
		return intValue + 100;
	}

}
