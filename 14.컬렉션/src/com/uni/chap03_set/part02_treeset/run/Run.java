package com.uni.chap03_set.part02_treeset.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import com.uni.chap03_set.part02_treeset.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();
		
		ts.add(new String("하하하"));
		ts.add(new String("나나나"));
		ts.add(new String("가가가"));
		ts.add(new String("다다다"));
		ts.add(new String("하하하"));
		
		System.out.println(ts);
		
		TreeSet<Student> ts1 = new TreeSet<>();
		
		ts1.add(new Student("공유", 30, 100));
		ts1.add(new Student("이효리", 20, 90));
		ts1.add(new Student("유재석", 40, 60));
		ts1.add(new Student("공유", 10, 100));
		System.out.println(ts1); //ClassCastException 발생. comparable 정의를 안 해서
		
		//Treeset의 경우 hashCode, equals로 중복 판단을 하는 것이 아닌 compareTo에 제시되어있는 필드로 중복처리를 해줌 (동일객체 판단)
		
		//1. for each
		System.out.println("=====for each문=====");
		for(Student s : ts1) {
			System.out.println(s);
		}
		//2. list
		System.out.println("=====list문=====");
		ArrayList<Student> list = new ArrayList<>(ts1);
		for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));}
		
		//3. Iterator
		System.out.println("=====Iterator문=====");
		Iterator it = ts1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
