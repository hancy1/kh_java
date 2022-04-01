package com.uni.chap02_Encapsulation.run;

import com.uni.chap02_Encapsulation.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {

		Student u = new Student();
		
		/*
		변수에 직접 접근을 통한 초기화: private로 접근제한되어 직접 접근이 이제 불가능
		u.name = "유재석";
		u.age = 20;
		u.height = 180.01;
		u.kor = 90;
		u.math = 100;
		 */
		
		u.setName("유재석");
		u.setAge(20);
		u.setHeight(180.01);
		u.setKor(90);
		u.setMath(100);
		
		//직접 접근을 통한 값 가져오기
		//System.out.println(u.name + "님의 나이는 " + u.age + "살이고 키는 " + u.height +"cm고 국어점수는 " + u.kor + "점이고 수학점수는 " + u.math + "점입니다." );
		System.out.println(u.getName() + "님의 나이는 " + u.getAge() + "살이고 키는 " + u.getHeight() +"cm고 국어점수는 " + u.getKor() + "점이고 수학점수는 " + u.getMath() + "점입니다." );
	
		System.out.println(u.information());
	}

}
