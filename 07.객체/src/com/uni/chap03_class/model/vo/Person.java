package com.uni.chap03_class.model.vo;

//클래스에서 사용가능한 접근제한자: public / default(명시x)
public class Person {

	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;

	public Person() {

	}
//alt+shift+s - > generate getter and setter
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return this.id;
	}
	public String getPwd() {
		return this.pwd;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public int getGender() {
		return this.gender;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getEmail() {
		return this.email;
	}

	public String information() {
		String info = "id: " + this.id + ", pwd: " + this.pwd + ", name: "+ this.name +", age: " + this.age +", gender: " + this.gender +", phone: "+ this.phone +", email: "+ this.email ;
		return info;
	}
}
