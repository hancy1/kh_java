package com.uni.chap07_method.part01_methodTest.controller;

import com.uni.chap06_constructor.model.vo.User;

public class NonStaticMethod {

	// 메소드
	/*
	 * [접근제한자] [예약어] 반환할 값의 자료형 메소드명([자료형 매개변수명, 자료형 매개변수명, ...]) { 수행내용; [return
	 * 반환값;] //있을 수도 있고 없을 수도 있고 }
	 */
	// 매개변수의 유무와 반환값 유무에 따른 구분

	// 1.매개변수없고 반환값도 없는 메소드 - 아무 값도 반환하지 않고 메소드 내용만 수행후 메소드 종료

	public void method1() {
		System.out.println("매개변수와 반환값 둘 다 없는 메소드입니다.");
		//return; 사실상 모든 메소드에 return이 있다. 다만 반환값이 없을 때는 JVM이 자동으로 생성한다.
	}	
		//2. 매개변수가 없고 반환값은 있는 메소드 - 반환되는 값을 기록하기 위한 변수든 출력문이든 작성해서 받아주기
	public String method2() {
		return "매개변수가 없고 반환값은 있는 메소드입니다.";
	}	
		
	//3. 매개변수가 있고 반환값이 없는 메소드
	public void method3(int num1, int num2) { //이 메소드를 호출하는 곳에서 전달되는 값을 받기위해 선언하는 것이 매개변수
		System.out.println(num1-num2);
	}

	//4. 매개변수 있고 반환값도 있는 메소드
	public int method4(int num1, int num2) {
		return num1 + num2;
	}
	
	// ===========추가 ( 매개변수로 객체를 전달받음)
	
	public void method(User u) {
		u.setAge(20);
	}
}
