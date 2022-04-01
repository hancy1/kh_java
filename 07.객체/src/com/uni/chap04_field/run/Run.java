package com.uni.chap04_field.run;

import com.uni.chap04_field.model.vo.FieldTest3;
import com.uni.chap04_field.model.vo.FieldTest4;

public class Run {

	public static void main(String[] args) {
//		=======================1.FieldTest1
//		FieldTest1 f1 = new FieldTest1();
//		f1.test(20);
		
		
/*		=======================2.FieldTest2
		FieldTest2 f2 = new FieldTest2();
		
		//public : 어디서든 접근 가능
		System.out.println(f2.pub);
		
		//protected : 같은 패키지 내에서 상속구조에서만 접근 가능
		//System.out.println(f2.pro); -> 다른 패키지이면서 상속구조도 아니기 때문에 접근불가
		System.out.println(f2.getPro());
		
		//default : 같은 패키지 내에서만 접근 가능
		//System.out.println(f2.def)); -> 다른 패키지여서 접근불가
		System.out.println(f2.getDef()); //퍼블릭으로 만들어놓은 getter메소드 통해 값 알아오는 것이 가능
		
		//private : 같은 클래스 내에서만 접근 가능
		//System.out.println(p2.pri);
		System.out.println(f2.getPri());
		*/
		
		
//		=======================3.FieldTest3
		
		//FieldTest3 f3 = new FieldTest3(); //static이기 때문에 객체생성할 필요없음
		
		//public static
		System.out.println(FieldTest3.pubSta); // static이기 때문에 객체생성 필요없이 바로 클래스명. 으로 접근 가능
		System.out.println(Math.PI);
		FieldTest3.pubSta = "값 변경"; //static은 수정 가능
		System.out.println(FieldTest3.pubSta);
		
		//private static
		//System.out.println(FieldTest3.prista); //private이기 때문에 바로 접근불가
		System.out.println(FieldTest3.getPriSta());
		
//		=======================4.FieldTest4
		
		System.out.println(FieldTest4.NUM);
		//FieldTest4.NUM = 3; : 상수는 수정불가
		
	}

}
