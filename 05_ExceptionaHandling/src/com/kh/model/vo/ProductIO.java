package com.kh.model.vo;

import java.sql.Date;

public class ProductIO {

	/*
	 * 입출고 정보를 담는 VO 클래스 필드 : ioNum, productId, pName , ioDate, amount, status
	 * (PRODUCT_ IO 테이블의 컬럼 값들 외에 추가로 pName 필드 도 있는거 확인할 것 왜냐면 PRODUCT 테이블과 JOIN 을
	 * 통해 상품명도 받아올 것이기 때문
	 */

	private int ioNum;
	private String productId;
	private String pName;
	private Date idDate;
	private int amount;
	private String status;

	public ProductIO() {
		// TODO Auto-generated constructor stub
	}

	public ProductIO(int ioNum, String productId, String pName, Date idDate, int amount, String status) {
		super();
		this.ioNum = ioNum;
		this.productId = productId;
		this.pName = pName;
		this.idDate = idDate;
		this.amount = amount;
		this.status = status;
	}

	public int getIoNum() {
		return ioNum;
	}

	public void setIoNum(int ioNum) {
		this.ioNum = ioNum;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Date getIdDate() {
		return idDate;
	}

	public void setIdDate(Date idDate) {
		this.idDate = idDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return ioNum + ", " + productId + ", " + pName + ", " + idDate + ", " + amount + ", " + status;
	}

}
