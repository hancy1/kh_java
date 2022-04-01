package com.uni.chap02_abstractAndInterface.model.vo;

public abstract class Sports {

	private int people;

	public Sports() {
	}

	public Sports(int people) {
		super();
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}
	
	public abstract void rule(); 
	//추상메소드(미완성된 메소드로 내용이 구현되어 있지 않은 메소드) : {} 몸통부가 아직 구현되어 있지 않은 상태
	// --> 미완성된 추상메소드가 있다는 것은 이 클래스또한 추상 클래스(미완성 클래스)라는 것 --> 추상클래스라는 것을 명시해줘야 함. (public abstract class Sports)
}
