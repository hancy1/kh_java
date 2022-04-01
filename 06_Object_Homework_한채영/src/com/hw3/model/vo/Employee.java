package com.hw3.model.vo;

public class Employee {

	private String empName; //사원명
	private String dept;	//부서명
	private String job;		//직급
	private int age;		//나이	
	private char gender;	//성별
	private int salary;		//급여
	private double bonuspoint;//보너스포인트
	private String phone;	//전화번호
	private String address;	//주소
	
	public Employee() {
		
	}
	
	public Employee(String empName, String dept, String job, int age, char gender, int salary, double bonuspoint, String phone, String address) {
		this.empName = empName;
		this.dept = dept;
		this.job = job; 
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonuspoint = bonuspoint;
		this.phone = phone;
		this.address = address;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonuspoint() {
		return bonuspoint;
	}

	public void setBonuspoint(double bonuspoint) {
		this.bonuspoint = bonuspoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String information() {
		return empName +" "+ dept +" "+ job +" "+ age +" "+ salary +" "+ bonuspoint +" "+ phone +" "+ address;
	}
}
