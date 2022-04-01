package com.uni.chap01_before_vs_after.after.model.vo;

public class Desktop extends Product {

	private boolean allInOne;// 일체여부

	public Desktop() {
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand, pCode, pName, price); //super() 생성자는 자식 생성자에서 부모생성자를 호출할 수 있다. 반드시 첫 줄에 작성
		/*
		 * super.brand = brand; //직접 접근일 때는 부모필드의 접속제어자가 protected여야 한다. super.pCode =
		 * pCode; super.pName = pName; super.price = price;
		 */
		this.allInOne = allInOne;
	}
	
	/*
	 * super.의 super는 해당 객체의 부모주소를 담고 있다. 
	 * 따라서 super.으로 부모에 접근이 가능하다. 단, 접근하고자 하는 필드가
	 * private 일 때는 접근 불가. 
	 * ->부모필드를 자식까지만 접근가능하게 하기 위해서 부모필드를 protected로 변경해야 한다.
	 */

	
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String toString() {
		return super.toString() + "allInOne : "+ allInOne;

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("나는 desktop");
	}

}
