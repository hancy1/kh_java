package com.uni.chap03_set.part02_treeset.model.vo;

public class Student implements Comparable<Student>{
	
	private String name;
	private int age;
	private int score;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student name = "+ name +" age = "+ age +" score = "+ score;
	}

	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name); //오름차순
	}

}
