package com.uni.chap02_abstractAndInterface.model.vo;

//미완성 클래스 : 클래스 extends (하나만 상속 가능)
//인터페이스: implements (여러개 적을 수 있음)
public class FootBall extends Sports implements ISports1 /*ISports1에서 2를 extends해서 하나만 써도 가능.*/{

	@Override
	public void rule() {
		System.out.println("손이 아니고 발로 공을 찬다.");
	}

	@Override
	public void startTime() {
		System.out.println("인터페이스 ISports2 메소드 startTime()");
	}

	@Override
	public void endTime() {
		System.out.println("인터페이스 ISports2 메소드 endTime()");

	}

	@Override
	public void rule1() {
		System.out.println("인터페이스 ISports1 메소드 rule1()");

	}

}
