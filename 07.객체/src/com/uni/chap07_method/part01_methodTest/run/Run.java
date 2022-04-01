package com.uni.chap07_method.part01_methodTest.run;

import com.uni.chap06_constructor.model.vo.User;
import com.uni.chap07_method.part01_methodTest.controller.NonStaticMethod;
import com.uni.chap07_method.part01_methodTest.controller.StaticMethod;

public class Run {

	public static void main(String[] args) {

		// ==============NonStaticMethod test==============
		NonStaticMethod test = new NonStaticMethod();

		// 1. 매개변수, 반환값 둘 다 없는 메소드
		test.method1();

		// 2. 매개변수가 없고 반환값은 있는 메소드 - 반환되는 값을 기록하기 위한 변수든 출력문이든 작성해서 받아주기
		String str = test.method2();
		System.out.println("str : " + str);
		//System.out.println(test.method2());

		// 3. 매개변수가 있고 반환값이 없는 메소드
		test.method3(5, 1);

		//4. 매개변수 있고 반환값도 있는 메소드
		int result = test.method4(5, 10);
		System.out.println(result);
		//System.out.println(test.method4(1, 2));
		
		User u1 = new User("user01", "pass01", "로운");
		System.out.println(u1.toString());
	
		test.method(u1);
		System.out.println(u1.toString());
		
		// ==============StaticMethod test==============
	
		//static은 객체생성할 필요없음 - > 이미 프로그램 시작할 때 데이터가 올라가 있음
		//클래스명.메소드명([전달값]);
		
		StaticMethod.method1();
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("유재석");
		System.out.println(StaticMethod.method4("유재석"));
		
		
		
		
		
		
		
	
	}

}
