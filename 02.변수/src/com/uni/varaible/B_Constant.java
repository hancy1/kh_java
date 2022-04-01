package com.uni.varaible;

public class B_Constant {

	public void finalConstant() {
		int age = 20;
		System.out.println("age ="+age);
		
		age = 30;
		System.out.println("변경된 age ="+age);
		
		final int AGE = 20;
		System.out.println("AGE ="+AGE);
		
		//AGE = 30; 파이널 붙은 지역변수(상수)는 수정 불가
				
	}
}
