package com.uni.chap03_set.part01_hashset.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.uni.chap03_set.part01_hashset.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		/*
		 * 1. Hash (hash알고리즘 도입) :
		 * 		데이터의 검색 성능 향상을 위해서 사용
		 * 		(hashCode와 equals를 모두 오버라이딩 해야한다.)
		 * 
		 * 2. Set
		 * 		- 순서유지 안됨, 중복 저장이 되지 않는다.(수학에서의 집합 개념) <-> List와 다름
		 * 		- 종류로는 HashSet, LinkedHashSet, TreeSet이 있다.
		 *      
		 * 3. HashSet
		 * 		- 순서가 존재하지 않는다.
		 * 		- hashCode()와 equals()가 오버라이딩 되어 있어야 한다.
		 * 
		 * 4. LinkedHashSet
		 * 		- 넣는 순서가 유지 된다.
		 * 		(hashCode와 equals를 모두 오버라이딩 해야한다.)
		 * 
		 * 5. TreeSet
		 * 		- 정렬기준대로 순서가 정해짐(기본 오름차순)
		 * 		- hashCode()와 equals()를 오버라이딩 할 필요 없이 알아서 중복저장 되지 않는다.
		 * 		- 세팅은 해 주어야 됨(Comparable이나 Comparator 구현 클래스)
		 * 
		 * 
		 */
	
		//Set hs = new HashSet(); // hashset의 상위 클래스는 set이기 때문에 set으로 받을 수 있음. (다형성 적용)
		//Collection hs1 = new HashSet(); //set보다 상위인 collection으로도 받을 수 있음. (다형성 적용)
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("반갑습니다.");
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요."));
		hs1.add(new String("여러분"));	
		hs1.add("1");	
		hs1.add(null);
		hs1.add(null);
		
		System.out.println(hs1);
		System.out.println("size: " + hs1.size());
		
		System.out.println(hs1.contains("여러분")); // 포함되어 있으면 true반환
		
		//hs1.clear(); //비우기
		System.out.println(hs1);

		Iterator it = hs1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//String 클래스는 hashcode(), equals()가 오버라이딩이 되어있음. 그래서 실제 필드값이 동일한 경우 동일객체로 인식
		
		HashSet<Student> hs2 = new HashSet<>();
		hs2.add(new Student(1, "공유"));
		hs2.add(new Student(2, "로운"));
		hs2.add(new Student(3, "공명"));
		hs2.add(new Student(4, "공유"));
		hs2.add(new Student(3, "공명"));
		hs2.add(new Student(4, "공유"));
		
		System.out.println("hs2: " + hs2);
		
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		/*ArrayList<Student> list = new ArrayList<>(hs2); //순서대로 하려면 어레이리스트에 담아야 함
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
	}
}
