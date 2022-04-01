package com.uni.chap07_method.part02_overloading;

public class OverloadingTest {

	// 오버로딩: 한 클래스 내에서 같은 메소드명으로 정의할 수 있는 방법

	public void test() {}

	// public void test() {}

	public void test(int a) {}

	public void test(int a, String s) {}

	public void test(String a, int s) {} // 순서달라도 가능

	public void test(int a, int b) {}

	// public void test(int c, int d) { } // 매개변수명은 상관없이 자료형의 개수, 타입이 달라야 함
	// 해당 메소드는 같은 타입에 같은 개수여서 오버로딩 불가

	public void test(int a, int b, String str) {}
	
	//public int test(int a, int b, String str) {} //오버로딩에 반환형이 상관이 없음. 매개변수 개수가 동일해서 에러
	
	//private void test(int a, int b, String str) {} //오버로딩에 접근제한자 상관없음. 매개변수 개수가 동일해서 에러

	//결론: 오버로딩은 동일한 메소드명을 사용하고 매개변수의 자료형과 개수, 순서가 다르게 작성되어야 함. 접근제한자와 반환형은 상관없음!
	
}
