package com.uni.first; //유사한 클래스를 묶어주는 패키지 선언

public class HelloWorld { //클래스 명

	public static void main(String[] args) { //실행메소드
		//public: 메인 메소드는 외부에서 호출할 수 있다.<->private
		//static: 객체를 생성하지 않고도 실행시킬 수 있다.
		//void: 반환 값이 없다.	
		//String[] args: 스트링 배열로 인자를 받겠다.
			
		System.out.println("Hi~~~~"); //출력문
		
		System.out.println(args[0]);
		System.out.println(args[1]);
	
		System.out.println("안녕하세요");//ln이 있으면 줄바꿈이 됨
		System.out.print("안녕하세요"); //\n줄바꿈	
		System.out.print("안녕하세요\n");
		System.out.print("반갑습니다\n");
		
//한줄주석 컨트롤+슬래쉬
/* 영역, 전체주석 -> 범위 지정해서 컨트롤+시프트+슬래쉬*/
//		ctrl + y 실행 앞으로 <-> ctrl + z 뒤로가기
//		ctrl + s 저장
		
/** 
 * 클래스:
 * 최초 작성자
 * DATE
 * 설명:
 **/	//파일에 대한 기록 남길 때 주석	

	}

}
